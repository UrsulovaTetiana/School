package kaufvertrag;


import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class PersistierungPdf implements IPersistierung {
    @Override
    public void schreiben(Kaufvertrag kaufvertrag) {
        try (FileWriter writer = new FileWriter("kaufvertrag.pdf")) {
            Class<?> clazz = kaufvertrag.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                writer.write(field.getName() + ": " + String.valueOf(field.get(kaufvertrag)) + "\n");
            }
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
