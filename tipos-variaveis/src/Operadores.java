public class Operadores {
    public static void main(String[] args){

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int resto = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        System.out.println("O resultado da soma é: "+ soma);
        System.out.println("O resultado da subtração é: " + subtracao);
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("O resultado da divisão é: " + divisao);
        System.out.println("O resto da divisão é: " + resto);
        System.out.println("O resultado da expressão é: " + resultado);

        String nomeCompleto = "Linguagem" + " " + "Java";
        System.out.println(nomeCompleto);

        String concatenacao ="?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}