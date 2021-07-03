package com.example.studyplan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.Objects;

public class StartActivity extends AppCompatActivity {
    private Button mBtnLogin;
    private Button mBtnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mBtnLogin=(Button)findViewById(R.id.btn_loginstart);
        mBtnRegister=(Button)findViewById(R.id.btn_registerstart);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                intent=new Intent(StartActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                intent=new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}