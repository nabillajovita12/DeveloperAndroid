package com.example.shoppinglistchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_ITEMS = "com.example.shoppinglistchallenge.extra.ITEMS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_nabilla);
//        Intent intent = getIntent();
    }

    public void selectItem(View view) {
        Intent return_items_intent = new Intent();

        switch (view.getId()){
            case R.id.button10:
                return_items_intent.putExtra(EXTRA_ITEMS, "Chocolate"); setResult(RESULT_OK,
                    return_items_intent); finish();
                break;
            case R.id.button9:
                return_items_intent.putExtra(EXTRA_ITEMS, "Oil"); setResult(RESULT_OK,
                    return_items_intent); finish();
                break;
            case R.id.button8:
                return_items_intent.putExtra(EXTRA_ITEMS, "Salt"); setResult(RESULT_OK,
                    return_items_intent); finish();
                break;
            case R.id.button7:
                return_items_intent.putExtra(EXTRA_ITEMS, "Sugar"); setResult(RESULT_OK,
                    return_items_intent); finish();
                break;
            case R.id.button6:
                return_items_intent.putExtra(EXTRA_ITEMS, "Bread"); setResult(RESULT_OK,
                    return_items_intent); finish();
                break;
            case R.id.button5:
                return_items_intent.putExtra(EXTRA_ITEMS, "Wheat_flour"); setResult(RESULT_OK,
                    return_items_intent); finish();
                break;
            case R.id.button4:
                return_items_intent.putExtra(EXTRA_ITEMS, "Rice"); setResult(RESULT_OK,
                    return_items_intent); finish();
                break;
            case R.id.button3:
                return_items_intent.putExtra(EXTRA_ITEMS, "Cheese"); setResult(RESULT_OK,
                    return_items_intent); finish();
                break;
            case R.id.button2:
                return_items_intent.putExtra(EXTRA_ITEMS, "Eggs"); setResult(RESULT_OK,
                    return_items_intent); finish();
                break;
            case R.id.button1:
                return_items_intent.putExtra(EXTRA_ITEMS, "Milk"); setResult(RESULT_OK,
                    return_items_intent); finish();
                break;
            default:
                Toast.makeText(SecondActivity.this, "There was an error",
                        Toast.LENGTH_LONG).show();
                break;
        }

    }
}

