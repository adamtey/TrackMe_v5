package com.example.trackme;

import android.app.Application;
import android.content.Intent;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MySingleton extends Application {
    public void onCreate(){
        super.onCreate();

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

        if(firebaseUser != null){

            Intent intent = new Intent(MySingleton.this , MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

           // startActivity(new Intent(MySingleton.this, HomeActivity.class));

//            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//            startActivity(intent);
        }
    }

}
