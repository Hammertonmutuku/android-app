package com.projects.muza;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import com.projects.muza.adapters.MusicListAdapter;
import com.projects.muza.models.Album;
import com.projects.muza.service.MusicInstance;
import com.projects.muza.service.MusicInterface;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.findMusicButton)
    Button mFindMusicButton;
    @BindView(R.id.LocationText)
    EditText mLocationEditView;
    @BindView(R.id.appTextView)
    TextView mAppTextView;
    @BindView(R.id.recyclerView)
    RecyclerView mrecyclerview;

    private MusicListAdapter musicListAdapter;

    public List<Album> music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MusicInterface musicInterface = MusicInstance.getMusicInfo().create(MusicInterface.class);
        Call<List<Album>> listcall = musicInterface.getAlbumsTitle();
        listcall.enqueue(new Callback<List<Album>>() {
            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                parseData(response.body());

            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable t) {

            }
        });
        ButterKnife.bind(this);

        mFindMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mac = mLocationEditView.getText().toString();
                Intent intent = new Intent(MainActivity.this, GenresActivity.class);
                intent.putExtra("mac", mac);
                startActivity(intent);
            }
        });

    }

    private void parseData(List<Album> body) {
        MusicListAdapter musicListAdapter = new MusicListAdapter();
    }
}
