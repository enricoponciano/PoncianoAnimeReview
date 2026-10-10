package com.itismob.s02.ponciano.enricoterrence.exercise2;
import com.itismob.s02.ponciano.enricoterrence.exercise2.Episode;
import com.itismob.s02.ponciano.enricoterrence.exercise2.Review;

import java.util.ArrayList;
import java.util.Collections;

public class DataGenerator {
    private final static AnimeTitle anime1 = new AnimeTitle(R.drawable.anime1, "The Rising of the Shield Hero Season 3");
    private final static AnimeTitle anime2 = new AnimeTitle(R.drawable.anime2, "Goblin Slayer II");
    private final static AnimeTitle anime3 = new AnimeTitle(R.drawable.anime3, "Spy x Family Season 2");
    private final static AnimeTitle anime4 = new AnimeTitle(R.drawable.anime4, "The Eminence in Shadow Season 2");
    private final static AnimeTitle anime5 = new AnimeTitle(R.drawable.anime5, "Dr. Stone: New World Part 2");
    private final static AnimeTitle anime6 = new AnimeTitle(R.drawable.anime6, "Frieren: Beyond Journey's End");
    private final static AnimeTitle anime7 = new AnimeTitle(R.drawable.anime7, "Tokyo Revengers: Tenjiku-hen");
    private final static AnimeTitle anime8 = new AnimeTitle(R.drawable.anime8, "Keikenzumi na Kimi to, Keiken Zero na Ore ga, Otsukiai suru Hanashi.");
    private final static AnimeTitle anime9 = new AnimeTitle(R.drawable.anime9, "The Faraway Paladin: The Lord of Rust Mountains");
    private final static AnimeTitle anime10 = new AnimeTitle(R.drawable.anime10, "The Apothecary Diaries");
    private final static AnimeTitle anime11 = new AnimeTitle(R.drawable.anime11, "Undead Unluck");

    private final static Episode episodeA = new Episode("Episode 1", anime6);
    private final static Episode episodeB = new Episode("Episode 2", anime6);
    private final static Episode episodeC = new Episode("Episode 3", anime6);
    private final static Episode episodeD = new Episode("Episode 1", anime4);
    private final static Episode episodeE = new Episode("Episode 1", anime8);
    private final static Episode episodeF = new Episode("Episode 1", anime3);
    private final static Episode episodeG = new Episode("Episode 2", anime10);
    private final static Episode episodeH = new Episode("Episode 4", anime11);

    public static ArrayList<AnimeTitle> generateAnimeTitleData() {
        ArrayList<AnimeTitle> tempList = new ArrayList<AnimeTitle>();
        
        tempList.add(anime1);
        tempList.add(anime2);
        tempList.add(anime3);
        tempList.add(anime4);
        tempList.add(anime5);
        tempList.add(anime6);
        tempList.add(anime7);
        tempList.add(anime8);
        tempList.add(anime9);
        tempList.add(anime10);
        tempList.add(anime11);
        
        return tempList;
    }

    public static ArrayList<Review> generateRecentReviewsData() {
        ArrayList<Review> tempList = new ArrayList<Review>();

        tempList.add(new Review("Dio", 4.5, episodeA));
        tempList.add(new Review("Dio", 4.5, episodeD));
        tempList.add(new Review("Dio", 1.5, episodeE));
        tempList.add(new Review("Dio", 3.5, episodeF));

        tempList.add(new Review("Eren", 1.5, episodeB));
        tempList.add(new Review("Eren", 5.0, episodeC));
        tempList.add(new Review("Eren", 5.0, episodeD));
        tempList.add(new Review("Eren", 1.5, episodeF));

        tempList.add(new Review("Griffith", 5.0, episodeA));
        tempList.add(new Review("Griffith", 5.0, episodeC));
        tempList.add(new Review("Griffith", 0.5, episodeD));
        tempList.add(new Review("Griffith", 3.5, episodeE));

        tempList.add(new Review("Madara Uchiha", 2.5, episodeA));
        tempList.add(new Review("Madara Uchiha", 1.5, episodeG));
        tempList.add(new Review("Madara Uchiha", 3.0, episodeH));

        tempList.add(new Review("Meruem", 4.0, episodeD));
        tempList.add(new Review("Meruem", 3.0, episodeE));
        tempList.add(new Review("Meruem", 4.5, episodeC));

        tempList.add(new Review("Hisoka", 4.5, episodeF));
        tempList.add(new Review("Hisoka", 0.5, episodeB));

        tempList.add(new Review("Pain", 3.5, episodeH));
        tempList.add(new Review("Pain", 3.5, episodeG));
        tempList.add(new Review("Pain", 3.5, episodeF));

        Collections.shuffle(tempList);

        return tempList;
    }
}