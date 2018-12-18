package com.example.team5.shinseoyougi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton1(View view) {
        Intent intent1 = new Intent(MainActivity.this, Gamerule.class);
        startActivity(intent1);
    }

    public void onClickButton2(View view) {
        Intent intent1 = new Intent(MainActivity.this, personquiz.class);
        startActivity(intent1);
    }

    public void onClickButton3(View view) {
        Intent intent1 = new Intent(MainActivity.this, sokdamquiz.class);
        startActivity(intent1);
    }

    public void onClickButton4(View view) {
        Intent intent1 = new Intent(MainActivity.this, fourquiz.class);
        startActivity(intent1);
    }

    public void onClickButton5(View view) {
        Intent intent1 = new Intent(MainActivity.this, searchword.class);
        startActivity(intent1);
    }
}
