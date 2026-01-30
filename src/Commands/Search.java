package Commands;

import Charakters.Charakter;
import Charakters.Player;
import Core.GameData;
import Items.Items;
import Locations.Room;


public class Search implements Command{

    private Player p;
    private GameData world;

    public Search(Player p, GameData world) {
        this.p = p;
        this.world = world;
    }

    @Override
    public String execute(String command) {

        Room currentRoom = p.getCurrentRoom();
        String result = "Prohledáváš místnost: " + currentRoom.getName() + "\n";

        if (currentRoom.getLootTableId().isEmpty()){
            result += "Nic jsi nenašel\n";
        } else {
            result += "Našel jsi: ";
            for (String itemId : currentRoom.getLootTableId()){
                   Items item = world.findItemById(itemId);
                   if (item != null){
                        result += item.getName() + "\n";
                   }
            }
        }

         Charakter npc = currentRoom.getCharakter();
         if (npc != null) {
             result += "V místnosti je: " + npc.getName() + "\n";
         }

            return result;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
