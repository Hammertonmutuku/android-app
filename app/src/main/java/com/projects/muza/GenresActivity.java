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

        @BindView(R.id.LocationTextView) TextView mLocationTextView;
        @BindView(R.id.listView) ListView mListView;

        private String[] muzas = new String[]{"Bilando", "Good Doctor",
                "Goodbye", "Screen Door", "Lucy", "Sweet At This",
                "Sleeping Child", "Equinox", "Miss moving on", "Adriana",
                "Lucky", "Port", "Good old friend",
                "Somebody to love", "Someone"};
        private String[] artist = new String[] {"Ariana grande", "Nicky Minaj", "one Direction", "Weekend", "Cameroon",
                "Swidish house mafia", "Bang beng", "Moving fast", "Out of my league", "Panic at the Disco", "Brown n q", "Cuba air",
                "Banned at the Disco", "Sports house", "Eminem", "good" };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_genres);
            ButterKnife.bind(this);


            MyMusicArrayAdapter adapter = new MyMusicArrayAdapter(this, android.R.layout.simple_list_item_1, muzas, artist);
            mListView.setAdapter(adapter);

            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String muzas = ((TextView) view).getText().toString();
                    Toast.makeText(GenresActivity.this, muzas, Toast.LENGTH_LONG).show();
                }
            });

            Intent intent = getIntent();
            String mac = intent.getStringExtra("mac");
            mLocationTextView.setText("Here are all the music: " + mac);
        }
    }


