public class ExemploForArray {
    public static void main(String[] args) {

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x = 1; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }
    }
}

//x < alunos.length, traduzindo: em quanto x for < que o tamanho de alunos