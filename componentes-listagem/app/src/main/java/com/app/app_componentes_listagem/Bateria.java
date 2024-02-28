package com.app.app_componentes_listagem;

import android.util.Log;

public class Bateria implements IInstrumento {

    @Override
    public void sendoTocado() {
        Log.i("teste", "Tocando a bateria!");
    }
}
