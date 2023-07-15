package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

public class ListViewAct extends AppCompatActivity {

    ListView lvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        lvResult = findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{{"Indonesia","ASIA","indonesia"},
                {"Malaysia","ASIA","malaysia"},{"Singapore","ASIA","singapore"},
                {"Italia","EROPA","italia"},{"Inggris","EROPA","inggris"},
                {"Belanda","EROPA","belanda"},{"Argentina","AMERIKA","argentina"},
                {"Chile","AMERIKA","chile"},{"Mesir","AFRIKA","mesir"},
                {"Uganda","AFRIKA","uganda"}};

        NegaraAdapter adapter = new NegaraAdapter(ListViewAct.this, dataNegara);
        lvResult.setAdapter(adapter);
    }
}