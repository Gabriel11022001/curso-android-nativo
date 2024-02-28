package com.app.app_componentes_listagem;

public class Musico {

    private IInstrumento instrumento;

    public Musico() { }

    public Musico(IInstrumento instrumento) {
        this.instrumento = instrumento;
    }

    public void tocar() {
        this.instrumento.sendoTocado();
    }
}
