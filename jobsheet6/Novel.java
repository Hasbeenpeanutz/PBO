package jobsheet6;

public class Novel extends Book {

    public String genre;

    public Novel() {
        super();
        System.out.println("Novel object created");

    }

    public Novel(String author, double price, String title, String genre ) {
        super(author, price, title);
        this.genre = genre;
        
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Genre  : " + genre + "\n";

        return info;
    }
}