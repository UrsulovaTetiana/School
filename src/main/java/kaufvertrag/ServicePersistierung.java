package kaufvertrag;

public class ServicePersistierung {

    public void schreibeDatenInDatei(Kaufvertrag kaufvertrag, IPersistierung persistierung) {
        persistierung.schreiben(kaufvertrag);
    }
}
