import java.util.ArrayList;
import java.util.Date;

class BorrowedBooks {
    private ArrayList<Book> borrowedBooks;
    private ArrayList<Date> dueDates;

    public BorrowedBooks() {
        borrowedBooks = new ArrayList<>();
        dueDates = new ArrayList<>();
    }

    public void addBook(Book book, Date date) {
        borrowedBooks.add(book);
        dueDates.add(date);
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public ArrayList<Date> getDueDates() {
        return dueDates;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < borrowedBooks.size(); i++) {
            str += borrowedBooks.get(i).toString() + " - Due Date: " + dueDates.get(i) + "\n";
        }
        return str;
    }
}
