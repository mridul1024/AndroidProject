package com.example.mridul.instagameproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InterestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);
    }

    public void onBackPressed(){

        Intent intent = new Intent(InterestActivity.this, FeedActivity.class);
        startActivity(intent);

    }

}
