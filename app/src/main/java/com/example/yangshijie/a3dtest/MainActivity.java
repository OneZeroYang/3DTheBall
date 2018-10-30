package com.example.yangshijie.a3dtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yangshijie.a3dtest.view.TagCloudView;
import com.example.yangshijie.a3dtest.view.TagCloudViewAdapter;

public class MainActivity extends AppCompatActivity {

    private TagCloudView tagCloudView;
    private TagCloudViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tagCloudView=findViewById(R.id.home_tcv);

        adapter=new TagCloudViewAdapter(this);
        tagCloudView.setAdapter(adapter);
    }
}
