package jobsheet7;

public class BookDemo {

    public static void main(String[] args) {

        Novel novel1 = new Novel(
            "J.K. Rowling",
            150000,
            "Harry Potter",
            "Fantasy"
        );

        Textbook textbook1 = new Textbook(
            "James Gosling",
            200000,
            "Java Programming",
            "Programming"
        );

        System.out.println("=== NOVEL ===");
        System.out.println(novel1.getInfo());
        System.out.println(novel1.getDescription());
        
        System.out.println("=== TEXTBOOK ===");
        System.out.println(textbook1.getInfo());
        System.out.println(textbook1.getDescription());

    }
}