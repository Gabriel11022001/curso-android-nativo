package exercicios.java.exercicio3;

public class ProdutoImportado extends Produto {
    
    private double taxa;
    private double taxaImportacao;
    
    public ProdutoImportado() {
        this.setImposto();
        this.setTaxa();
        this.setTaxaImportacao();
    }
    
    public ProdutoImportado(String descricao, double valor) {
        super(descricao, valor);
        this.setImposto();
        this.setTaxa();
        this.setTaxaImportacao();
    }
    
    @Override
    public void setImposto() {
        this.imposto = 5;
    }
    
    public void setTaxa() {
        this.taxa = 10;
    }
    
    public double getTaxa() {
        
        return this.taxa;
    }
    
    public void setTaxaImportacao() {
        this.taxaImportacao = 5;
    }
    
    public double getTaxaImportacao() {
        
        return this.taxaImportacao;
    }
    
    @Override
    public void apresentar() {
        System.out.println("Produto: " + this.getDescricao());
        System.out.println("Valor: R$" + this.getValor());
        System.out.println("Imposto: " + this.getImposto() + "%");
        System.out.println("Taxa: " + this.getTaxa());
        System.out.println("Taxa importação: " + this.getTaxaImportacao());
    }
}
