package Aula1B;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int x = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.println("A soma dos numeros é: " + soma);


    }
}
