package Locations;

import Charakters.Charakter;
import Items.Items;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
    private String name;
    private String description;
    private boolean isLocked;
    private Charakter npc;
    private ArrayList<Items> items;
    private HashMap<String,Room> exits;

    public Room(String name, String description, boolean isLocked) {
        this.name = name;
        this.description = description;
        this.isLocked = isLocked;
        this.items = new ArrayList<>();
        this.exits = new HashMap<>();
    }

    public void addExit(Room room, String direction) {
        //TODO
    }

    public Room getExit(String direction) {
        //TODO
        return null;
    }

    public String getExitName() {
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
}
