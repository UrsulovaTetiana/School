package kaufvertrag;

import java.io.*;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) throws IOException {
        ServicePersistierung servicePersistierung = new ServicePersistierung();
        PersistierungCsv persistierungCsv = new PersistierungCsv();
        servicePersistierung.schreibeDatenInDatei(erstellKaufvertrag(),persistierungCsv);
    }

    public static Kaufvertrag erstellKaufvertrag() {
        Vertragspartner verkaeufer = new Vertragspartner("Max", "Mustermann");
        Vertragspartner kaeufer = new Vertragspartner("Anna", "Schmidt");
        Ware ware = new Ware("Fahrrad", 599.99);

        Kaufvertrag kaufvertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);

        return kaufvertrag;

    }


}
