package Classes;

import Frames.AbaInicial;

public class SistemaEscolar {
    public static void main(String[] args) {
       Financeiro geral = new Financeiro();
        
        //Aluno rayssaPires = new Aluno("Rayssa Alves Pires", "15/02/2003", "feminino", "(88) 992325912", "Monsenhor Fco de Assis Feitosa", 381, "Centro", "Casa", "Crato", "63100-360", 1, "Ronilce", "1º ano", 350, geral);
        Aluno a = new Aluno("Ra", "15/02/2003", "feminino", "(88) 992325912", "Monsenhor Fco de Assis Feitosa", 381, "Centro", "Casa", "Crato", "63100-360", 1, "Ronilce", "1º ano", 350, geral);
        Funcionario fulanoDeTal = new Funcionario("Fulano", "23/04/1976", "Masculino", "(88) 988765432", "Rua tal", 12, "Tal", "Apto 02", "Crato", "45368-000", "Graduação em Matemática", "Professor", 2300, "654.234.765-00", "Nubank", "1234567-8", 0001, "Conta de pagamentos", geral);
   
        //geral.mostrarReceita();
        //geral.mostrarDespesas();
        //geral.mostrarTotal();
        
        new AbaInicial(geral).setVisible(true);
        
        }
}