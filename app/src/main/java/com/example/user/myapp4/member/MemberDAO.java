package com.example.user.myapp4.member;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by USER on 2016-06-11.
 */
public class MemberDAO extends SQLiteOpenHelper { // alt+insert 해서 extends 의 경우는 override 클릭

    public MemberDAO(Context context) {
        super(context, null, null, 1);
        // DB_NAME , null, DB_VERSION
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override // override 는 extends 할때 쓰는 것임
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public String signup(MemberBean member) { //void 아니면 return 값이 있어야 함
        String name = member.getName();
        String id = member.getId();
        String pw = member.getPw();
        String email = member.getEmail();

        Log.i("name",name);
        Log.i("id",id);
        Log.i("pw",pw);
        Log.i("email",email);

        return "회원가입을 축하합니다";
    }

    public MemberBean login(MemberBean member) {
        MemberBean mem = new MemberBean();
        mem.setId(member.getId());
        mem.setName("홍길동");
        mem.setPw(member.getPw());
        mem.setEmail("hong@naver.com");
        Log.i("name",mem.getName());
        Log.i("id",mem.getId());
        Log.i("pw",mem.getPw());
        Log.i("email",mem.getEmail());
        return mem;
    }

    public MemberBean update(MemberBean member) {
        MemberBean mem = new MemberBean();
        return mem;
    }

    public String delete(MemberBean member) {
        return "삭제완료";
    }
}
