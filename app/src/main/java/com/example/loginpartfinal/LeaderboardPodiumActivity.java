package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LeaderboardPodiumActivity extends AppCompatActivity implements View.OnClickListener {

    TextView leaderboardText;
    String leaderboardType;

    ImageView backBtn, homeBtn, leaderboardBtn, searchBtn, taskBtn, profileBtn, showMoreIV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.leaderboard_podium);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView backBtn = findViewById(R.id.backBtn);
        ImageView homeBtn = findViewById(R.id.homebutton);
        ImageView leaderboardBtn = findViewById(R.id.leaderboardbutton);
        ImageView searchBtn = findViewById(R.id.searchbutton);
        ImageView taskBtn = findViewById(R.id.taskboardbutton);
        ImageView profileBtn = findViewById(R.id.profilebutton);
        ImageView showMoreIV = findViewById(R.id.showMoreIV);

        backBtn.setOnClickListener(this);
        homeBtn.setOnClickListener(this);
        leaderboardBtn.setOnClickListener(this);
        searchBtn.setOnClickListener(this);
        taskBtn.setOnClickListener(this);
        profileBtn.setOnClickListener(this);

        String leaderboardType = getIntent().getStringExtra(LeaderboardConstants.extraLeaderboardType);
        TextView leaderboardText = findViewById(R.id.leaderboardText);

        switch (leaderboardType) {

            case LeaderboardConstants.TYPE_UI:
                leaderboardText.setText("UI Design Leaderboard");
                //loadUiPodium();
                break;

            case LeaderboardConstants.TYPE_WEB:
                leaderboardText.setText("Web Design Leaderboard");
                //loadWebPodium();
                break;

            case LeaderboardConstants.TYPE_AD:
                leaderboardText.setText("Advertisement Manager Leaderboard");
               // loadAdPodium();
                break;

            case LeaderboardConstants.TYPE_3D:
                leaderboardText.setText("3D Modeling Leaderboard");
               // load3dPodium();
                break;

            case LeaderboardConstants.TYPE_ART:
                leaderboardText.setText("Art Director Leaderboard");
                //loadArtPodium();
                break;
        }


        showMoreIV.setOnClickListener(v-> openLeaderboard(leaderboardType));

    }
    private void openLeaderboard(String type) {
        Intent intent = new Intent(this, LeaderboardFullList.class);
        intent.putExtra(LeaderboardConstants.extraLeaderboardType, leaderboardType);
        startActivity(intent);
    }
        public void onClick (View v){
        Intent intent;
        int id = v.getId();

        if (id == R.id.backBtn) {
            intent = new Intent(this, LeaderboardMain.class);
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