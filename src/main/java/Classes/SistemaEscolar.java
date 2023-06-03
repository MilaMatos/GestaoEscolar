package Classes;

import Frames.AbaInicial;
import java.util.ArrayList;

public class SistemaEscolar {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        //ArrayList<Professor> listaProf = new ArrayList<>();
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
        
        /*Professor teste = new Professor("preto", "", "", "", "", 0,
            "", "", "", "", "", "",
            700.00, "", "", "", 0, "");
        listaFuncionario.add(teste);
        //listaProf.add(teste);
    
        //Auxiliar testes
        Aluno a = new Aluno("a", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno b = new Aluno("b", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno c = new Aluno("c", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno d = new Aluno("d", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno e = new Aluno("e", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno f = new Aluno("f", "", "", "", "", 2,
            "", "", "", "", "",
            "3º ANO", geral);
        Aluno g = new Aluno("g", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno h = new Aluno("h", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno i = new Aluno("i", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno j = new Aluno("j", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno k = new Aluno("k", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno l = new Aluno("l", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno m = new Aluno("m", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno n = new Aluno("n", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno o = new Aluno("o", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno p = new Aluno("p", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno q = new Aluno("q", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno r = new Aluno("r", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno s = new Aluno("s", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno t = new Aluno("t", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        Aluno u = new Aluno("u", "", "", "", "", 2,
            "", "", "", "", "",
            "1º ANO", geral);
        
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
        listaAlunos.add(r);
        listaAlunos.add(s);
        listaAlunos.add(t);
        listaAlunos.add(u);
        */
        
        // -------------------------------------------------
        new AbaInicial(geral, listaAlunos, listaFuncionario, turmas).setVisible(true);
    }
}
