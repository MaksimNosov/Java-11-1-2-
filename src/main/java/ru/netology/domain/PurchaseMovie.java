package ru.netology.domain;

public class PurchaseMovie {
    private int id;
    private String movieName;

    public PurchaseMovie(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }
}
