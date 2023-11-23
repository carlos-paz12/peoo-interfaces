package br.edu.ifrn.peoo.interfaces.zoo;

public class Morcego implements Animal {

    @Override
    public void nasca() {
        System.out.println("Nasce um lindo Morcego");
    }

    @Override
    public void passeie() {
        System.out.println("Voe de um lado para o outro");
    }

    @Override
    public void durma() {
        System.out.println("Dorme de cabeça para baixo");
    }

    @Override
    public double peso() {
        return 4.5;
    }

}
