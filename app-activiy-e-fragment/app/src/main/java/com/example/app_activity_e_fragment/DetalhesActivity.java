package com.example.app_activity_e_fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;

import com.example.app_activity_e_fragment.model.Produto;

public class DetalhesActivity extends AppCompatActivity {

    private TextView txtId, txtNome, txtAtivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        Button btnFechar = findViewById(R.id.btn_fechar);
        txtId = findViewById(R.id.txt_id);
        txtNome = findViewById(R.id.txt_nome);
        txtAtivo = findViewById(R.id.txt_ativo);
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // para fechar a activity é só invocar o método finish();
                finish();
            }
        });
        ActionBar actionBar = getSupportActionBar();
        
        if (actionBar != null) {
            // apresenta o botão de retorno na ActionBar
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        /**
         * O método onCreate é invocado quando a Activity
         * está sendo criada, é no escopo desse método que posso
         * implementar a apresentação de um loader.
         */
        System.out.println("Executando o método onCreate()!");
        // obter dados vindos da tela anterior
        Bundle bundleDadosVindosTelaInicial = getIntent().getExtras();
        int id = bundleDadosVindosTelaInicial.getInt("id");
        String nome = bundleDadosVindosTelaInicial.getString("nome");
        boolean ativo = bundleDadosVindosTelaInicial.getBoolean("ativo");
        System.out.println("=============================================");
        System.out.println(id);
        System.out.println(nome);
        System.out.println(ativo);
        System.out.println("=============================================");
        txtId.setText("id: " + id);
        txtNome.setText("nome: " + nome);
        txtAtivo.setText("ativo: " + (ativo ? "ativo" : "inativo"));
        Produto produto = (Produto) bundleDadosVindosTelaInicial.getSerializable("produto");
        System.out.println("produto: " + produto.getDescricao() + " | preço: " + produto.getPreco());
    }

    @Override
    protected void onStart() {
        super.onStart();
        /**
         * método que é executado após o onCreate(), nesse método,
         * posso implementar uma requisição HTTP para buscar
         * dados por meio de uma API.
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

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            // android.R.id.home id do botão de retorno da actionbar
            fechar();
        }

        return super.onOptionsItemSelected(item);
    }

    private void fechar() {
        finish();
    }

    @Override
    public void onBackPressed() {
        /**
         * método invocado quando o usuário pressiona o botão
         * de retorno do android
         */
        System.out.println("O usuário pessionou o botão de retorno do android!");
        super.onBackPressed();
    }
}