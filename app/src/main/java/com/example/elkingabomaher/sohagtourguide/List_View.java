package com.example.elkingabomaher.sohagtourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class List_View extends AppCompatActivity {
    TextView nameId,detId;
    ImageView imageView , back ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        nameId = (TextView)findViewById(R.id.txt_name_activity);
        detId = (TextView)findViewById(R.id.txt_det_activity);
        imageView = (ImageView)findViewById(R.id.image_activity);
        back = (ImageView)findViewById(R.id.back_icon);
        Bundle b = getIntent().getExtras();
        final int image = b.getInt("image");
        String name = b.getString("name");
        String det = b.getString("det");
        nameId.setText(name);
        detId.setText(det);
        imageView.setImageResource(image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),Image.class);
                Bundle b = new Bundle();
                b.putInt("image",image);
                intent1.putExtras(b);
                startActivity(intent1);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
