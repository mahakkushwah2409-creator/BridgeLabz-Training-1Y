class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio
	}	
}

public class LibraryTest {
    public static void main(String[] args) {
        Author a1 = new Author(
            "Java Basics",
            2023,
            "Riya Sharma",
            "Java programmer and teacher"
        );

        a1.displayInfo();
    }
}