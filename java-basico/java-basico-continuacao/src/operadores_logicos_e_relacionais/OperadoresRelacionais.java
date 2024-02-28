package operadores_logicos_e_relacionais;

public class OperadoresRelacionais {
    
    public static void main(String[] args) {
        /**
         * == -> igual a
         * != -> diferente de
         * > -> maior que
         * < -> menor que
         * >= -> maior ou igual a 
         * <= -> menor ou igual a
         */
        double primeiroValor, segundoValor;
        primeiroValor = 12;
        segundoValor = 3;
        System.out.println(primeiroValor == segundoValor); // false
        System.out.println(primeiroValor < segundoValor); // false
        System.out.println(primeiroValor > segundoValor); // true
        System.out.println(primeiroValor >= segundoValor); // true
        System.out.println(primeiroValor <= segundoValor); // false
        System.out.println(primeiroValor != segundoValor); // true
        System.out.println(12 >= 12); // true;
        System.out.println(12 <= 12); // true
        // para comparar se uma String é igual a outra, utilizar o método equals()
        System.out.println("Gabriel".equals("Gabriel")); // true
        System.out.println("Gabriel".equals("gabriel")); // false
        String primeiroUsuario = "Gabriel";
        String segundoUsuario = "Felipe";
        
        if (primeiroUsuario.equals(segundoUsuario)) {
            System.out.println("Mesmo usuário!");
        } else {
            System.out.println("Usuários diferentes!");
        }
        
    }
}
