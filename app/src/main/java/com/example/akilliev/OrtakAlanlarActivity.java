package com.example.akilliev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class OrtakAlanlarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortak_alanlar);


        ImageButton imageButtonHavaKalitesi = findViewById(R.id.imageButton);
        ImageButton imageButtonHavaTemizleyici = findViewById(R.id.imageButton5);

        imageButtonHavaKalitesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OrtakAlanlarActivity.this, "Hava Kalitesi seçildi", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(OrtakAlanlarActivity.this, HavaKalitesiActivity.class);
                startActivity(intent);
            }
        });

        imageButtonHavaTemizleyici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OrtakAlanlarActivity.this, "Hava Temizleyici seçildi", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(OrtakAlanlarActivity.this, HavaTemizleyiciActivity.class);
                startActivity(intent);
            }
        });
    }
}
