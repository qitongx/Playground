package com.roamdata.mavenHelloWorld;

import com.roamdata.mavenHelloWorld.dao.wsapi6.Apiws6LoginRequestBody;
import com.roamdata.mavenHelloWorld.dao.wsapi6.Apiws6LoginResponse;
import com.roamdata.mavenHelloWorld.services.Apiws6Service;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main {

    public static void main(String[] args) {

        Gson snakeCaseGson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new LoggingInterceptor())
                .build();

        Retrofit wsapiEmvAio = new Retrofit.Builder()
                .baseUrl("http://emv-aio.bos.roamdata.com/wsapi/")
                .addConverterFactory(GsonConverterFactory.create(snakeCaseGson))
                .client(client)
                .build();

        Apiws6Service apiws6Service = wsapiEmvAio.create(Apiws6Service.class);

        System.out.println("\n\n\n Call Version 3: \n\n");
        String userName = "vbokka_sub";
        String password = "123456";
        callVersion3(apiws6Service, userName, password);
    }

    public static void callVersion3(Apiws6Service apiws6Service, String userName, String password) {

        Call<Apiws6LoginResponse> loginCall = apiws6Service.Login(new Apiws6LoginRequestBody(userName, password));
        Response loginResponse = null;

        try {
            loginResponse = loginCall.execute();

            System.out.println("====================\n\n\n");
            System.out.println("Login Response successful? : " + loginResponse.isSuccessful());
            System.out.println("Login Response organizationId: " + ((Apiws6LoginResponse) loginResponse.body()).getOrganizationId());
            System.out.println("Login Response terminalId: " + ((Apiws6LoginResponse) loginResponse.body()).getTerminalId());
            System.out.println("Login Response chainId: " + ((Apiws6LoginResponse) loginResponse.body()).getChainId());
            System.out.println("Login Response storeId: " + ((Apiws6LoginResponse) loginResponse.body()).getStoreId());
            System.out.println("====================\n\n\n");
            System.out.println("Login Response configuration: " + ((Apiws6LoginResponse) loginResponse.body()).getConfiguration().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
