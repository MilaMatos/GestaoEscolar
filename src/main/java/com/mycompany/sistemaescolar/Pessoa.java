package com.mycompany.sistemaescolar;

public abstract class Pessoa {
    private String nome;
    private String dataNascimento;
    private int idade;
    private String genero;
    private String contato;
    
    private String rua;
    private int numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String cep;
    
    public Pessoa (String nome, String dataNascimento, String genero, String contato, String rua, int numero, String bairro, String complemento, String cidade, String cep){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.contato = contato;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.cep = cep;
    }   //Construtor completo
    
    //Fazer os gets/sets
    
    
    
    
    
}
