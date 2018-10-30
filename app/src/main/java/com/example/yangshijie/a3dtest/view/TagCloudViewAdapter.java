package com.example.yangshijie.a3dtest.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yangshijie.a3dtest.R;


public class TagCloudViewAdapter extends TagsAdapter {
    private TextView textView;
    private ImageView imageView;

    private Context context;


    public TagCloudViewAdapter(Context context){


    }
    @Override
    public int getCount() {
        return 50;
    }

    @Override
    public View getView(Context context, int position, ViewGroup parent) {
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.tagcloudview_layout, parent,false);
        textView=inflate.findViewById(R.id.tv1);
        imageView=inflate.findViewById(R.id.im1);
        textView.setText("杨大");
        textView.setSelected(true);

        return inflate;
    }

    @Override
    public Object getItem(int position) {



        return null;
    }

    @Override
    public int getPopularity(int position) {
        return position % 5;
    }

    @Override
    public void onThemeColorChanged(View view, int themeColor, float alpha) {

    }


}
