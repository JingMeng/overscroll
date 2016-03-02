package com.example.overscroll;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
         findViewById(R.id.list_view).setOnClickListener(this);
         findViewById(R.id.grid_view).setOnClickListener(this);
         findViewById(R.id.scroll_view).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.list_view:
                intent.setClass(this,ListViewActivity.class);
                break;
            case R.id.grid_view:
                intent.setClass(this,GridActivity.class);
                break;
            case R.id.scroll_view:
                intent.setClass(this,ScrollViewActivity.class);
                break;
        }
        startActivity(intent);
    }
}
