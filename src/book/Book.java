package book;

public class Book {
    private int bookCode;
    private String name,author;
    private int price;

    public Book() {
    }

    public Book(int bookCode, String name, String author, int price) {
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
