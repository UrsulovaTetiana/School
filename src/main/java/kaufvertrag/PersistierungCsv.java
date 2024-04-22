package kaufvertrag;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class PersistierungCsv implements IPersistierung{
    @Override
    public void schreiben(Kaufvertrag kaufvertrag) {
        try (FileWriter writer = new FileWriter("kaufvertrag.csv", true)) {
            StringBuilder data = new StringBuilder();
            Class<?> clazz = kaufvertrag.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                data.append(field.get(kaufvertrag)).append(",");
            }
            if (data.length() > 0) {
                data.deleteCharAt(data.length() - 1);
            }
            writer.write(data + "\n");
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
