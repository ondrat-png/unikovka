import Charakters.Player;
import Commands.Command;
import Commands.Move;

import java.util.HashMap;

public class Game {

    private boolean gameOver;
    private Player player;
    private GameData world;
    private HashMap<String, Command> commands;

    public Game() {
        this.gameOver = false;
    }

    public void inicialization() {
        world = GameData.loadGameDataFromResources("/gameData.json");
        world.roomConnect();

        player = new Player("player", world.findLocation("cell_room"));

        commands = new HashMap<>();
        commands.put("jdi", new Move(player));

        System.out.println("items: " + world.items.size());
        System.out.println("charakters: " + world.charakters.size());
        System.out.println("rooms: " + world.rooms.size());
    }

    public void start() {
        // TODO game logic
        inicialization();

        System.out.println(player.getCurrentRoom().getName());
        System.out.println(player.getCurrentRoom().getDescription());
        System.out.println("Sousedni mistnosti: " + player.getCurrentRoom().getNeighborsName());

        Command moveCommand = commands.get("jdi");
        String result = moveCommand.execute("jdi chodba");
        System.out.println(result);
    }



}
