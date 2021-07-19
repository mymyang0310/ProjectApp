package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

    }

    public void login(View view){
        FirebaseAuth.getInstance().signOut(); //log in
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }

    public void register(View view){
        FirebaseAuth.getInstance().signOut(); //register
        startActivity(new Intent(getApplicationContext(),Register.class));
        finish();
    }
}