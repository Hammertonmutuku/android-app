package com.projects.muza;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.findMusicButton)
    Button mFindMusicButton;
    @BindView(R.id.LocationEditView)
    EditText mLocationEditView;
    @BindView(R.id.appTextView)
    TextView mAppTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String muzas = mLocationEditView.getText().toString();
                Intent intent = new Intent(MainActivity.this, GenresActivity.class);
                intent.putExtra("muzas", muzas);
                startActivity(intent);
            }
        });
    }
}
