package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username, password;
    Button login;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.txt_username);
        password = findViewById(R.id.txt_password);
        login = findViewById(R.id.button);
        signup = findViewById(R.id.signup_reg);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equalsIgnoreCase("iqbal")
                && password.getText().toString().equalsIgnoreCase("iqbal03")){
                    Toast.makeText(login.this,
                            "Anda berhasil Login", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(login.this,
                            "Username atau Password anda salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(login.this, RegisterActivity.class);
                startActivity(register);
            }
        });

    }
}