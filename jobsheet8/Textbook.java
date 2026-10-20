package jobsheet8;

public class Textbook extends Book {

    public String subject;

    public Textbook(String author, String title, String subject) {
        super(author, title);
        this.subject = subject;

    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

    public void getBookType() {
        System.out.println("This is a textbook");
    }
}