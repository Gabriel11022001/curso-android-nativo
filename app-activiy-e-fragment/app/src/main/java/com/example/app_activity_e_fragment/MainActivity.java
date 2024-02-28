package com.example.app_activity_e_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.app_activity_e_fragment.model.Produto;

public class MainActivity extends AppCompatActivity {

    private Button btnIrTelaDetalhes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIrTelaDetalhes = findViewById(R.id.btn_ir_tela_detalhes);
        btnIrTelaDetalhes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irTelaDetalhes();
            }
        });
    }

    private void irTelaDetalhes() {
        /**
         * Para transitar para outra activity, eu preciso inicialmente
         * instanciar um objeto da classe Intent, no construtor eu passo
         * como primeiro argumento o contexto da tela atual(activity atual)
         * e como segundo argumento a activity para onde vou ser redirecionado, em seguida
         * eu preciso invocar o método startActivity(intent) passando o intent como argumento,
         * após invocar esse método eu serei redirecionado para a outra activity
         */
        Intent intentIrTelaDetalhes = new Intent(getApplicationContext(), DetalhesActivity.class);
        // é possível passar parâmetros na intent para outra tela
        intentIrTelaDetalhes.putExtra("id", 1);
        intentIrTelaDetalhes.putExtra("nome", "Gabriel Rodrigues dos Santos");
        intentIrTelaDetalhes.putExtra("ativo", true);
        Produto produto = new Produto(
                1,
                "Coca-Cola 2L",
                11.90
        );
        intentIrTelaDetalhes.putExtra("produto", produto);
        startActivity(intentIrTelaDetalhes);
    }

    @Override
    protected void onStart() {
        super.onStart();
        /**
         * método que é executado após o onCreate(), nesse método,
         * posso implementar uma requisição HTTP para buscar
         * dados por meio de uma API.
         * OBS: Se eu abrir uma nova activity, por exemplo, para visualizar detalhes de
         * alguma coisa(produto, categoria, cliente, etc...) e em seguida retornar
         * para a activity atual(onde eu apresento a listagem), o método invocado é o
         * onStart(), então em telas onde eu apresento listagem de elementos vindos de uma
         * REST Api, eu posso implementar a requisição no método onStart()
         */
        System.out.println("Executando o método onStart()!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        /**
         * método que é incovado após o onStart(), nesse método
         * posso implementar o processo de esconder o loader
         */
        System.out.println("Executando o método onResume()!");
    }
}