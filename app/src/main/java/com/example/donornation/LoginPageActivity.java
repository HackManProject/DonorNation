package com.example.donornation;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        Button donar = (Button) findViewById(R.id.donar_button);
        donar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(LoginPageActivity.this, DonorRegistrationPageActivity.class);
                startActivity(myIntent);
            }
        });
        Button seeker = (Button) findViewById(R.id.seeker_button);
        seeker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(LoginPageActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
