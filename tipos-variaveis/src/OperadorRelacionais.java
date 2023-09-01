public class OperadorRelacionais {
    public static void main(String[] args){

        String nomeUm = "Diego";
        String nomeDois = new String("Diego");
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        } else {
            System.out.println("A nossa condição não é verdadeira");
        }

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior do que numeroDois? " + simNao);

    }
    
}
