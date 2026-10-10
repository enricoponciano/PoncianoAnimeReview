package com.itismob.s02.ponciano.enricoterrence.exercise2;

public class Episode {
    private String title;
    private AnimeTitle anime;

    public Episode(String title, AnimeTitle anime) {
        this.title = title;
        this.anime = anime;
    }

    public String getTitle() {
        return this.title;
    }

    public AnimeTitle getAnime() {
        return this.anime;
    }
}