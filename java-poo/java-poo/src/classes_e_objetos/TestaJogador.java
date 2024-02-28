package classes_e_objetos;

public class TestaJogador {
    
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        jogador1.nome = "Gabriel";
        jogador1.nivel = 100;
        jogador2.nome = "Pedro";
        jogador2.nivel = 90;
        System.out.println("Nome do jogador 1: " + jogador1.nome);
        System.out.println("Nível do jogador 1: " + jogador1.nivel);
        System.out.println("Nome do jogador 2: " + jogador2.nome);
        System.out.println("Nível do jogador 2: " + jogador2.nivel);
        jogador1.apresentar();
        jogador2.apresentar();
    }
}
