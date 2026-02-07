package Commands;

import Charakters.Player;
import Core.GameData;
import Items.Items;
import Locations.Room;

public class Use implements Command{

    private Player p;
    private GameData world;

    public Use(Player p, GameData world) {
        this.p = p;
        this.world = world;
    }

    /**
     * Method to use items on  objects in certain rooms
     * @param command full command entered by player
     * @return result of using the item on the object or error message if the item cannot be used here
     */
    @Override
    public String execute(String command) {

        String[] parts = command.split(" ", 2);
        if (parts.length < 2) {
            return "Vyber předmět, který chceš použít";
        }

        String targetName = parts[1].toLowerCase();
        Room currentRoom = p.getCurrentRoom();
        Items currentItem = p.getInventory().getCurrentItem();

        if (currentRoom.getId().equals("engine_room") && targetName.equals("skříň") ){
            if (currentItem == null || !currentItem.getId().equals("crowbar")){
                return "Potřebuješ páčidlo";
            }

            if (!currentRoom.getLootTableId().contains("fuse")){
                currentRoom.getLootTableId().add("fuse");
                return "Otevřel jsi skříň páčidlem a našel jsi pojistku";
            }
            return "Skříň už je otevřená";
        }

        if (currentRoom.getId().equals("laboratory_room") && targetName.equals("sejf") ){
            if (currentItem == null || !currentItem.getId().equals("safe_code")){
                return "Potřebuješ kód k sejfu";
            }

            if (!currentRoom.getLootTableId().contains("id_card")){
                currentRoom.getLootTableId().add("id_card");
                return "Otevřel jsi sejf pomocí kódu a našel jsi ID kartu";
            }
            return "Sejf už je otevřený";
        }

        return "Tady to nemůžeš použít";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
