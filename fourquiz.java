package com.example.team5.shinseoyougi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fourquiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourquiz);
    }

    public void onClickButton(View view) {
        Intent intent1 = new Intent(fourquiz.this, searchword.class);
        startActivity(intent1);
    }
}
