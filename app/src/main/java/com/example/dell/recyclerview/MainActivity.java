package com.example.dell.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

private ArrayList<String> mNames = new ArrayList<>();
private ArrayList<String> mImageUrl= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        initImageBitmaps();
    }
    private void  initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
        mImageUrl.add("https://www.gstatic.com/webp/gallery/5.webp");
        mNames.add("INDIA");

        mImageUrl.add("https://upload.wikimedia.org/wikipedia/commons/2/2d/Snake_River_%285mb%29.jpg");
        mNames.add("AMERICA");
        mImageUrl.add("https://www.gstatic.com/webp/gallery/4.jpg");
        mNames.add("GERMAN");
        mImageUrl.add("https://www.gstatic.com/webp/gallery/1.jpg");
        mNames.add("CANADA");
        mImageUrl.add("https://www.gstatic.com/webp/gallery/2.webp");
        mNames.add("LONDON");
        mImageUrl.add("https://www.gstatic.com/webp/gallery/5.webp");
        mNames.add("SINGAPORE");
        mImageUrl.add("https://www.gstatic.com/webp/gallery/4.jpg");
        mNames.add("MALAYSIA");
        mImageUrl.add("https://www.gstatic.com/webp/gallery/2.webp");
        mNames.add("CHINA");
        mImageUrl.add("https://www.gstatic.com/webp/gallery/1.jpg");
        mNames.add("JAPAN");
        mImageUrl.add("https://www.gstatic.com/webp/gallery/4.jpg");
        mNames.add("RUSSIA");

initRecyclerView();


    }


    public void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init RecyclerView.");
        RecyclerView recyclerView= findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mNames,mImageUrl);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


        
    }
}
