package Aula1E;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionario: ");
        String nome = sc.next();
        System.out.print("Digite o CPF do funcionario: ");
        String cpf = sc.next();
        System.out.print("Digite o idade do funcionario: ");
        int idade = sc.nextInt();
        System.out.print("Digite o telefone do funcionario: ");
        BigInteger telefone = sc.nextBigInteger();

        Cliente cliente = new Cliente();

        cliente.cadastrarCliente(nome, cpf, idade, telefone);

        String c = cliente.retornaDadosCliente();

        System.out.println("Dados do Cliente: " + c);





    }
}
