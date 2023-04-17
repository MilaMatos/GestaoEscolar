package com.mycompany.sistemaescolar;

public class Aluno extends Pessoa{
    private double mensalidade;
    private double notas[][];
    private boolean carne[];
    private int matricula;
    private String responsavel;
    private String serie;
    
    public Aluno (String nome, String dataNascimento, String genero, String contato, String rua, int numero, String bairro, String complemento, String cidade, String cep, int matricula, String responsavel, String serie, double mensalidade, Financeiro fin){
        super(nome, dataNascimento, genero, contato, rua, numero, bairro, complemento, cidade, cep);
        this.matricula = matricula;
        this.responsavel = responsavel;
        this.serie = serie;
        this.mensalidade = mensalidade;
        
        //Adiciona na receita do financeiro passado
        fin.adicionaReceita(mensalidade);
        
    }   //Construtor completo
    
    public void mostraDetalhesAluno(){
        System.out.println("--------Detalhes do aluno--------");
        System.out.println("Nome: "+nome);
        System.out.println("Data de nascimento: "+dataNascimento);
        System.out.println("Gênero: "+genero);
        System.out.println("Número de contato: "+contato);  
        System.out.println("Número da matrícula: "+matricula);
        System.out.println("Responsável: "+responsavel);
        System.out.println("Série: "+serie);
        System.out.println("Valor da mensalidade: R$ "+mensalidade);
        System.out.println("---Endereço--- ");
        System.out.println("Cidade: "+cidade);
        System.out.println("Rua: "+rua);
        System.out.println("Nº: "+numero);
        System.out.println("Bairro: "+bairro);
        System.out.println("Complemento: "+complemento);
        System.out.println("CEP: "+cep);
    }
}
