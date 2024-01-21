package Aula1D;

public class Ponto {

    double x, y;

    void iniciaX(double i){
        x = i;
    }

    void iniciaY(double j){
        y = j;
    }

    double distanciaEuclidiana(Ponto ponto){
        double diferencaX = x - ponto.x;
        double diferencaY = y - ponto.y;

        return Math.sqrt(Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2));

    }

}
