package com.pratyay.multiplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextNumberDecimal, bac;
    private AdView mAdView, mAdView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);
        bac = findViewById(R.id.bac);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View  v){
                try{
                    int number = Integer.parseInt(editTextNumberDecimal.getText().toString());
                    int multiplier = Integer.parseInt(bac.getText().toString());
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra( "number", number);
                    i.putExtra("multiplier", multiplier);
                    startActivity(i);
                }
                catch(NumberFormatException ex){ // handle your exception
                    Toast.makeText(MainActivity.this, "Enter Any Valid Digit To Continue.",
                            Toast.LENGTH_SHORT).show();
                }

                }


        });


        AdView adView2 = new AdView(this);
        adView2.setAdSize(AdSize.BANNER);
        adView2.setAdUnitId("ca-app-pub-5700824016479958/1131772514");

        /* TODO: Add adView to your view hierarchy. */
        mAdView = findViewById(R.id.adView2);
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
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-5700824016479958/1131772514");
        /* TODO: Add adView to your view hierarchy. */
        mAdView1 = findViewById(R.id.adView);
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