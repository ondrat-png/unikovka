package Commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mapa implements Command{

    /**
     * reading from file
     * @param command full command entered by player
     * @return map of the game
     */
    @Override
    public String execute(String command) {

        String mapaline = "";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("res/mapa.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                mapaline += line + "\n";
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return mapaline;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
