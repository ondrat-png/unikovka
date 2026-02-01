package Core;

import Charakters.Player;
import Commands.*;

import java.util.HashMap;
import java.util.Scanner;

public class Game {

    private boolean gameOver;
    private Player player;
    private GameData world;
    private HashMap<String, Command> commands;
    private Scanner scanner;

    public Game() {
        this.gameOver = false;
        this.scanner = new Scanner(System.in);
    }

    public void inicialization() {
        world = GameData.loadGameDataFromResources("/gameData.json");
        world.roomConnect();

        player = new Player("player", world.findLocation("cell_room"));

        commands = new HashMap<>();
        commands.put("jdi", new Move(player));
        commands.put("pomoc", new Help());
        commands.put("napoveda", new Hint(player));
        commands.put("konec", new Exit());
        commands.put("prohledat", new Search(player, world));
        commands.put("inventar", new CommandInventory(player));
        commands.put("vezmi", new PickUp(player, world));
        commands.put("zahodit", new Drop(player));
        commands.put("otevrit", new Use(player, world));

        while (gameOver == false) {
            System.out.print(">>> ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 2);
            String commandWord = parts[0];

            Command command = commands.get(commandWord);
            if (command != null) {
                String result = command.execute(input);
                System.out.println(result);
                if (command.exit()) {
                    gameOver = true;
                }
            } else {
                System.out.println("Neznamy prikaz");
            }
        }
    }

    public void start() {
        // TODO game logic
        inicialization();
    }
}
