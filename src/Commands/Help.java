package Commands;

import java.io.*;

public class Help implements Command{
    @Override
    public String execute(String command) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("res/Help.txt"));
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
