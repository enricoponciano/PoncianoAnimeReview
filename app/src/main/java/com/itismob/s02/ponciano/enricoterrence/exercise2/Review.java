package com.itismob.s02.ponciano.enricoterrence.exercise2;

public class Review {
    private String username;
    private double rating;
    private Episode episode;

    public Review(String username, double rating, Episode episode) {
        this.username = username;
        this.rating = rating;
        this.episode = episode;
    }

    public String getUsername() {
        return this.username;
    }

    public double getRating() {
        return this.rating;
    }

    public Episode getEpisode() {
        return this.episode;
    }
}