package Classes;

import java.util.ArrayList;

public class Financeiro {
    private ArrayList<Funcionario> listaDespesas;
    private ArrayList<Aluno> listaReceitas;

    public Financeiro(ArrayList alunos, ArrayList funcionarios) {
        listaDespesas = funcionarios;
        listaReceitas = alunos;
    }

    public static double verificaMensalidade(String serie) {
        if (serie == "1º ANO")
            return 100;
        if (serie == "2º ANO")
            return 200;
        if (serie == "3º ANO")
            return 300;
        if (serie == "4º ANO")
            return 400;
        if (serie == "5º ANO")
            return 500;
        return 0;
    }

    public double verificaSalario(double salario) {
        if (salario >= 100 && salario <= 2000)
            return salario;
        else
            return 0;
    }

    public double getReceita() {
        double aux = 0;
        for (int i = 0; i < listaReceitas.size(); i++) {
            aux += listaReceitas.get(i).getMensalidade();
        }
        return aux;
    }

    public double getDespesas() {
        double aux = 0;
        for (int i = 0; i < listaDespesas.size(); i++) {
            aux += listaDespesas.get(i).getSalario();
        }
        return aux;
    }

    public double getTotal() {
        return (getReceita() - getDespesas());
    }

}
