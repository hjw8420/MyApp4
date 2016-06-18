package com.example.user.myapp4.movie;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.user.myapp4.R;

/**
 * Created by USER on 2016-06-18.
 */
public class MovieGridAdapter extends BaseAdapter{ // extends 는 alt+insert
    Context context;
    Integer[] posterID = {
            R.drawable.mov01,R.drawable.mov02,R.drawable.mov03,
            R.drawable.mov04,R.drawable.mov05,R.drawable.mov06,
            R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,
            R.drawable.mov10,
    };

    public MovieGridAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return posterID.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView iv = new ImageView(context);
        iv.setLayoutParams(new GridView.LayoutParams(100, 150));
        iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        iv.setPadding(5, 5, 5, 5);
        final int pos = position;
        iv.setImageResource(posterID[pos]);
        //findViewById(R.id.ivPoster).setOnClickListener(this);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = (View) View.inflate(context, R.layout.dialog, null);
                AlertDialog.Builder dig = new AlertDialog.Builder(context);
                ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.ivPoster);
                ivPoster.setImageResource(posterID[pos]);
                dig.setTitle("큰 포스터");
                dig.setIcon(R.drawable.movie_icon);
                dig.setView(dialogView);
                dig.setNegativeButton("닫기", null);
                dig.show();
            }
        });
        return iv;
    }
}
