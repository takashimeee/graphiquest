package com.example.loginpartfinal;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class userprofile extends AppCompatActivity {

    private ImageView profileImage;
    private SharedPreferences sharedPreferences;

    private final ActivityResultLauncher<Intent> pickImage = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                    Uri imageUri = result.getData().getData();
                    if (imageUri != null) {
                        try {
                            // Take persistable URI permission
                            getContentResolver().takePersistableUriPermission(imageUri, Intent.FLAG_GRANT_READ_URI_PERMISSION);
                            InputStream inputStream = getContentResolver().openInputStream(imageUri);
                            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                            profileImage.setImageBitmap(bitmap);
                            saveImageToInternalStorage(bitmap);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userprofile);

        sharedPreferences = getSharedPreferences("profile", MODE_PRIVATE);
        profileImage = findViewById(R.id.profileImage);

        String imagePath = sharedPreferences.getString("profile_image_path", null);
        if (imagePath != null) {
            Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
            profileImage.setImageBitmap(bitmap);
        }

        profileImage.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("image/*");
            pickImage.launch(intent);
        });

        LinearLayout btnQuest = findViewById(R.id.btnquest);
        btnQuest.setOnClickListener(v -> startActivity(new Intent(userprofile.this, QuestActivity.class)));

        LinearLayout btnPortfolio = findViewById(R.id.btnportfolio);
        btnPortfolio.setOnClickListener(v -> startActivity(new Intent(userprofile.this, ItemsActivity.class)));

        LinearLayout btnSettings = findViewById(R.id.btnsettings);
        btnSettings.setOnClickListener(v -> startActivity(new Intent(userprofile.this, SettingsActivity.class)));

        LinearLayout btnWallet = findViewById(R.id.btnwallet);
        btnWallet.setOnClickListener(v -> startActivity(new Intent(userprofile.this, WalletActivity.class)));
    }

    private void saveImageToInternalStorage(Bitmap bitmap) {
        File directory = getFilesDir();
        File file = new File(directory, "profile.jpg");

        try (FileOutputStream fos = new FileOutputStream(file)) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            sharedPreferences.edit().putString("profile_image_path", file.getAbsolutePath()).apply();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}