package com.example.fragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragments.R;

public class ChamadosFragment extends Fragment {

    public ChamadosFragment() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Caso eu deseje obter dados vindos de outra activity
         * por meio de um Bundle, eu devo obter esse valor no método onCreate()
         * eu obtenho o objeto Bundle por meio do método getArguments()
         */
        Bundle argumentos = getArguments();

        if (argumentos != null) {
            Log.i("TESTE", argumentos.getString("teste"));
            Log.i("TESTE_INT", String.valueOf(argumentos.getInt("teste_valor_inteiro")));
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * No caso dis fragments, o método onCreateView() é utilizado para
         * montar o layout.
         */
        return inflater.inflate(R.layout.fragment_chamados, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("TESTE", "O usuário fechou o fragment ChamadosFragment!");
    }
}