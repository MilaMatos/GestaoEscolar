package Classes;

public class HorarioAulas {

    private String[][] horario;
    private String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};


    public HorarioAulas(int numeroDias, int numeroAulas) {
        horario = new String[numeroDias][numeroAulas];
    }
    
    public String[][] getHorarioAulas(){
        return this.horario;
    }

    public void definirAula(int dia, int aula, String disciplina) {
        horario[dia][aula] = disciplina;
    }

    public String obterAula(int dia, int aula) {
        return horario[dia][aula];
    }
}

