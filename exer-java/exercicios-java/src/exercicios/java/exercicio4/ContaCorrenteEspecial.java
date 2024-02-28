package exercicios.java.exercicio4;

public class ContaCorrenteEspecial {
    
    private Titular titular;
    private double saldo;
    private double limite;
    private int numero;
    
    public ContaCorrenteEspecial() {
        this.saldo = 0;
    }
    
    public ContaCorrenteEspecial(Titular titular, double limite, int numero) {
        this.saldo = 0;
        this.setTitular(titular);
        this.setLimite(limite);
        this.setNumero(numero);
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    public Titular getTitular() {

        return this.titular;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        
        return this.numero;
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public double getLimite() {
        
        return this.limite;
    }
    
    public double getSaldo() {
        
        return this.saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        double somaSaldoLimite = this.getSaldo() + this.getLimite();
        
        if (somaSaldoLimite < valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        
    }
    
    public void apresentar() {
        System.out.println("Titular: " + this.getTitular().getNome());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Limite: R$" + this.getLimite());
        System.out.println("Número da conta: " + this.getNumero());
    }
}
