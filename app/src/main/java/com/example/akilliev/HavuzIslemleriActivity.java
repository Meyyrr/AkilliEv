package com.example.akilliev;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class HavuzIslemleriActivity extends AppCompatActivity {

    private TextView textViewTemizlikDurumu;
    private TextView textViewSicaklik;
    private Switch switchTemizlik;
    private SeekBar seekBarSicaklik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_havuz_islemleri);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        textViewTemizlikDurumu = findViewById(R.id.textViewTemizlikDurumu);
        textViewSicaklik = findViewById(R.id.textViewSicaklik);
        switchTemizlik = findViewById(R.id.switchTemizlik);
        seekBarSicaklik = findViewById(R.id.seekBarSicaklik);


        switchTemizlik.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                textViewTemizlikDurumu.setText("Temizlik Durumu: Açık");
                Toast.makeText(HavuzIslemleriActivity.this, "Temizlik Sistemi Açıldı", Toast.LENGTH_SHORT).show();
            } else {
                textViewTemizlikDurumu.setText("Temizlik Durumu: Kapalı");
                Toast.makeText(HavuzIslemleriActivity.this, "Temizlik Sistemi Kapatıldı", Toast.LENGTH_SHORT).show();
            }
        });


        seekBarSicaklik.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewSicaklik.setText("Mevcut Sıcaklık: " + progress + "°C");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(HavuzIslemleriActivity.this, "Sıcaklık " + seekBar.getProgress() + "°C olarak ayarlandı", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
