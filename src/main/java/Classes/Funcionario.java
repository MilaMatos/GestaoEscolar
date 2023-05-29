package Classes;

import java.util.ArrayList;
import java.util.Collections;

public class Funcionario extends Pessoa {
    private double salario; //
    private String cargo; //
    private String cpf; //
    private String escolaridade; //
    private String banco;
    private String conta;
    private int agencia;
    private String tipoDeConta;

    public Funcionario(String nome, String dataNascimento, String genero, String contato, String rua, int numero,
            String bairro, String complemento, String cidade, String cep, String escolaridade, String cargo,
            double salario, String cpf, String banco, String conta, int agencia, String tipoDeConta) {
        super(nome, dataNascimento, genero, contato, rua, numero, bairro, complemento, cidade, cep);
        this.escolaridade = escolaridade;
        this.cargo = cargo;
        this.salario = salario;
        this.cpf = cpf;
        this.banco = banco;
        this.conta = conta;
        this.agencia = agencia;
        this.tipoDeConta = tipoDeConta;

    }

    // Gets e Sets
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
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
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public String getTipoDeConta() {
        return tipoDeConta;
    }
    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
    
    public static int adicionarFuncionario(ArrayList lista, Financeiro financeiro ,String nome, String dataNascimento, String genero, String contato, String rua, int numero,
        String bairro, String complemento, String cidade, String cep, String escolaridade, String cargo,
        String salario, String cpf, String banco, String conta, int agencia, String tipoDeConta ){
    
        if(verificaCampoObrigatorio(nome, cargo, salario)){
            double salarioFun = Integer.parseInt(salario);  
            if(financeiro.verificaSalario(salarioFun) != 0){
                    Funcionario aux = new Funcionario(nome, dataNascimento, genero, contato, rua, numero, bairro, complemento, cidade, cep, escolaridade, cargo, salarioFun, cpf, banco, conta, agencia, tipoDeConta);
                    lista.add(aux);
                    return 0;
                }
                else return 1;
        }
        return -1;                     
    }
    
    private static boolean verificaCampoObrigatorio(String nome, String cargo, String salario){
        if((nome.isBlank()) || (cargo.equals("Selecione")) || (cargo.isBlank()) || (salario.isBlank())){
            return false;
        }
        else return true;
    }
    
    private void alterarInfo(String nome, String dataNascimento, String genero, String contato, String rua, int numero,
            String bairro, String complemento, String cidade, String cep, String escolaridade, String cargo,
            double salario, String cpf, String banco, String conta, int agencia, String tipoDeConta) {
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setContato(contato);
        this.setGenero(genero);
        this.setCidade(cidade);
        this.setCep(cep);
        this.setRua(rua);
        this.setBairro(bairro);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setEscolaridade(escolaridade);
        this.setCargo(cargo);
        this.setSalario(salario); ////////
        this.setCpf(cpf);
        this.setBanco(banco);
        this.setConta(conta);
        this.setAgencia(agencia);
        this.setTipoDeConta(tipoDeConta);
    }
    
    //Função que após as verificações (Campos obrigatórios e idade) chama a função auxiliar para alterar as informações
    public int editarFuncionario(Financeiro financeiro, String nome, String data, String genero, String contato, String rua, int numero,
            String bairro, String complemento, String cidade, String cep, String escolaridade, String cargo,
            String salario, String cpf, String banco, String conta, int agencia, String tipoDeConta) {
            
            if(Funcionario.verificaCampoObrigatorio(nome, cargo, salario)){
                double salarioFun = Integer.parseInt(salario);  
                if(financeiro.verificaSalario(salarioFun) != 0){
                    this.alterarInfo(nome, data, genero, contato, rua, numero, bairro, complemento, cidade, cep, escolaridade, cargo, salarioFun, cpf, banco, conta, agencia, tipoDeConta);
                    return 0;
            }
            else return 1;
        }
        return -1;                
    }
    
    public static Funcionario pesquisarFuncionario(ArrayList<Funcionario> lista, String nome){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equals(nome)){
                return lista.get(i);
                }
        }
        return null;
    }
}
