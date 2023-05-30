package Classes;

public class Notas {
    
    private String[] materias; //adicionar as string das materias //todas iguais
    private double[] notas;         //mesma quantidade de materias
    
    public void adicionarNota(String materia, double nota) {
        int indice = buscarIndiceMateria(materia);
        if (indice != -1) {
            notas[indice] = nota;
        } else {
            System.out.println("Matéria não encontrada!");
        }
    }
    
    public double obterNota(String materia) {
        int indice = buscarIndiceMateria(materia);
        if (indice != -1) {
            return notas[indice];
        } else {
            System.out.println("Matéria não encontrada!");
            return 0.0;
        }
    }
    
    /*public void imprimirBoletim() {
        System.out.println("Boletim do Aluno:");
        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i] + ": " + notas[i]);
        }
    }*/
    
    private int buscarIndiceMateria(String materia) {
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] != null && materias[i].equals(materia)) {
                return i;
            }
        }
        return -1;
    }
    
    /*public static void main(String[] args) {
        int numeroMaterias = 3;
        Notas boletim = new Notas();
        
        boletim.materias[0] = "Matemática";
        boletim.materias[1] = "Português";
        boletim.materias[2] = "História";
        
        boletim.adicionarNota("Matemática", 8.5);
        boletim.adicionarNota("Português", 7.0);
        boletim.adicionarNota("História", 9.0);
        
        boletim.imprimirBoletim();
        
        double notaMatematica = boletim.obterNota("Matemática");
        System.out.println("Nota de Matemática: " + notaMatematica);
    }*/
}