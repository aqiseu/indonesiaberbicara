package com.indonesiaberbicara.discussionapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.indonesiaberbicara.discussionapp.model.Article;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailArticleActivity extends AppCompatActivity {



    @BindView(R.id.messageRecyclerView)
    RecyclerView messageRecyclerView;
    Article activeArticle;
    DatabaseReference dbReference;
    public static final String CHILD = "message";


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_artcle);
        ButterKnife.bind(this);
        activeArticle = DataSource.getInstance().activeArticle;
    }


}
