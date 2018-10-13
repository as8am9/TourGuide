package com.example.elkingabomaher.sohagtourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Image extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image);
        imageView = (ImageView)findViewById(R.id.image_view);
        Bundle b = getIntent().getExtras();
        int imageId = b.getInt("image");
        imageView.setImageResource(imageId);
    }
}
