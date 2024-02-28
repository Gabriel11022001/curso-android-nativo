package com.app.colecoes.classes_internas;

public class Externa {

    private String textoExterno;

    public void setTextoExterno(String textoExterno) {
        this.textoExterno = textoExterno;
    }

    public String getTextoExterno() {

        return this.textoExterno;
    }

    public void apresentarTextoExterno() {
        System.out.println(this.getTextoExterno());
    }

    public static class Interna {

        private String textoInterno;

        public void setTextoInterno(String textoInterno) {
            this.textoInterno = textoInterno;
        }

        public String getTextoInterno() {

            return this.textoInterno;
        }

        public void apresentarTextoInterno() {
            System.out.println(this.getTextoInterno());
        }
    }
}
