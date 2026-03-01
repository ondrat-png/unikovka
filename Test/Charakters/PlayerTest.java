package Charakters;

import Items.Inventory;
import Locations.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player player;
    private Room startRoom;
    private Room newRoom;


    @BeforeEach
    void setUp(){
        startRoom = new Room("start_id", "Start Room", "Starting location", false, null);
        newRoom = new Room("new_id", "New Room", "Another room", false, null);
        player = new Player("TestPlayer", startRoom);

    }
    @Test
    void getCurrentRoom() {
        assertEquals(startRoom, player.getCurrentRoom());
    }

    @Test
    void setCurrentRoom() {
        player.setCurrentRoom(newRoom);
        assertEquals(newRoom, player.getCurrentRoom());
    }

    @Test
    void getInventory(){
    assertNotNull(player.getInventory());
    assertNull(player.getInventory().getCurrentItem());
    }
}