package com.example.user.myapp4.member;

/**
 * Created by USER on 2016-06-11.
 */
public class MemberBean {
    private String id;
    private String pw;
    private String name;
    private String email;

    public String getId() { //alt+insert 눌러서 getter and setter 눌러서 아래틀 자동생성
        return id;
    }

    public void setId(String id) { //여기로 들어와서 id 가 private 으로 잠겨버림 (void 는 리턴값이 없음)
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[회원정보]" +
                "ID='" + id + '\'' +
                ", 비밀번호='" + pw + '\'' +
                ", 이름='" + name + '\'' +
                ", 이메일='" + email + '\'';
    }
}
