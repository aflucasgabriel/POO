package Aula1D;

public class Main {
    public static void main(String[] args) {

        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto();

        double xi = 5.89;
        double yi = 15.32;

        ponto1.iniciaX(xi);
        ponto1.iniciaY(yi);

        double xii = 6.42;
        double yii = 32.93;

        ponto2.iniciaX(xii);
        ponto2.iniciaY(yii);


        double distancia = ponto1.distanciaEuclidiana(ponto2);

        System.out.println("Distancia entre os pontos é de: " + distancia);

    }
}
