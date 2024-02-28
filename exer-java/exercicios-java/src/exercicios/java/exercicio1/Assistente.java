package exercicios.java.exercicio1;

public class Assistente extends Funcionario { 
    
    private String numeroMatricula;
    
    public Assistente() {
        
    }
    
    public Assistente(String nome, double salario, String numeroMatricula) {
        super(nome, salario);
        this.setNumeroMatricula(numeroMatricula);
    }
    
    public void setNumeroMatricula(String numeroMatricula) {
        
        if (numeroMatricula.isEmpty()) {
            
            throw new RuntimeException("Número de matrícula inválido!");
        }
        
        this.numeroMatricula = numeroMatricula;
    }
    
    public String getNumeroMatricula() {
        
        return this.numeroMatricula;
    }
    
    @Override
    public void apresentaDados() {
        super.apresentaDados();
        System.out.println("Número de matrícula: " + this.getNumeroMatricula());
    }
}
