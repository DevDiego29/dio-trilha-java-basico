/*
 * Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, logo, 
 * enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho.
 * 
 */

import java.util.concurrent.ThreadLocalRandom; //valores aleatórios

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;

        while(mesada>0) { //Emquanto minha mesada for maior que 0

            Double valorDoce = valorAleatorio(); //pegar um doce com valor aleatoria
            
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce; //até que continue sendo > 0
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
            
    }

    //Criando um método chamado valorAleatoria que me retorna um double

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8); //Classe que me retorna um valor entre 2 e 8
    }
}