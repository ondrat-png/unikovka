package Commands;

import Charakters.Player;
import Items.Items;
import Locations.Room;

public class Drop implements Command{

    private Player p;

    public Drop(Player p) {
        this.p = p;
    }

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
