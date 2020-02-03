package com.projects.muza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class GenresActivity extends AppCompatActivity {
    public class RestaurantsActivity extends AppCompatActivity {
        private String[] muzas = new String[]{"Mi Mero Mole", "Mother's Bistro",
                "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
                "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
                "Lardo", "Portland City Grill", "Fat Head's Brewery",
                "Chipotle", "Subway"};
        private ListView mListView;
        private TextView mLocationTextView;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_genres);

            mListView = (ListView) findViewById(R.id.listView);
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, muzas);
            mListView.setAdapter(adapter);

            Intent intent = getIntent();
            String muza = intent.getStringExtra("muza");
            mLocationTextView.setText("Here are all the restaurants near: " + muza);
        }
    }
