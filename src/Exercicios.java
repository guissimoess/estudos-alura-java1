public class Exercicios {
    public static void main(String[] args) {
        double temperaturaGrausCelsius = 30;
        double temperaturaGrausFahrenheit = (temperaturaGrausCelsius * 1.8) + 32;
        System.out.println(temperaturaGrausFahrenheit);

        double nota1, nota2, media;
        nota1 = 9.8;
        nota2 = 6.3;
        media = (nota1 + nota2) / 2;
        System.out.println(media);



        double numero = 6.8;
        int numeroInteiro = (int) numero;
        System.out.println(numeroInteiro);


        char letra = 'A';
        String palavra = "Abacate";
        System.out.println(letra + palavra);


        double precoProduto = 9.99;
        int quantidade = 13;
        System.out.println(precoProduto * quantidade);


        double valorEmDolares = 100;
        double valorEmReal = valorEmDolares * 4.94;
        System.out.println(valorEmReal);


        double precoOriginal = 100;
        double percentualDesconto = 10;
        double precoComDesconto = precoOriginal - (precoOriginal * (percentualDesconto / 100));
        System.out.println(precoComDesconto);

    }
}
