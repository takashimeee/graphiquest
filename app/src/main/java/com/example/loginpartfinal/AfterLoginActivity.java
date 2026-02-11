package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AfterLoginActivity extends AppCompatActivity implements View.OnClickListener {

    String userType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        // Find all the buttons and TextViews
        Button btnUI = findViewById(R.id.btnUI);
        Button btnWeb = findViewById(R.id.btnWeb);
        Button btnAds = findViewById(R.id.btnAds);
        Button btnProduct = findViewById(R.id.btnProduct);
        Button btn3D = findViewById(R.id.btn3D);
        Button btnArt = findViewById(R.id.btnArt);
        Button btnOther = findViewById(R.id.btnOther);
        Button btnSkip = findViewById(R.id.btnSkip);
        Button btnBack = findViewById(R.id.btnBack);
        TextView tvQuestGiver = findViewById(R.id.QuestGiver);
        TextView tvWelcome = findViewById(R.id.tvWelcome);
        TextView tvWelcomeText = findViewById(R.id.tvWelcomeText);


        // Set a single click listener for all specialization/skip buttons and the QuestGiver TextView
        btnUI.setOnClickListener(this);
        btnWeb.setOnClickListener(this);
        btnAds.setOnClickListener(this);
        btnProduct.setOnClickListener(this);
        btn3D.setOnClickListener(this);
        btnArt.setOnClickListener(this);
        btnOther.setOnClickListener(this);
        btnSkip.setOnClickListener(this);
        tvQuestGiver.setOnClickListener(this); // Added listener for QuestGiver

        userType = getIntent().getStringExtra("userType");

        if (userType != null) {
            switch (userType){
                case "Giver":
                    tvWelcome.setText("Welcome Giver!");
                    tvWelcomeText.setText("Before we start let’s start on what type of \nQuestTaker you need?");
                    break;
                case "Taker":
                    tvWelcome.setText("Welcome Taker!");
                    tvWelcomeText.setText("Before we start let’s start on what type of \nQuestTaker you are? (We recommend you to pick your forte)");
                    break;
            }
        }

        // Set a separate listener for the back button
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(AfterLoginActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public void onClick(View v) {
        // All buttons/views that use this listener will go to TermsActivity
        Intent intent = new Intent(AfterLoginActivity.this, TermsActivity.class);
        intent.putExtra("userType", userType);
        startActivity(intent);
    }
}
