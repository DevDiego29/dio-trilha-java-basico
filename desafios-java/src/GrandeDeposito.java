import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Lendo um valor decimal inserido pelo usuário
        // Isso captura a entrada do usuário e armazena na variável "valor"
        double valor = scanner.nextDouble();

        // Verificando as condições com base no valor inserido
        if (valor > 0) {
            // Se o valor for maior que zero, significa que é um depósito válido
            // Nesse caso, o saldo é atualizado com o valor do depósito
            double saldo = valor;
            // Exibindo uma mensagem de sucesso e o saldo atual
            System.out.println("Deposito realizado com sucesso!");
            // Exibindo o saldo formatado como moeda
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        } else if (valor == 0.0) {
            System.out.println("Encerrando o programa...");
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }

        scanner.close();
    }
}
