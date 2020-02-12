
package com.projects.muza.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Toptags {

    @SerializedName("tag")
    @Expose
    private List<Tag> tag = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Toptags() {
    }

    /**
     * 
     * @param tag
     */
    public Toptags(List<Tag> tag) {
        super();
        this.tag = tag;
    }

    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

}
