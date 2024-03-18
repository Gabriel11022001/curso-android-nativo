package com.app.app_componentes_listagem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.app.app_componentes_listagem.adapter.AlimentoAdapter;

import java.util.ArrayList;
import java.util.List;

public class TesteLinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_linear_layout);
        RecyclerView recyclerView = findViewById(R.id.recycler_listagem_horizontal);
        List<Alimento> alimentos = new ArrayList<>();
        alimentos.add(new Alimento(1, "Bolo 1", 100));
        alimentos.add(new Alimento(2, "Bolo 2", 100));
        alimentos.add(new Alimento(3, "Bolo 3", 100));
        alimentos.add(new Alimento(4, "Bolo 4", 100));
        alimentos.add(new Alimento(5, "Bolo 5", 100));
        alimentos.add(new Alimento(6, "Bolo 6", 100));
        alimentos.add(new Alimento(7, "Bolo 7", 100));
        AlimentoAdapter alimentoAdapter = new AlimentoAdapter();
        alimentoAdapter.setAlimentos(alimentos);
        recyclerView.setAdapter(alimentoAdapter);
        /**
         * LinearLayoutManager -> gerenciador da recyclerview
         * -> posso utilizar como horizontal ou vertical por meio
         * do método setOrientation()
         * -> setLayoutManager(layout manager) -> definir o layout manager
         * da recyclerview
         */
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}