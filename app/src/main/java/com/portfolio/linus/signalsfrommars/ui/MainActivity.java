package com.portfolio.linus.signalsfrommars.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.portfolio.linus.signalsfrommars.R;

public class MainActivity extends AppCompatActivity {

    // MVP:
    // Model:data and objects to display.
    // View: How it's displayed.(xml layout-files).
    // Presenter: formats the model for display and handles events like user inputs.(Activities)

    private EditText nameField;
    private Button startBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = findViewById(R.id.userInput);
        startBtn = findViewById(R.id.startButton);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String userName = nameField.getText().toString();
              startStory(userName);
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        nameField.setText("");
    }

    private void startStory(String userName) {
        Intent intent = new Intent(this,StoryActivity.class);
        Resources resources = getResources();
        String key = resources.getString(R.string.key_name);
        intent.putExtra(key,userName);
        startActivity(intent);
    }
}
