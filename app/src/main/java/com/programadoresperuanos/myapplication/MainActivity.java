package com.programadoresperuanos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText entrada1,entrada2;
    Button boton1, boton2, boton3, boton4;
    TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada1 = findViewById(R.id.editText);
        entrada2 = findViewById(R.id.editText2);
        boton1 = findViewById(R.id.button);
        boton2 = findViewById(R.id.button2);
        boton3 = findViewById(R.id.button3);
        boton4 = findViewById(R.id.button4);
        salida = findViewById(R.id.textView);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(entrada1.getText().toString());
                int n2 = Integer.parseInt(entrada2.getText().toString());
                int respuesta = n1+n2;
                salida.setText(String.valueOf(respuesta));
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(entrada1.getText().toString());
                int n2 = Integer.parseInt(entrada2.getText().toString());
                int respuesta = n1-n2;
                salida.setText(String.valueOf(respuesta));
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(entrada1.getText().toString());
                int n2 = Integer.parseInt(entrada2.getText().toString());
                int respuesta = n1*n2;
                salida.setText(String.valueOf(respuesta));
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(entrada1.getText().toString());
                int n2 = Integer.parseInt(entrada2.getText().toString());
                int respuesta = n1/n2;
                salida.setText(String.valueOf(respuesta));
            }
        });
    }
}
