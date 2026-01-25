package Locations;

import Charakters.Charakter;
import Items.Items;
import java.util.ArrayList;

public class Room {
    private String id;
    private String name;
    private String description;
    private boolean isLocked;
    private String keyRequired;
    private Charakter npc;
    //soubory(ID)
    private ArrayList<String> neighbors;
    private ArrayList<String> lootTable;
    //objkety(hra)
    private ArrayList<Items> itemsInRoom;
    private ArrayList<Room> neighboringRooms;


    public Room(String id,String name, String description, boolean isLocked, String keyRequired) {
        this(); //volani prazdneho konstruktoru, ktery inicializuje
        this.id = id;
        this.name = name;
        this.description = description;
        this.isLocked = isLocked;
        this.keyRequired = keyRequired;
    }

    //prazdny konstruktor pro GSON
    public Room(){
        this.neighbors = new ArrayList<>();
        this.lootTable = new ArrayList<>();
        this.itemsInRoom = new ArrayList<>();
        this.neighboringRooms = new ArrayList<>();
    }

    //pro GSON(ID)
    public ArrayList<String> getNeighborId() {
        return neighbors;
    }

    public ArrayList<String> getLootTableId(){
        return lootTable;
    }

    //pro praci se sousedy
    public void addNeighbors(Room room) {
        if (!neighboringRooms.contains(room)) {
            neighboringRooms.add(room);
        }
    }

    public Room getNeighborsByName(String neighborName) {
        for (Room room : neighboringRooms) {
            if (room.getName().equalsIgnoreCase(neighborName)) {
                return room;
            }
        }
        return null;
    }


    public String getNeighborsName() {
        if (neighboringRooms.isEmpty()){
            return "Žádné sousední místnosti.";
        }
        ArrayList<String> names = new ArrayList<>();
        for (Room room : neighboringRooms) {
            names.add(room.getName());
        }
        return String.join(", ", names);
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

    public ArrayList<Items> getItemsInRoom() {
        return itemsInRoom;
    }

    public void setCharakter(Charakter npc) {
        this.npc = npc;
    }

    public Charakter getCharakter() {
        return npc;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getKeyRequired() {
        return keyRequired;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isLocked=" + isLocked +
                ", keyRequired='" + keyRequired + '\'' +
                ", npc=" + npc +
                ", lootTable=" + lootTable +
                ", neighbors=" + neighbors +
                '}';
    }
}
