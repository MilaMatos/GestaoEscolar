package com.mycompany.sistemaescolar;
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
            System.out.println("3 - Pesquisar por nome");
            System.out.println("Outros - Sair do programa");
            System.out.println("-----------------------------------------");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(ler.nextLine());

            if(opcao == 1){                                     //cadastrar pessoas
                while(opcao != 0){

                Aluno cadastro = new Aluno();                      //criando um aluno 
                System.out.print("Nome completo: ");
                String nome = ler.nextLine();
                if(nome.intern() == sair){break;}
                else cadastro.nome = nome;

                System.out.print("Idade: ");
                int idade = ler.nextInt();
                ler.nextLine(); 
                cadastro.idade = idade;

                System.out.print("Valor da mensalidade: ");
                Double mensalidade = ler.nextDouble();
                ler.nextLine(); 
                cadastro.mensalidade = mensalidade;


                System.out.println("\n");
                lista.add(cadastro);
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

            else if (opcao == 3){
                System.out.print("Nome: ");
                String pes = ler.nextLine(); 

                boolean pesquisar = false;

			    for (int i = 0; i < lista.size(); i++) {
                    Aluno aux = (Aluno)lista.get(i);
                    if (aux.nome.equals(pes)) {
                        aux.exibir();
                        pesquisar = true;
                    }
			    }

                if (!pesquisar) {
                    System.out.println("Nao achei o nome: " + pes + " no cadastro.");
                }

                else {
                    menu = 1;
                    break;
                }
            }

        }

        ler.close();
    }
}