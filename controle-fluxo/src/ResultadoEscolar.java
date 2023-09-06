public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 3;

        if (nota >= 7) {
            System.out.println("Aluno aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
