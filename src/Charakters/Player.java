package Charakters;

import Items.Inventory;
import Locations.Room;

public class Player {
    private String name;
    private Room currentroom;
    private Inventory inventory;

    public Player(String name, Room startingRoom) {
        this.name = name;
        this.currentroom = startingRoom;
        this.inventory = new Inventory();
    }

    public String getName() {
        return name;
    }

    public Room getCurrentRoom() {
        return currentroom;
    }

    public void setCurrentRoom(Room room) {
        this.currentroom = room;
    }

    public Inventory getInventory() {
        return inventory;
    }
}
