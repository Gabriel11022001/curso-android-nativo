package com.example.calculadora_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputEditText edtPeso;
    private TextInputEditText edtAltura;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtAltura = findViewById(R.id.edt_altura);
        edtPeso = findViewById(R.id.edt_peso);
        btnCalcular = findViewById(R.id.btn_calcular);
        btnCalcular.setOnClickListener(this);
    }

    private boolean validarCampos() {
        boolean ok = true;
        String pesoString = edtPeso.getText().toString();
        String alturaString = edtAltura.getText().toString();

        if (pesoString.isEmpty()) {
            ok = false;
            Toast.makeText(getApplicationContext(), "Informe o peso!", Toast.LENGTH_LONG).show();
        } else if (Double.parseDouble(pesoString) <= 0) {
            ok = false;
            Toast.makeText(getApplicationContext(), "Peso inválido!", Toast.LENGTH_LONG).show();
        } else if (alturaString.isEmpty()) {
            ok = false;
            Toast.makeText(getApplicationContext(), "Informe a altura!", Toast.LENGTH_LONG).show();
        } else if (Double.parseDouble(alturaString) <= 0) {
            ok = false;
            Toast.makeText(getApplicationContext(), "Altura inválida!", Toast.LENGTH_LONG).show();
        }

        return ok;
    }

    private void passarDadosTelaDetalhes() {

        try {

            if (validarCampos()) {
                // passar peso e altura para a tela de detalhes
                Intent intentPassarDadosTelaDetalhes = new Intent(getApplicationContext(), DetalhesActivity.class);
                double peso = Double.parseDouble(edtPeso.getText().toString());
                double altura = Double.parseDouble(edtAltura.getText().toString());
                intentPassarDadosTelaDetalhes.putExtra("peso", peso);
                intentPassarDadosTelaDetalhes.putExtra("altura", altura);
                startActivity(intentPassarDadosTelaDetalhes);
            }

        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_calcular) {
            passarDadosTelaDetalhes();
        }

    }
}