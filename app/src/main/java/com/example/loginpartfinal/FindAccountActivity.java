package com.example.loginpartfinal;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FindAccountActivity extends AppCompatActivity {

    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_account);

        btnCancel = findViewById(R.id.btnCancel);

        btnCancel.setOnClickListener(v -> {
            finish();
        });
    }
}
