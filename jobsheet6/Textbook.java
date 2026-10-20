package jobsheet6;

public class Textbook extends Book {

    public String subject;

    public Textbook() {
        super();
        System.out.println("Textbook object created");
        
    }

    public Textbook(String author, double price, String title, String subject) {
        super(author, price, title);
        this.subject = subject;

        }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Subject: " + subject + "\n";

        return info;
    }
}