package kaufvertrag;

import java.io.FileWriter;
import java.io.IOException;

public class PersistierungTxt implements IPersistierung{
    @Override
    public void schreiben(Kaufvertrag kaufvertrag) {
        try (FileWriter writer = new FileWriter("kaufvertrag.txt")) {
            writer.write(kaufvertrag.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
