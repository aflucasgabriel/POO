package Aula1E;

import java.math.BigInteger;

public class Cliente {

    String nome = "";
    String cpf = "";
    int idade = 0;
    BigInteger telefone;


    void cadastrarCliente(String x, String y, int w, BigInteger z){

        nome = x;
        cpf = y;
        idade = w;
        telefone = z;

    }

    String retornaDadosCliente(){

        return "Nome: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade + "\nTelefone: " + telefone;
    }





}
