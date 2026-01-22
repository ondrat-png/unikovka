package Charakters;

public class Charakter {
    private String name;
    private String dialogue;
    private String role;
    private String homeLocation;

    public Charakter(String name, String dialogue, String role, String homeLocation) {
        this.name = name;
        this.dialogue = dialogue;
        this.role = role;
        this.homeLocation = homeLocation;
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
}