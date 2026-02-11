package com.example.loginpartfinal;



import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class taskbar1 extends AppCompatActivity {

    FrameLayout btntut;
    ImageView btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taskbar1);
        btntut = findViewById(R.id.btntut);
        btnback = findViewById(R.id.btnback);


        btnback.setOnClickListener(v -> {
            Intent intent = new Intent(taskbar1.this, homepage.class);
            startActivity(intent);
        });

        btntut.setOnClickListener(v -> {
            Intent intent = new Intent(taskbar1.this, taskbar2.class);
            startActivity(intent);
        });
    }
}
