package com.itismob.s02.ponciano.enricoterrence.exercise2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Initialize Top Horizontal Recycler
        RecyclerView recyclerAnimeList = findViewById(R.id.recyclerAnimeList);
        LinearLayoutManager horizontalManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerAnimeList.setLayoutManager(horizontalManager);
        AnimeAdapter animeAdapter = new AnimeAdapter(DataGenerator.generateAnimeTitles());
        recyclerAnimeList.setAdapter(animeAdapter);

        // 2. Initialize Bottom Vertical Recycler
        RecyclerView recyclerReviewList = findViewById(R.id.recyclerReviewList);
        LinearLayoutManager verticalManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerReviewList.setLayoutManager(verticalManager);
        ReviewAdapter reviewAdapter = new ReviewAdapter(DataGenerator.generateReviews());
        recyclerReviewList.setAdapter(reviewAdapter);
    }
}