package jobsheet4;

public class CinemaDemo {
    public static void main(String[] args) {
        Film film1 = new Film("Spider-Man: Brand New Day", "Action", 150, "PG-13");
        Film film2 = new Film("Avengers: Endgame", "Action", 181, "PG-13");

        System.out.println("=== INFORMASI FILM ===");
        System.out.println(film1.displayInfo());
        System.out.println(film2.displayInfo());

        Viewer viewer1 = new Viewer("Budi", 20, "081234567890");
        Viewer viewer2 = new Viewer("Ani", 9, "081234567891");

        System.out.println("=== INFORMASI PENONTON ===");
        System.out.println(viewer1.displayInfo());
        System.out.println(viewer2.displayInfo());

        Ticket ticket1 = new Ticket("TCK-001", film1, 12, 50000.0);
        Ticket ticket2 = new Ticket("TCK-002", film2, 13, 50000.0);
        Ticket ticket3 = new Ticket("TCK-003", film2, 14, 50000.0);

        System.out.println("=== PROSES PEMBELIAN TIKET ===");
        viewer1.buyTicket(ticket1);
        viewer1.buyTicket(ticket2);
        viewer1.buyTicket(ticket3);

        viewer2.buyTicket(ticket1);

        System.out.println("\n=== DAFTAR TIKET MILIK PENONTON ===");
        System.out.println(">> Tiket Budi:");
        viewer1.showTickets();

        System.out.println(">> Tiket Ani:");
        viewer2.showTickets();

        System.out.println("=== SISA KURSI TERKINI ===");
        System.out.println(ticket1.displayRemainingSeats());
        System.out.println(ticket2.displayRemainingSeats());
    }
}