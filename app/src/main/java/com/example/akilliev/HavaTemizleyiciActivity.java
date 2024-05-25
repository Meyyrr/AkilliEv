package com.example.akilliev;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HavaTemizleyiciActivity extends AppCompatActivity {

    private TextView textViewHavaTemizleyiciDurum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hava_temizleyici);

        textViewHavaTemizleyiciDurum = findViewById(R.id.textViewHavaTemizleyiciDurum);
        Button buttonHavaTemizleyiciAc = findViewById(R.id.buttonHavaTemizleyiciAc);
        Button buttonHavaTemizleyiciKapat = findViewById(R.id.buttonHavaTemizleyiciKapat);

        buttonHavaTemizleyiciAc.setOnClickListener(v -> {
            textViewHavaTemizleyiciDurum.setText("Mevcut Durum: Açık");
            Toast.makeText(HavaTemizleyiciActivity.this, "Hava Temizleyici Açıldı", Toast.LENGTH_SHORT).show();
        });

        buttonHavaTemizleyiciKapat.setOnClickListener(v -> {
            textViewHavaTemizleyiciDurum.setText("Mevcut Durum: Kapalı");
            Toast.makeText(HavaTemizleyiciActivity.this, "Hava Temizleyici Kapatıldı", Toast.LENGTH_SHORT).show();
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

