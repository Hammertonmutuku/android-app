package com.projects.muza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mFindMusicButton;
    private EditText mLocationEditView;
    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditView = (EditText) findViewById(R.id.LocationEditView);
        mFindMusicButton = (Button)findViewById(R.id.findMusicButton);
        mFindMusicButton.setOnClickListener(new View.OnClickListener() {
        @Override
                public void onClick(View v) {
            String location = mLocationEditView.getText().toString();
            Log.d(TAG, location);
            Intent intent = new Intent(MainActivity.this, GenresActivity.class);
            startActivity(intent);
        }

        }
    }

