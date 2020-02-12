
package com.projects.muza.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TrackInfo {

    @SerializedName("track")
    @Expose
    private Track track;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TrackInfo() {
    }

    /**
     * 
     * @param track
     */
    public TrackInfo(Track track) {
        super();
        this.track = track;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

}
