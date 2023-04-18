package com.mycompany.sistemaescolar;

public class Financeiro {
    private double receita;
    private double despesas;
    
    public double getReceita() {
        return receita;
    }
    public void setReceita(double receita) {
        this.receita = receita;
    }
    public double getDespesas() {
        return despesas;
    }
    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }
    
    public Financeiro(){
        this.receita = 0;
        this.despesas = 0;
    }   //Construtor completo
    
    public void adicionaReceita(double receita){
        this.receita += receita;
    }
    
    public void adicionaDespesa(double despesa){
        this.despesas += despesa;
    }
    
    public void mostrarTotal(){
        System.out.println("Total de financeiro: " + (receita-despesas));
    }
    
    public void mostrarDespesas(){
        System.out.println("Despesas: " + despesas);
    }
    
    public void mostrarReceita(){
        System.out.println("Receita: " + receita);
    }
    
    
    
}
