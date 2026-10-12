
interface Reservable {
    boolean reserve();
}

class Book implements Reservable {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public boolean reserve() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + ISBN + ") - " + (isAvailable ? "Available" : "Not Available");
    }
}
