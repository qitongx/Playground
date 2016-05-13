package com.roamdata.mavenHelloWorld.dao.example;

import com.google.gson.annotations.SerializedName;

/**
 * Created by j on 5/13/16.
 */
public class Repo {

    @SerializedName("git_url")
    String gitUrl;
    String defaultBranch;

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }
}
