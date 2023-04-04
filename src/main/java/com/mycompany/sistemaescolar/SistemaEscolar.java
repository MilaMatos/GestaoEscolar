package com.mycompany.sistemaescolar;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class SistemaEscolar {

    public static void main(String[] args) {
        
        ArrayList<Pessoa> lista = new ArrayList<>();
        Scanner ler = new Scanner(System.in);  // Create a Scanner object
        
        int menu = 0;
        String sair = "sair";
         
        while(menu != 1){
            Pessoa teste = new Pessoa();
            
            System.out.println("Bota o nome");
            String nome = ler.next(); 
            
            if(nome.intern() == sair){
                break;
            }
            
            teste.nome = nome;
            
            System.out.println("Idade");
            int idade = ler.nextInt(); 
            teste.idade = idade;
            
            
            
            System.out.println("\n");
            lista.add(teste); 
        
        }
        
        for(int i=0; i<(lista.size()); i++){
            lista.get(i).exibir(); 
        }
        
       // new MenuInicial().setVisible(true);
       // System.out.println("Menu inicial inicializado");
        
    }
}