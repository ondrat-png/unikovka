package Items;

public class Items {

    private String id;
    private String name;
    private String description;


    public Items(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
