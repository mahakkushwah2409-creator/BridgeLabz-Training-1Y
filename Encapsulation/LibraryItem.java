abstract class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println("Title: " + title);
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(String title) {
        super(title);
    }

    int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book Reserved");
    }

    public boolean checkAvailability() {
        return true;
    }
}
