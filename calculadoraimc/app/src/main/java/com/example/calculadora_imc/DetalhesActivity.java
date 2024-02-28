package com.example.calculadora_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {

    private TextView txtResultado;
    private TextView txtPesoInformado;
    private TextView txtAlturaInformada;
    private TextView txtImc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        txtResultado = findViewById(R.id.txt_resultado);
        txtImc = findViewById(R.id.txt_imc);
        txtPesoInformado = findViewById(R.id.txt_label_peso);
        txtAlturaInformada = findViewById(R.id.txt_label_altura);
    }

    @Override
    protected void onStart() {
        super.onStart();
        apresentarValores();
    }

    private void apresentarValores() {
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            double pesoInformado = bundle.getDouble("peso");
            double alturaInformada = bundle.getDouble("altura");
            txtPesoInformado.setText("Peso informado: " + pesoInformado + "kg");
            txtAlturaInformada.setText("Altura informada: " + alturaInformada + " metros");
            double imc = calcularImc(pesoInformado, alturaInformada);
            txtImc.setText("IMC: " + imc);

            if (imc < 18.5) {
                txtResultado.setText("Resultado: Baixo");
            } else if (imc <= 24.9) {
                txtResultado.setText("Resultado: Normal");
            } else if (imc <= 29.9) {
                txtResultado.setText("Resultado: Sobrepeso");
            } else {
                txtResultado.setText("Resultado: Obesidade");
            }

        }

    }

    private double calcularImc(double peso, double altura) {

        return peso / Math.pow(altura, 2);
    }
}