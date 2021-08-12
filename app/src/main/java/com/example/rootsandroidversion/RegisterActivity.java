package com.example.rootsandroidversion;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Button bBackToLogin, bSaveRegistration;
    EditText etNameRegistration, etEmailRegistration, etBirthRegistration, etPasswordRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        declarations();

        bBackToLogin.setOnClickListener(v ->{
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });

        bSaveRegistration.setOnClickListener(v ->{

            if( etNameRegistration.getText().toString().isEmpty()  ||
                etEmailRegistration.getText().toString().isEmpty() ||
                etBirthRegistration.getText().toString().isEmpty() ||
                etPasswordRegistration.getText().toString().isEmpty() ){

                Toast.makeText(getApplicationContext(), "All fields are required", Toast.LENGTH_SHORT).show();

            } else {

                Toast.makeText(getApplicationContext(), "Registration complete!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            };

        });

    }

    private void declarations(){
        //Button declarations
        bBackToLogin      = findViewById(R.id.bBackToLogin);
        bSaveRegistration = findViewById(R.id.bSaveRegistration);

        //Edit Text declarations
        etNameRegistration     = findViewById(R.id.etNameRegistration);
        etEmailRegistration    = findViewById(R.id.etEmailRegistration);
        etBirthRegistration    = findViewById(R.id.etBirthRegistration);
        etPasswordRegistration = findViewById(R.id.etPasswordRegistration);
    }

}