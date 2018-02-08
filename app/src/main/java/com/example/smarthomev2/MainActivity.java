package com.example.smarthomev2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button to  input user settings
        Button customize = (Button) findViewById(R.id.customize);
        customize.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent settingsIntent = new Intent(getApplicationContext(), settings.class);
                startActivity(settingsIntent);
            }
        });

   /*     //Button to go to list
        Button startButton = (Button) findViewById(R.id.getStarted);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), getStartedActivity.class);
                startActivity(startIntent);
            }
        }); */

        //Button to go to DB list
        Button viewData = (Button) findViewById(R.id.viewData);
        viewData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), database_test.class);
                startActivity(startIntent);
            }
        });
    }
}