package Classes;

public class Notas {
    
    private String[] materias = {"Portugês", "Matemática", "História", "Geografia", "Ciências", "Artes", "Inglês", "Educação Física"};
    private double[] notas;
    
    public Notas(){ 
        this.notas = new double[8];
    }
    
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
    
    private int buscarIndiceMateria(String materia) {
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] != null && materias[i].equals(materia)) {
                return i;
            }
        }
        return -1;
    }

}