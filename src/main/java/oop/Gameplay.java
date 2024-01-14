package oop;

import oop.players.Goalkeeper;
import oop.players.Player;

import java.util.Random;


public class Gameplay {

    private static final int PLAY_TIME = 90;
    private static final int EXTRA_TIME = 5;
    private static final int MAX_TIME_TO_NEXT_ACTION = 10;

    private static Random random = new Random();


    private static int determineTeamValue(Team team) {
        int result = team.getMotivation() * team.getStrength() * team.getTrainer().getExperience();
        return Math.max(result, 1);

    }

    private static boolean isScoredGoal(Player player, Goalkeeper goalkeeper) {
        player.setGoalKick(random.nextInt(10));
        goalkeeper.setReaction(random.nextInt(10));
        return player.getGoalKick() > goalkeeper.getReaction();

    }

    public static void play(Match match) throws GameCancelException {
        int counter = 0;
        System.out.println("PLAY IS STARTING!");
        while (counter < (PLAY_TIME + EXTRA_TIME)) {
            cancelGame(counter);
            int firstTeamValue = random.nextInt(determineTeamValue(match.getFirstTeam()));
            int secondTeamValue = random.nextInt(determineTeamValue(match.getSecondTeam()));
            if (firstTeamValue < secondTeamValue) {
                int randomInteger = random.nextInt(10);
                Player chosePlayer = match.getSecondTeam().getPlayers().get(randomInteger);
                if (isScoredGoal(chosePlayer, match.getFirstTeam().getGoalkeeper())) {
                    match.getResult().incrementGoalsOfSecondTeam();
                    System.out.println(match.getSecondTeam().getName() + " scored a goal!\n"
                            + "SCORE " + match.getResult());

                }
                counter += MAX_TIME_TO_NEXT_ACTION;
            } else if (firstTeamValue > secondTeamValue) {
                int randomInteger = random.nextInt(10);
                Player chosePlayer = match.getFirstTeam().getPlayers().get(randomInteger);
                if (isScoredGoal(chosePlayer, match.getSecondTeam().getGoalkeeper())) {
                    match.getResult().incrementGoalsOfFirstTeam();
                    System.out.println(match.getFirstTeam().getName() + " scored a goal!\n"
                            + "SCORE " + match.getResult());

                }
                counter += MAX_TIME_TO_NEXT_ACTION;

            }


        }
        System.out.println("FINAL SCORE " + match.getResult());
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 1000);
    }

    public static void cancelGame(int gameMin) throws GameCancelException {
        if (getRandomNumber() == 0) {
            throw new GameCancelException(gameMin);
        }
    }
}
