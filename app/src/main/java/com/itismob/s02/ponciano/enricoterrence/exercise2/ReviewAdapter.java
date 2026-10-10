package com.itismob.s02.ponciano.enricoterrence.exercise2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {
    private List<Review> reviewList;

    public ReviewAdapter(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_review, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Review review = reviewList.get(position);
        Episode episode = review.getEpisode();
        AnimeTitle anime = episode.getAnimeTitle();

        holder.thumbnail.setImageResource(anime.getImageResId());
        holder.animeTitle.setText(anime.getTitle());
        holder.episode.setText("Episode " + episode.getEpisodeNumber());
        holder.author.setText("by " + review.getAuthor());
        holder.rating.setText(review.getRating() + "/5.0");
    }

    @Override
    public int getItemCount() {
        return reviewList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView animeTitle, episode, author, rating;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.reviewThumbnail);
            animeTitle = itemView.findViewById(R.id.reviewAnimeTitle);
            episode = itemView.findViewById(R.id.reviewEpisode);
            author = itemView.findViewById(R.id.reviewAuthor);
            rating = itemView.findViewById(R.id.reviewRating);
        }
    }
}