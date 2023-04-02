package book;

import book.Book;

public class ProgrammingBook extends Book {
    private String language,framework;

    public ProgrammingBook() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public ProgrammingBook(int bookCode, String name, String author, int price) {
        super(bookCode, name, author, price);
    }

    public ProgrammingBook(int bookCode, String name, String author, int price, String language) {
        super(bookCode, name, author, price);
        this.language = language;
    }
}
