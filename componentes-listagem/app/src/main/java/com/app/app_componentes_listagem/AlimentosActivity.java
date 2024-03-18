package com.app.app_componentes_listagem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.app.app_componentes_listagem.adapter.AlimentoAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class AlimentosActivity extends AppCompatActivity {

    private List<Alimento> alimentos;
    private AlimentoAdapter alimentoAdapter;
    private RecyclerView recyclerViewAlimentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentos);
        recyclerViewAlimentos = findViewById(R.id.recycler_alimentos);
        // preparar o adapter
        alimentos = new ArrayList<>();
        alimentos.add(new Alimento(1, "Bolo", 1000));
        alimentos.add(new Alimento(2, "Fanta Uva", 1000));
        alimentos.add(new Alimento(3, "Barra de Chocolate", 10000));
        alimentos.add(new Alimento(4, "Bolo de Morango", 12000));
        // configurando o listener para o evento de clique da lista
        IOnClickItemListaListener eventoCliqueItemLista = new IOnClickItemListaListener() {
            @Override
            public void click(String nomeAlimento) {
                Toast.makeText(getApplicationContext(), "Clicou no alimento: " + nomeAlimento, Toast.LENGTH_SHORT)
                        .show();
            }
        };
        // configurando evento de remover elemento da lista
        IOnRemoverListener iOnRemoverListener = new IOnRemoverListener() {
            @Override
            public void remover(int posicaoElemento) {
                removerAlimento(posicaoElemento);
            }
        };
        alimentoAdapter = new AlimentoAdapter(
                alimentos,
                eventoCliqueItemLista,
                iOnRemoverListener
        );
        // preparando a recyclerview
        recyclerViewAlimentos.setAdapter(alimentoAdapter); // definindo o adapter
        recyclerViewAlimentos.setLayoutManager(new LinearLayoutManager(this)); // definindo o layoutmanager
        // adicionar o divisor dos itens da recyclerview
        recyclerViewAlimentos.addItemDecoration(new DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
        ));
        FloatingActionButton btnTeste = findViewById(R.id.btn_teste);
        /*btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TesteLinearLayoutActivity.class);
                startActivity(intent);
            }
        });*/
        // adicionar item na recyclerview
        btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * sempre que o conjunto de dados sofre alteração, é necessário notificar
                 * ao adapter que houve tal alteração.
                 * - método notifyDataSetChanged() -> notifica ao adapter que toda a lista precisa
                 * ser atualizada.
                 */
            }
        });
    }

    private void removerAlimento(int posicaoElemento) {
        Log.i("posicao", "Posição do alimento a ser removido: " + posicaoElemento);
        this.alimentos.remove(posicaoElemento);
        // notificando o adapter que o elemento foi removido do dataset
        this.alimentoAdapter.notifyItemRemoved(posicaoElemento);
        // notifyItemRemoved(posicaoElemento) -> método que notifica o adapter que o elemento na posição X foi removido do dataset
    }
}