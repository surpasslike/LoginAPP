package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class UserService extends Service {
    public UserService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}