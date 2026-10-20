package jobsheet6;

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

        System.out.println("=== TEXTBOOK ===");
        System.out.println(textbook1.getInfo());

        novel1.price = 175000;
        novel1.genre = "Fantasy Adventure";

        textbook1.subject = "Object Oriented Programming";

        System.out.println("=== AFTER MODIFICATION ===");
        System.out.println("--- Novel ---");
        System.out.println(novel1.getInfo());
        System.out.println("--- Textbook ---");
        System.out.println(textbook1.getInfo());
    }
}