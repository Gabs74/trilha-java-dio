public class operadoresDois {
    private Object system;

    public static void main(String[] args) {
        // Operadores Aritmeticos
        // +, -, *, /, %
        // int resultado = 10 + 5;
        // System.out.println(resultado);
        // resultado = 10 - 5;
        // System.out.println(resultado);
        // resultado = 10 * 5;
        // System.out.println(resultado);
        // resultado = 10 / 5;
        // System.out.println(resultado);
        // resultado = 10 % 5;
        // System.out.println(resultado);

        // Operadores Relacionais
        // ==, !=, >, >=, <, <=
        int a = 10;
        int b = 20;

        boolean simNao = a == b;
        System.out.println("A é igual a B? " + simNao);

        simNao = a != b;
        System.out.println("A é diferente de B? " + simNao);

        simNao = a > b;
        System.out.println("A é maior que B? " + simNao);

        simNao = a >= b;
        System.out.println("A é maior ou igual a B? " + simNao);

        simNao = a < b;
        System.out.println("A é menor que B? " + simNao);

        simNao = a <= b;
        System.out.println("A é menor ou igual a B? " + simNao);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
    }

    
}
