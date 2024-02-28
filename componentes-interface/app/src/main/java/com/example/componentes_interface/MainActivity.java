package com.example.componentes_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTeste = findViewById(R.id.btn_teste_texto);
        btnTeste.setOnClickListener(this);
    }

    private void redirecionarSegundaTela() {
        Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_teste_texto) {
            redirecionarSegundaTela();
        }

    }
}