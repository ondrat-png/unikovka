package Items;

public class Items {

    private String id;
    private String name;
    private String description;
    private boolean isCollectible;

    public Items(String id, String name, String description, boolean isCollectible) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isCollectible = isCollectible;
    }

    public String getId() {
        return id;
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
