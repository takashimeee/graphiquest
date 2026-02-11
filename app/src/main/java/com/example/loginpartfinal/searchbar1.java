package com.example.loginpartfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class searchbar1 extends AppCompatActivity {
    
    Button btnWebDesign, btnPv, btnUIDesign, btnGameDev;
    ImageView btnHome, btnback;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takersearchbar2);

        btnWebDesign = findViewById(R.id.btnWebDesign);
        btnPv = findViewById(R.id.btnPv);
        btnUIDesign = findViewById(R.id.btnUIDesign);
        btnGameDev = findViewById(R.id.btnGameDev);
        btnHome = findViewById(R.id.homebutton);
        btnback = findViewById(R.id.btnback);

        btnWebDesign.setOnClickListener(v -> {
            Intent intent = new Intent(searchbar1.this, searhbar1_1.class);
            intent.putExtra("category", "Web Design");
            startActivity(intent);
        });


        btnPv.setOnClickListener(v -> {
            Intent intent = new Intent(searchbar1.this, searhbar1_1.class);
            intent.putExtra("category", "Product Visualization");
            startActivity(intent);
        });


        btnUIDesign.setOnClickListener(v -> {
            Intent intent = new Intent(searchbar1.this, searhbar1_1.class);
            intent.putExtra("category", "UI/UX Designer");
            startActivity(intent);
        });


        btnGameDev.setOnClickListener(v -> {
            Intent intent = new Intent(searchbar1.this, searhbar1_1.class);
            intent.putExtra("category", "Game Developer");
            startActivity(intent);
        });

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(searchbar1.this, homepage.class);
            startActivity(intent);
        });

        btnback.setOnClickListener(v -> {
            Intent intent = new Intent(searchbar1.this, homepage.class);
            startActivity(intent);
        });

    }
}
