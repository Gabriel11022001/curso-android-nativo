package exercicios.java.exercicio3;

public abstract class Produto {
    
    private String descricao;
    private double valor;
    protected double imposto;
    
    public Produto() {}
    
    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        
        return this.valor;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        
        return this.descricao;
    }
    
    public abstract void setImposto();
    
    public double getImposto() {
        
        return this.imposto;
    }
    
    public abstract void apresentar();
}
