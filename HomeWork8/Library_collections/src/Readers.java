import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Readers {
    String fio;
    int cardNumber;
    String faculty;
    Date birthDate = new Date();
    long number;
    List<Books> booksList = new ArrayList<>();

    public Readers(String fio) {
        this.fio = fio;
    }

    void printStatus() {
        System.out.print(fio + " has taken the following books: ");
        for (Books bl: booksList) {
            System.out.print(bl.bookName + ", ");
        }
    }
    void takeBook(Books newBook) {
        booksList.add(newBook);
        System.out.println(fio + " has just taken the book " + newBook.bookName);
    }
    void returnBook(String returningBook) {
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).bookName == returningBook) {
                booksList.remove(i);
                System.out.println(fio + " returned the book " + returningBook);
                break;
            } else {
                System.out.println(fio + " does not keep the book " + returningBook);
                break;
            }
        }
    }
}
