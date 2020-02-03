package com.projects.muza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mFindMusicButton;
    private EditText mLocationEditView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditView = (EditText) findViewById(R.id.LocationEditView);
        mFindMusicButton = (Button)findViewById(R.id.findMusicButton);
        mFindMusicButton.setOnClickListener(new View.OnClickListener() {
        @Override
                public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, genresActivity.class);
            startActivity(intent);
        }

        }
    }

