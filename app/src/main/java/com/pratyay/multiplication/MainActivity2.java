package com.pratyay.multiplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listview);
        Intent i = getIntent();
        int number = i.getIntExtra("number", 0);
        int b = i.getIntExtra("multiplier", 0);


        ArrayList<String> table = new ArrayList<>();
        for(int a=0; a<= b; a++)
        {
            table.add(number + " * " + a +" = " + number * a);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, table);
        listView.setAdapter(arrayAdapter);
    }
}