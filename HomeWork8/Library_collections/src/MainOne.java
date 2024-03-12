import java.util.ArrayList;
import java.util.List;

public class MainOne {
    public static void main(String[] args) {
        Books book1 = new Books("Gone with the wind");
        Books book2 = new Books("Hallowe'en Party");
        Books book3 = new Books("Adventures of Sherlock Holmes");

        List<Readers> readers = new ArrayList<>();
        readers.add(new Readers("Sam Smith"));
        readers.add(new Readers("Lily Collins"));
        readers.add(new Readers("Tom Holland"));
        readers.getFirst().booksList.add(book1);
        readers.getFirst().booksList.add(book2);
        readers.getFirst().booksList.add(book3);

        readers.getFirst().printStatus();
        System.out.println();
        Books book4 = new Books("The A B C Murders");
        readers.getFirst().takeBook(book4);
        readers.getFirst().returnBook("Financier");
        readers.getFirst().returnBook("Gone with the wind");
    }
}
