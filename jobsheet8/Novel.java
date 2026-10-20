package jobsheet8;

public class Novel extends Book {

    public String genre;

    public Novel(String author, String title, String genre ) {
        super(author, title);
        this.genre = genre;
        
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }

    public void getBookType() {
        System.out.println("This is a novel");
    }
}