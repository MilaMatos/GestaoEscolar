package com.mycompany.sistemaescolar;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    ArrayList<Aluno> lista;
    int qtd;
    
    
    Lista(ArrayList<Aluno> lista){
        this.lista = lista;
    }
    
    void novoAluno(String nome, int idade, int serie){
        Aluno novo = new Aluno();
        novo.nome = nome;
        novo.idade = idade;
        novo.serie = serie;
        lista.add(novo);
        qtd++;
        
    }
    
    void cadastrar(){
        Scanner sc = new Scanner(System.in); 

        Aluno cadastro = new Aluno();                      //criando um aluno 
        System.out.print("Nome completo: ");
        String no = sc.nextLine();
        cadastro.nome = no;

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); 
        cadastro.idade = idade;
        lista.add(cadastro);
        qtd++;

        System.out.println("--------Aluno cadastrado com sucesso--------");
        System.out.println("\n");

        sc.close();

        
    }

    void listaDeAlunos(){
        System.out.println("\n--------Lista de Alunos--------");
        for(Aluno a: this.lista){
            a.exibir();
        }
    }

    void pesquisar(){

        Scanner ler = new Scanner(System.in); 

        System.out.print("Nome: ");
        String pes = ler.nextLine(); 

        boolean pesquisar = false;

        for (int i = 0; i < qtd; i++) {
            Aluno aux = (Aluno)lista.get(i);
            if (aux.nome.equals(pes)) {
                aux.exibir();
                pesquisar = true;
            }
        }

        if (!pesquisar) {
            System.out.println("Nao achei o nome " + pes + " no cadastro.");
        }

        ler.close();

    }

}
