package com.adriangutierrez.android.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText fieldPeso;
    private EditText fieldEstatura;
    private Button ButtonCalcular;
    private Button ButtonLimpiar;
    private TextView TextImc;
    private TextView TextValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fieldPeso =(EditText) findViewById(R.id.field_peso);
        fieldEstatura = (EditText) findViewById(R.id.field_altura);
        ButtonCalcular = (Button) findViewById(R.id.Button_Calcular);
        ButtonLimpiar =(Button) findViewById(R.id.Button_Limpiar);
        TextImc = (TextView)findViewById(R.id.text_imc);
        TextValor = (TextView)findViewById(R.id.text_valor);

        ButtonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = fieldPeso.getText().toString();
                double peso = Double.parseDouble(s);
                s = fieldEstatura.getText().toString();
                double Estatura = Double.parseDouble(s);
                double imc = peso / Math.pow(Estatura,2);
                s = Double.toString(imc);
                TextImc.setText(s);
                if (TextImc <=) {

                }

                }
            });
        ButtonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fieldPeso.setText("");
                fieldEstatura.setText("");
                TextImc.setText("0.0");
            }
        });
    }
}
