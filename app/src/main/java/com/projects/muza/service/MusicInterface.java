package com.projects.muza.service;

import com.projects.muza.models.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MusicInterface {

    @GET("/Album")
    Call<List<Album>> getAlbumsTitle();

}
