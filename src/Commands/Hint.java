package Commands;

import Charakters.Player;
import Items.Items;

public class Hint implements Command{

    private Player p;

    public Hint(Player p) {
        this.p = p;
    }

    @Override
    public String execute(String command) {

        String roomId = p.getCurrentRoom().getId();
        Items currentItem = p.getInventory().getCurrentItem();

        switch (roomId) {
            case "cell_room":
                if (currentItem == null || !currentItem.getId().equals("wire_piece")) {
                    return "Potřebuješ kus drátu";
                }
                return "Pak můžeš odejít";

            case "office_room":
                if (currentItem == null || !currentItem.getId().equals("fuse")) {
                    return "Potřebuješ pojistku";
                }
                return "Pak můžeš odejít";


            case "elevator_room":
                if (currentItem == null || !currentItem.getId().equals("id_card")) {
                    return "Potřebuješ ID kartu";
                }
                return "Pak můžeš odejít";
            default:
                return "Zkus prohledat místnost";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
