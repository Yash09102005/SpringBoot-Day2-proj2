package com.day2proj2;

public class App {
    public static void main(String[] args) {

        // Create 2 Users
        User user1 = new User(1, "Yash", "yash@example.com");
        User user2 = new User(2, "Prathaban", "prathaban@example.com");

        // Create 3 Tickets
        Ticket ticket1 = new Ticket(101, "Login Issue",
                "Unable to login to the portal", "Open", user1);

        Ticket ticket2 = new Ticket(102, "Email not sending",
                "Outbox emails are stuck", "In Progress", user2);

        Ticket ticket3 = new Ticket(103, "Slow Dashboard",
                "Dashboard takes too long to load", "Open", user1);

        // Display all tickets
        System.out.println("===== HELPDESK TICKETS =====");
        ticket1.displayDetails();
        ticket2.displayDetails();
        ticket3.displayDetails();
    }
}