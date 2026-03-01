package Commands;

import Charakters.Player;
import Core.GameData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoveTest {

    private Player player;
    private GameData gameData;
    private Move moveCommand;

    @BeforeEach
    void SetUp() {
        gameData = GameData.loadGameDataFromResources("/gameData.json");
        gameData.roomConnect();
        player = new Player("TestPlayer", gameData.findLocation("hallway_room"));
        moveCommand = new Move(player);
    }

    @Test
    void execute() {
        String result = moveCommand.execute("jdi sklad");
        assertTrue(result.contains("Místnost plná harampádí"));
        assertEquals("storage_room", player.getCurrentRoom().getId());
    }
}