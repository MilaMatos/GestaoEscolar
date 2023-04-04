package com.mycompany.sistemaescolar;
//import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class SistemaEscolar {

    public static void main(String[] args) {
        
        ArrayList<Aluno> lista = new ArrayList<>();
        Scanner ler = new Scanner(System.in);           // cria um objeto scanner
        
        int menu = 0;                                   //Atribuindo variáveis usadas como parâmetros de parada
        int opcao = 5;                                  //Aqui eu botei 5 so pq eu quis
        String sair = "sair";                           //Esssa tbm oh
         
        while(menu != 1){                               //Menuzinho só pra testar o cadastro

            System.out.println("\n\n----- Escolha uma das opções abaixo -----");
            System.out.println("1 - Cadastra pessoas");
            System.out.println("2 - Exibir lista de alunos");
            System.out.println("Outros - Sair do programa");
            System.out.println("-----------------------------------------");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(ler.nextLine());

            if(opcao == 1){
                while(opcao != 0){

                Aluno teste = new Aluno();
                System.out.print("Nome completo: ");
                String nome = ler.nextLine();
                if(nome.intern() == sair){break;}
                else teste.nome = nome;

                System.out.print("Idade: ");
                int idade = ler.nextInt();
                ler.nextLine(); 
                teste.idade = idade;

                System.out.print("Valor da mensalidade: ");
                Double mensalidade = ler.nextDouble();
                ler.nextLine(); 
                teste.mensalidade = mensalidade;


                System.out.println("\n");
                lista.add(teste);
                } 
            }

            else if(opcao == 2){
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

            else break;


        }
                
       // new MenuInicial().setVisible(true);
       // System.out.println("Menu inicial inicializado");
        ler.close();
    }
}