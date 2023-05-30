package Classes;

import java.util.ArrayList;
import java.util.Collections;

public class Aluno extends Pessoa implements Comparable{
    private double mensalidade;
    private double notas;
    private boolean carne;
    private int matricula;
    private String responsavel;
    private String serie;

    
    private static int contador = 202300;

    public Aluno(String nome, String dataNascimento, String genero, String contato, String rua, int numero,
            String bairro, String complemento, String cidade, String cep, String responsavel,
            String serie) {
        super(nome, dataNascimento, genero, contato, rua, numero, bairro, complemento, cidade, cep);
        this.responsavel = responsavel;
        this.serie = serie;
        this.mensalidade = Financeiro.verificaMensalidade(serie);
        this.matricula = contador;
        Aluno.contador++;
    }
    
    public double getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }

    //Função auxiliar para o editar Aluno - altera as informações do aluno
    private void alterarInfo(String nome, String dataNascimento, String genero, String contato, String rua, int numero,
            String bairro, String complemento, String cidade, String cep, String responsavel, String serie, double mensalidade) {
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setContato(contato);
        this.setGenero(genero);
        this.setSerie(serie);
        this.setResponsavel(responsavel);
        this.setCidade(cidade);
        this.setCep(cep);
        this.setRua(rua);
        this.setBairro(bairro);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.mensalidade = Financeiro.verificaMensalidade(serie);
    }
    
    //Função que após as verificações (Campos obrigatórios e idade) chama a função auxiliar para alterar as informações
    public int editarAluno(String nome, String data, String genero, String contato, String rua, int numero,
            String bairro, String complemento, String cidade, String cep, String responsavel, String serie) {
            
            if(Aluno.verificaCampoObrigatorio(nome, serie, responsavel, data)){
                if(Aluno.validarIdade(data, serie)){
                    this.alterarInfo(nome, data, genero, contato, rua, numero, bairro, complemento, cidade, cep, responsavel, serie, mensalidade);
                    return 0;
            }
            else return 1;
        }
        return -1;                
    }
    
    //Cria e adiciona o aluno na lista passada (Após as verificações de campos obrigatórios e idade)
    public static int adicionarAluno(ArrayList lista,String nome, String data, String genero, String contato, String rua, int numero,
            String bairro, String complemento, String cidade, String cep, String responsavel,
            String serie){
        if(Aluno.verificaCampoObrigatorio(nome, serie, responsavel, data)){
            if(Aluno.validarIdade(data, serie)){
                Aluno aux = new Aluno(nome, data, genero, contato, rua, numero, bairro, complemento, cidade, cep, responsavel, serie);
                lista.add(aux);
                Collections.sort(lista);
                return 0;
            }
            else return 1;
        }
        return -1;
    }                                               

    
    public static boolean verificaCampoObrigatorio(String nome, String serie, String responsavel, String data){
        if( (nome.isBlank()) || (serie.equals("Selecione")) || (responsavel.isBlank()) || (data.equals("  /  /    ")) ){
            return false;
        }
        else return true;
    }

    public static boolean validarIdade(String data, String serie){  
        String[] result = data.split("/");
        int ano = Integer.parseInt(result[2]);
        int mes = Integer.parseInt(result[1]);
        
        if(null != serie) switch (serie) {
            case "1º ANO":
                if(ano > 2017) return false;
                if(ano == 2017 && mes > 3) return false;
                break;
            case "2º ANO":
                if(ano > 2016) return false;
                if(ano == 2016 && mes > 3) return false;
                break;
            case "3º ANO":
                if(ano > 2015) return false;
                if(ano == 2015 && mes > 3) return false;
                break;
            case "4º ANO":
                if(ano > 2014) return false;
                if(ano == 2014 && mes > 3) return false;
                break;
            case "5º ANO":
                if(ano > 2013) return false;
                if(ano == 2013 && mes > 3) return false;
                break;
            default:
                break;
        } 
        return true;
    }
    
    public static Aluno pesquisarAluno(ArrayList<Aluno> lista, String nome){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equals(nome)){
                return lista.get(i);
                }
        }
        return null;
    }
    
    public static int pesquisarAluno(ArrayList<Aluno> lista, Aluno aluno){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getMatricula() == aluno.getMatricula()){
                return i;
            }
        }
        return -1;
    }
    
    public static void excluirAluno(ArrayList<Aluno> lista, Aluno aluno){
        int i = Aluno.pesquisarAluno(lista, aluno);
        if(i != -1){
            lista.remove(i);
        }
    }
    
    @Override
    public int compareTo(Object arg0) {
        Aluno aux = (Aluno) arg0;
            if(this.matricula < aux.getMatricula()) {
                return -1;
            }
            if(this.matricula > aux.getMatricula()) {
                return 1;}
            return 0;
    }
    
    
    
    
    public double getNotas() {
        return notas;
    }
    public void setNotas(double notas) {
        this.notas = notas;
    }
    public boolean getCarne() {
        return carne;
    }
    public void setCarne(boolean carne) {
        this.carne = carne;
    }
}
