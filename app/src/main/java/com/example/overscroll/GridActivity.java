package com.example.overscroll;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.example.overscroll.adapter.MyAdapter;
import com.example.overscrolllib.OverScrollGridView;

/**
 * Created by changyou on 2016/3/1.
 */
public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_activity);
        OverScrollGridView gridView = (OverScrollGridView) findViewById(R.id.grid_view);
        MyAdapter adapter = new MyAdapter(this, 10);
        gridView.setAdapter(adapter);
    }
}
