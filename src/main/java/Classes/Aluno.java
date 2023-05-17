package Classes;

public class Aluno extends Pessoa {
    private double mensalidade;
    private double notas;
    private boolean carne;
    private int matricula;
    private String responsavel;
    private String serie;

    public Aluno(String nome, String dataNascimento, String genero, String contato, String rua, int numero,
            String bairro, String complemento, String cidade, String cep, int matricula, String responsavel,
            String serie, double mensalidade) {
        super(nome, dataNascimento, genero, contato, rua, numero, bairro, complemento, cidade, cep);
        this.matricula = matricula;
        this.responsavel = responsavel;
        this.serie = serie;
        this.mensalidade = mensalidade;
    } // Construtor completo

    private int aux = 20230000;

    public int retornaMatricula() {
        aux += 1;
        return aux;
    }

    // Gets e Sets
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

    // Fim dos Gets e Sets

    public void mostraDetalhesAluno() {
        System.out.println("--------Detalhes do aluno--------");
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNascimento());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Número de contato: " + getContato());
        System.out.println("Número da matrícula: " + getMatricula());
        System.out.println("Responsável: " + getResponsavel());
        System.out.println("Série: " + getSerie());
        System.out.println("Valor da mensalidade: R$ " + getMensalidade());
        System.out.println("---Endereço--- ");
        System.out.println("Cidade: " + getCidade());
        System.out.println("Rua: " + getRua());
        System.out.println("Nº: " + getNumero());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Complemento: " + getComplemento());
        System.out.println("CEP: " + getCep());
    }
}
