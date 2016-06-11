package com.example.user.myapp4.signup;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.user.myapp4.R;
import com.example.user.myapp4.member.MemberBean;
import com.example.user.myapp4.member.MemberDAO;
import com.example.user.myapp4.member.MemberService;
import com.example.user.myapp4.member.MemberServiceImpl;

public class SignupActivity extends Activity implements View.OnClickListener{
    EditText etID,etPW,etName,etEmail;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etName = (EditText) findViewById(R.id.etName);
        etID = (EditText) findViewById(R.id.etID);
        etPW = (EditText) findViewById(R.id.etPW); //ctrl+d 누르면 한줄 카피
        etEmail = (EditText) findViewById(R.id.etEmail); //ctrl+y 누르면 한줄 카피
        textResult = (TextView) findViewById(R.id.textResult); //ctrl+y 누르면 한줄 카피
        ((Button)findViewById(R.id.btSignup)).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) { // alt+insert 로 한번에 생성
        String name = etName.getText().toString();
        String id = etID.getText().toString();
        String pw = etPW.getText().toString();
        String email = etEmail.getText().toString();
        MemberBean member = new MemberBean();
        MemberService service = new MemberServiceImpl(); // 객체 Instance //shift+F6 Rename
        MemberDAO dao = new MemberDAO(this.getApplicationContext());
        member.setId(id);
        member.setPw(pw);
        member.setName(name);
        member.setEmail(email);
        String msg = dao.signup(member); // ctrl 키 누르고 signup 클릭
        textResult.setText("회원가입 결과 : " + msg);
    }
}
