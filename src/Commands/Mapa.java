package Commands;

import java.io.*;

public class Mapa implements Command{

    /**
     * reading from file
     * @param command full command entered by player
     * @return map of the game
     */
    @Override
    public String execute(String command) {

        String mapaline = "";
        InputStream is = getClass().getClassLoader().getResourceAsStream("mapa.txt");

        if (is == null) {
            return "Mapa není k dispozici.";
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
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
