public abstract class Peca {
    protected char tipo;
    protected boolean check;

    public abstract String mover();
    public abstract String moverAtaque();
    public abstract void teste();
    public abstract char getTipo();

    public boolean isNull() {
        if (getTipo() == '\u0000')
            return true;
        return false;
    }
}
