package com.dipendra.retrofittuto.network;


import com.dipendra.retrofittuto.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by praka on 12/24/2017.
 */

public interface GetDataService {

    @GET("/posts")
    Call<List<RetroPhoto>> getAllPhotos();
}
