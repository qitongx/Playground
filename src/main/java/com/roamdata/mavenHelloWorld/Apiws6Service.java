package com.roamdata.mavenHelloWorld;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.List;

/**
 * Created by Josh on 5/13/16.
 */
public interface Apiws6Service {

    @Headers({
            "X-Roam-Key: RPX6-d76d2c37-f7b7-40c8-bf3f-9ec0a5cdc562",
            "Content-Type: application/json"
    })
    @POST("Authentication")
    Call<Apiws6LoginResponse> Login(@Body Apiws6LoginRequest loginRequest);
}
