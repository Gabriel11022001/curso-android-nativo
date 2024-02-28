package exercicios.java.exercicio3;

public class ProdutoEstadual extends Produto {
    
    public ProdutoEstadual() {
        this.setImposto();
    }
    
    public ProdutoEstadual(String descricao, double valor) {
        super(descricao, valor);
        this.setImposto();
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
    }
}
