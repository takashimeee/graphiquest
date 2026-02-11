package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class takersearchbar2 extends AppCompatActivity implements View.OnClickListener {

    Button btnkendrick, btnbaxia, btnMark, btnbeast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takersearchbar2);

        btnkendrick = findViewById(R.id.btnkendrick);
        btnbaxia = findViewById(R.id.btnbaxia);
        btnMark = findViewById(R.id.btnMark);
        btnbeast = findViewById(R.id.btnbeast);

        btnkendrick.setOnClickListener(this);
        btnbaxia.setOnClickListener(this);
        btnMark.setOnClickListener(this);
        btnbeast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;

        if (id == R.id.btnkendrick) {
            intent = new Intent(this, takersearchbar3.class);
            startActivity(intent);
        } else if (id == R.id.btnbaxia || id == R.id.btnMark || id == R.id.btnbeast) {
            // Handle clicks for other buttons if needed
        }
    }
}
