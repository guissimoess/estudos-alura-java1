import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int quantidadeNotas = 0;

        while (nota != -1) {
            System.out.print("Diga sua avaliação do filme ou digite -1 para encerrar");
            nota = scanner.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                quantidadeNotas++;
            }
        }

        System.out.println("Media " + mediaAvaliacao / quantidadeNotas);
    }
}
