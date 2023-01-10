package com.example.droidcafechallenge;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.droidcafechallenge.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
    "com.example.droidcafechallenge.etra.MESSAGE";
    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Droid Cafe Challenge - Nabilla");
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            FloatingActionButton fab = findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent =
                            new Intent(MainActivity.this, OrderActivity.class);
                    intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
                    startActivity(intent);
                }
            });
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();

            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        public void displayToast(String message) {
            Toast.makeText(getApplicationContext(), message,
                    Toast.LENGTH_SHORT).show();
        }


        public void showDonutOrder(View view) {
            mOrderMessage = getString(R.string.donut_order_message);
            displayToast(mOrderMessage);
        }

        public void showIceCreamOrder(View view) {
            mOrderMessage = getString(R.string.ice_cream_order_message);
            displayToast(mOrderMessage);
        }

        public void showFroyoOrder(View view) {
            mOrderMessage = getString(R.string.froyo_order_message);
            displayToast(mOrderMessage);
        }
    }