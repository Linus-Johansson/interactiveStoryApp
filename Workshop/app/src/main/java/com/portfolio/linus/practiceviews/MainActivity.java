package com.portfolio.linus.practiceviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView countedNumber;
    private Button countMe;
    public int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countedNumber = findViewById(R.id.showCount);
        countMe = findViewById(R.id.countMe);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                countedNumber.setText(count+"");

            }
        };
        countMe.setOnClickListener(listener);
    }
}
