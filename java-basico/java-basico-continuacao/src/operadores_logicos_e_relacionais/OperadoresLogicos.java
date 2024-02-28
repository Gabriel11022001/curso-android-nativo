package operadores_logicos_e_relacionais;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
        /**
         * os operadores lógicos são:
         * && -> and
         * || -> or
         * ! -> not
         */
        int primeiroValor = 12;
        int segundoValor = 33;
        System.out.println(primeiroValor > 11 && segundoValor < 50); // true
        System.out.println(primeiroValor > 11 && segundoValor > 100); // false
        System.out.println(primeiroValor > 11 || segundoValor > 100); // true
        System.out.println(primeiroValor == 13 || segundoValor == 10); // false
    }
}
