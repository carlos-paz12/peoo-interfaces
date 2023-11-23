package br.edu.ifrn.peoo.interfaces.conversor;

public class ConversorMedida implements IConversor {

    @Override
    public double converter(double valor) {
        return valor * 0.39;
    }

}