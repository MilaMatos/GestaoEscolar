package Classes;

import java.util.ArrayList;

public class Financeiro {
    private ArrayList<Funcionario> listaDespesas;
    private ArrayList<Aluno> listaReceitas;

    public Financeiro(ArrayList alunos, ArrayList funcionarios) {
        listaDespesas = funcionarios;
        listaReceitas = alunos;
    }

    public double verificaMensalidade(String serie, String responsavel) {
        double mensalidade = 0;

        switch (serie) {
            case "1º ANO":
                mensalidade = 100;
                break;
            case "2º ANO":
                mensalidade = 200;
                break;
            case "3º ANO":
                mensalidade = 300;
                break;
            case "4º ANO":
                mensalidade = 400;
                break;
            case "5º ANO":
                mensalidade = 500;
                break;
            default:
                break;
        }

        for (Funcionario aux : listaDespesas) {
            if (aux.getNome().equals(responsavel)) {
                return mensalidade / 2;
            }
        }

        return mensalidade;
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
