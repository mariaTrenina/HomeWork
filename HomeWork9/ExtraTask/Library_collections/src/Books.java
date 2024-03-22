import java.io.Serializable;

public class Books implements Serializable {
    public String bookName;
    public String authorName;
    public final String TEXT = " ";

    public Books(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }
    public Books(String bookName) {
        this.bookName = bookName;
    }
}
