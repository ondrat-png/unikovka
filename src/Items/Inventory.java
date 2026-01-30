package Items;

public class Inventory {
    private Items currentItem;
    private static final int size = 1;

    public Inventory() {
        this.currentItem = null;
    }

    public Items getCurrentItem() {
        return currentItem;
    }

    public boolean addItem(Items item) {

        if (currentItem != null) {
            return false;
        }
        currentItem = item;
        return true;
    }

    public Items removeItem() {

        Items items = currentItem;
        currentItem = null;
        return items;
    }

    public boolean isFull() {

        if (currentItem != null) {
            return true;
        }
        return false;
    }
}
