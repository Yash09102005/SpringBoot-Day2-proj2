package com.day2proj2;

public class Ticket {

    private int ticketId;
    private String title;
    private String description;
    private String status;
    private User assignedUser;

    public Ticket(int ticketId, String title, String description,
            String status, User assignedUser) {
        this.ticketId = ticketId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.assignedUser = assignedUser;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void displayDetails() {
        System.out.println("----------------------------------");
        System.out.println("Ticket ID   : " + ticketId);
        System.out.println("Title       : " + title);
        System.out.println("Description : " + description);
        System.out.println("Status      : " + status);
        System.out.println("Assigned To :");
        assignedUser.displayDetails();
        System.out.println("----------------------------------");
    }
}