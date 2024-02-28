package exercicios.java.exercicio5;

public class Teste {
    
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(12);
        lista.adicionar(44);
        lista.adicionar(1);
        lista.apresentar();
        lista.remover(3);
        lista.apresentar();
        lista.informarNumeroElementosArmazenados();
        lista.remover(0);
        lista.remover(1);
        lista.remover(2);
        lista.remover(3);
        lista.remover(1);
        lista.remover(0);
        lista.informarNumeroElementosArmazenados();
    }
    
}
