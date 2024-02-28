package com.app.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTelefonica {

    private List<String> telefones;

    public ListaTelefonica() {
        this.telefones = new ArrayList<>();
    }

    public void adicionarTelefone(String telefone) {
        this.telefones.add(telefone);
    }

    public void adicionarVariosTelefones(String... telefones) {
        Collections.addAll(this.telefones, telefones);
    }

    public List<String> getTelefones() {

        return this.telefones;
    }
}
