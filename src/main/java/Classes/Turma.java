package Classes;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> listaAlunos;
    private HorarioAulas horario;
    private ArrayList<Funcionario> listaProf;
    private String serie;
    private int qtdAlunos;
    
    public Turma(String serie, ArrayList<Aluno> listaAlunos){
        this.serie = serie;
        this.horario = new HorarioAulas(5,5);
        this.listaAlunos = listaAlunos;
        this.qtdAlunos = 0;
    }
    
    public ArrayList<Aluno> getListaAlunos(){
        ArrayList<Aluno> aux = new ArrayList();
        int cont = 0;
        for(int i = 0; i < listaAlunos.size(); i++){
            if(listaAlunos.get(i).getSerie().equals(serie)){
                aux.add(listaAlunos.get(i));
                cont++;
            }
        }
        this.qtdAlunos = cont;
        return aux;
    }
    
    public String getSerie(){
        return this.serie;
    }
    public int getQuantidadeAlunos(){
        return getListaAlunos().size();
    }
    public HorarioAulas getHorario(){
        return this.horario;
    }
    
    public void adicionarProfessor(Funcionario professor){
        this.listaProf.add(professor);
    }
  
}
