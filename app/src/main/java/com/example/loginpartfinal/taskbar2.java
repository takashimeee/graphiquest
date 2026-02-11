package com.example.loginpartfinal;



import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class taskbar2 extends AppCompatActivity {

    ImageView btnback;
    Button cancelBtn, confirmBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskbar2);

        btnback = findViewById(R.id.btnback);
        cancelBtn = findViewById(R.id.cancelBtn);
        confirmBtn = findViewById(R.id.confrimBtn);

        btnback.setOnClickListener(v -> {
            Intent intent = new Intent(taskbar2.this, taskbar1.class);
            startActivity(intent);
        });

        cancelBtn.setOnClickListener( v -> {
            Toast.makeText(taskbar2.this, "Quest cancelled.", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(taskbar2.this, taskbar1.class);
            startActivity(intent);
        });

        confirmBtn.setOnClickListener(v -> {
            Toast.makeText(taskbar2.this, "Quest accepted.", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(taskbar2.this, userprofile.class);
            startActivity(intent);

        });
    }
}


