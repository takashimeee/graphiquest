package com.example.loginpartfinal;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;

public class apply extends AppCompatActivity {


    ImageView btnBack;
    TextView tvTitle, tvDescription, tvTier, tvDeadline, tvDifficulty;
    Button btnApply, btnBackBottom;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_apply_quest);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //  CONNECT VIEWS
        btnBack = findViewById(R.id.btnBacks);
        tvTitle = findViewById(R.id.tvQuestTitle);
        tvDescription = findViewById(R.id.tvDescription);
        tvTier = findViewById(R.id.tvTier);
        tvDeadline = findViewById(R.id.tvDeadline);
        tvDifficulty = findViewById(R.id.tvDifficulty);
        btnApply = findViewById(R.id.btnApply);
        btnBackBottom = findViewById(R.id.btnBack);

        Intent intent = getIntent();



        //  GET DATA FROM INTENT
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        String tier = intent.getStringExtra("tier");
        String deadline = intent.getStringExtra("deadline");
        String difficulty = intent.getStringExtra("difficulty");


        //  SET DATA
        if (title != null && !title.trim().isEmpty()) {
            tvTitle.setText(title);
        }

        if (description != null && !description.trim().isEmpty()) {
            tvDescription.setText(description);
        }

        if (tier != null && !tier.trim().isEmpty()) {
            tvTier.setText(tier);
        }

        if (deadline != null && !deadline.trim().isEmpty()) {
            tvDeadline.setText(deadline);
        }

        if (difficulty != null && !difficulty.trim().isEmpty()) {
            tvDifficulty.setText(difficulty);
        }



        //  BACK BUTTONS
        btnBack.setOnClickListener(v -> finish());
        btnBackBottom.setOnClickListener(v -> finish());


        //  APPLY BUTTON
        btnApply.setOnClickListener(v -> {
            Toast.makeText(this, "Application Sent!", Toast.LENGTH_SHORT).show();


            // Later  save to database here
        });
    }
}
