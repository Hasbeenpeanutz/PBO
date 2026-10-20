package jobsheet8;

public class BookDemo {

    public static void main(String[] args) {

        Novel novel1 = new Novel("J.K. Rowling", "Harry Potter", "Fantasy" );

        Textbook textbook1 = new Textbook( "James Gosling", "Java Programming", "Programming" );

        System.out.println("=== NOVEL ===");
        novel1.displayInfo();
        novel1.getBookType();

        System.out.println("=== TEXTBOOK ===");
        textbook1.displayInfo();
        textbook1.getBookType();

        // Book book1 = new Book("George Orwell", "1984");

    }
}