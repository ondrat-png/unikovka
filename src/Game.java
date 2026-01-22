import Charakters.Player;
import Commands.Command;

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
        commands = new HashMap<>();
        world = GameData.loadGameDataFromResources("/gameData.json");
        System.out.println("items: " + world.items.size());
        System.out.println("charakters: " + world.charakters.size());
        System.out.println("rooms: " + world.rooms.size());
        //TODO commands.put("move", new Move());
    }

    public void start() {
        // TODO game logic
        inicialization();
    }



}
