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
    
    public double getSalario() {
        return salario;
    }
    public void setNome(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }
    public void setNome(int agencia) {
        this.agencia = agencia;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }
    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public Funcionario(String nome, String dataNascimento, String genero, String contato, String rua, int numero, String bairro, String complemento, String cidade, String cep, String escolaridade, String cargo, double salario, String cpf, String banco, String conta, int agencia, String tipoDeConta, Financeiro fin){
        super(nome, dataNascimento, genero, contato, rua, numero, bairro, complemento, cidade, cep);  
        
        
        fin.adicionaDespesa(salario);
    }   //Construtor pela metade - falta as especifidades da classe
}
    
