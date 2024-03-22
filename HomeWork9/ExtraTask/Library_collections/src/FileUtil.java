import java.io.*;
import java.util.List;

public class FileUtil {
    public static boolean saveReadersList(List<Readers> readers) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("readersList.txt"))) {
            oos.writeObject(readers);
            return true;
        } catch (IOException exception) {
            System.out.println("Failed to save the list of readers to a file");
            return false;
        }
    }
    public static List<Readers> restoreReadersList() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("readersList.txt"))) {
            return (List<Readers>) ois.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            System.out.println("Failed to restore the list of readers from a file");
            return null;
        }
    }
}
