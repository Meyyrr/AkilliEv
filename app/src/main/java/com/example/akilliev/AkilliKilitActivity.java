package com.example.akilliev;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AkilliKilitActivity extends AppCompatActivity {

    private boolean isLocked = false; // Kilit durumu
    private ImageView lockImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akilli_kilit);

        lockImageView = findViewById(R.id.imageView2);

        // İlk görseli
        lockImageView.setImageResource(R.drawable.acik_kilit);

        // Tıklama olayını
        lockImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleLock();
            }
        });

        // Action Bar'ı etkinleştir ve Up butonunu göster
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    private void toggleLock() {
        if (isLocked) {
            lockImageView.setImageResource(R.drawable.acik_kilit);
            Toast.makeText(this, "Kilit Açıldı", Toast.LENGTH_SHORT).show();
        } else {
            lockImageView.setImageResource(R.drawable.kapali_kilit);
            Toast.makeText(this, "Kilit Kapandı", Toast.LENGTH_SHORT).show();
        }
        isLocked = !isLocked; // Kilit durumunu değiştir
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Up butonuna basıldığında geri dön
        onBackPressed();
        return true;
    }
}
