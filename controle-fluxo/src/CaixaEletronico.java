public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 30.0;
        double valorSolicitado = 37.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
