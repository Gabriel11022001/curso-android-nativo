package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.fragments.fragment.ChamadosFragment;
import com.example.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnIrTelaConversas;
    private Button btnIrTelaChamadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIrTelaConversas = findViewById(R.id.btn_ir_tela_conversas);
        btnIrTelaChamadas = findViewById(R.id.btn_ir_tela_chamadas);
        btnIrTelaConversas.setOnClickListener(this);
        btnIrTelaChamadas.setOnClickListener(this);
        /**
         * Para adicionar um fragment, primeiro eu instacio um objeto da classe FragmentTransaction,
         * em seguida, eu invoco o método add() passando o id do container view e em seguida
         * uma instancia do objeto da classe do fragment, e por fim invoco o método
         * commit()
         */
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_container_view, new ConversasFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View view) {
        /**
         * O método replace() serve para substituir um fragment por outro
         */

        if (view.getId() == R.id.btn_ir_tela_conversas) {
            // redirecionar para o fragment de conversas
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container_view, new ConversasFragment())
                    .commit();
        } else {
            // redirecionar para o fragment de chamados
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container_view, new ChamadosFragment())
                    .commit();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        /**
         * Quando eu invoco o método onBackPressed na activity
         * que possui o fragment, é invocado o método onDestroy()
         * do fragment que estiver dentro da activity
         */
        Log.i("TESTE", "Foi invocado o método onBackPressed da activity!");
    }
}