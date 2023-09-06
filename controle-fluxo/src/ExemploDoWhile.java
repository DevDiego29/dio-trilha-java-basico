//Joãozinho resolveu ligar para o seu amigo, dizendo que hoje se entupiu de comer docinhos:

import java.util.Random; //Classe para obter numeros aleatórios

public class ExemploDoWhile {
	public static void main(String[] args) {

		System.out.println("Discando..."); //Iniciará dizendo que está discando
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}

	private static boolean tocando() { //Método booleano
		boolean atendeu = new Random().nextInt(3)==1; //Valor entre 1 e 3
		System.out.println("Atendeu? " + atendeu); //Se for == 1 é pq ele atendeu
		//negando o ato de continuar tocando
		return ! atendeu; //Se ele atendeu então não quero que me diga que está tocando
	}
}