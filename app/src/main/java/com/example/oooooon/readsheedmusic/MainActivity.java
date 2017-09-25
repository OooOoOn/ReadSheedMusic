package com.example.oooooon.readsheedmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button read = (Button) findViewById(R.id.button_read);
        Button readAndListen = (Button) findViewById(R.id.button_readAndListen);
        Button listen = (Button) findViewById(R.id.button_listen);

        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSecond = new Intent();
            }
        });
    }

    public void nextActivity(View v){


    }
}
