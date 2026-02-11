package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class homepagetaker extends AppCompatActivity implements View.OnClickListener {

    ImageView searchButton, homeButton, leaderboardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepagetaker);

        searchButton = findViewById(R.id.searchbutton);
        homeButton = findViewById(R.id.homebutton);
        leaderboardButton = findViewById(R.id.leaderboardbutton);

        searchButton.setOnClickListener(this);
        homeButton.setOnClickListener(this);
        leaderboardButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;

        if (id == R.id.searchbutton) {
            intent = new Intent(this, takersearchbar1.class);
            startActivity(intent);
        } else if (id == R.id.homebutton || id == R.id.leaderboardbutton) {
            intent = new Intent(this, LeaderboardMain.class);
            startActivity(intent);
        }
    }
}
