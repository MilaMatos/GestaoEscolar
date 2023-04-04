package com.mycompany.sistemaescolar;

public class Aluno extends Pessoa{
    double mensalidade;
    double notas[][];
    boolean carne[];
    


    String exibir(){
        System.out.println("");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Mensalidade: "+mensalidade);
        return nome;
    }
}
