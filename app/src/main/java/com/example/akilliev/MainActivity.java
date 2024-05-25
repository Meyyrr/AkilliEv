package com.example.akilliev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onAkilliKilitClicked(View view) {
        // Toast mesajını göster
        Toast.makeText(this, "Akıllı Kilit seçildi", Toast.LENGTH_SHORT).show();

        // AkilliKilitActivity'yi başlat
        Intent intent = new Intent(this, AkilliKilitActivity.class);
        startActivity(intent);
    }

    public void onSesSistemiClicked(View view) {
        Toast.makeText(this, "Ses Sistemi seçildi", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, SesSistemiActivity.class);
        startActivity(intent);
    }

    public void onProjeksionClicked(View view) {
        Toast.makeText(this, "Projeksiyon seçildi", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, ProjeksiyonActivity.class);
        startActivity(intent);
    }
}




