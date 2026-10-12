import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Library {
    private ArrayList<Book> books;

    public Library(String inventoryFile) throws IOException {
        books = new ArrayList<>();
        loadBooksFromFile(inventoryFile);
    }

    private void loadBooksFromFile(String inventoryFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inventoryFile));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            books.add(new Book(parts[0], parts[1], parts[2], Boolean.parseBoolean(parts[3])));
        }
        reader.close();
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(Transaction transaction, String bookTitle) {
        Book book = searchBook(bookTitle);
        if (book != null && book.isAvailable()) {
            book.setAvailability(false);
            Date dueDate = calculateDueDate();
            transaction.borrowBook(book, dueDate);
            System.out.println("Borrowed: " + bookTitle + " - Due Date: " + dueDate);
        } else {
            System.out.println("Book not available!");
        }
    }

    private Date calculateDueDate() {
        Date now = new Date();
        long millisIn14Days = 14L * 24 * 60 * 60 * 1000;
        return new Date(now.getTime() + millisIn14Days);
    }
}
