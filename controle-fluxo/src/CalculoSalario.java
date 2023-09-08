import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        //Lê os valores de entrada
        Scanner leitorDeEntradas = new Scanner(System.in);
        System.out.println("Digite o valor do salário: ");
        float valorSalario = leitorDeEntradas.nextFloat();
        System.out.println("Digite o valor do benefício: ");
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;

        if(valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05F * valorSalario;
        }else if(valorSalario >= 1100.01 && valorSalario <= 2500.00){
            valorImposto = 0.10F * valorSalario;
        }else{
            valorImposto = 0.15F * valorSalario;
        }

        //Calcula e imprime a saída com duas casas decimais
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println("O valor do seu salário com os descontos é: ");
        System.out.println(String.format("%.2f", saida));
    }
}