package jobsheet4;

import java.util.ArrayList;

public class Viewer {
    private String name;
    private int age;
    private String phoneNumber;
    private ArrayList<Ticket> tickets;

    public Viewer(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.tickets = new ArrayList<Ticket>();
    }

    public String displayInfo() {
        return "Name: " + name + "\n" +
               "Age: " + age + "\n" +
               "Phone Number: " + phoneNumber + "\n";
    }

    public void buyTicket(Ticket ticket) {
        int minAge = ticket.getFilm().getMinAge();

        if (this.age < minAge) {
            System.out.println("Sorry, " + name + " is not old enough to watch " + ticket.getFilm().getTitle());
            return;
        }

        if (ticket.reduceSeat()) {
            tickets.add(ticket);

        } else {
            
        }
    }

    public void showTickets() {
        if (tickets.isEmpty()) {
            System.out.println(name + " didn't have a ticket yet.\n");
            return;
        }
        for (Ticket ticket : tickets) {
            System.out.println(ticket.displayTicket() + "\n");
        }
    }
}