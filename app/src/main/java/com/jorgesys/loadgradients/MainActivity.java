package com.jorgesys.loadgradients;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView myImageView = findViewById(R.id.myImageView);
        myImageView.setImageResource(R.drawable.ic_strawberry);
    }
}
