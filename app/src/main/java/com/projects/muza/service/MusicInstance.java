package com.projects.muza.service;

import com.projects.muza.service.MusicInterface;
import com.projects.muza.service.MusicInstance;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.projects.muza.Constants.last_API_KEY;
import static com.projects.muza.Constants.last_API_KEY_URL;

public class MusicInstance {
    private static Retrofit retrofit = null;
    private static final String last_API_KEY_URL = "Https://www.last.fm/api/";

    public static Retrofit getMusicInfo() {

        if (retrofit == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request newRequest  = chain.request().newBuilder()
                                    .addHeader("Authorization", last_API_KEY)
                                    .build();
                            return chain.proceed(newRequest);
                        }
                    })
                    .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(last_API_KEY_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

        return retrofit;

        }
    }

