package oop;

public class Match {

    private final Team firstTeam;
    private final Team secondTeam;

    private Result result = new Result();
    private StringBuilder play;

    public Match(Team firstTeam, Team secondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.play = new StringBuilder();
    }

    public Team getFirstTeam() {
        return firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }

    public Result getResult() {
        return result;
    }

    public StringBuilder getPlay() {
        return play;
    }
}
