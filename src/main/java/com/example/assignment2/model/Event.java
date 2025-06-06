package com.example.assignment2.model;

public class Event {
    private String title;
    private String venue;
    private String day;
    private double price;
    private int sold;
    private int total;

    public Event(String title, String venue, String day, double price, int sold, int total) {
        this.title = title;
        this.venue = venue;
        this.day = day;
        this.price = price;
        this.sold = sold;
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public String getVenue() {
        return venue;
    }

    public String getDay() {
        return day;
    }

    public double getPrice() {
        return price;
    }

    public int getSold() {
        return sold;
    }

    public int getTotal() {
        return total;
    }
}
