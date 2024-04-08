package rechteck;

public class Flächeninhal implements IRechnen{
    @Override
    public double calculate(double sideA, double sideB) {
        return sideA*sideB;
    }
}
