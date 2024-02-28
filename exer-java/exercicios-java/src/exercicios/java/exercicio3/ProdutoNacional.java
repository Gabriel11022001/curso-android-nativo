package exercicios.java.exercicio3;

public class ProdutoNacional extends Produto {
    
    private double taxa;
    
    public ProdutoNacional() {
        this.setImposto();
        this.setTaxa();
    }
    
    public ProdutoNacional(String descricao, double valor) {
        super(descricao, valor);
        this.setImposto();
        this.setTaxa();
    }
    
    public void setTaxa() {
        this.taxa = 5;
    }
    
    public double getTaxa() {
        
        return this.taxa;
    }
    
    @Override
    public void setImposto() {
        this.imposto = 10;
    }
    
    @Override
    public void apresentar() {
        System.out.println("Produto: " + this.getDescricao());
        System.out.println("Valor: R$" + this.getValor());
        System.out.println("Imposto: " + this.getImposto() + "%");
        System.out.println("Taxa: " + this.getTaxa());
    }
}
