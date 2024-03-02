import java.util.Date;

public class Reader {

    String fio;
    int cardNumber;
    String faculty;
    Date birthDate = new Date();
    long number;
    Book[] booksArray = new Book[10];

    void printStatus() {
        System.out.print(fio + " has taken the following books: ");
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i] != null) {
                System.out.print(booksArray[i].bookName + ", ");
            }
        }
    }
    void takeBook(Book newBook) {
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i] == null) {
                booksArray[i] = newBook;
                System.out.println(fio + " has just taken the book " + newBook.bookName);
                break;
            }
        }
    }
    void returnBook(String returningBook) {
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i].bookName == returningBook) {
                booksArray[i] = null;
                System.out.println(fio + " returned the book " + returningBook);
                break;
            } else {
                System.out.println(fio + " does not keep the book " + returningBook);
                break;
            }
        }
    }
}