package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Downloaded extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downloaded);

        Button redirectSearch = (Button) findViewById(R.id.redirectSearch);
        Button downloadedsong = (Button) findViewById(R.id.firstsong);

        if (redirectSearch != null) {
            redirectSearch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent redirectIntent = new Intent(Downloaded.this, Search.class);
                    startActivity(redirectIntent);


                }
            });
        }

        if (downloadedsong != null) {
            downloadedsong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent firstsongIntent = new Intent(Downloaded.this, Currentlyplaying.class);
                    startActivity(firstsongIntent);
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
