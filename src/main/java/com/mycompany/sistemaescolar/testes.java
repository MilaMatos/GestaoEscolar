package com.mycompany.sistemaescolar;
import java.util.ArrayList;
import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        
        
        /*InterfaceT teste = new InterfaceT();
        teste.setVisible(true);*/
        
        
        
        
        int menu = 0;                                   
        int opcao = 5;                                  
        //String sair = "sair";
        Scanner ler = new Scanner(System.in);
        ArrayList<Aluno> teste = new ArrayList<>();
        Lista geral = new Lista(teste);


        // testar o pesquisar
        geral.lista = teste;
        Aluno a = new Aluno(); 
        a.nome = "a";
        geral.qtd = 1;

        geral.lista.add(a);
        // iniciando com 1 aluno 

        

        while(menu != 1){
            
            System.out.println("\n\n----- Escolha uma das opções abaixo -----");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Exibir lista de alunos");
            System.out.println("3 - Pesquisar por nome");
            System.out.println("4 - Sair do programa");
            System.out.println("-----------------------------------------");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(ler.nextLine());
            //opcao = ler.nextInt();
            //ler.nextLine(); 
            
            
            if(opcao == 1){
                geral.cadastrar();
            }
            else if(opcao == 2){
                geral.listaDeAlunos();
                

            }
            else if (opcao == 3){
                geral.pesquisar();
            }
            else{
                break;
            }

        }

        ler.close();
    }
    
}
