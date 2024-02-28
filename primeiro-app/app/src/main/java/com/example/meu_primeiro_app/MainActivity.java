package com.example.meu_primeiro_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtMeuNome;
    private TextView txtValorSorteado;
    private Button btn;
    private Button btnSortear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // mapeando elementos de tela
        this.txtMeuNome = findViewById(R.id.txt_meu_nome);
        this.btn = findViewById(R.id.btn_teste);
        this.txtValorSorteado = findViewById(R.id.txt_numero);
        this.btnSortear = findViewById(R.id.btn_sortear);
        // mapeando evento de clique
        this.btn.setOnClickListener(this);
        this.btnSortear.setOnClickListener(this);
    }

    public void clique() {
        Toast.makeText(getApplicationContext(), "Clicou no botão!", Toast.LENGTH_LONG)
                .show();
        this.txtMeuNome.setText("Alterando o nome!");
    }

    private void sortearNumero() {
        Random random = new Random();
        int numero = random.nextInt(10) + 1;
        this.txtValorSorteado.setText(String.valueOf(numero));
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.btn_teste) {
            clique();
        } else if (id == R.id.btn_sortear) {
            this.sortearNumero();
        }

    }
}