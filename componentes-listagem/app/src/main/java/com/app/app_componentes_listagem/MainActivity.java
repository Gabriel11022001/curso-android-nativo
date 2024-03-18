package com.app.app_componentes_listagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.app.app_componentes_listagem.adapter.AlimentoAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listaAlimentos;
    private AlimentoAdapter alimentoAdapter;
    private List<Alimento> alimentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaAlimentos = findViewById(R.id.list_view_alimentos);
        // alimentoAdapter = new AlimentoAdapter();
        //alimentos = new ArrayList<>();
        testeMusico();
        testeListView();
        Button btnTeste = findViewById(R.id.btn_ir_listagem_alimentos);
        btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AlimentosActivity.class);
                startActivity(intent);
            }
        });
    }

    private void testeMusico() {
        Musico musico1 = new Musico(new Bateria());
        musico1.tocar();
        Musico musico2 = new Musico(new Guitarra());
        musico2.tocar();
        IInstrumento bateriaTeste = new Bateria();
        IInstrumento guitarraTeste = new Guitarra();
        bateriaTeste.sendoTocado();
        guitarraTeste.sendoTocado();
        // guitarraTeste.testeGuitarra();
        Guitarra guitarra2 = new Guitarra();
        guitarra2.sendoTocado();
        guitarra2.testeGuitarra();
    }

    private void testeListView() {
        // definir um adapter para o listview
        ArrayAdapter<String> adapterListaAlimentos = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1);
        adapterListaAlimentos.addAll(
                "Coca-Cola de 2 litros",
                "Bolo",
                "Cenoura",
                "Uva"
        );
        listaAlimentos.setAdapter(adapterListaAlimentos);
    }
}