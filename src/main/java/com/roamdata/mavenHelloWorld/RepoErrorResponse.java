package com.roamdata.mavenHelloWorld;

/**
 * Created by Josh on 5/12/16.
 * This is actually The Error Response from a Repo request.
 */
public class RepoErrorResponse {

    String message;
    String documentation_url;

    @Override
    public String toString() {
        return "Repo.message=" + message;
    }
}
