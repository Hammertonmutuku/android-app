package com.projects.muza;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import butterknife.BindView;
import butterknife.Butterknife;
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.findMusicButton) Button mFindMusicButton;


    //private Button mFindMusicButton;
    //private EditText mLocationEditView;
    //public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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

