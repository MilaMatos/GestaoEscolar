package Classes;

public class HorarioAulas {

    private String[][] horario;

    public HorarioAulas(int numeroDias, int numeroAulas) {
        horario = new String[numeroDias][numeroAulas];
    }

    public void definirAula(int dia, int aula, String disciplina) {
        horario[dia][aula] = disciplina;
    }

    public String obterAula(int dia, int aula) {
        return horario[dia][aula];
    }

    public void imprimirHorario() {
        for (int dia = 0; dia < horario.length; dia++) {
            System.out.println("Dia " + (dia + 1) + ":");
            for (int aula = 0; aula < horario[dia].length; aula++) {
                String disciplina = horario[dia][aula];
                System.out.println("Aula " + (aula + 1) + ": " + disciplina);
            }
            System.out.println();
        }
    }
}