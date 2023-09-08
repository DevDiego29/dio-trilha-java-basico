import java.util.Scanner;

public class CondicionalmenteRico {
    public static void main(String[] args) {
        // Criar um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Declarar variáveis para armazenar saldoTotal e valorSaque
        System.out.println("Qual o saldo atual: ");
        int saldoTotal = scanner.nextInt();
        System.out.println("Valor do saque: ");
        int valorSaque = scanner.nextInt();
        
        // Verificar se o valor do saque é menor ou igual ao saldoTotal
        if (valorSaque <= saldoTotal) {
            // Calcular o novo saldo após o saque
            int novoSaldo = saldoTotal - valorSaque;
            
            // Exibir mensagem de saque bem-sucedido e o novo saldo
            System.out.println("Saque realizado com sucesso. Novo saldo: " + novoSaldo);
        } else {
            // Caso contrário, exibir mensagem de saldo insuficiente
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
        
        // Fechar o objeto Scanner para liberar recursos
        scanner.close();
    }
}
