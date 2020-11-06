package com.example.digiprof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class VideoActivity extends AppCompatActivity {
    // UI Views
    FloatingActionButton addVideosBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        // change actionbar title.
        setTitle("Videos");

        // Inside it UI views
        addVideosBtn = findViewById(R.id.addVideosBtn);

        //Click Button
        addVideosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // start activity to add videos.
                startActivity(new Intent(VideoActivity.this,AddVideoActivity.class));
            }
        });

    }
}