package exercicios.java.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    
    static void apresentarMenu() {
        
    }
    
    static void cadastrarConta(List<ContaCorrenteEspecial> contas) {
        Scanner console = new Scanner(System.in);
        int idTitular = 0;
        
        if (contas.size() == 0) {
            idTitular = 1;
        } else {
            idTitular = contas.get(contas.size() - 1).getTitular().getId() + 1;
        }
        
        Titular titular = new Titular();
        System.out.println("Informe o nome do titular:");
        titular.setNome(console.next());
        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial();
        contaCorrenteEspecial.setTitular(titular);
        System.out.println("Informe o número da conta:");
        contaCorrenteEspecial.setNumero(console.nextInt());
        System.out.println("Informe o limite da conta:");
        contaCorrenteEspecial.setLimite(console.nextDouble());
        contas.add(contaCorrenteEspecial);
        System.out.println("Conta cadastrada com sucesso!");
    }
    
    static ContaCorrenteEspecial buscarContaPeloNumero(int numero, List<ContaCorrenteEspecial> contas) {
        ContaCorrenteEspecial contaCorrenteEspecial = null;
        
        for (ContaCorrenteEspecial conta : contas) {
            
            if (conta.getNumero() == numero) {
                contaCorrenteEspecial = conta;
            }
            
        }
        
        return contaCorrenteEspecial;
    }
    
    static void sacar(List<ContaCorrenteEspecial> contas) {
        Scanner console = new Scanner(System.in);
        int numeroConta = 0;
        double valorSacar = 0;
        System.out.println("Informe o número da conta:");
        numeroConta = console.nextInt();
        ContaCorrenteEspecial contaCorrenteEspecial = buscarContaPeloNumero(numeroConta, contas);
        
        if (contaCorrenteEspecial == null) {
            System.out.println("Não existe uma conta cadastrada com esse número!");
            
            return;
        }
        
        System.out.println("Quanto você deseja sacar?");
        valorSacar = console.nextDouble();
        contaCorrenteEspecial.sacar(valorSacar);
    }
    
    static void depositar(List<ContaCorrenteEspecial> contas) {
        Scanner console = new Scanner(System.in);
        double valor = 0;
        int numeroConta = 0;
        ContaCorrenteEspecial contaDepositar = null;
        System.out.println("Informe o número da conta:");
        numeroConta = console.nextInt();
        contaDepositar = buscarContaPeloNumero(numeroConta, contas);
        
        if (contaDepositar == null) {
            System.out.println("Não existe uma conta cadastrada com esse número!");
            
            return;
        }
        
        System.out.println("Quanto você deseja depositar?");
        contaDepositar.depositar(console.nextDouble());
    }
    
    public static void main(String[] args) {
        
        try {
            List<ContaCorrenteEspecial> contas = new ArrayList<>();
            int opcao = 0;
            Scanner console = new Scanner(System.in);
            
            while (opcao != 9) {
                apresentarMenu();
                System.out.println("Escolha um apção:");
                opcao = console.nextInt();
                
                if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4
                && opcao != 5 && opcao != 6 && opcao != 7 && opcao != 9) {
                    System.out.println("Opção inválida!");
                } else {
                    
                    if (opcao == 1) {
                        cadastrarConta(contas);
                    } else if (opcao == 2) {
                        sacar(contas);
                    } else if (opcao == 3) {
                        depositar(contas);
                    } else if (opcao == 4) {
                         
                    } else if (opcao == 5) {
                        
                    } else if (opcao == 6) {
                        
                    } else if (opcao == 7) {
                        
                    } else {
                        System.out.println("Saindo...");
                    }
                    
                }
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
