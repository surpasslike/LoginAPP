package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.service.databinding.ActivityAdminLoginBinding;
import com.example.service.databinding.ActivityAdminRegisterBinding;
import com.example.service.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String packageName = getPackageName();
        System.out.println(packageName);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
    public void onAdminButtonClick(View view) {
        Intent intent = new Intent(this, AdminLoginActivity.class);
        startActivity(intent);
    }
}