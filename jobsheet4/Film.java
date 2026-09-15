package jobsheet4;

public class Film {
    private String title;
    private String genre;
    private int duration;
    private String rating;
    private int seatAmount = 30; 

    public Film(String title, String genre, int duration, String rating) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public boolean reduceSeat() {
        if (seatAmount > 0) {
            seatAmount--;
            return true;
        } else {
            return false;
        }
    }

    public int getSeatAmount() {
        return seatAmount;
    }

    public String getTitle() {
        return title;
    }

    public String displayInfo() {
        return "Title: " + title + "\n" +
               "Genre: " + genre + "\n" +
               "Duration: " + duration + " minutes\n" +
               "Rating: " + rating + "\n" +
               "Sisa Kursi: " + seatAmount + "\n";
    }

    public String checkRating() {
        if (rating.equalsIgnoreCase("R")) {
            return "This film is restricted to viewers aged 17 and above.";
        } else if (rating.equalsIgnoreCase("PG-13")) {
            return "This film is suitable for viewers aged 13 and above.";
        } else if (rating.equalsIgnoreCase("PG")) {
            return "This film is suitable for viewers of all ages.";
        } else {
            return "Rating information not available.";
        }
    }

    public int getMinAge() {
        if (rating.equalsIgnoreCase("R")) {
            return 17;
        } else if (rating.equalsIgnoreCase("PG-13")) {
            return 13;
        } else {
            return 0;
        }
    }

    public String updateRating(String newRating) {
        this.rating = newRating;
        return "Rating updated to: " + newRating;
    }
}