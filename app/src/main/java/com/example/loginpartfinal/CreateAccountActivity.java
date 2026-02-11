package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnBack, btnSignup;
    RadioButton giverAcc, takerAcc;
    RadioGroup radiogroupacc;

    String userType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        btnBack = findViewById(R.id.btnBack);
        btnSignup = findViewById(R.id.btnSignup);
        radiogroupacc = findViewById(R.id.radiogroupacc);
        giverAcc = findViewById(R.id.GiverAcc);
        takerAcc = findViewById(R.id.TakerAcc);

        btnSignup.setOnClickListener(this);

        // Set the listener for the back button
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(CreateAccountActivity.this, MainActivity.class);
            startActivity(intent);
        });

        radiogroupacc.clearCheck();

        radiogroupacc.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {

                if (checkedId == R.id.GiverAcc) {
                    userType = "Giver";
                } else if (checkedId == R.id.TakerAcc) {
                    userType = "Taker";
                }
            }
        });

    }

    public void onClick (View v){
        Intent intent;
        int id = v.getId();

        if (id == R.id.btnSignup){
            if (userType == null) {
                Toast.makeText(this, "Please select a role", Toast.LENGTH_SHORT).show();
            } else {
                intent = new Intent(this, AfterLoginActivity.class);
                intent.putExtra("userType", userType);
                startActivity(intent);
            }
        }
    }
}
