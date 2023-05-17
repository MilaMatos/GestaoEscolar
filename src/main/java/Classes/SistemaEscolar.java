package Classes;

import Frames.AbaInicial;
import java.util.ArrayList;

public class SistemaEscolar {
    public static void main(String[] args) {
       Financeiro geral = new Financeiro();
       ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
       ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
        
        //Aluno rayssaPires = new Aluno("Rayssa Alves Pires", "15/02/2003", "feminino", "(88) 992325912", "Monsenhor Fco de Assis Feitosa", 381, "Centro", "Casa", "Crato", "63100-360", 1, "Ronilce", "1º ano", 350, geral);
        Aluno a = new Aluno("Rayssa Alves", "15/02/2003", "Masculino", "(88) 992325912", "Monsenhor Fco de Assis Feitosa", 381, "Centro", "", "Crato", "63100-360", 1, "Ronilce", "1º ANO", 350, geral);
        Aluno c = new Aluno("Camila", "15/02/2003", "Masculino", "(88) 992325912", "Monsenhor Fco de Assis Feitosa", 381, "Centro", "", "Crato", "63100-360", 2021007384, "Ronilce", "1º ANO", 350, geral);

        //Funcionario fulanoDeTal = new Funcionario("Fulano", "23/04/1976", "Masculino", "(88) 988765432", "Rua tal", 12, "Tal", "Apto 02", "Crato", "45368-000", "Graduação em Matemática", "Professor", 2300, "654.234.765-00", "Nubank", "1234567-8", 0001, "Conta de pagamentos", geral);
        
       new AbaInicial(geral, listaAlunos, listaFuncionario).setVisible(true);
        listaAlunos.add(a);
        listaAlunos.add(c);
        
            
        }
}