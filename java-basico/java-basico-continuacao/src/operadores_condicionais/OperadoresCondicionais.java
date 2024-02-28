package operadores_condicionais;

import java.util.Scanner;

public class OperadoresCondicionais {
    
    public static void main(String[] args) {
        String nome = "Gabriel Rodrigues dos Santos";
        
        if (nome.length() > 10) {
            System.out.println("Nome bem comprido!");
        }
        
        double valorTotalVenda, desconto;
        valorTotalVenda = 3000;
        
        if (valorTotalVenda >= 4000) {
            desconto = 20;
        } else if (valorTotalVenda >= 1200) {
            desconto = 16;
        } else {
            desconto = 5;
        }
        
        double valorFinalVenda = valorTotalVenda - ((desconto / 100) * valorTotalVenda);
        System.out.println("Valor total da venda: " + valorFinalVenda);
        System.out.println("O desconto foi de " + desconto + "%");
        int idade;
        Scanner console = new Scanner(System.in);
        System.out.println("Informe sua idade:");
        idade = console.nextInt();
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else if (idade >= 1) {
            System.out.println("Você é menor de idade!");
        } else {
            System.out.println("Idade inválida!");
        }
        
        int idadePrimeiraPessoa, idadeSegundaPessoa;
        String nomePrimeiraPessoa, nomeSegundaPessoa, nomePessoaMaisVelha = "";
        System.out.println("Informe seu nome:");
        nomePrimeiraPessoa = console.next();
        System.out.println("Informe sua idade:");
        idadePrimeiraPessoa = console.nextInt();
        System.out.println("Informe seu nome:");
        nomeSegundaPessoa = console.next();
        System.out.println("Informe sua idade:");
        idadeSegundaPessoa = console.nextInt();
        
        if (idadePrimeiraPessoa == idadeSegundaPessoa) {
            System.out.println("Os dois possuem a mesma idade!");
        } else if (idadePrimeiraPessoa > idadeSegundaPessoa) {
            nomePessoaMaisVelha = nomePrimeiraPessoa;
        } else {
            nomePessoaMaisVelha = nomeSegundaPessoa;
        }
        
        if (!nomePrimeiraPessoa.equals("")) {
            System.out.println("Pessoa mais velha: " + nomePessoaMaisVelha);
        }
        
    }
}
