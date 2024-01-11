public class Book {
    private Person2 author;
    private String name;
    private int pages;

    public Book(Person2 author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public Person2 getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }
}
