public class OperadorUnários {
    public static void main(String[] args){
        /*int numero = 5;
        numero = - numero; //negando o valor
        System.out.println(numero);
        numero = numero * -1; //Deixando positivo
        System.out.println(numero);*/

        int numero = 5;
        numero++; //numero = numero + 1;
        System.out.println(++ numero);
        System.out.println(numero);
        System.out.println(numero --);
        System.out.println(-- numero);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        //Invertendo o valor booleano da variável

        variavel = !variavel;
        System.out.println(variavel);
    }
}
