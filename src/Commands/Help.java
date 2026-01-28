package Commands;

public class Help implements Command{
    @Override
    public String execute(String command) {
        return "\n================ příkazy, které může hráč použít ================\n" +
                "move (jdi_mistnost)                = jdi místnost\n" +
                "exit (exit)                        = konec hry\n" +
                "hint (hint)                        = nápověda hráči\n" +
                "pickup (pickup_item)               = hráč vezme item\n" +
                "drop (drop_item)                   = hráč odhodí item\n" +
                "use (use_item)                     = použití itemu\n" +
                "search (search_item/search_objejt) = prohledá item/objekt\n" +
                "inventory (inventory)              = ukáže inventář\n" +
                "dialoque (dialoque_postava)        = mluveni s postavau";

    }

    @Override
    public boolean exit() {
        return false;
    }
}
