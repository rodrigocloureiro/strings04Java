public class AlgoritmosGeneticos {
    private int indiceAleatorio;
    private CadeiaDeDna proteinas = new CadeiaDeDna();

    public int getIndiceAleatorio() {
        return indiceAleatorio;
    }

    private void gerarAleatorio(String cadeia) {
        indiceAleatorio = (int) Math.floor(Math.random() * cadeia.length());
    }

    public String[] recombinacao(String cadeia1, String cadeia2) {
        String[] recombinacao = new String[2];
        do {
            gerarAleatorio(cadeia1);
        } while (indiceAleatorio == 0);

        String recombinacao1, recombinacao2;
        recombinacao1 = cadeia1.substring(0, indiceAleatorio) + cadeia2.substring(indiceAleatorio);
        recombinacao2 = cadeia2.substring(0, indiceAleatorio) + cadeia1.substring(indiceAleatorio);

        recombinacao[0] = recombinacao1;
        recombinacao[1] = recombinacao2;

        return recombinacao;
    }

    public String mutacao(String cadeia) {
        gerarAleatorio(cadeia);
        char novaProteina, antigaProteina = cadeia.charAt(indiceAleatorio);

        do {
            novaProteina = proteinas.getProteinas()[(int) Math.floor(Math.random() * proteinas.getProteinas().length)];
        } while (novaProteina == antigaProteina);

        return cadeia.substring(0, indiceAleatorio) + novaProteina + cadeia.substring(indiceAleatorio + 1);
    }
}
