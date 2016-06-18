package com.example.user.myapp4.movie;

import android.app.Activity;
import android.graphics.Movie;
import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.user.myapp4.R;

public class MovieActivity extends Activity{

    // final int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        setTitle("그리드 뷰 영화 포스터");
        final GridView gv = (GridView) findViewById(R.id.gridView1);
        MovieGridAdapter gAdapter = new MovieGridAdapter(this);
        gv.setAdapter(gAdapter);

    }


}
