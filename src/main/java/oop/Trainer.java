package oop;

import oop.players.Person;

public class Trainer extends Person {


    private int experience;

    public Trainer(String name, double age, int experience) {
        super(name,age);

        this.experience = experience;
    }



    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "experience=" + experience +
                '}';
    }
}
