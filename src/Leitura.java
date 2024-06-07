import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu filme favorito: ");
        String filme = scanner.nextLine();
        System.out.print("Qual o ano de lançamento?");
        int anoDeLancamento = scanner.nextInt();
        System.out.print("Diga sua avaliação do filme: ");
        double notaDoFilme = scanner.nextDouble();

        System.out.println("Seu filme favorito é: ");
        System.out.println(filme);
        System.out.println("Nota do filme: ");
        System.out.println(notaDoFilme);
        System.out.println("Ano de lançamento: ");
        System.out.println(anoDeLancamento);


    }
}
