package operadores_aritmeticos;

public class Operadores {
    
    public static void main(String[] args) {
        /**
         * os operadores matemáticos em java são:
         * + -> soma
         * - -> subtração
         * / -> divisão
         * * -> multiplicação
         * % -> resto da divisão
         */
        int primeiroValor, segundoValor;
        primeiroValor = 12;
        segundoValor = 55;
        int soma = primeiroValor + segundoValor;
        int subtracao = primeiroValor - segundoValor;
        /**
         * quando eu realizo a divisão de um valor inteiro
         * por outro inteiro, o resultado será a parte inteira
         * da divisão
         */
        int divisao = primeiroValor / segundoValor;
        int multiplicacao = primeiroValor * segundoValor;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("" + (double) primeiroValor / (double) segundoValor);
        System.out.println("Resto da divisão: " + (primeiroValor % segundoValor));
    }
}
