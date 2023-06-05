package Classes;

import Frames.AbaInicial;
import java.util.ArrayList;

public class SistemaEscolar {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        Financeiro geral = new Financeiro(listaAlunos, listaFuncionario);
        ArrayList<Turma> turmas = new ArrayList<>();
        
        Turma pri = new Turma("1º ANO", listaAlunos);
        Turma seg = new Turma("2º ANO", listaAlunos);
        Turma ter = new Turma("3º ANO", listaAlunos);
        Turma qua = new Turma("4º ANO", listaAlunos);
        Turma qui = new Turma("5º ANO", listaAlunos);
        turmas.add(pri);
        turmas.add(seg);
        turmas.add(ter);
        turmas.add(qua);
        turmas.add(qui);


        new AbaInicial(geral, listaAlunos, listaFuncionario, turmas).setVisible(true);
    }
}
