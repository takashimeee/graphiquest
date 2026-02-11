package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;




public class giversearchbar1 extends AppCompatActivity {

    Button btnwebdesign;
    Button btnpv;
    Button btnuidesign;
    Button btngamedev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giversearchbar1);

        Button nextButton = findViewById(R.id.btnWebDesign);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(giversearchbar1.this, giversearchbar2.class);
                startActivity(intent);
            }
        });
    }
}
