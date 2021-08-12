package com.example.rootsandroidversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bClientLogin, bPartnerRegisterLogin, bForgotPasswordClient, bRegisterClient;
    EditText etLoginEmailClient, etLoginPasswordClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declarations();

        bClientLogin.setOnClickListener( v ->{

            if(etLoginPasswordClient.getText().toString().isEmpty() ||
               etLoginEmailClient.getText().toString().isEmpty() ) {

                Toast.makeText(getApplicationContext(), "All fields are required", Toast.LENGTH_LONG).show();

            } else {

                Toast.makeText(getApplicationContext(), "Login complete", Toast.LENGTH_SHORT).show();
            }

        });

        bRegisterClient.setOnClickListener(v ->{
            Intent intentRegister = new Intent(getApplicationContext(), RegisterActivity.class);
            startActivity(intentRegister);
        });

        bForgotPasswordClient.setOnClickListener(v ->{
            Intent intentForgotPassword = new Intent(this, PasswordResetLoginActivity.class);
            startActivity(intentForgotPassword);
        });

    }
    private void declarations(){
        // Button declaration
        bClientLogin = findViewById(R.id.bClientLogin);
        bPartnerRegisterLogin = findViewById(R.id.bPartnerRegisterLogin);
        bForgotPasswordClient = findViewById(R.id.bForgotPasswordClient);
        bRegisterClient = findViewById(R.id.bRegisterClient);

        // Edit Text declaration
        etLoginEmailClient = findViewById(R.id.etLoginEmailClient);
        etLoginPasswordClient = findViewById(R.id.etLoginPasswordClient);
    }
}