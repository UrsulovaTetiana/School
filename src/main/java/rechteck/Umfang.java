package rechteck;

public class Umfang implements IRechnen{
    @Override
    public double calculate(double sideA, double sideB) {
        return 2*(sideA + sideB);
    }
}
