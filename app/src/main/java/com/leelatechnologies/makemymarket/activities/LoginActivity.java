package com.leelatechnologies.makemymarket.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.leelatechnologies.makemymarket.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void goToHome(View view) {
        Intent intent =new Intent(LoginActivity.this,NavigationActivity.class);
        startActivity(intent);
    }

    public void goToRegistration(View view) {
        Intent intent =new Intent(LoginActivity.this,RegistrationActivity.class);
        startActivity(intent);
    }
}
