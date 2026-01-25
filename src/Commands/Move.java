package Commands;

import Charakters.Player;
import Items.Items;
import Locations.Room;


public class Move implements Command {

    private Player p;

    public Move(Player p) {
        this.p = p;
    }

    /**
     * Method to move player to another room
     * @param command full command entered by player
     * @return description of the new room where player wanted to go or error message
     */

    @Override
    public String execute(String command) {

        String[] parts = command.split(" ", 2);
        if (parts.length < 2) {
            return "vyber mistnost, kam chces jit";
        }

        String roomDestinationName = parts[1];
        Room currentRoom = p.getCurrentRoom();

        Room roomDestination = currentRoom.getNeighborsByName(roomDestinationName);
        if (roomDestination == null){
            return "Tato mistnost neni sousedni. Tohle jsou jeji sousední: " + currentRoom.getNeighborsName();
        }

        if (currentRoom.getId().equals("cell_room")){
            Items currentItem = p.getInventory().getCurrentItem();
            if (currentItem == null || !currentItem.getId().equals("wire_piece")){
                return "Nemůžeš odejít, jsi pořád zamčený v cele. Potřebuješ klíč od cely.";
            }
        }

        if (roomDestination.isLocked()){
            Items currentItem = p.getInventory().getCurrentItem();
            if (currentItem == null || !currentItem.getId().equals(roomDestination.getKeyRequired())){
                return "Mistnost je zamčená, potřebuješ klíč./nemáš klíč. Potřebuješ: " + roomDestination.getKeyRequired();
            } else {
                roomDestination.setLocked(false);
            }
        }

        p.setCurrentRoom(roomDestination);
        return roomDestination.getDescription();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
