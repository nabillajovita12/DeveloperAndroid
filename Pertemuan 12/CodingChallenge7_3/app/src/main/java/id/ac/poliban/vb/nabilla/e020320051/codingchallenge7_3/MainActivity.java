package id.ac.poliban.vb.nabilla.e020320051.codingchallenge7_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import id.ac.poliban.va.dwi.e020320002.codingchallenge7_3.R;

public class MainActivity extends AppCompatActivity {
    private final CustomReceiver customReceiver = new CustomReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar()!=null)getSupportActionBar().setTitle("Headset Receiver - Nabilla");

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_HEADSET_PLUG);
        this.registerReceiver(customReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        this.unregisterReceiver(customReceiver);
        super.onDestroy();
    }
}