package br.edu.ifrn.peoo.interfaces.zoo;

public class Zebra implements Animal {

    private int listras;
    private double peso;

    public Zebra(int listras, double peso) {
        this.listras = listras;
        this.peso = peso;
    }

    @Override
    public void nasca() {
        System.out.println("Nasce mais uma Zebra");
    }

    @Override
    public void passeie() {
        System.out.println("Galopa pelo campo");
    }

    @Override
    public void durma() {
        System.out.println("Dorme em pé");
    }

    @Override
    public double peso() {
        return peso;
    }

    public void contaListras() {
        System.out.println("Esta Zebra tem: " + listras + " listras");
    }

}
