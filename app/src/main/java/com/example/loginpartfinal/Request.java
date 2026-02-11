package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Request extends AppCompatActivity implements View.OnClickListener {

    Button btnApply, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applyrequest);

        btnApply = findViewById(R.id.btnApply);
        btnBack = findViewById(R.id.btnBack);

        btnApply.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this, takersearchbar3.class);

        if (id == R.id.btnApply) {
            Toast.makeText(this, "sent request done!", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        } else if (id == R.id.btnBack) {
            startActivity(intent);
        }
    }
}
