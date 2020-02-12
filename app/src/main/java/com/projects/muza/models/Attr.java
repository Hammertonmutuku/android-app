
package com.projects.muza.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attr {

    @SerializedName("position")
    @Expose
    private String position;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attr() {
    }

    /**
     * 
     * @param position
     */
    public Attr(String position) {
        super();
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
