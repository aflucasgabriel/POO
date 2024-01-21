package Aula1C;

import java.util.Scanner;

public class Triangulo {
    int l1, l2, l3;

    void alteraL1(int x) {

        l1 = x;
    }

    void alteraL2(int x) {
        l2 = x;
    }

    void alteraL3(int x) {
        l3 = x;
    }

    int retornaL1() {
        return l1;
    }

    int retornaL2() {
        return l2;
    }

    int retornaL3() {
        return l3;
    }

    int calculaPerimetro() {
        return l1 + l2 + l3;
    }

    String retornaTipo() {
        if ((l1 == l2) && (l2 == l3)) {
            return "Equilatero";
        } else if (((l1 == l2) || (l2 == l3) || (l1 == l3))) {
            return "Isoceles";
        }
        return "Escaleno";
    }



}
