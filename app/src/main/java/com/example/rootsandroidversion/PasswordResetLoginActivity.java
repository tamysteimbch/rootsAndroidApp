package com.example.rootsandroidversion;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import android.os.Bundle;

public class PasswordResetLoginActivity extends AppCompatActivity {

    Button bBackToLoginPassword, bSendEmailPassword;
    EditText etEmailPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset_login);

        bSendEmailPassword.setOnClickListener(v ->{

            if(etEmailPassword.getText().toString().isEmpty()){

                Toast.makeText(getApplicationContext(), "The e-mail is required.", Toast.LENGTH_SHORT).show();

            }else{

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }

        });
        bBackToLoginPassword.setOnClickListener(v ->{
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        });

    }

    private void declarations(){
        //Button declarations
        bBackToLoginPassword = findViewById(R.id.bBackToLoginPassword);
        bSendEmailPassword   = findViewById(R.id.bSendEmailPassword);

        //Edit text declarations
        etEmailPassword = findViewById(R.id.etEmailPassword);
    }

}