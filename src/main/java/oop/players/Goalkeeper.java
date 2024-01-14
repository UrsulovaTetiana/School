package oop.players;

public class Goalkeeper extends Player{

    private int reaction;
    public Goalkeeper(String name, double age,  int strength, int motivation, int reaction) {
        super(name, age, 0, strength, motivation, 0);
        this.reaction = reaction;
    }

    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }
}
