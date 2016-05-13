package com.roamdata.mavenHelloWorld.dao.example;

/**
 * Created by Josh on 5/12/16.
 * This is actually The Error Response from a Repo request.
 */
public class RepoErrorResponse {

    String message;
    String documentation_url;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDocumentation_url() {
        return documentation_url;
    }

    public void setDocumentation_url(String documentation_url) {
        this.documentation_url = documentation_url;
    }

    @Override
    public String toString() {
        return "Repo.message=" + message;
    }
}
