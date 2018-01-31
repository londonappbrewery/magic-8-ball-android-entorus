package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button onAskButton = findViewById(R.id.askButton);
        final ImageView ballView = findViewById(R.id.ballView);
        final int[] ballViewArr = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        onAskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int number = rand.nextInt(5);
                ballView.setImageResource(ballViewArr[number]);
            }
        });
    }
}
