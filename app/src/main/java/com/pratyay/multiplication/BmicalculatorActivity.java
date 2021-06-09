package com.pratyay.multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

import java.text.DecimalFormat;

public class BmicalculatorActivity extends AppCompatActivity {
    private AdView mAdView, mAdView1;
    RadioButton male, female;
    EditText age, feet, inch, weight;
    Button calculate, buttonbmi;
    TextView result, remark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmicalculator);
        buttonbmi = findViewById(R.id.buttonbmi);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        age = findViewById(R.id.age);
        feet = findViewById(R.id.feet);
        inch = findViewById(R.id.inch);
        weight = findViewById(R.id.weight);
        calculate = findViewById(R.id.calculate);
        result = findViewById(R.id.result);
        remark = findViewById(R.id.remark);

        //noinspection Convert2Lambda
        buttonbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(BmicalculatorActivity.this, MainActivity3.class);
                startActivity(in);
            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double bmians = calculatebmi();
                    String ageText = age.getText().toString();
                    int age = Integer.parseInt(ageText);
                    if (age >= 14) {
                        displayresult(bmians);
                    } else {
                        displayminor(bmians);
                    }
                    Toast.makeText(BmicalculatorActivity.this, "Calculation Done!!", Toast.LENGTH_SHORT).show();
                }
                catch(NumberFormatException ex)
                { // handle your exception
                    Toast.makeText(BmicalculatorActivity.this, "Enter Any Valid Digit To Continue.", Toast.LENGTH_SHORT).show();
                }
            }
            @SuppressLint("SetTextI18n")
            private double calculatebmi(){

                String feetText = feet.getText().toString();
                String inchText = inch.getText().toString();
                String wei = weight.getText().toString();
                //converting Strings to int
                int feet = Integer.parseInt(feetText);
                int inch = Integer.parseInt(inchText);
                int weight = Integer.parseInt(wei);
                int totalInch = (feet * 12) + inch;
                double heightinm = totalInch * 0.0254;
                return weight / (heightinm * heightinm);
            }
            //UNDER 18 MINOR
            private void displayminor(double bmi) {
                DecimalFormat myDecimalFormat = new DecimalFormat("0.00");
                String bmiresult = myDecimalFormat.format(bmi);
                String bmiremark;
                if (male.isChecked()) {
                    //Display Boy
                    bmiremark = "Concult Doctor For Bmi";
                } else if (female.isChecked()) {
                    //Display Girl
                    bmiremark = "Concult Doctor For Bmi";
                }else {
                    //general
                    bmiremark = "Concult Doctor For Bmi";
                }
                result.setText(bmiresult);
                remark.setText(bmiremark);

            }
            // Adult
            private void displayresult(double bmi) {
                DecimalFormat myDecimalFormat = new DecimalFormat("0.00");
                String bmiresult = myDecimalFormat.format(bmi);
                String bmiremark;
                if (bmi < 18.5) {
                    bmiremark = "Under Weight";
                } else if (bmi > 25) {
                    bmiremark = "Over Weight";
                } else {
                    bmiremark = "Healthy";
                }
                result.setText(bmiresult);
                remark.setText(bmiremark);

            }
        });
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
                Toast.makeText(BmicalculatorActivity.this, ".", Toast.LENGTH_SHORT).show();

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