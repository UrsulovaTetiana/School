package oop;

import oop.players.Goalkeeper;
import oop.players.Player;

import java.util.List;
import java.util.SplittableRandom;

public class Team {

    private String name;
    private Trainer trainer;
    private Goalkeeper goalkeeper;
    private List<Player> players;

    public Team(String name, Trainer trainer, Goalkeeper goalkeeper, List<Player> players) {
        this.name = name;
        this.trainer = trainer;
        this.goalkeeper = goalkeeper;
        this.players = players;
    }

    public int getMotivation () {
        int motivation = 0;
        for (Player player: players) {
             motivation += player.getMotivation();
        }

        return motivation/players.size();
    }

    public int getStrength () {
        int strength = 0;
        for (Player player: players) {
            strength += player.getMotivation();
        }

        return strength/players.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Goalkeeper getGoalkeeper() {
        return goalkeeper;
    }

    public void setGoalkeeper(Goalkeeper goalkeeper) {
        this.goalkeeper = goalkeeper;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
