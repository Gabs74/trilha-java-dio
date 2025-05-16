public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println(- numero);

        System.out.println(numero);

        int a, b;
        a = 5;
        b = 6;

        //String resultado = "";
        //if (a == b)
         //   resultado = "verdadeiro";
        //else
          //  resultado = "falso";
        //System.out.println(resultado); 
        
        String resultado = a == b ? "verdadeiro" : "falso";
        int resultado2 = a == b ? 1 : 0;
        System.out.println(resultado);
        System.out.println(resultado2);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? " + simNao);

    }
}
