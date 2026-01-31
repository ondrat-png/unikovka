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

        if (p.getCurrentRoom().getId().equals("cell_room")){
            Items currentItem = p.getInventory().getCurrentItem();
            if (currentItem == null || !currentItem.getId().equals("wire_piece")){
                return "Potřebuješ kus drátu";
            }
            return "Pak můžeš odejít";
        }

        if (p.getCurrentRoom().getId().equals("office_room")){
            Items currentItem = p.getInventory().getCurrentItem();
            if (currentItem == null || !currentItem.getId().equals("fuse")){
                return "Potřebuješ pojistky";
            }
            return "pak můžeš odejít";

        }

        if (p.getCurrentRoom().getId().equals("elevator_room")){
            Items currentItem = p.getInventory().getCurrentItem();
            if (currentItem == null || !currentItem.getId().equals("id_card")){
            return "Potřebuješ Id kartu";
            }
            return "pak můžeš odejít";
        }

        return "zkus prohledat místnost";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
