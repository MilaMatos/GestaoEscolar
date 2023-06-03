package Classes;

public class Notas {
    
    private String[] materias = {"Portugês", "Matemática", "História", "Geografia", "Ciências", "Artes", "Inglês", "Educação Física"};
    private double[] notas;
    
    public Notas(){ 
        this.notas = new double[8];
        for(int i = 0; i < 8; i++){
            notas[i] = -1;
        }
    }
    
    public void adicionarNota(int materia, double nota) {
        if (materia != -1) {
            notas[materia] = nota;
        } else {
            System.out.println("Matéria não encontrada!");
        }
    }
    
    public double obterNota(int materia) {   
            return notas[materia];
        }
    
    public String getMateria(int indice){
        if(indice >= 0 && indice <= 8){
            return this.materias[indice];
        }
        else return "Não existe";
    }

}