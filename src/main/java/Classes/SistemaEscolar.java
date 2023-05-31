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
        
        
    
        //Auxiliar testes
        Aluno a = new Aluno("a", "", "", "", "", 2,
            "", "", "", "", "",
            "5º ANO");
        Aluno b = new Aluno("b", "", "", "", "", 2,
            "", "", "", "", "",
            "2º ANO");
        Aluno c = new Aluno("c", "", "", "", "", 2,
            "", "", "", "", "",
            "2º ANO");
        Aluno d = new Aluno("d", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO");
        Aluno e = new Aluno("e", "", "", "", "", 2,
            "", "", "", "", "",
            "2º ANO");
        Aluno f = new Aluno("f", "", "", "", "", 2,
            "", "", "", "", "",
            "3º ANO");
        Aluno g = new Aluno("g", "", "", "", "", 2,
            "", "", "", "", "",
            "3º ANO");
        Aluno h = new Aluno("h", "", "", "", "", 2,
            "", "", "", "", "",
            "2º ANO");
        Aluno i = new Aluno("i", "", "", "", "", 2,
            "", "", "", "", "",
            "3º ANO");
        Aluno j = new Aluno("j", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO");
        Aluno k = new Aluno("k", "", "", "", "", 2,
            "", "", "", "", "",
            "4º ANO");
        Aluno l = new Aluno("l", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO");
        Aluno m = new Aluno("m", "", "", "", "", 2,
            "", "", "", "", "",
            "3º ANO");
        Aluno n = new Aluno("n", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO");
        Aluno o = new Aluno("o", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO");
        Aluno p = new Aluno("p", "", "", "", "", 2,
            "", "", "", "", "",
            "5º ANO");
        Aluno q = new Aluno("q", "", "", "", "", 2,
            "", "", "", "", "",
            "4º ANO");
        
        listaAlunos.add(a);
        listaAlunos.add(b);
        listaAlunos.add(c);
        listaAlunos.add(d);
        listaAlunos.add(e);
        listaAlunos.add(f);
        listaAlunos.add(g);
        listaAlunos.add(h);
        listaAlunos.add(i);
        listaAlunos.add(j);
        listaAlunos.add(k);
        listaAlunos.add(l);
        listaAlunos.add(m);
        listaAlunos.add(n);
        listaAlunos.add(o);
        listaAlunos.add(p);
        listaAlunos.add(q);
        
        // -------------------------------------------------
        
        //new AbaExibirHorario(horario).setVisible(true);
        new AbaInicial(geral, listaAlunos, listaFuncionario, turmas).setVisible(true);
    }
}
