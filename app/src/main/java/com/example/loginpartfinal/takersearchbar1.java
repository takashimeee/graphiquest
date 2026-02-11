package com.example.loginpartfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class takersearchbar1 extends AppCompatActivity {

    Button btnwebdesign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takersearchbar1);

        Button nextButton = findViewById(R.id.btnWebDesign);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(takersearchbar1.this, takersearchbar2.class);
                startActivity(intent);
            }
        });
    }
}
