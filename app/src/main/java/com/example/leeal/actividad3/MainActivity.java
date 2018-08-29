package com.example.leeal.actividad3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.leeal.actividad3.Models.Usuario;

public class MainActivity extends AppCompatActivity {
@Override

protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }

        public void enviarclick(View view) {

                String nombre=((EditText)findViewById(R.id.nombretext)).getText().toString();

                String apellido=((EditText)findViewById(R.id.apellidotext)).getText().toString();

                String edad=((EditText)findViewById(R.id.edadtext)).getText().toString();

                Usuario a = new Usuario(nombre, apellido, edad);

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("user", a);
                startActivity(intent);
        }
}



