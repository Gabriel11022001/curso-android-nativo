package exercicios.java.exercicio1;

public class AssistenteTecnico extends Assistente {
    
    private double bonusSalarial;
    
    public AssistenteTecnico() {
        
    }
    
    public AssistenteTecnico(String nome, double salario, String numeroMatricula, double bonusSalarial) {
        super(nome, salario, numeroMatricula);
    }
    
    public void setBonusSalarial(double bonusSalarial) {
        
        if (bonusSalarial <= 0) {
            
            throw new RuntimeException("Bônus salarial inválido!");
        }
        
        this.bonusSalarial = bonusSalarial;
    }
    
    public double getBonusSalarial() {
        
        return this.bonusSalarial;
    }
    
    @Override
    public double ganhoAnual() {
        double salarioComBonus = this.getSalario() + this.getBonusSalarial();
        
        return salarioComBonus * 12;
    }
}
