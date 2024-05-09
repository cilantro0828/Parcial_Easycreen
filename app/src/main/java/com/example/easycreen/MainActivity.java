package com.example.easycreen;

import  android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.easycreen.MainActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {


    private ViewPager viewPager;
    private ImageAdapter adapter;
    private int[] images = {R.drawable.netflix_1, R.drawable.disney_1, R.drawable.max_1, R.drawable.win_1};

    Button btn_ingre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        adapter = new ImageAdapter(this, images);
        viewPager.setAdapter(adapter);

        btn_ingre = findViewById(R.id.btn_ingre);

        btn_ingre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });

    }
}