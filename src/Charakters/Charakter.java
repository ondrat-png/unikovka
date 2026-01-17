package Charakters;

public class Charakter {
    private String name;
    private String dialogue;

    public Charakter(String name, String dialogue) {
        this.name = name;
        this.dialogue = dialogue;
    }

    public String getName() {
        return name;
    }

    public String getDialogue() {
        return dialogue;
    }
}