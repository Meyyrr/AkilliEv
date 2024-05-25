package com.example.akilliev;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AracSarjActivity extends AppCompatActivity {

    private ImageView imageViewBattery;
    private TextView textViewSarjDurumu;
    private int sarjSeviyesi = 50; // Başlangıç şarj seviyesi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arac_sarj);

        // Action Bar'ı etkinleştir ve Up butonunu göster
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        imageViewBattery = findViewById(R.id.imageViewBattery);
        textViewSarjDurumu = findViewById(R.id.textViewSarjDurumu);
        Button buttonSarjBaslat = findViewById(R.id.buttonSarjBaslat);
        Button buttonSarjDurdur = findViewById(R.id.buttonSarjDurdur);

        // Şarj başlat butonuna tıklama olayı
        buttonSarjBaslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sarjSeviyesi += 10;
                if (sarjSeviyesi > 100) {
                    sarjSeviyesi = 100;
                }
                updateBatteryStatus();
                Toast.makeText(AracSarjActivity.this, "Şarj Başlatıldı", Toast.LENGTH_SHORT).show();
            }
        });

        // Şarj durdur butonuna tıklama olayı
        buttonSarjDurdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sarjSeviyesi -= 10;
                if (sarjSeviyesi < 0) {
                    sarjSeviyesi = 0;
                }
                updateBatteryStatus();
                Toast.makeText(AracSarjActivity.this, "Şarj Durduruldu", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateBatteryStatus() {
        textViewSarjDurumu.setText("Şarj Durumu: %" + sarjSeviyesi);

    }

    @Override
    public boolean onSupportNavigateUp() {
        // Up butonuna basıldığında geri dön
        onBackPressed();
        return true;
    }
}
