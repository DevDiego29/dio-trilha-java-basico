import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double saldoAtual, valorDeposito, valorRetirada;

    System.out.println("Qual seu saldo atual: ");
    saldoAtual = scanner.nextDouble();

    System.out.println("Qual o valor a ser depositado: ");
    valorDeposito = scanner.nextDouble();

    System.out.println("Qual valor deseja sacar: ");
    valorRetirada = scanner.nextDouble();

  
    saldoAtual = saldoAtual + valorDeposito - valorRetirada;

    
    System.out.println("\nSaldo atualizado na conta: " + saldoAtual);

    scanner.close();
 }
}
