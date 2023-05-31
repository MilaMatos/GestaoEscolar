package Classes;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> listaAlunos;
    private HorarioAulas horario;
    private ArrayList<Funcionario> listaProf;
    private String serie;
    
    public Turma(String serie, ArrayList<Aluno> listaAlunos){
        this.serie = serie;
        this.horario = new HorarioAulas(5,5);
        for(int i = 0; i < listaAlunos.size(); i++){
            if(listaAlunos.get(i).getSerie().equals(serie)){
                this.listaAlunos.add(listaAlunos.get(i));
                }
        }
    }
    
    public HorarioAulas getHorario(){
        return this.horario;
    }
    
    public void adicionarProfessor(Funcionario professor){
        this.listaProf.add(professor);
    }
    
  
}
