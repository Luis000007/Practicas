package Java.Intermedio.Practicas.Constructores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String movie = read.nextLine();
        int row = read.nextInt();
        int seat = read.nextInt();

        Ticket ticket = new Ticket(movie, row, seat);

        System.out.println("Movie: " + ticket.getMovie());
        System.out.println("Row: " + ticket.getRow());
        System.out.println("Seat: " + ticket.getSeat());
    }
}

class Ticket {

    private String movie;
    private int row;
    private int seat;

    // complete the constructor
    public Ticket(String movie, int row, int seat) {
        this.movie = movie;
        this.row = row;
        this.seat = seat;
    }

    public String getMovie() {
        return movie;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }
}
