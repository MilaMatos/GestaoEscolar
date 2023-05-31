package Classes;

import Frames.AbaInicial;
import Frames.AbaExibirHorario;
import java.util.ArrayList;

public class SistemaEscolar {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        Financeiro geral = new Financeiro(listaAlunos, listaFuncionario);
        
        Turma primeiro = new Turma("1º ANO", listaAlunos);
        
        //Auxiliar testes
        Aluno a = new Aluno("a", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno b = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno c = new Aluno("a", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno d = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno e = new Aluno("a", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno f = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno g = new Aluno("a", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno h = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno i = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno j = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno k = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno l = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno m = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno n = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno o = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno p = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno q = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        
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
        new AbaInicial(geral, listaAlunos, listaFuncionario, primeiro).setVisible(true);
    }
}
