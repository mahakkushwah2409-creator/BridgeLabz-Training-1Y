class new_Book {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends new_Book {
    void display() {
        System.out.println(ISBN);   
        System.out.println(title);  
    }
}

class Test2 {
    public static void main(String[] args) {
        EBook b = new EBook();
        b.ISBN = "123";
        b.title = "Java";
        b.setAuthor("James");

        b.display();
        System.out.println("Author: " + b.getAuthor());
    }
}
