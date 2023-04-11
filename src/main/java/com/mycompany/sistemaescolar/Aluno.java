package com.mycompany.sistemaescolar;

import java.util.ArrayList;


public class Aluno extends Pessoa{
    double mensalidade;
    double notas[][];
    boolean carne[];
    int matricula;
    String responsavel;
    int serie;

    ArrayList<Aluno> lista = new ArrayList<>();
    

    String exibir(){
        System.out.println("");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Série: "+serie);
        return nome;
    }

    void mostrarLista(){
        if(lista.size() > 0){
            System.out.println("\n");
            System.out.println("-----Lista de alunos-----");

            for(int i=0; i<(lista.size()); i++){
                lista.get(i).exibir(); 
            }
        }
        else {
            System.out.println("");
            System.out.println("Não existem alunos cadastrados");
        }
    }
}
