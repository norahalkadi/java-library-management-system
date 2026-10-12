import java.io.IOException;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        try {
            Library library = new Library("books.txt");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter your name: ");
            String userName = scanner.nextLine();

            Transaction transaction = new Transaction(userName);

            borrowBooksRecursively(library, transaction, scanner);

            System.out.println("\nReport:");
            System.out.println(transaction);

        } catch (IOException e) {
            System.out.println("Error loading library books: " + e.getMessage());
        }
    }

    private static void borrowBooksRecursively(Library library, Transaction transaction, Scanner scanner) {
        System.out.println("\nAvailable Books:");
        library.displayBooks();

        System.out.print("\nPlease enter the title of the book to borrow (or type 'done' to finish): ");
        String bookTitle = scanner.nextLine();

        if (bookTitle.equalsIgnoreCase("done")) {
            return;
        }

        library.borrowBook(transaction, bookTitle);
        borrowBooksRecursively(library, transaction, scanner);
    }
}
