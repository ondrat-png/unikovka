package Items;

public class Items {

    private String name;
    private String description;
    private boolean isCollectible;

    public Items(String name, String description, boolean isCollectible) {
        this.name = name;
        this.description = description;
        this.isCollectible = isCollectible;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCollectible() {
        return isCollectible;
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isCollectible=" + isCollectible +
                '}';
    }
}
