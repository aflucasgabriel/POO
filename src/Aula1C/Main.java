package Aula1C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangulo[] vt = new Triangulo[10];

        int op;
        int qtdT = 0;

        System.out.print("Deseja cadastrar quantos triangulos? (Max: 10): ");
        qtdT = scanner.nextInt();

        System.out.println();

        do {
            System.out.println("---------------------Menu Triangulo---------------------");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Inserir Triangulo");
            System.out.println("2 - Mostrar Triangulo(s)");
            System.out.println("3 - Mostrar Triangulo com maior perimetro");
            System.out.println("4 - Mostrar numero de Equilateros");
            System.out.println("0 - Sair");

            System.out.print("Opcao: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    for (int i = 0; i < qtdT; i++) {
                        vt[i] = new Triangulo();
                        System.out.print("Entre com o lado 1 do Triangulo " + (i+1) + ": ");
                        int l1 = scanner.nextInt();
                        System.out.print("Entre com o lado 2 do Triangulo " + (i+1) + ": ");
                        int l2 = scanner.nextInt();
                        System.out.print("Entre com o lado 3 do Triangulo " + (i+1) + ": ");
                        int l3 = scanner.nextInt();

                        vt[i].alteraL1(l1);
                        vt[i].alteraL2(l2);
                        vt[i].alteraL3(l3);

                        System.out.println("Triangulo Cadastrado!");
                    }
                    break;
                case 2:

                    for (int i = 0; i < qtdT; i++) {

                        System.out.println("------------Triangulo[" + (i + 1) + "]------------");
                        System.out.println("Lado 1:" + vt[i].retornaL1());
                        System.out.println("Lado 2:" + vt[i].retornaL2());
                        System.out.println("Lado 3:" + vt[i].retornaL3());
                        System.out.println("Perimetro: " + vt[i].calculaPerimetro());
                        System.out.println("Tipo: " + vt[i].retornaTipo());

                    }
                    break;
                case 3:
                    if (qtdT > 0) {
                        Triangulo maiorP = vt[0];

                        for (int i = 0; i < qtdT; i++) {
                            if (vt[i].calculaPerimetro() > maiorP.calculaPerimetro()) {
                                maiorP = vt[i];
                            }
                        }
                        System.out.println("Triangulo com maior perimetro: " + maiorP.calculaPerimetro());
                        System.out.println("Tipo: " + maiorP.retornaTipo());


                    }
                    break;
                case 4:
                    int numEq = 0;
                    for (int i = 0; i < qtdT; i++) {
                        if (vt[i].retornaTipo().equals("Equilatero"))
                            numEq++;
                    }
                    System.out.println("Existem " + numEq + " triangulos equilateros");

                    break;
            }
        } while (op != 0);
    }
}
