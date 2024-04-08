package rechteck;

public class ProgramLambda {
    public static void main(String[] args) { new ProgramLambda().doWork();

    }
    private void doWork() {
        Rechteck rechteck = new Rechteck(3,5);
        IRechnen umfang = (sideA, sideB) -> 2 * (sideA + sideB);
        IRechnen flächeninhal = (sideA, sideB) -> sideA * sideB;
        IRechnen diagonale = (sideA, sideB) -> Math.sqrt(sideA * sideA + sideB * sideB);
        System.out.println("Umfang: " + rechteck.calculate(umfang) +
                " Flacheninhal: " + rechteck.calculate(flächeninhal) +
                "Diagonale: " + rechteck.calculate(diagonale));
    }

}
