package Classes;

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
            String serie, double mensalidade) {
        super(nome, dataNascimento, genero, contato, rua, numero, bairro, complemento, cidade, cep);
        this.responsavel = responsavel;
        this.serie = serie;
        this.mensalidade = mensalidade;
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

    // Ou ta errado ou vai mudar algo no futuro
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

    public void editarAluno(String nome, String dataNascimento, String genero, String contato, String rua, int numero,
            String bairro, String complemento, String cidade, String cep, String responsavel, String serie) {
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
}
