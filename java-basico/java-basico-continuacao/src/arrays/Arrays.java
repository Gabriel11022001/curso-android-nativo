package arrays;

import java.util.Scanner;

public class Arrays {
   
    static void lerDadosPessoas(String[] nomes, int[] idades) {
        Scanner console = new Scanner(System.in);
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe seu nome:");
            nomes[i] = console.next();
            System.out.println("Informe sua idade:");
            idades[i] = console.nextInt();
        }
        
    }
    
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Gabriel";
        nomes[1] = "Maria";
        nomes[2] = "Pedro";
        
        for (String nome : nomes) {
            
            if (nome != null) {
                System.out.println(nome);
            }
            
        }
        
        int[] idades = new int[3];
        lerDadosPessoas(nomes, idades);
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
        }
        
    }
}
