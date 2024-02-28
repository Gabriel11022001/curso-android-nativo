package exercicios.java.exercicio5;

public class Lista {
    
    protected int[] valores;
    protected boolean listaVazia;
    
    public Lista() {
        this.valores = new int[1];
        this.listaVazia = true;
    }
    
    protected int[] copiarListaAtual() {
        int[] listaCopia = new int[this.valores.length + 1];
        
        for (int i = 0; i < this.valores.length; i++) {
            int valor = this.valores[i];
            listaCopia[i] = valor;
        }
        
        return listaCopia;
    }
    
    public void adicionar(int numero) {
        
        if (this.listaVazia) {
            this.valores[0] = numero;
        } else {
            int[] listaCopia = this.copiarListaAtual();
            listaCopia[listaCopia.length - 1] = numero;
            this.valores = listaCopia;    
        }
        
        this.listaVazia = false;
        System.out.println("Valor " + numero + " adicionado com sucesso na lista!");
    }
    
    public void apresentar() {
        
        if (this.listaVazia) {
            System.out.println("A lista não possui elementos!");
            
            return;
        }
        
        for (int valor : this.valores) {
            System.out.println("Valor: " + valor);
        }
        
    }
    
    public void remover(int indice) {
        
        if (this.listaVazia) {
            System.out.println("A lista não possui elementos!");
            
            return;
        }
        
        if (indice < 0 || indice > this.valores.length - 1) {
            System.out.println("Índice inválido!");
            
            return;
        }
        
        if (this.valores.length == 1 && indice == 0) {
            this.valores[0] = 0;
            this.listaVazia = true;
        } else {
            int[] novaLista = new int[this.valores.length - 1];
            int indiceAtualNovaLista = 0;
            
            for (int i = 0; i < this.valores.length; i++) {
                
                if (i != indice) {
                    novaLista[indiceAtualNovaLista] = this.valores[i];
                    indiceAtualNovaLista++;
                }
                
            }
            
            this.valores = novaLista;
        }
        
        System.out.println("Valor do indice " + indice + " removido com sucesso!");
    }
    
    public void informarNumeroElementosArmazenados() {
        
        if (this.listaVazia) {
            System.out.println("A lista não possui elementos!");
        } else {
            System.out.println("A lista possui " + this.valores.length + " elementos!");
        }
        
    }
}
