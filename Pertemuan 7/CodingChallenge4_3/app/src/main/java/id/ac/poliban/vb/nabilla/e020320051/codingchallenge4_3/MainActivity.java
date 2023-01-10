package id.ac.poliban.vb.nabilla.e020320051.codingchallenge4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.poliban.va.dwi.e020320002.codingchallenge4_3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("NavDrawerExperimen - Nabilla");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) getSupportActionBar().setTitle("Context Menu Scrolling Text 4_3 Dwi");

        TextView articleText = findViewById(R.id.article);
        registerForContextMenu(articleText);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.context_edit:
                displayToast(getString(R.string.context_edit_message));
                return true;
            case R.id.context_delete:
                displayToast(getString(R.string.context_delete_message));
                return true;
            case R.id.context_share:
                displayToast(getString(R.string.context_share_message));
                return true;
            default: return super.onContextItemSelected(item);
        }
    }

    private void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}