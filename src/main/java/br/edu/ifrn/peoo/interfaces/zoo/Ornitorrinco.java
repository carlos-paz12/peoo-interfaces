package br.edu.ifrn.peoo.interfaces.zoo;

public class Ornitorrinco implements Animal {

    private double peso;

    public Ornitorrinco(double peso) {
        this.peso = peso;
    }

    @Override
    public void nasca() {
        System.out.println("Quebro o ovo para sair");
    }

    @Override
    public void passeie() {
        System.out.println("Anda e nada de um lado para o outro");
    }

    @Override
    public void durma() {
        System.out.println("Dorme dentro de túneis durante o dia");
    }

    @Override
    public double peso() {
        return peso;
    }

}
