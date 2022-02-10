package com.dipendra.retrofittuto.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by praka on 12/24/2017.
 */

public class RetroPhoto {

    @SerializedName("userId")
    private float userId;
    @SerializedName("id")
    private float id;
    @SerializedName("title")
    private String title;
    @SerializedName("body")
    private String body;

    public RetroPhoto() {
    }

    public RetroPhoto(float userId, float id, String title, String body) {

        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public float getUserId() {
        return userId;
    }

    public void setUserId(float userId) {
        this.userId = userId;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
