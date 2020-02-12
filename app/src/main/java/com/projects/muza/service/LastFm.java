package com.projects.muza.service;

import com.projects.muza.models.TrackInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LastFm {
    @GET("Trackinfo/listeners")
    Call<TrackInfo> getrackinfo(
            @Query("trackinfo") String trackinfo
    );
}
