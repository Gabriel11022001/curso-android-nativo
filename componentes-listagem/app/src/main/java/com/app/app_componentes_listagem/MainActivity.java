package com.app.app_componentes_listagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testeMusico();
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
}