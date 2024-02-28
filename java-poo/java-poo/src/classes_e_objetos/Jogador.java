package classes_e_objetos;

public class Jogador {
    
    public String nome;
    public int nivel;
    
    public void apresentar() {
        System.out.println("========================================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível: " + this.nivel);
        System.out.println("========================================");
    }
}
