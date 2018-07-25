package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        //View of rnb playlist
        Button smoothRnb = (Button) findViewById(R.id.smoothrmb);

        if (smoothRnb != null) {
            // set click listener
            smoothRnb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent playListIntent = new Intent(Playlist.this, Currentlyplaying.class);
                    startActivity(playListIntent);
                }
            });
        }

        // add back button

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home)

            //emd activity
            this.finish();

        return super.onOptionsItemSelected(item);

    }
}
