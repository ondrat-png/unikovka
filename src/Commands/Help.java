package Commands;

import java.io.*;

public class Help implements Command{

    /**
     * reading from file
     * @param command full command entered by player
     * @return help text
     */
    @Override
    public String execute(String command) {

        String helpLine = "";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("res/Help.txt"));
            String line;
            while((line = bufferedReader.readLine()) != null){
                helpLine += line + "\n";
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return helpLine;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
