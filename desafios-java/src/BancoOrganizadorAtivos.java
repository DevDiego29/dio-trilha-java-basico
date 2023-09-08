import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        // Criar um ArrayList para armazenar os códigos dos ativos
        ArrayList<String> ativos = new ArrayList<>();

        // Entrada da quantidade de ativos
        int quantidadeAtivos = scanner.nextInt(); // Ler um número inteiro
        scanner.nextLine(); // Limpar o buffer de leitura
    
        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine(); // Ler uma linha (código do ativo)
            ativos.add(codigoAtivo); // Adicionar o código à lista de ativos
        }

        // Organização em ordem alfabética usando o método sort da classe Collections
        Collections.sort(ativos);

        // Saída de dados: imprimir os códigos dos ativos em ordem alfabética
        for (String ativo : ativos) {
            System.out.println(ativo); // Imprimir cada código em uma nova linha
        }
    
        // Fechar o Scanner para liberar recursos
        scanner.close();
    }
}
