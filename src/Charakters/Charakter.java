package Charakters;

public class Charakter {
    private String id;
    private String name;
    private String dialogue;
    private String homeLocation;

    public Charakter(String id, String name, String dialogue, String homeLocation) {
        this.id = id;
        this.name = name;
        this.dialogue = dialogue;
        this.homeLocation = homeLocation;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDialogue() {
        return dialogue;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    @Override
    public String toString() {
        return "Charakter{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dialogue='" + dialogue + '\'' +
                ", homeLocation='" + homeLocation + '\'' +
                '}';
    }
}