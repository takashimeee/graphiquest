package com.example.loginpartfinal;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Calendar;
import android.app.DatePickerDialog;
import android.widget.Toast;
import androidx.annotation.Nullable;

public class upload extends AppCompatActivity {


    private static final int PICK_IMAGE_REQUEST = 1;


    private EditText etTitle, etDescription, etTier, etDeadline, etDifficulty;
    private FrameLayout uploadBox;
    private ImageView imgPreview;
    private Uri selectedImageUri;


    private Button btnPost;
    private ImageView btnBacks;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        // Initialize views
        etTitle = findViewById(R.id.etTitle); 
        etDescription = findViewById(R.id.etDescription);
        etTier = findViewById(R.id.etTier);
        etDeadline = findViewById(R.id.etDeadline);
        etDeadline.setFocusable(false);
        etDeadline.setClickable(true);
        etDifficulty = findViewById(R.id.etDifficulty);


        uploadBox = findViewById(R.id.uploadBox);
        imgPreview = findViewById(R.id.imgPreview);


        btnPost = findViewById(R.id.btnPost);
        btnBacks = findViewById(R.id.btnBacks);


        uploadBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openImagePicker();
            }
        });
        // Post Quest logic
        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitQuest();
            }
        });
        // Back button
        btnBacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // just closes the activity
            }
        });

        etDeadline.setOnClickListener(v -> showDatePicker());
    }
    // Open Gallery to pick an image
    private void openImagePicker() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null) {
            selectedImageUri = data.getData();
            if (selectedImageUri != null) {
                imgPreview.setImageURI(selectedImageUri);
                imgPreview.setVisibility(View.VISIBLE);
            }
        }
    }


    // Collect inputs and simulate posting
    private void submitQuest() {
        String title = etTitle.getText().toString().trim();
        String description = etDescription.getText().toString().trim();
        String tier = etTier.getText().toString().trim();
        String deadline = etDeadline.getText().toString().trim();
        String difficulty = etDifficulty.getText().toString().trim();


        if (title.isEmpty() || description.isEmpty() || tier.isEmpty() || deadline.isEmpty() || difficulty.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }


        // Example: just showing a Toast for now
        String message = "Quest Posted!\nTitle: " + title +
                "\nDescription: " + description +
                "\nTier: " + tier +
                "\nDeadline: " + deadline +
                "\nDifficulty: " + difficulty +
                "\nReference: " + (selectedImageUri != null ? selectedImageUri.toString() : "None");


        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(upload.this, homepage.class);
        startActivity(intent);
        finish();
    }
    private void showDatePicker() {


        Calendar calendar = Calendar.getInstance();


        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog datePickerDialog =
                new DatePickerDialog(this,
                        (view, y, m, d) -> {


                            String date =
                                    y + "-" +
                                            String.format("%02d", m + 1) + "-" +
                                            String.format("%02d", d);


                            etDeadline.setText(date);
                        },
                        year, month, day);


        // Prevent past dates
        datePickerDialog.getDatePicker()
                .setMinDate(System.currentTimeMillis());


        datePickerDialog.show();
    }

}
