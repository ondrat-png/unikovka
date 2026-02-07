package Commands;

import Charakters.Player;
import Core.GameData;
import Items.Items;
import Locations.Room;

public class PickUp implements Command{

    private Player p;
    private GameData world;

    public PickUp(Player p, GameData world) {
        this.p = p;
        this.world = world;
    }

    /**
     * Method to pick up items from the current room and add them to the player's inventory
     * It checks if the item exists in the room and if the players inventory is full before adding the item.
     * @param command full command entered by player
     * @return items name and description or inventory is full or item does not exist in the room
     */
    @Override
    public String execute(String command) {

        String[] parts = command.split(" ", 2);
        if (parts.length < 2) {
            return "Vyber co chces vzit";
        }

        String input = parts[1];
        Room currentRoom = p.getCurrentRoom();

        Items items = null;
        String itemIdToRemove = null;

        for (String itemId : currentRoom.getLootTableId()){
            Items foundItem = world.findItemById(itemId);
            if (foundItem == null){
                continue;
            }
            if (foundItem.getName().equalsIgnoreCase(input)){
                items = foundItem;
                itemIdToRemove = itemId;
                break;
            }
        }

        if (items == null){
            return "Tento předmět tu není";
        }

        if (p.getInventory().isFull()){
            return "Inventář je plný";
        }

        p.getInventory().addItem(items);
        currentRoom.getLootTableId().remove(itemIdToRemove);
        return "Sebral jsi: " + items.getName() + "\n - " + items.getDescription();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
