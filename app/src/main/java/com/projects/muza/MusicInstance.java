package com.projects.muza;

import retrofit2.Retrofit;
import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.projects.muza.Constants.last_API_KEY_URL;

public class MusicInstance {
    private static Retrofit retrofit;
    private static final String BASE_URL = "ttps://www.last.fm/api/";

    public static Retrofit getMusicInfo() {
        if (retrofit == null) {
        retrofit = new Retrofit.Builder()
                .baseUrl(last_API_KEY_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

        return retrofit;
}
    }

