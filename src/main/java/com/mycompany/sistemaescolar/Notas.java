package com.mycompany.sistemaescolar;

public class Notas {
    double matematica;
    double portugues;
    double edFisica;
    double artes;
    double ciencias;
    double historia;
    double geografia;
    double media;
    
    public Notas(double matematica, double portugues, double edFisica, double artes, double ciencias, double historia, double geografia){
        this.matematica = matematica;
        this.portugues = portugues;
        this.edFisica = edFisica;
        this.artes = artes;
        this.ciencias = ciencias;
        this.historia = historia;
        this.geografia = geografia;
    }   //Construtor completo

    void mostraDetalhes(){
        System.out.println("Matemática: "+matematica);
        System.out.println("Português: "+portugues);
        System.out.println("Ciências: "+ciencias);
        System.out.println("História: "+historia);
        System.out.println("Geografia: "+geografia);
        System.out.println("Artes: "+artes);
        System.out.println("Educação Física: "+edFisica);
        System.out.println("Média: "+mediaBimestre());
    }

    double mediaBimestre(){
        this.media = (this.matematica + this.portugues + this.ciencias + this.historia + this.geografia + this.artes + this.edFisica)/7;
        return this.media;
    }    
}
