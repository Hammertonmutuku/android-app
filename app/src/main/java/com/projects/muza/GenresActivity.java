package com.projects.muza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long 1) {
                    String muza = ((TextView) view).getText().toString();
                    Toast.makeText(GenresActivity.this, muza, Toast.LENGTH_LONG).show();
                }
            });

            Intent intent = getIntent();
            String muza = intent.getStringExtra("muza");
            mLocationTextView.setText("Here are all the restaurants near: " + muza);
        }
    }

}
