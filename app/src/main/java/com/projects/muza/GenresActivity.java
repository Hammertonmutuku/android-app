package com.projects.muza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class GenresActivity extends AppCompatActivity {
    private ListView mListView;
    private TextView mLocationTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);
        Intent intent = getIntent();
        String muza = intent.getStringExtra("muza");
        mLocationTextView.setText("Here are all the restaurants near: " + muza);
    }
}
