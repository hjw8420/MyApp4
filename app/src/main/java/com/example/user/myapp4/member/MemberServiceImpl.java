package com.example.user.myapp4.member;

import android.app.Activity;

/**
 * Created by USER on 2016-06-11.
 */
public class MemberServiceImpl extends Activity implements MemberService { // alt+insert 눌러서 아래틀 자동생성
    MemberDAO dao = null;
    @Override
    public String signup(MemberBean member) { //void 아니면 return 값이 있어야 함
        return dao.signup(member);
    }

    @Override
    public MemberBean login(MemberBean member) {
        return dao.login(member);
    }

    @Override
    public MemberBean update(MemberBean member) {
        return dao.update(member);
    }

    @Override
    public String delete(MemberBean member) {
        return dao.delete(member);
    }
}
