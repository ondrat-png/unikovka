package Core;

import Items.Items;
import Locations.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class GameDataTest {

    private GameData gameData;

    @BeforeEach
    void settUp(){
        gameData = GameData.loadGameDataFromResources("/gameData.json");
    }

    @Test
    void roomConnect() {
        gameData.roomConnect();
        Room cell = gameData.findLocation("cell_room");
        assertNotNull(cell.getNeighborsByName("Chodba"));
    }

    @Test
    void findItemById() {
         Items item = gameData.findItemById("wire_piece");
         assertNotNull(item);
         assertEquals("Kus drátu", item.getName());
    }

    @Test
    void roomCharakter() {
        gameData.roomCharakter();
        Room office = gameData.findLocation("office_room");
        assertNotNull(office.getCharakter());
        assertEquals("Robot", office.getCharakter().getName());
    }
}