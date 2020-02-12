
package com.projects.muza.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Apiresponse {

    @SerializedName("track")
    @Expose
    private Track track;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Apiresponse() {
    }

    /**
     * 
     * @param track
     */
    public Apiresponse(Track track) {
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
