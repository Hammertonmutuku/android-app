package com.projects.muza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mFindMusicButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFindMusicButton = (Button)findViewById(R.id.findMusicButton);
        mFindMusicButton.setOnClickListener(new View.OnClickListener() {
        @Override
                public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, genresActivity.class);
            startActivity(intent);
        }

        }
    }

