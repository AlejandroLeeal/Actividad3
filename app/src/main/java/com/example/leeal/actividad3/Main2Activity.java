package com.example.leeal.actividad3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.leeal.actividad3.Models.Usuario;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Usuario user = intent.getParcelableExtra("user");

        ((TextView)findViewById(R.id.texto)).setText(user.nombre);
        ((TextView)findViewById(R.id.texto1)).setText(user.apellido);
        ((TextView)findViewById(R.id.texto2)).setText(user.edad + " Años");
    }
}
