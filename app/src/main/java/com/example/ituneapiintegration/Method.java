package com.example.ituneapiintegration;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Method {
    @GET("search?term=*")
    Call<Model> getAllData();
}
