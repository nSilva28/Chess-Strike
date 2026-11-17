public abstract class Peca {
    protected char tipo;
    protected boolean check;

    public abstract String mover(String destino);
    public abstract String moverAtaque(String destino);
    public abstract void teste();
    public abstract char getTipo();

}
