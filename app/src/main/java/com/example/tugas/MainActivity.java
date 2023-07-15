package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button linear, relative, login, bahasa, negara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear = findViewById(R.id.btnLinear);
        relative = findViewById(R.id.btnRelative);
        login = findViewById(R.id.btnLogin);
        bahasa = findViewById(R.id.btnBahasa);
        negara = findViewById(R.id.btnNegara);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linearlayout = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(linearlayout);
            }
        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relativelayout = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(relativelayout);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(MainActivity.this, com.example.tugas.login.class);
                startActivity(login);
            }
        });

        bahasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bhs = new Intent(MainActivity.this, ListViewData.class);
                startActivity(bhs);
            }
        });
    }
}