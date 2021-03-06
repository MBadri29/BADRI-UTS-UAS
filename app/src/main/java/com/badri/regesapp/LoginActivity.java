package com.badri.regesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.badri.regesapp.R;

public class LoginActivity extends AppCompatActivity {
    EditText npp, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //GET INPUT
        npp = findViewById(R.id.npp);
        password = findViewById(R.id.password);

        //LOGIN
        findViewById(R.id.login).setOnClickListener(view -> {
            String strNpp = npp.getText().toString();
            String strPassword = password.getText().toString();

            //VERIFY LOGIN (Belum Pake Database :D)
            if(strNpp.equals("181011402864") && strPassword.equals("badri")){
                startActivity(new Intent(this, MainActivity.class));
            } else{
                Toast.makeText(this, "NPP atau Password salah", Toast.LENGTH_LONG).show();
            }
        });

    }
}