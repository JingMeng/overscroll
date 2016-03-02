package com.example.overscroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.example.overscroll.adapter.MyAdapter;
import com.example.overscrolllib.OverScrollListView;

/**
 * Created by changyou on 2016/3/1.
 */
public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        OverScrollListView listView = (OverScrollListView) findViewById(R.id.list_view);
        MyAdapter adapter = new MyAdapter(this, 3);
        listView.setAdapter(adapter);
    }

}
