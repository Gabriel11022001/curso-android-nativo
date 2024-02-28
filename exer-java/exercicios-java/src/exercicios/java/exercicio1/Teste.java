package exercicios.java.exercicio1;

public class Teste {
    
    public static void main(String[] args) {
        
        try {
            AssistenteTecnico assistenteTecnico1 = new AssistenteTecnico();
            assistenteTecnico1.setNome("Gabriel");
            assistenteTecnico1.setSalario(4000);
            assistenteTecnico1.setNumeroMatricula("123456");
            assistenteTecnico1.setBonusSalarial(400);
            assistenteTecnico1.apresentaDados();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
