package com.example.loginpartfinal;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class searchbar2 extends AppCompatActivity {

    Button btnmessagee, btnhireme;
    TextView nameText, status, roleText, questText, ratingText;
    ImageView btnback;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giversearchbar3);

        btnmessagee = findViewById(R.id.btnmessagee);
        btnhireme = findViewById(R.id.btnhireme);
        btnback = findViewById(R.id.btnback);

        nameText = findViewById(R.id.nameText);
        status = findViewById(R.id.status);
        roleText = findViewById(R.id.roleText);
        questText =findViewById(R.id.questText);
        ratingText = findViewById(R.id.ratingText);

        nameText.setText("John Kirky");
        status.setText("Available");
        roleText.setText("Freelancer on media advertisement, 3D Modeling, Web Designer");
        questText.setText("Total quest taken: 67");
        ratingText.setText("Current Rating: ★★★★☆");
        
        btnhireme.setOnClickListener(v -> {
                Intent intent = new Intent(searchbar2.this, upload.class);
                startActivity(intent);
        });        

        btnback.setOnClickListener(v -> {
            finish();
        });

    }
}
