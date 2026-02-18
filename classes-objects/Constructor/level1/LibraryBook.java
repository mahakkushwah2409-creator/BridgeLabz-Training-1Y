class LibraryBook {
    String title;
    String author;
    double price;
    boolean available = true;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Not available");
        }
    }

    void display() {
        System.out.println(title + " | " + author + " | " + price + 
                           " | Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java", "James", 500);
        b1.display();
        b1.borrowBook();
        b1.display();
    }
}
