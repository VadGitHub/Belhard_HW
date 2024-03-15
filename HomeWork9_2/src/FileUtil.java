import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    final static String saveFileName = "Library.dat";

    public static boolean saveReadersList(List<Reader> readers) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(saveFileName))) {
            outputStream.writeObject(readers);
            return true;
        } catch (Exception ex) {
            System.out.println("Не удалось сохранить данные в файл " + saveFileName);
            ex.printStackTrace();
            return false;
        }

    }

    public static List<Reader> restoreReadersList() {

        List<Reader> readers;

        System.out.println("Чтение данных из " + saveFileName + "...");

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(saveFileName))) {
            readers = (List<Reader>) inputStream.readObject();
            System.out.println("Успешно");
        } catch (FileNotFoundException ex) {
            System.out.println("Данные не обнаружены. Создана новая библиотека");
            readers = new ArrayList<Reader>();
        } catch (Exception ex) {
            System.out.println("Ошибка чтения данных");
            ex.printStackTrace();
            readers = new ArrayList<Reader>();
        }

        return readers;
    }

}
