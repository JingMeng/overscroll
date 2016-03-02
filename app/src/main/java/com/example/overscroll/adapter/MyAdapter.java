package com.example.overscroll.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.overscroll.R;

/**
 * Created by changyou on 2016/3/1.
 */
public class MyAdapter extends BaseAdapter {
    private int size;
    private Context context;

    public MyAdapter(Context context, int size) {
        this.context = context;
        this.size = size;
    }

    @Override
    public int getCount() {
        return size;
    }

    @Override
    public Object getItem(int position) {
        return size;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
        }
        return convertView;
    }
}
