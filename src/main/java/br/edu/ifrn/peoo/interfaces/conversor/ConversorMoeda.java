package br.edu.ifrn.peoo.interfaces.conversor;

public class ConversorMoeda implements IConversor {

    @Override
    public double converter(double valor) {
        return valor / 5.51;
    }
    
}