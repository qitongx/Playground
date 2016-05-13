package com.roamdata.mavenHelloWorld;

import com.google.gson.annotations.SerializedName;

/**
 * Created by j on 5/13/16.
 */
public class Repo {

    @SerializedName("git_url")
    String gitUrl;
    String defaultBranch;
}
