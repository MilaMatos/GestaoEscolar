package Classes;

import Frames.AbaInicial;
import java.util.ArrayList;

public class SistemaEscolar {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
        Financeiro geral = new Financeiro(listaAlunos, listaFuncionario);

        new AbaInicial(geral, listaAlunos, listaFuncionario).setVisible(true);

    }
}
