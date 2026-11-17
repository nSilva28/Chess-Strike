public class Peao extends Peca {
    protected final char tipo = 'P';
    private int posX, posY;
    private boolean primeiro;
    public Peao(int i, int j) {
        setPosX(j);
        setPosY(i);
    }

    public void setPosX(int i) {
        this.posX = i;
    }

    public void setPosY(int j) {
        this.posY = j;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public char getTipo() {
        return this.tipo;
    }

    public String mover(String destino) {
        char posiX = (char)(this.posX+65); // o que tá aqui ainda não é o mover implementado.
        char posiY = (char)(this.posY+65);
        String posiCompleta = "" + posiX;
        posiCompleta += posiY;
        return posiCompleta;
    }

    public void teste() {
        // teste pra checar se as posições das peças estão sendo guardadas e impressas/retornadas corretamente.
        char posiY = (char)(this.posY+49);
        char posiX = (char)(this.posX+65);
        String posiCompleta = "" + posiX;
        posiCompleta += posiY;
        System.out.println(posiCompleta);
    }

    public String moverAtaque(String destino) {
        return "";
    }
}
