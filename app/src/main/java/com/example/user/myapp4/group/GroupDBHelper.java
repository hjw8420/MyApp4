package com.example.user.myapp4.group;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by USER on 2016-06-18.
 */
public class GroupDBHelper extends SQLiteOpenHelper { // alt+enter 하고, alt+insert 버튼
    public GroupDBHelper(Context context) {
        super(context, "hanbitDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE group(_id INTEGER PRIMARY KEY, name TEXT, num INTEGER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS group");
        this.onCreate(db);
    }
}
