package jobsheet8;

public abstract class Book {

    public String author;
    public String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public abstract void getBookType();
} 