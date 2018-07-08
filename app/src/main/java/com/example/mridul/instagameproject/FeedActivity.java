package com.example.mridul.instagameproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FeedActivity extends AppCompatActivity {

    Button navDrawer, directMessage;
    TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        navDrawer = (Button) findViewById(R.id.navBtn);
        directMessage = (Button) findViewById(R.id.directmessageBtn);

        header = (TextView) findViewById(R.id.feedHeader);

        navDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(),"Tapped navDrawer",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(FeedActivity.this, NavigationDrawer.class);
                startActivity(intent);
            }
        });

        directMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(getApplicationContext(),"Tapped directMessage",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(FeedActivity.this, UserProfileActivity.class);
                startActivity(intent);
            }
        });

        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FeedActivity.this, InterestActivity.class);
                startActivity(intent);

            }
        });

    }

    public void onBackPressed(){

        Intent intent = new Intent(FeedActivity.this, LoginActivity.class);
        FeedActivity.this.startActivity(intent);

    }

}
