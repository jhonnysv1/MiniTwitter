package com.jhonny.android.minitwitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActitvity extends AppCompatActivity implements View.OnClickListener {

    Button btnSignUp;
    TextView tvGoLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_actitvity);

        getSupportActionBar().hide();

        btnSignUp = findViewById(R.id.buttonRegister);
        btnSignUp.setOnClickListener(this);

        tvGoLogin = findViewById(R.id.textViewGoLogin);
        tvGoLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        switch (id){
            case R.id.buttonRegister:
                break;
            case R.id.textViewGoLogin:
                goToLogin();
                break;
        }

    }

    private void goToLogin(){
        Intent i = new Intent(SignUpActitvity.this, MainActivity.class);
        startActivity(i);
        finish();
    }


}
