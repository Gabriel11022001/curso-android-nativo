package metodos;

public class Teste {
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double primeiroValor = 12;
        double segundoValor = 43;
        System.out.println(calculadora.somar(primeiroValor, segundoValor));
        System.out.println(calculadora.subtrair(primeiroValor, segundoValor));
    }
}
