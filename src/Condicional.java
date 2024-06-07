public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 1986;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.5;
        String tipoPlano = "plus";

        if (anoLancamento >= 2022) {
            System.out.println("Filme novo");
        } else {
            System.out.println("Filme antigo");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme disponível");
        } else {
            System.out.println("Filme indisponível");
        }

    }
}
