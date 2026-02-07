package Commands;

import Charakters.Player;
import Items.Items;
import Locations.Room;

public class Drop implements Command{

    private Player p;

    public Drop(Player p) {
        this.p = p;
    }

    /**
     * Method to drop current item from inventory to the current room
     * @param command full command entered by player
     * @return message about dropped item or error message if inventory is empty
     */
    @Override
    public String execute(String command) {

    Items currentItem = p.getInventory().getCurrentItem();

    if (currentItem == null){
        return "Prázdný inventář";
    }

    Room currentRoom = p.getCurrentRoom();
    Items droppedItem = p.getInventory().removeItem();
    currentRoom.getLootTableId().add(droppedItem.getId());

    return "Zahozeno: " + droppedItem.getName();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
