package com.mycompany.sistemaescolar;

public class Pessoa {
    String nome;
    Endereco endereço;
    int nascimento;
    int idade;

    
    String exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        return nome;
    }
    
    
}
