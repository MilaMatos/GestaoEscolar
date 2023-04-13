package com.mycompany.sistemaescolar;

public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    
    public Endereco(String rua, int numero, String complemento, String bairro, String cidade, String cep){} //Com complemento
    public Endereco(String rua, int numero, String bairro, String cidade, String cep){}                     //Sem complemento
    
    public String getRua(){
        return rua;
    }
    
    public void mostrarDetalhes(){
        System.out.println("---Endereço--- ");
        System.out.println("Cidade: "+cidade);
        System.out.println("Rua: "+getRua());
        System.out.println("Nº: "+numero);
        System.out.println("Bairro: "+bairro);
        System.out.println("Complemento: "+complemento);
        System.out.println("CEP: "+cep);
    }
    
}
