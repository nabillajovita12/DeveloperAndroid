package com.example.sayhello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondSayHello extends AppCompatActivity {

    private static final String TAG = "TAG";
    TextView helloViewView;
    TextView counterViewView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_say_hello);
        helloViewView = (TextView) findViewById(R.id.article);
        counterViewView = (TextView) findViewById(R.id.number);
        Intent intent = getIntent();
        helloViewView.setText("Hello!");
        counterViewView.setText(Integer.toString(intent.getIntExtra(MainActivity.COUNT, 0)));
    }
}