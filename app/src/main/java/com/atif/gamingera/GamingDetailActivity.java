package com.atif.gamingera;



import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

public class GamingDetailActivity extends AppCompatActivity {
    TextView name;
    TextView description;
    ImageView image;
    Article article;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming_detail);
        name=findViewById(R.id.name);
        description=findViewById(R.id.description);
        image=findViewById(R.id.image);

        article=new Gson().fromJson(getIntent().getStringExtra("data"),Article.class);

        name.setText(article.getName());
        description.setText(article.getDescription());
        image.setImageResource(article.getImage());



    }
}