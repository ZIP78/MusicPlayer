package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the view that shows each category
        Button Playlist = (Button) findViewById(R.id.playlist);
        Button search = (Button) findViewById(R.id.artist);
        Button offline = (Button) findViewById(R.id.download);

        if (Playlist != null) {
            Playlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent playlistIntent = new Intent(MainActivity.this, Playlist.class);
                    startActivity(playlistIntent);
                }
            });

        }

        if (search != null) {
            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent searchIntent = new Intent(MainActivity.this, Search.class);
                    startActivity(searchIntent);
                }
            });

        }

        if (offline != null) {
            offline.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent offlineIntent = new Intent(MainActivity.this, Downloaded.class);
                    startActivity(offlineIntent);
                }
            });

        }

    }

}

