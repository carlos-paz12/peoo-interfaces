package br.edu.ifrn.peoo.interfaces.voo;

public class Ave implements Aereo {

    @Override
    public void voar() {
        System.out.println("Bate as asas bem forte");
    }

    @Override
    public void aterrissar() {
        System.out.println("Bate as asas mais fraco e põe as patas no chão");
    }

}
