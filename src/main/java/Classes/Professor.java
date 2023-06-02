package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Professor extends Funcionario{
    //private String[] materias;
    //private Map<String, Map> serie;
    private Map<String, String[]> serieMaterias;
    
       
    public Professor(String nome, String dataNascimento, String genero, String contato, String rua, int numero,
            String bairro, String complemento, String cidade, String cep, String escolaridade, String cargo,
            double salario, String cpf, String banco, String conta, int agencia, String tipoDeConta){
        super(nome, dataNascimento, genero, contato, rua, numero, bairro, complemento, cidade, cep, escolaridade, cargo, salario, cpf, banco, conta, agencia, tipoDeConta);
        serieMaterias = new HashMap<>() ;
    }
    
    public void adicionarMaterias(String serie, String[] materias) {
        serieMaterias.put(serie, materias);
    }

    public boolean verificaMateria(ArrayList<Professor> lista, String serie, String materia){
        for(int i = 0; i < lista.size(); i++){
            //if(lista.get(i))
        }
        return true;
    }

    public Map<String, String[]> getSerieMaterias(){
        return this.serieMaterias;
    }
    
   public static boolean verificarProfessorPorSerieMateria(ArrayList<Professor> listaProfessores, String serie, String materia) {
        for (Professor professor : listaProfessores) {
            Map<String, String[]> serieMaterias = professor.getSerieMaterias();
            
            if (serieMaterias.containsKey(serie)) {
                String[] materias = serieMaterias.get(serie);
                
                for (String materiaProfessor : materias) {
                    if (materiaProfessor.equals(materia)) {
                        return true; // Existe professor com a série e a matéria especificadas
                    }
                }
            }
        }
        
        return false; // Não existe professor com a série e a matéria especificadas
    }
   
   public boolean adicionarMateriaParaSerie(ArrayList<Professor> listaProfessores, Professor professor, String serie, String materia) {
        // Verifica se já existe algum professor com a série e a matéria especificadas
        boolean existeProfessor = verificarProfessorPorSerieMateria(listaProfessores, serie, materia);
        
        if (!existeProfessor) {
            // Adiciona a matéria para a série do professor
            Map<String, String[]> serieMaterias = professor.getSerieMaterias();
            
            if (serieMaterias.containsKey(serie)) {
                String[] materias = serieMaterias.get(serie);
                String[] novasMaterias = new String[materias.length + 1];
                System.arraycopy(materias, 0, novasMaterias, 0, materias.length);
                novasMaterias[materias.length] = materia;
                serieMaterias.put(serie, novasMaterias);
            } else {
                String[] materias = {materia};
                serieMaterias.put(serie, materias);
            }
            
            return true; // Matéria adicionada com sucesso
        }
        
        return false; // Não foi possível adicionar a matéria
    }
   
   public static ArrayList<Professor> getListaProf(ArrayList<Funcionario> lista){
        ArrayList<Funcionario> listaFuncionarios = lista;

        // Filtrar os funcionários e criar uma lista somente com os professores
        ArrayList<Professor> listaProfessores = new ArrayList<>();
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getCargo().equals("Professor")) {
                listaProfessores.add((Professor) funcionario);
            }
        }
        return listaProfessores;
   }
   
   
    
    
    
    
}
