package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class ResetPasswordSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password_success);
    }

    public void back(View view){
        FirebaseAuth.getInstance().signOut(); //log out
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
    //Disable back button
    @Override
    public void onBackPressed(){
        moveTaskToBack(true);
    }
}