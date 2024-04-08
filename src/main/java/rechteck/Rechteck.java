package rechteck;

public class Rechteck {
    private double sideA;
    private double sideB;

    public Rechteck(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculate (IRechnen calculateMethod) {
        return calculateMethod.calculate(sideA,sideB);
    }
}
