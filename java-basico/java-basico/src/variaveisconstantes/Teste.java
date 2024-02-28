package variaveisconstantes;

public class Teste {

    public static void main(String[] args) {
        String nome = "Gabriel Rodrigues dos Santos";
        final int idade = 21;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        nome = "Gabriel";
        System.out.println(nome);
        // idade = 22; não é possível alterar o valor de uma constante
        // tipos das variáveis
        /**
         * String -> tipo que representa textos
         * int -> tipo que representa números inteiros
         * double -> tipo que representa números reais
         * float -> tipo que representa números reais
         * boolean -> tipo que representa true ou false
         */
        String primeiroNome = "Gabriel";
        String sobrenome = "Rodrigues";
        String nomeCompleto = primeiroNome + " " + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);
        int idadePessoa = 22;
        System.out.println("Idade: " + idadePessoa);
        double peso = 98;
        float altura = 1.83f;
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Altura: " + altura + "m");
        boolean possuiCnh = true;
        System.out.println("Possui cnh? " + (possuiCnh ? "Sim" : "Não"));
        int primeiroValor = 12, segundoValor = 33;
        System.out.println(primeiroValor + segundoValor);
        double terceiroValor = 33.98;
        System.out.println(primeiroValor + terceiroValor);
        // também existem os tipos representados por classes
        Integer valorInteiro = 23;
        String texto = "Texto qualquer";
        Double imc = 22.9;
        System.out.println(valorInteiro);
        System.out.println(texto);
        System.out.println(imc);
        Boolean possuiCarteiraIdentidade = true;
        System.out.println(possuiCarteiraIdentidade);
    }
}
