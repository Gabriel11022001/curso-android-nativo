package exercicios.java.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    
    static void apresentarMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Relatório geral");
        System.out.println("9 - Sair");
    }
    
    static void cadastrarAluno(List<Aluno> alunosAcademia) {
        Aluno aluno = new Aluno();
        Scanner console = new Scanner(System.in);
        
        if (alunosAcademia.size() == 0) {
            aluno.setId(1);
        } else {
            Aluno ultimoAluno = alunosAcademia.get(alunosAcademia.size() - 1);
            aluno.setId(ultimoAluno.getId() + 1);
        }
        
        System.out.println("Informe o nome do aluno:");
        aluno.setNome(console.next());
        System.out.println("Informe o peso do aluno:");
        double peso = console.nextDouble();
        
        while (peso <= 0) {
            System.out.println("Peso inválido!");
            System.out.println("Informe o peso do aluno:");
            peso = console.nextDouble();
        }
        
        System.out.println("Informe a altura do aluno:");
        double altura = console.nextDouble();
        
        while (altura <= 0) {
            System.out.println("Altura inválida!");
            System.out.println("Informe a altura do aluno:");
            altura = console.nextDouble();
        }
        
        System.out.println("Informe a idade do aluno:");
        int idade = console.nextInt();
        
        while (idade <= 0) {
            System.out.println("Idade inválida!");
            System.out.println("Informe a idade do aluno:");
            idade = console.nextInt();
        }
        
        aluno.setPeso(peso);
        aluno.setIdade(idade);
        aluno.setAltura(altura);
        alunosAcademia.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }
    
    static void apresentarAlunos(List<Aluno> alunos) {
        
        if (alunos.size() == 0) {
            System.out.println("Não existem alunos cadastrados!");
        } else {
            
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            
        }
        
    }
    
    static void relatorioGeral(List<Aluno> alunos) {
        
        if (alunos.size() == 0) {
            System.out.println("Não existem alunos cadastrados!");
        } else {
            
            for (Aluno aluno : alunos) {
                aluno.exibir();
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        
        try {
            List<Aluno> alunos = new ArrayList<>();
            int opcao = 0;
            Scanner console = new Scanner(System.in);
            
            do {                
                apresentarMenu();
                opcao = console.nextInt();
                
                while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 9) {
                    System.out.println("Opção inválida!");
                    apresentarMenu();
                    opcao = console.nextInt();
                }
                
                if (opcao == 1) {
                    cadastrarAluno(alunos);
                } else if (opcao == 2) {
                    apresentarAlunos(alunos);
                } else if (opcao == 3) {
                    relatorioGeral(alunos);
                } else {
                    System.out.println("Saindo...");
                }
                
            } while (opcao != 9);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
