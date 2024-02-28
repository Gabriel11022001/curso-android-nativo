package com.app.colecoes.teste;

public class Pessoa implements Comparable<Pessoa> {

    public String nome;
    public Integer idade;

    public Pessoa() { }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa pessoa) {

        // -1 -> o que vai vir na frente
        if (pessoa.idade < this.idade) {

            return -1;
        }

        // 1 -> o que vai vir atras
        if (pessoa.idade > this.idade) {

            return 1;
        }

        // os dois elementos possuem valor de comparação iguais
        return 0;
    }
}
