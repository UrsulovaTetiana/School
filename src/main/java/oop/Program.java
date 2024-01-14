package oop;

import oop.players.Goalkeeper;
import oop.players.Player;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("Tim", 45,20);
        Trainer trainer2 = new Trainer("Karl", 45,20);

        Goalkeeper goalkeeper = new Goalkeeper("Thomas",45,3,9,6);
        Goalkeeper goalkeeper2 = new Goalkeeper("Jim",40,5,7,8);


        List<Player> players1 = new ArrayList<>();
        List<Player> players2 = new ArrayList<>();



        for (int i = 0; i < 10; i++) {
            Player player = new Player("player" + (i + 1), 27 + (i + 1),56 + (i + 1), (i + 1), (i + 1),(i + 1));
            players1.add(player);
        }

        for (int i = 0; i < 10; i++) {
            Player player = new Player("player" + (i + 1), 27 + (i + 1),56 + (i + 1), (i + 1), (i + 1),(i + 1));
            players2.add(player);
        }

        Team team1 = new Team("First team",trainer,goalkeeper,players1);
        Team team2 = new Team("Second team",trainer2,goalkeeper2,players2);


        Match match = new Match(team1,team2);

        Gameplay gameplay = new Gameplay();


            try {
                gameplay.play(match);
            } catch (GameCancelException e) {
                System.out.println(e.getMessage());
            }

    }
}
