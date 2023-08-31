public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //Tipos primitivos e variáveis:

        //Texto

        String nomeCompleto = "Diego Rodrigues Alves";

        //Números Inteiros

        byte idade = 8;
        short ano = 2023;
        int cep = 58039265;
        long cpf = 10140547689L;

        //Números reais 

        float pi = 3.14F;
        double salarioMinimo = 2500.33;

        //casting

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short)numeroNormal;
        
        //Palavra reservada

        final int numero = 1;
        System.out.print(numero);
        
    }
}
