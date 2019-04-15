package com.jhonny.android.minitwitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnlogin;
    TextView tvGoSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        btnlogin = findViewById(R.id.buttonLogin);
        tvGoSignUp = findViewById(R.id.textViewGoSignup);

        btnlogin.setOnClickListener(this);
        tvGoSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.buttonLogin:
                break;
            case R.id.textViewGoSignup:
                goToSignUp();
                break;
        }

    }


    private void goToSignUp(){
        Intent i = new Intent(MainActivity.this, SignUpActitvity.class);
        startActivity(i);
        finish();
    }


}
