package com.gudgie.dagger2;

import javax.inject.Inject;

public class NetworkApi {

    @Inject
    public NetworkApi() {
    }

    public boolean validateUser(String username, String password) {
        return username == null || username.length() == 0;
    }

}
