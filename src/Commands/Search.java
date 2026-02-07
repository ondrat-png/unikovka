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

    /**
     * Method to search the current room for items, characters and neighboring rooms
     * @param command full command entered by player
     * @return items found in the room, characters in the room and neighboring rooms or message that nothing was found
     */
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

        if (currentRoom.getId().equals("engine_room")) {
            result += "V místnosti se nachází zamčená skříň\n";
        }

        if (currentRoom.getId().equals("laboratory_room")) {
            result += "V místnosti se nachází zamčený sejf\n";
        }

         Charakter npc = currentRoom.getCharakter();
         if (npc != null) {
             result += "V místnosti je: " + npc.getName() + "\n";
         }

         result += "Sousedni místnosti: " + currentRoom.getNeighborsName() + "\n";

            return result;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
