public class CadeiaDeDna {
    private char[] proteinas = {'A', 'C', 'G', 'T'};

    public String gerarCadeiaDeDna(int tamanho) {
        String cadeia = "";
        for (int i = 0; i < tamanho; i++) {
            cadeia += proteinas[(int) Math.floor(Math.random() * proteinas.length)];
        }
        return cadeia;
    }

    public char[] getProteinas() {
        return this.proteinas;
    }
}
