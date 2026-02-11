package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class InsideMessage extends AppCompatActivity {

    ImageView backtomsgtab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_message);

        backtomsgtab = findViewById(R.id.backtomsgtab);

        backtomsgtab.setOnClickListener(v -> {
            Intent intent = new Intent(InsideMessage.this, messagetab.class);
            startActivity(intent);
        });
    }
}
