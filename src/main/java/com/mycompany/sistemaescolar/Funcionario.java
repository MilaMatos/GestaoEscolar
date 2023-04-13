package com.mycompany.sistemaescolar;

public class Funcionario extends Pessoa{
    private double salario;
    private String cargo;
    private String cpf;
    private String escolaridade;
    private String banco;
    private String conta;
    private int agencia;
    private String tipoDeConta;

    public Funcionario(String nome, String dataNascimento, String genero, String contato, String rua, int numero, String bairro, String complemento, String cidade, String cep, String escolaridade, String cargo, double salario, String cpf, String banco, String conta, int agencia, String tipoDeConta, Financeiro fin){
        super(nome, dataNascimento, genero, contato, rua, numero, bairro, complemento, cidade, cep);  
        
        
        fin.adicionaDespesa(salario);
    }   //Construtor pela metade - falta as especifidades da classe
}
    
