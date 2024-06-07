public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o ScreenMatch");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançaento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.5;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse = "Filme com galã dos anos 80";
        System.out.println(sinopse);

        System.out.println("""
                FILME TOP GUN
                FILME DE AVENTURA GALA DOS ANOS 80
                MUITO BOM
                ANO DE LANCAMENTO
                """ + anoDeLancamento);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}