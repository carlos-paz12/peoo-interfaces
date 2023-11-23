package br.edu.ifrn.peoo.interfaces.figuras;

public class TesteFiguras {

    private static int perimetro(FiguraGeometrica figura_geometrica) {
        return figura_geometrica.calcPerimetro();
    }

    public static void main(String[] args) {
        Losango l_01 = new Losango(12);
        Retangulo r_01 = new Retangulo(10, 6);
        FiguraGeometrica l_02 = new Losango(24);
        FiguraGeometrica r_02 = new Retangulo(20, 12);

        System.out.printf("losango_01 perimetro: %dcm\n", perimetro(l_01));
        System.out.printf("losango_02 perimetro: %dcm\n", l_02.calcPerimetro());
        System.out.printf("retangulo_01 perimetro: %dcm\n", r_01.calcPerimetro());
        System.out.printf("retangulo_02 perimetro: %dcm\n", perimetro(r_02));
    }

}
