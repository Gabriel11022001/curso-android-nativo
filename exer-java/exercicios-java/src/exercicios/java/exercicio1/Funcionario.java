package exercicios.java.exercicio1;

public class Funcionario {
    
    private String nome;
    private double salario;
    
    public Funcionario() {}
    
    public Funcionario(String nome, double salario) {
        
    }
    
    public void setNome(String nome) {
        
        if (nome.isEmpty()) {
            
            throw new RuntimeException("O nome não deve estar vazio!");
        }
        
        this.nome = nome;
    }
    
    public String getNome() {
        
        return this.nome;
    }
    
    public void setSalario(double salario) {
        
        if (salario <= 0) {
            
            throw new RuntimeException("Salário inválido!");
        }
        
        this.salario = salario;
    }
    
    public double getSalario() {
        
        return this.salario;
    }

    public void darAumento(double valor) {
        
        if (valor <= 0) {
            
            throw new RuntimeException("Valor de aumento inválido!");
        }
        
        this.salario += valor;
    }
    
    public double ganhoAnual() {
        
        return this.getSalario() + 12;
    }
    
    public void apresentaDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.salario);
        System.out.println("Ganho anual: " + this.ganhoAnual());
    }
}
