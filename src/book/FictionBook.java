package book;

import book.Book;

public class FictionBook extends Book {
    private  String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FictionBook() {
    }

    public FictionBook(int bookCode, String name, String author, int price, String category) {
        super(bookCode, name, author, price);
        this.category = category;
    }

    public FictionBook(int bookCode, String name, String author, int price) {
        super(bookCode, name, author, price);
    }
}
