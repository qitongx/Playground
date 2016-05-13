package com.roamdata.mavenHelloWorld.dao.wsapi6;

/**
 * Created by j on 5/13/16.
 */
public class Apiws6LoginRequestBody {
    String userName;
    String password;

    public Apiws6LoginRequestBody(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
