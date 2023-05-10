package Classes;

public class Financeiro {
    private double receita;
    private double despesas;  
    
    public Financeiro(){
        this.receita = 0;
        this.despesas = 0;
    }
    
    public double verificaMensalidade(String serie){
        if(serie == "1º ANO") return 100;
        if(serie == "2º ANO") return 200;
        if(serie == "3º ANO") return 300;
        if(serie == "4º ANO") return 400;
        if(serie == "5º ANO") return 500;
        return 0;
    }
    
    public double getReceita() {
        return receita;
    }
    public void setReceita(double receita) {
        this.receita = receita;
    }
    public double getDespesas() {
        return despesas;
    }
    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }
    
    public void adicionaReceita(double receita){
        this.receita += receita;
    }
    
    public void adicionaDespesa(double despesa){
        this.despesas += despesa;
    }
    
    public double getTotal(){
        return (receita-despesas);
    }
    
    public void mostrarDespesas(){
        System.out.println("Despesas: " + despesas);
    }
    
    public void mostrarReceita(){
        System.out.println("Receita: " + receita);
    }    
    
}
