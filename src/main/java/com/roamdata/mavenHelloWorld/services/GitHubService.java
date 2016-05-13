package com.roamdata.mavenHelloWorld.services;

import com.roamdata.mavenHelloWorld.dao.example.Repo;
import com.roamdata.mavenHelloWorld.dao.example.RepoErrorResponse;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {

    @GET("users/{user}/repos")
    Call<RepoErrorResponse> expectError(@Path("user") String user);

    @GET("users/{user}/repos")
    Call<List<Repo>> ListRepos(@Path("user") String user);
}