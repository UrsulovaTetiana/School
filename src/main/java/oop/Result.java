package oop;

public class Result {

    private int goalsFirstTeam;
    private int goalsSecondTeam;

    public int incrementGoalsOfFirstTeam() {
        return goalsFirstTeam ++;

    }

    public int incrementGoalsOfSecondTeam() {
        return goalsSecondTeam ++;
    }

    public int getGoalsFirstTeam() {
        return goalsFirstTeam;
    }

    public int getGoalsSecondTeam() {
        return goalsSecondTeam;
    }

    @Override
    public String toString() {
        return  goalsFirstTeam + " : " + goalsSecondTeam;
    }
}
