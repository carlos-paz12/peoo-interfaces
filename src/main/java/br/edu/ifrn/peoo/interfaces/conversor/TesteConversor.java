package br.edu.ifrn.peoo.interfaces.conversor;

public class TesteConversor {

    public static void main(String[] args) {
        IConversor mo02 = new ConversorMoeda();
        IConversor me02 = new ConversorMedida();

        System.out.printf("MOEDA CONVERTIDA: ");
        System.out.printf("%.2f \n", mo02.converter(1));
        System.out.printf("\nMEDIDA CONVERTIDA: ");
        System.out.printf("%.2f \n", me02.converter(1));
    }

}
