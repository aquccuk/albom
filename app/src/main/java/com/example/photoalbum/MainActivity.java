package com.example.photoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button buttonNext;
    Button buttonPrevious;
    ImageView screen;
    TextView urlShow;
    int index = 0;
    final Random r = new Random();

    @SuppressLint({"ResourceType", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNext = findViewById(R.id.btnNext);
        buttonPrevious = findViewById(R.id.btnPrevious);
        screen = findViewById(R.id.imgScreen);
        urlShow = findViewById(R.id.showUrl);

        index = r.nextInt(100) + 1;

        urlShow.setText("http://myfile.org/" + index);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });

        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}