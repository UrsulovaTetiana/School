package rechteck;

public class Program {

    public static void main(String[] args) {
        new Program().doWork();
    }

    private void doWork() {
        Rechteck rechteck = new Rechteck(3,5);
        double result = rechteck.calculate(new Umfang());
        System.out.println(result);
    }
}
