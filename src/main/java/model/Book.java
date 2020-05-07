package model;

public class Book {

    private static Long idCounter = 0L;

    private Long id;
    private String author;
    private String title;
    private String isbn;


    public Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.id = idCounter++;
    }

    public static Long getIdCounter() {
        return idCounter;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "\n\n id=" + id +
                "\n author='" + author +
                "\n title='" + title +
                "\n isbn='" + isbn +
                '}';
    }

}
