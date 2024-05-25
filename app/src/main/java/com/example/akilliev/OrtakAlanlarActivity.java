package com.example.akilliev;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.content.Intent;

public class OrtakAlanlarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ortak_alanlar);

        // İleri butonu ile MainActivity'ye geçiş
        Button buttonIleri = findViewById(R.id.buttonIleri);
        buttonIleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrtakAlanlarActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Hava Kalitesi ve Hava Temizleyici butonları
        ImageButton imageButtonHavaKalitesi = findViewById(R.id.imageButtonHavaKalitesi);
        ImageButton imageButtonHavaTemizleyici = findViewById(R.id.imageButtonHavaTemizleyici);

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





