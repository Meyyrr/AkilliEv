package com.example.akilliev;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HavaKalitesiActivity extends AppCompatActivity {

    private TextView textViewHavaKalitesiDurum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hava_kalitesi);

        textViewHavaKalitesiDurum = findViewById(R.id.textViewHavaKalitesiDurum);
        Button buttonHavaKalitesiKontrolEt = findViewById(R.id.buttonHavaKalitesiKontrolEt);
        Button buttonHavaKalitesiYenile = findViewById(R.id.buttonHavaKalitesiYenile);

        buttonHavaKalitesiKontrolEt.setOnClickListener(v ->
                Toast.makeText(HavaKalitesiActivity.this, "Hava Kalitesi Kontrol Ediliyor...", Toast.LENGTH_SHORT).show());

        buttonHavaKalitesiYenile.setOnClickListener(v -> {
            Toast.makeText(HavaKalitesiActivity.this, "Hava Kalitesi Yenilendi", Toast.LENGTH_SHORT).show();
        });


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}

