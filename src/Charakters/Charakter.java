package Charakters;

public class Charakter {
    private String id;
    private String name;
    private String dialogue;
    private String role;
    private String homeLocation;

    public Charakter(String id, String name, String dialogue, String role, String homeLocation) {
        this.id = id;
        this.name = name;
        this.dialogue = dialogue;
        this.role = role;
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

    public String getRole() {
        return role;
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
                ", role='" + role + '\'' +
                ", homeLocation='" + homeLocation + '\'' +
                '}';
    }
}