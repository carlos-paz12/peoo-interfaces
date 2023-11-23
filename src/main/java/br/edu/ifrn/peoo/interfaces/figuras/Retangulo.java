package br.edu.ifrn.peoo.interfaces.figuras;

public class Retangulo implements FiguraGeometrica {

    private int base, altura;

    public Retangulo() {
    }

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

}
