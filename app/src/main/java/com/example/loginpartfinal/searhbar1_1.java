package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class searhbar1_1 extends AppCompatActivity {

    Button btnJohn, btnPaul, btnMark, btnBen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giversearchbar2);


        btnJohn = findViewById(R.id.btnJohn);
        btnPaul = findViewById(R.id.btnPaul);
        btnMark = findViewById(R.id.btnMark);
        btnBen = findViewById(R.id.btnBen);


        btnJohn.setOnClickListener(v -> {
            Toast.makeText(this, "John clicked!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(searhbar1_1.this, searchbar2.class);
            startActivity(intent);
        });

        ImageView btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(v -> {
            finish();
        });

    }
}
