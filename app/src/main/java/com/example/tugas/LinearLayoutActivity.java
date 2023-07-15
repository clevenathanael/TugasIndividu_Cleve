package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearLayoutActivity extends AppCompatActivity {
    Button tampilkan;
    EditText nama, alamat;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        tampilkan = findViewById(R.id.btntampilkan);
        nama =  findViewById(R.id.editnama);
        alamat =  findViewById(R.id.editalamat);
        hasil = findViewById(R.id.txthasil);

        tampilkan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                hasil.setText("Hallo Nama Saya " + nama.getText().toString()
                + " dan Alamat Saya di " + alamat.getText().toString());
            }

        });

    }
}