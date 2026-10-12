import java.util.Date;

class Transaction {
    private String userName;
    private BorrowedBooks borrowedBooks;

    public Transaction(String userName) {
        this.userName = userName;
        this.borrowedBooks = new BorrowedBooks();
    }

    public void borrowBook(Book book, Date dueDate) {
        borrowedBooks.addBook(book, dueDate);
    }

    public BorrowedBooks getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getUserName() {
        return userName;
    }

    public int numOfBooks() {
        return borrowedBooks.getBorrowedBooks().size();
    }

    @Override
    public String toString() {
        return "Transaction for " + userName + ":\n" + borrowedBooks.toString();
    }
}
