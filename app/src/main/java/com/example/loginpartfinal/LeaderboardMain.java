    package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LeaderboardMain extends AppCompatActivity implements  View.OnClickListener {


    ImageView backBtn, homeBtn, leaderboardBtn, searchBtn, taskBtn, profileBtn;
    Button uiDesignBtn, webDesignBtn, adManagerBtn, d3ModelingBtn, artDirectorBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.leaderboard_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView backBtn = findViewById(R.id.backBtn);
        Button uiDesignBtn = findViewById(R.id.uiDesignBtn);
        Button webDesignBtn = findViewById(R.id.webDesignBtn);
        Button adManagerBtn = findViewById(R.id.adManagerBtn);
        Button d3ModelingBtn = findViewById(R.id.d3ModelingBtn);
        Button artDirectorBtn = findViewById(R.id.artDirectorBtn);
        ImageView homeBtn = findViewById(R.id.homebutton);
        ImageView leaderboardBtn = findViewById(R.id.leaderboardbutton);
        ImageView searchBtn = findViewById(R.id.searchbutton);
        ImageView taskBtn = findViewById(R.id.taskboardbutton);
        ImageView profileBtn = findViewById(R.id.profilebutton);

        backBtn.setOnClickListener(this);
        homeBtn.setOnClickListener(this);
        leaderboardBtn.setOnClickListener(this);
        searchBtn.setOnClickListener(this);
        taskBtn.setOnClickListener(this);
        profileBtn.setOnClickListener(this);

        uiDesignBtn.setOnClickListener(v->openLeaderboard(LeaderboardConstants.TYPE_UI));
        webDesignBtn.setOnClickListener(v->openLeaderboard(LeaderboardConstants.TYPE_WEB));
        adManagerBtn.setOnClickListener(v->openLeaderboard(LeaderboardConstants.TYPE_AD));
        d3ModelingBtn.setOnClickListener(v->openLeaderboard(LeaderboardConstants.TYPE_3D));
        artDirectorBtn.setOnClickListener(v->openLeaderboard(LeaderboardConstants.TYPE_ART));
    }
    private void openLeaderboard(String type) {
        Intent intent = new Intent(this, LeaderboardPodiumActivity.class);
        intent.putExtra(
                LeaderboardConstants.extraLeaderboardType,
                type
        );
        startActivity(intent);
    }

    public void onClick (View v){
        Intent intent;
        int id = v.getId();

        if (id == R.id.backBtn) {
            /* This opens the main page change mainPage.class to the main page of app
            intent = new Intent(this, mainPage.class);
            startActivity(intent); */
        } else if (id == R.id.homebutton){
              /* Same shit as backBtn
            intent = new Intent(this, mainPage.class);
            startActivity(intent);*/
        } else if (id == R.id.leaderboardbutton){
            //does nothing youre here already
        } else if (id == R.id.searchbutton){
            /* This opens the search page change searchPage.class to search page of the app
            intent = new intent(this, searchPage.class);
            startActivity(intent);
             */
        } else if (id == R.id.taskboardbutton){
            /* This opens the task page change taskPage.class to task page of the app
            intent = new intent(this, taskPage.class);
            startActivity(intent);
             */
        } else if (id == R.id.profilebutton){
            /* This opens profile page change profilePage.class to profile page of the app
            intent = new intent (this, profilePage.class);
            startActivity(intent);
             */
        }

    }
}