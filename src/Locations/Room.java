package Locations;

import Charakters.Charakter;
import Items.Items;

import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private boolean isLocked;
    private String keyRequired;
    private Charakter npc;
    private ArrayList<String> lootTable;
    private ArrayList<String> neighbors;


    public Room(String name, String description, boolean isLocked, String keyRequired) {
        this.name = name;
        this.description = description;
        this.isLocked = isLocked;
        this.keyRequired = keyRequired;
        this.lootTable = new ArrayList<>();
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbors(Room room) {
        //TODO
    }

    public Room getNeighbors(String roomName) {
        //TODO
        return null;
    }

    public String getNeighborsName() {
        //TODO
        return "";
    }

    public Items addItem(Items item) {
        //TODO
        return null;
    }

    public Items removeItem(String item) {
        //TODO
        return null;
    }

    public Items getItem(String item) {
        //TODO
        return null;
    }

    public void setCharakter(Charakter npc) {
        //TODO
    }

    public Charakter getCharakter() {
        //TODO
        return null;
    }

    public boolean isLocked() {
        //TODO
        return false;
    }

    public void setLocked(boolean locked) {
        //TODO
    }

    public String getDescription() {
        //TODO
        return "";
    }

    public String getName() {
        return name;
    }

    public String getKeyRequired() {
        return keyRequired;
    }
}
