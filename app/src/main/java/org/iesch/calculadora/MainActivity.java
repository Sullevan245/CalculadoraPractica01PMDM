package org.iesch.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numero1 = findViewById(R.id.etNumero1);
        EditText numero2 = findViewById(R.id.etNumero2);
        TextView resultado = findViewById(R.id.txtResultado);
        Button sumar = findViewById(R.id.btnSumar);
        Button restar = findViewById(R.id.btnRestar);
        Button multiplicar = findViewById(R.id.btnMultiplicar);
        Button dividir = findViewById(R.id.btnDividir);

        sumar.setOnClickListener(v -> {
            String primerNumero = numero1.getText().toString();
            String segundoNumero = numero2.getText().toString();
            if (primerNumero.isEmpty() || segundoNumero.isEmpty()){
                Log.d("Main Activity", "El campo numero1 o el numero2 estan vacios.");
                Toast.makeText(this, "Debe introducir 2 numeros", Toast.LENGTH_SHORT).show();
            }else {
                int n1 = Integer.parseInt(primerNumero);
                int n2 = Integer.parseInt(segundoNumero);
                int resultSuma = n1 + n2;
                resultado.setText(getString(R.string.resultado, resultSuma));

            }
        });

        restar.setOnClickListener(v -> {
            String primerNumero = numero1.getText().toString();
            String segundoNumero = numero2.getText().toString();
            if (primerNumero.isEmpty() || segundoNumero.isEmpty()){
                Log.d("Main Activity", "El campo numero1 o el numero2 estan vacios.");
                Toast.makeText(this, "Debe introducir 2 numeros", Toast.LENGTH_SHORT).show();
            }
            else {
                int n1 = Integer.parseInt(primerNumero);
                int n2 = Integer.parseInt(segundoNumero);
                int resultResta = n1 - n2;
                resultado.setText(getString(R.string.resultado, resultResta));
            }
        });
        multiplicar.setOnClickListener(v -> {
            String primerNumero = numero1.getText().toString();
            String segundoNumero = numero2.getText().toString();
            if (primerNumero.isEmpty() || segundoNumero.isEmpty()){
                Log.d("Main Activity", "El campo numero1 o el numero2 estan vacios.");
                Toast.makeText(this, "Debe introducir 2 numeros", Toast.LENGTH_SHORT).show();
            }
            else {
                int n1 = Integer.parseInt(primerNumero);
                int n2 = Integer.parseInt(segundoNumero);
                int resultMulti = n1 * n2;
                resultado.setText(getString(R.string.resultado, resultMulti));
            }
        });
        dividir.setOnClickListener(v -> {
            String primerNumero = numero1.getText().toString();
            String segundoNumero = numero2.getText().toString();
            if (primerNumero.isEmpty() || segundoNumero.isEmpty()){
                Log.d("Main Activity", "El campo numero1 o el numero2 estan vacios.");
                Toast.makeText(this, "Debe introducir 2 numeros", Toast.LENGTH_SHORT).show();
            }
            else {
                int n1 = Integer.parseInt(primerNumero);
                int n2 = Integer.parseInt(segundoNumero);
                int resultDivision = n1 / n2;
                resultado.setText(getString(R.string.resultado, resultDivision));
            }
        });
    }
}