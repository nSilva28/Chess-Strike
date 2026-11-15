public class Tabuleiro {
    private Peca[][] jogo = new Peca[8][8];

    public Tabuleiro(String modo) {
        setJogo(modo);
    }

    public void setJogo(String modo) {
        if("normal".equalsIgnoreCase(modo)) {
            for (int i = 0; i < 8; i++) {
                jogo[1][i] = new Peao(1, i);
                jogo[6][i] = new Peao(6, i);
            }
        }
    }

    public Peca[][] getJogo() {
        return jogo;
    }

    public static void mostrarTab(Tabuleiro tab) {

        for(int i = 0; i < 8; i++) {

            for(int j = 0; j < 8; j++) {
                System.out.printf("|");
                if(tab.getJogo()[i][j] == null)
                    System.out.printf(" |");
                else
                    System.out.printf("%c|", tab.getJogo()[i][j].getTipo());
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

}
