package Commands;

public class Help implements Command{
    @Override
    public String execute(String command) {
        return "\n================ příkazy, které může hráč použít ================\n" +
                "jdi (místnost)                  = jdi místnost\n" +
                "konec                           = konec hry\n" +
                "napoveda                        = nápověda hráči\n" +
                "vezmi (předmět)                 = hráč vezme item\n" +
                "zahodit                         = hráč odhodí item\n" +
                "otevrit (objekt)                = použití itemu\n" +
                "prohledat                       = prohledá item/objekt\n" +
                "inventar                        = ukáže inventář\n" +
                "mluv                            = mluvení s postavou\n" +
                "pomoc                           = ukáže příkazy\n" +
                "=====================================================================\n";

    }

    @Override
    public boolean exit() {
        return false;
    }
}
