package jobsheet7;

public class Book {

    public String author;
    public double price;
    public String title;
    final String language = "Indonesia";

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
        info += "Language  : " + language + "\n";
        
        return info;
    }

    public String getDescription() {
        String description = "";
        description += "This is a book about " + title + "\n";

        return description;
    }
} 