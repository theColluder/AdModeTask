package com.example.admodetask;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим AdView по его ID
        mAdView = findViewById(R.id.adView);

        // Создаем запрос на загрузку рекламы
        AdRequest adRequest = new AdRequest.Builder().build();

        // Загружаем рекламу в AdView
        mAdView.loadAd(adRequest);
    }
}
