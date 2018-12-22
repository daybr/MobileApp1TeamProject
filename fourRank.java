package com.example.team5.shinseoyougi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.models.BarModel;

public class fourRank extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_rank);


        BarChart mBarChart = (BarChart) findViewById(R.id.barchart);

        mBarChart.addBar(new BarModel(3, 0xFF123456));
        mBarChart.addBar(new BarModel(2, 0xFF873F56));
        mBarChart.addBar(new BarModel(3, 0xFF56B7F1));
        mBarChart.addBar(new BarModel(2, 0xFF1FF4AC));

        mBarChart.startAnimation();

    }
}
