package oop;

public class GameCancelException extends Exception {

    private int gameMin;

    public GameCancelException(int gameMin) {
        this.gameMin = gameMin;
    }

    @Override
    public String getMessage() {
        return "Time when game was canceled: " + gameMin + " Min";
    }


}
