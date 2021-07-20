package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut(); //log out
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }

    void testNewUserPush() {
        Log.d("test","測試用另一個使用者上傳程式");
    }
}