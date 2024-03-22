import java.util.ArrayList;
import java.util.List;

public class MainOne {
    public static void main(String[] args) {
        List<Readers> readers = new ArrayList<>();
        Readers readers1 = new Readers("Jim Hooper",27);
        Readers readers2 = new Readers("Erica Brenner",30);
        Readers readers3 = new Readers("Cara Wheeler",56);
        Readers readers4 = new Readers("Henry Creel",34);
        readers.add(readers1);
        readers.add(readers2);
        readers.add(readers3);
        readers.add(readers4);

        System.out.println(FileUtil.saveReadersList(readers));

        List<Readers> restored = FileUtil.restoreReadersList();
        System.out.println("Restored readers list:");
        for (Readers item: restored) {
                System.out.println(item.getFio()+", "+item.getAge());
        }
    }


}