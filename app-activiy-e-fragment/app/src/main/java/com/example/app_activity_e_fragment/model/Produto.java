package com.example.app_activity_e_fragment.model;

import java.io.Serializable;

public class Produto implements Serializable {

    private int id;
    private String descricao;
    private Double preco;

    public Produto (int id, String descricao, Double preco) {
        this.setId(id);
        this.setDescricao(descricao);
        this.setPreco(preco);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return this.id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {

        return this.descricao;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {

        return this.preco;
    }
}
