package Classes;

import Frames.AbaInicial;
import Frames.teste;
import java.util.ArrayList;

public class SistemaEscolar {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        Financeiro geral = new Financeiro(listaAlunos, listaFuncionario);

        new AbaInicial(geral, listaAlunos, listaFuncionario).setVisible(true);
    }
}
