package com.example.a61meng.ecofiltro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LearnMore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_more);

        ImageView imv1 = findViewById(R.id.StoryButton);
        imv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Story.class);
                startActivity(intent);


            }
        });
        ImageView imb2 = findViewById(R.id.HowItWorksButton);
        imb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HowItWorks.class);
                startActivity(intent);


            }
        });
        ImageView imb3 = findViewById(R.id.whyUsButton);
        imb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WhyEco.class);
                startActivity(intent);


            }
        });
        ImageView imb4 = findViewById(R.id.BadWaterButton);
        imb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BadWater.class);
                startActivity(intent);
            }
        });
        TextView tv1 = findViewById(R.id.ContactUs);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ContactUs.class);
                startActivity(intent);
            }
        });
        TextView tv2 = findViewById(R.id.FAQbutton);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FAQs.class);
                startActivity(intent);
            }
        });


    }

}