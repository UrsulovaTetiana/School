package rechteck;

public class Diagonale implements IRechnen{
    @Override
    public double calculate(double sideA, double sideB) {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }
}
