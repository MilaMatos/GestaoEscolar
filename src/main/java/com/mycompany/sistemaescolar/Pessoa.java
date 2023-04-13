package com.mycompany.sistemaescolar;

public abstract class Pessoa {
    protected String nome;
    protected String dataNascimento;
    protected int idade;
    protected String genero;
    protected String contato;
    
    protected String rua;
    protected int numero;
    protected String bairro;
    protected String complemento;
    protected String cidade;
    protected String cep;
    
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
    
    
    
    
    
    
}
