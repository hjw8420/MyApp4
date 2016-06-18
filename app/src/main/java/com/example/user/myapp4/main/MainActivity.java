package com.example.user.myapp4.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.user.myapp4.R;
import com.example.user.myapp4.calc.CalcActivity;
import com.example.user.myapp4.group.GroupActivity;
import com.example.user.myapp4.kaup.KaupActivity;
import com.example.user.myapp4.login.Login2Activity;
import com.example.user.myapp4.signup.SignupActivity;

import static com.example.user.myapp4.R.id.btKaup;

public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(btKaup)).setOnClickListener(this);
        ((Button) findViewById(R.id.btCalc)).setOnClickListener(this);
        ((Button) findViewById(R.id.btLogin)).setOnClickListener(this);
        ((Button) findViewById(R.id.btSignup)).setOnClickListener(this);
        ((Button) findViewById(R.id.btGroup)).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btKaup:
                startActivity(new Intent(this, KaupActivity.class));
                break;
            case R.id.btCalc:
                startActivity(new Intent(this, CalcActivity.class));
                break;
            case R.id.btLogin:
                startActivity(new Intent(this, Login2Activity.class));
                break;
            case R.id.btSignup:
                startActivity(new Intent(this, SignupActivity.class));
                break;
            case R.id.btGroup:
                startActivity(new Intent(this, GroupActivity.class));
                break;

        }
    }
}
