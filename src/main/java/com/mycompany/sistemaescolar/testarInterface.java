package com.mycompany.sistemaescolar;
import java.util.ArrayList;

public class testarInterface {
    public static void main(String[] args) {
    
        ArrayList<Aluno> pri = new ArrayList<>();
        Lista geral = new Lista(pri);
        
       
        
        InterfaceT teste = new InterfaceT(geral);
        teste.setVisible(true);
        
        
        
        
        
        
        
        
        
    }
}