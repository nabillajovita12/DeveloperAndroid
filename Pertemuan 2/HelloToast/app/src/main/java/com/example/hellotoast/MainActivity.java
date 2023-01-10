package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btToast = findViewById(R.id.bt_toast);
        Button btCount = findViewById(R.id.bt_count);
        tvValue = findViewById(R.id.tv_value);

        if (savedInstanceState != null){
            mCount = savedInstanceState.getInt("value");
        }

        btToast.setOnClickListener(o-> {
            Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
            mCount = 0;
            tvValue.setText()

        }
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    @Override
    protected void onSaveInstanceState(@)
}