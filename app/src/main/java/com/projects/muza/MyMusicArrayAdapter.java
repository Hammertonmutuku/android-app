package com.projects.muza;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyMusicArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mMuzas;
    private String[] mArtist;

    public MyMusicArrayAdapter(Context mContext, int resource, String[] mMuzas, String[] mArtist) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mMuzas = mMuzas;
        this.mArtist = mArtist;
    }

    @Override
    public Object getItem(int position) {
        String muzas = mMuzas[position];
        String artist = mArtist[position];
        return String.format("%s \nServes great: %s", muzas, artist);
    }

    @Override
    public int getCount() {
        return mMuzas.length;
    }
}
