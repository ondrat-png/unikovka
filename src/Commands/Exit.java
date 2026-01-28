package Commands;

public class Exit implements Command{
    @Override
    public String execute(String command) {
        return "💀";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
