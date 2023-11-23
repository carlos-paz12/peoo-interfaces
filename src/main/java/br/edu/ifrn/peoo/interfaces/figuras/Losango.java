package br.edu.ifrn.peoo.interfaces.figuras;

public class Losango implements FiguraGeometrica {

    private int lado;

    public Losango() {}

    public Losango(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcPerimetro() {
        return this.lado * 4;
    }

}
