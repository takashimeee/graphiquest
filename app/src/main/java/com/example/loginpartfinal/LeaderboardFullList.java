package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LeaderboardFullList extends AppCompatActivity implements View.OnClickListener {

    ImageView backBtn, homeBtn, leaderboardBtn, searchBtn, taskBtn, profileBtn, showMoreIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.leaderboard_full_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        backBtn = findViewById(R.id.backBtn);
        homeBtn = findViewById(R.id.homebutton);
        leaderboardBtn = findViewById(R.id.leaderboardbutton);
        searchBtn = findViewById(R.id.searchbutton);
        taskBtn = findViewById(R.id.taskboardbutton);
        profileBtn = findViewById(R.id.profilebutton);
        showMoreIV = findViewById(R.id.showMoreIV);

        backBtn.setOnClickListener(this);
        homeBtn.setOnClickListener(this);
        leaderboardBtn.setOnClickListener(this);
        searchBtn.setOnClickListener(this);
        taskBtn.setOnClickListener(this);
        profileBtn.setOnClickListener(this);
        showMoreIV.setOnClickListener(this);
    }
    public void onClick (View v){
        Intent intent;
        int id = v.getId();

        if (id == R.id.backBtn) {
            intent = new Intent(this, LeaderboardPodiumActivity.class);
            startActivity(intent);
        } else if (id == R.id.homebutton){
              /* open home change mainPage.class to home page of the app
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
