package com.projects.muza.adapters;

import android.content.Context;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projects.muza.R;
import com.projects.muza.models.Album;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.RecyclerHolder> {
    private List<Album> mAlbums;
    private Context mContext;

    public MusicListAdapter(Context context, List<Album> Albums) {
        mContext = context;
        mAlbums = Albums;

    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.music_list_item, parent, false);
        RecyclerHolder viewHolder = new RecyclerHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position, @NonNull List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public int getItemCount() {
        return mAlbums.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.restaurantImageView)
        ImageView mrestaurantImageView;
        @BindView(R.id.restaurantNameTextView)
        TextView mNameTextView;
        @BindView(R.id.categoryTextView)
        TextView mCategoryTextView;


        private Context mContext;

        public RecyclerHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindAlbums(Album musicAlbum) {
            mNameTextView.setText(musicAlbum.getArtist());
            mCategoryTextView.setText(musicAlbum.getTitle());

        }
    }
}

