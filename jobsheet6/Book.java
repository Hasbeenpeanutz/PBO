package jobsheet6;

public class Book {

    public String author;
    public double price;
    public String title;

    public Book() {
        System.out.println("Book object created");

    }

    public Book(String author, double price, String title) {
        this.author = author;
        this.price = price;
        this.title = title;

    }

    public String getInfo() {
        String info = "";
        info += "Title  : " + title + "\n";
        info += "Author : " + author + "\n";
        info += "Price  : " + price + "\n";
        
        return info;
    }
}