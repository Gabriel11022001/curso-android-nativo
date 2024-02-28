package loop_while;

public class Teste {
    
    static void sequenciaFibonnaci() {
        int primeiroValor = 1;
        int segundoValor = 1;
        int proximoValor;
        int contador = 0;
        System.out.println(primeiroValor);
        System.out.println(segundoValor);
        
        while (contador < 10) {
            proximoValor = primeiroValor + segundoValor;
            primeiroValor = segundoValor;
            segundoValor = proximoValor;
            System.out.println(proximoValor);
            contador++;
        }
        
    }
    
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Gabriel";
        nomes[1] = "Maria";
        nomes[2] = "Fernando";
        nomes[3] = "Pedro";
        int contador = 0;
        
        while (contador < nomes.length) {
            System.out.println(nomes[contador]);
            contador++;
        }
        
        System.out.println("Valor do contador: " + contador);
        sequenciaFibonnaci();
    }
}
