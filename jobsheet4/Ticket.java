package jobsheet4;

public class Ticket {
    private String idTicket;
    private int seatNumber;
    private double price;
    private Film film;

    public Ticket(String idTicket, Film film, int seatNumber, double price) {
        this.idTicket = idTicket;
        this.film = film;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public Film getFilm() {
        return film;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean reduceSeat() {
        return film.reduceSeat();
    }

    public String displayTicket() {
        return "Ticket ID: " + idTicket + "\n" +
               "Film Title: " + film.getTitle() + "\n" +
               "Rate: " + film.checkRating() + "\n" +
               "Seat Number: " + seatNumber + "\n" +
               "Price: $" + price;
    }

    public String displayRemainingSeats() {
        return "Remaining Seats for \"" + film.getTitle() + "\": " + film.getSeatAmount();
    }

    public String changeSeatNumber(int newSeatNumber) {
        this.seatNumber = newSeatNumber;
        return "Seat number updated to: " + newSeatNumber + "\n";
    }
}