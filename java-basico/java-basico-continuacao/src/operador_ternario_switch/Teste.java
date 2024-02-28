package operador_ternario_switch;

public class Teste {
    
    public static void main(String[] args) {
        // operador ternário
        int idade = 17;
        boolean podeEntrarFesta = idade >= 18 ? true : false;
        
        if (podeEntrarFesta) {
            System.out.println("Você pode entrar na festa!");
        } else {
            System.out.println("Você não pode entrar na festa!");
        }
        
        int valor = 12;
        
        switch (valor) {
            case 1:
                System.out.println("Teste valor 1");
                break;
            case 2:
                System.out.println("Teste valor 2");
                break;
            default:
                System.out.println("Fio informado outro valor!");
        }
        
    }
}
