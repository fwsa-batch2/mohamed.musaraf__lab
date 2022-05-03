package com.encaps;

public class interfaceClass {
    public static void main(String[] args) {
        seats myBooking = new seats();
        myBooking.movieName();
        myBooking.ticketPrice();
    }
}

interface movie {

    public void movieName();

    public void ticketPrice();

}

class seats implements movie {
    public void movieName() {
        System.out.println("movie_name : KGF");
    }

    public void ticketPrice() {
        System.out.println("Ticket_price : 120rs");
    }

}