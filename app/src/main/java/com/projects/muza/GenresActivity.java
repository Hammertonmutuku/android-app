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
import butterknife.BindView;
import butterknife.ButterKnife;


public class GenresActivity extends AppCompatActivity {
    public class RestaurantsActivity extends AppCompatActivity {
        @BindView(R.id.LocationTextView) TextView mLocationTextView;
        @BindView(R.id.listView) ListView mListView;

        private String[] muzas = new String[]{"Mi Mero Mole", "Mother's Bistro",
                "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
                "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
                "Lardo", "Portland City Grill", "Fat Head's Brewery",
                "Chipotle", "Subway"};


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_genres);
            ButterKnife.bind(this);


            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, muzas);
            mListView.setAdapter(adapter);

            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String muzas = ((TextView) view).getText().toString();
                    Toast.makeText(GenresActivity.this, muzas, Toast.LENGTH_LONG).show();
                }
            });

            Intent intent = getIntent();
            String muzas = intent.getStringExtra("muzas");
            mLocationTextView.setText("Here are all the restaurants near: " + muzas);
        }
    }

}
