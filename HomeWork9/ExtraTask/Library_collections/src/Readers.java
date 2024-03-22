import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Readers implements Serializable {
    String fio;
    int age;
    int cardNumber;
    String faculty;
    Date birthDate = new Date();
    long number;
    List<Books> booksList = new ArrayList<>();

    public Readers(String fio) {
        this.fio = fio;
    }

    public Readers(String fio, int age) {
        this.fio = fio;
        this.age = age;
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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }
}
