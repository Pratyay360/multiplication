package com.pratyay.multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

public class MainActivity3 extends AppCompatActivity {
    private AdView mAdView, mAdView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-5700824016479958/1131772514");
        /* TODO: Add adView to your view hierarchy. */
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                super.onAdLoaded();
                super.onAdLoaded();


            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError);
                mAdView.loadAd(adRequest);
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();

            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                super.onAdClicked();
            }

            @Override
            public void onAdClosed() {
                super.onAdClosed();
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });
        ////////////////////
        AdView adView2 = new AdView(this);
        adView2.setAdSize(AdSize.BANNER);
        adView2.setAdUnitId("ca-app-pub-5700824016479958/1131772514");
        /* TODO: Add adView to your view hierarchy. */
        mAdView1 = findViewById(R.id.adView2);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest1);
        mAdView1.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                super.onAdLoaded();
                super.onAdLoaded();


            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError1) {
                // Code to be executed when an ad request fails.
                super.onAdFailedToLoad(adError1);
                mAdView1.loadAd(adRequest1);
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
                super.onAdOpened();

            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                super.onAdClicked();
            }

            @Override
            public void onAdClosed() {
                super.onAdClosed();
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });











    }
}