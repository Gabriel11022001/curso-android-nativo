package exercicios.java.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaProduto {
    
    static void apresentarMenu() {
        System.out.println("Escolha uma opcão!");
        System.out.println("1 - Cadastrar produto estadual");
        System.out.println("2 - Cadastrar produto nacional");
        System.out.println("3 - Cadastrar produto importado");
        System.out.println("4 - Exibir produtos estaduais");
        System.out.println("5 - Exibir produtos nacionais");
        System.out.println("6 - Exibir produtos importados");
        System.out.println("7 - Exibir todos os produtos");
        System.out.println("8 - Sair");
    }
    
    static boolean validarOpcao(int opcao) {
        
        if (opcao < 1 || opcao > 8) {
            
            return false;
        }
        
        return true;
    }
    
    static void cadastrarProduto(String tipoProduto, List<Produto> produtos) {
        Scanner console = new Scanner(System.in);
        Produto produto;
        
        if (tipoProduto.equals("estadual")) {
            produto = new ProdutoEstadual();
        } else if (tipoProduto.equals("nacional")) {
            produto = new ProdutoNacional();
        } else {
            produto = new ProdutoImportado();
        }
        
        System.out.println("Informe a descrição do produto:");
        produto.setDescricao(console.next());
        System.out.println("Informe o valor do produto:");
        produto.setValor(console.nextDouble());
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }
    
    static void apresentarProdutos(String tipoProduto, List<Produto> produtos) {
        List<Produto> produtosApresentar = new ArrayList<>();
        
        if (tipoProduto.equals("estadual")) {
            
            for (Produto produto : produtos) {
                
                if (produto instanceof ProdutoEstadual) {
                    produtosApresentar.add(produto);
                }
                
            }
            
            if (produtosApresentar.size() == 0) {
                System.out.println("Não existem produtos estaduais cadastrados!");
            }
            
        } else if (tipoProduto.equals("nacional")) {
            
            for (Produto produto : produtos) {
                
                if (produto instanceof ProdutoNacional) {
                    produtosApresentar.add(produto);
                }
                
            }
            
            if (produtosApresentar.size() == 0) {
                System.out.println("Não existem produtos nacionais cadastrados!");
            }
            
        } else {
            
            for (Produto produto : produtos) {
                
                if (produto instanceof ProdutoImportado) {
                    produtosApresentar.add(produto);
                }
                
            }
            
            if (produtosApresentar.size() == 0) {
                System.out.println("Não existem produtos importados cadastrados!");
            }
            
        }
        
        for (Produto produtoApresentar : produtosApresentar) {
            produtoApresentar.apresentar();
        }
        
    }
    
    static void apresentarTodosProdutos(List<Produto> todosProdutos) {
        
        for (Produto prod : todosProdutos) {
            prod.apresentar();
        }
        
    }
    
    public static void main(String[] args) {
        
        try {
            int opcao = 0;
            Scanner console = new Scanner(System.in);
            List<Produto> produtos = new ArrayList<>();
            
            do {
                apresentarMenu();
                System.out.println("Informe uma opção:");
                opcao = console.nextInt();
                
                if (!validarOpcao(opcao)) {
                    System.out.println("Opção inválida!");
                } else {
                    
                    if (opcao == 1) {
                        cadastrarProduto("estadual", produtos);
                    } else if (opcao == 2) {
                        cadastrarProduto("nacional", produtos);
                    } else if (opcao == 3) {
                        cadastrarProduto("importado", produtos);
                    } else if (opcao == 4) {
                        apresentarProdutos("estadual", produtos);
                    } else if (opcao == 5) {
                        apresentarProdutos("nacional", produtos);
                    } else if (opcao == 6) {
                        apresentarProdutos("importado", produtos);
                    } else if (opcao == 7) {
                        apresentarTodosProdutos(produtos);
                    } else {
                        System.out.println("Saindo...");
                    }
                    
                }
                
            } while(opcao != 8);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
