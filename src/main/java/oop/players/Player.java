package oop.players;

import java.util.Objects;

public class Player extends Person {


     private int numberOfGoals;
     private int strength;
     private int motivation;
     private int goalKick;

    public Player(String name, double age, int numberOfGoals, int strength, int motivation, int goalKick) {
        super(name,age);
        this.numberOfGoals = numberOfGoals;
        this.strength = strength;
        this.motivation = motivation;
        this.goalKick = goalKick;
    }


    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getGoalKick() {
        return goalKick;
    }

    public void setGoalKick(int goalKick) {
        this.goalKick = goalKick;
    }

    @Override
    public String toString() {
        return "Player{" +
                "numberOfGoals=" + numberOfGoals +
                ", strength=" + strength +
                ", motivation=" + motivation +
                ", goalKick=" + goalKick +
                '}';
    }
}
