package com.roamdata.mavenHelloWorld;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main {

    // A simple HTTP request
    public static void callVersion1(GitHubService service) {

        // here given a false username to output an error:
        /**
         * curl https://api.github.com/users/xxx/repos/
         {
         "message": "Not Found",
         "documentation_url": "https://developer.github.com/v3"
         }
         */
        Call<RepoErrorResponse> repos = service.expectError("xxx");

        try {
            RepoErrorResponse errorResp = repos.execute().body();
            System.out.println("Hello World!" + errorResp.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException ne) {
            ne.printStackTrace();
        }
    }

    // HTTP request with OKHTTP intercept, output debug info
    public static void callVersion2(GitHubService service) {

        // here given a false username to output an error:
        /**
         * curl https://api.github.com/users/xxx/repos/
         {
         "message": "Not Found",
         "documentation_url": "https://developer.github.com/v3"
         }
         */
        Call<List<Repo>> repos = service.ListRepos("qitongx");

        Response response = null;

        try {
            response = repos.execute();

            System.out.println("====================\n\n\n");
//            System.out.println(response.networkResponse().body());
            System.out.println("Response Body: \n" + response.isSuccessful());
            System.out.println("Response Body: \n" + ((List<Repo>) response.body()).get(0).gitUrl);
            System.out.println("Response Body: \n" + ((List<Repo>) response.body()).get(0).defaultBranch);
            System.out.println("====================\n\n\n");



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        Retrofit retrofit = new Retrofit.Builder()

                .baseUrl("https://api.github.com/")
                // here is a gson package, maybe we need to use others in the future.
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        GitHubService service = retrofit.create(GitHubService.class);



//        System.out.println("Call Version 1: \n\n");
//        callVersion1(service);


        System.out.println("\n\n\n Call Version 2: \n\n");
        callVersion2(service);
    }
}
