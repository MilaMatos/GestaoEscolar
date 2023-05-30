package Classes;

import Frames.AbaInicial;
import java.util.ArrayList;

public class SistemaEscolar {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        Financeiro geral = new Financeiro(listaAlunos, listaFuncionario);
        
        //Auxiliar testes
        Aluno a = new Aluno("a", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        Aluno b = new Aluno("ab", "", "", "", "", 2,
            "", "", "", "", "",
            "");
        listaAlunos.add(a);
        listaAlunos.add(b);
        // -------------------------------------------------
        
        new AbaInicial(geral, listaAlunos, listaFuncionario).setVisible(true);
    }
}
