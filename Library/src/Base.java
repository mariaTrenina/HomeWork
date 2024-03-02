public class Base {
    public static void main(String[] args) {
        Book book1 = new Book("Gone with the wind");
        Book book2 = new Book("Hallowe'en Party");
        Book book3 = new Book("Adventures of Sherlock Holmes");

        Reader sam = new Reader();
        sam.fio = "Sam Morrison";
        sam.booksArray[0] = book1;
        sam.booksArray[1] = book2;
        sam.booksArray[2] = book3;

        sam.printStatus();
        System.out.println();
        Book book4 = new Book("The A B C Murders");
        sam.takeBook(book4);
        sam.returnBook("Financier");
        sam.returnBook("Gone with the wind");
    }
}
