package Commands;

import Charakters.Charakter;
import Charakters.Player;
import Locations.Room;

public class Dialogue implements Command{

    private Player p;

    public Dialogue(Player p) {
        this.p = p;
    }

    @Override
    public String execute(String command) {

        Room currentRoom = p.getCurrentRoom();
        Charakter npc = currentRoom.getCharakter();


        if (npc == null) {
            return "V místnosti nikdo není";
        }

        return npc.getName() +": " + "\nříka: " + npc.getDialogue();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
