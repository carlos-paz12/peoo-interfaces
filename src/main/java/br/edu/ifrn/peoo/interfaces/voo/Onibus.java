package br.edu.ifrn.peoo.interfaces.voo;

public class Onibus implements TransportadorDePessoas {

    @Override
    public void entraPessoas() {
        System.out.println("Abre as portas e entram as pessoas");
    }

    @Override
    public void saiPessoas() {
        System.out.println("Abre a porta e saem as pessoas");
    }

}
