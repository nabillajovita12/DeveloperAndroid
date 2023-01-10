package id.ac.poliban.vb.nabilla.e020320051.codingchallenge5_3;

import android.content.Intent;
import android.os.Bundle;
import android.transition.TransitionInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import id.ac.poliban.va.dwi.e020320002.codingchallenge5_3.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportsTitle = findViewById(R.id.titleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);
        TextView sportsDetail = findViewById(R.id.subTitleDetail);
        getWindow().setSharedElementEnterTransition(TransitionInflater.from(this)
                .inflateTransition(R.transition.shared_element));

        Intent intent = getIntent();
        String titleString = intent.getStringExtra("title");
        int imageInt = intent.getIntExtra("image_resource", 0);
        String details = intent.getStringExtra("details");

        sportsTitle.setText(titleString);
        Glide.with(this).load(imageInt).into(sportsImage);
        sportsDetail.setText(details);
    }
}