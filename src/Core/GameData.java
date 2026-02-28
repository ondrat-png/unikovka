package Core;

import Charakters.Charakter;
import Items.Items;
import Locations.Room;
import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * Represents the game data loaded from a JSON file.
 * This class serves as a data container for all static game content, such as items, characters, Roooms, and quests.
 *
 */
public class GameData {

    public ArrayList<Items> items;
    public ArrayList<Charakter> charakters;
    public ArrayList<Room> rooms;

    /**
     * Loads game data from a JSON file.
     * @param resourcePath path to the resource file
     * @return a Core.GameData object filled with the loaded data
     */
    public static GameData loadGameDataFromResources(String resourcePath) {
        //Vytvoření objektu pro práci s JSON souborem
        Gson gson = new Gson();

        //Načtení souboru gamedata.json, musí být ve složce res/resources, ta musí být označena jako resource složka projektu
        try (InputStream is = Main.class.getResourceAsStream(resourcePath)) {

            //Zde ověřujeme, zdali soubor existuje
            if (is == null) {
                throw new IllegalStateException("Nenalezen resource: " + resourcePath +
                        " (zkontrolujte, že soubor je v src/main/resources).");
            }

            //Přečte celý JSON a vytvoří instanci Core.GameData, naplní vlastnosti podle názvů klíčů v JSONU, vrátí se hotová třída Core.GameData
            return gson.fromJson(
                    new InputStreamReader(is, StandardCharsets.UTF_8),
                    GameData.class
            );

        } catch (Exception e) {
            throw new RuntimeException("Chyba při načítání JSON: " + e.getMessage());
        }

    }

    /**
     * Finds a specific location by its identifier.
     * @param id the identifier of the location to be found
     * @return the matching location
     */
    public  Room findLocation(String id) {
        for (Room l : rooms) {
            if (l.getId().equals(id)){
                return l;
            }
        }
        throw new IllegalArgumentException("Neexistuje lokace s id: " + id);
    }

    /**
     * Method to connect rooms based on their neighbor ID
     * Converts String ID from JSON to actual Room objects, if the room exists
     */
    public void roomConnect(){
        for (Room room : rooms) {
                for (String neighbordId : room.getNeighborId()) {
                    Room neighbords = findLocation(neighbordId);
                    if (neighbords != null) {
                        room.addNeighbors(neighbords);
                    }
                }
        }
    }

    /**
     * Method to find a specific item by its id.
     * @param itemId to check if item with this id exists
     * @return the matching item, or null if no such item exists
     */
    public Items findItemById(String itemId){
        for (Items item : items) {
            if (item.getId().equals(itemId)){
                return item;
            }
        }
        return null;
    }

    /**
     * Method to place character in their home locations
     * if the location exits the character will be placed there
     */
    public void roomCharakter(){
        for (Charakter c : charakters) {
            Room room = findLocation(c.getHomeLocation());
            if (room != null) {
                room.setCharakter(c);
            }
        }
    }


}