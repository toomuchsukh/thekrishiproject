package com.example.thekrishiproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thekrishiproject.adapter.ytadapter;
import com.example.thekrishiproject.model.youtubevid;

import java.util.Vector;

public class vidya extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<youtubevid> youtubeVideos = new Vector<youtubevid>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidya);

        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        youtubeVideos.add( new youtubevid("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/watch?v=5k_N226sVUI\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youtubevid("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/watch?v=92vqAZ7infw\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youtubevid("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/watch?v=8Z0Cmy9WppQ\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youtubevid("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/watch?v=KM9SZyPpm-I\" frameborder=\"0\" allowfullscreen></iframe>") );

        ytadapter videoAdapter = new ytadapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);
    }
}