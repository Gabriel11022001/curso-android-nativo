package com.app.app_componentes_listagem;

import android.util.Log;

public class Guitarra implements IInstrumento {

    @Override
    public void sendoTocado() {
        Log.i("teste", "Tocando a guitarra!");
    }

    public void testeGuitarra() {
        Log.i("teste", "Teste guitarra!");
    }
}
