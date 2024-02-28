package exercicios.java.exercicio2;

public class Aluno {
    
    private int id;
    private String nome;
    private double peso;
    private double altura;
    private int idade;
    
    public Aluno() {}
    
    public Aluno(int id, String nome, double peso, double altura, int idade) {
        
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        
        return this.nome;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        
        return this.id;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        
        return this.peso;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getAltura() {
        
        return this.altura;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        
        return this.idade;
    }
    
    public void exibir() {
        System.out.println("Id: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade() + " anos de idade");
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("IMC: " + this.calcularImc());
    }
    
    public double calcularImc() {
        
        return this.getPeso() / Math.pow(this.getAltura(), 2);
    }
}
