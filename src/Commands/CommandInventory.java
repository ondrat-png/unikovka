package Commands;

import Charakters.Player;
import Items.Items;

public class CommandInventory implements Command{

    private Player p;

    public CommandInventory(Player p) {
        this.p = p;
    }

    /**
     * shows current item in players inventory
     * @param command full command entered by player
     * @return description and name of current item or message that inventory is empty
     */
    @Override
    public String execute(String command) {

        Items currentItem = p.getInventory().getCurrentItem();

        if (currentItem == null){
            return "Inventář je prázdný.";
        } else {
            return "V inventáři máš: " + currentItem.getName() + " - " + currentItem.getDescription();
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
