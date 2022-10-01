package com.papb1.pertemuan7.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    TextView title, lyric;
    String txtTitle, txtLyric;
    int img_photo;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        txtTitle = bundle.getString("title");
        txtLyric = bundle.getString("lyric");
        img_photo = bundle.getInt("picture");

        title = (TextView) findViewById(R.id.title);
        lyric = (TextView) findViewById(R.id.lyric);
        img = (ImageView) findViewById(R.id.image);

        title.setText(txtTitle);
        lyric.setText(txtLyric);

        Glide.with(DetailActivity.this)
                .load(img_photo)
                .apply(new RequestOptions().override(370,370))
                .into(img);
    }

}
