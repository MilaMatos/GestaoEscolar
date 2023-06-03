package Frames;

import Classes.Funcionario;
import Classes.Professor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AbaExibirProfessores extends javax.swing.JFrame {
    private ArrayList<Funcionario> lista;
    
    public AbaExibirProfessores(ArrayList<Funcionario> lista) {
        initComponents();
        this.lista = lista;
        configTela();
        configuraLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Lista de professores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void configTela(){
        setLocationRelativeTo(null);   //Inicializar no meio
        setResizable(false);        //Não mudar a configuração de do tamanho da tela
        setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Procedimento personalizado a ser executado ao fechar o JFrame
                dispose();
            } 
        });
    }
    
    private void configuraLista(){
       ArrayList<Funcionario> listaFuncionarios = lista;
        // Filtrar os funcionários e criar uma lista somente com os professores
        ArrayList<Professor> listaProfessores = Professor.getListaProf(lista);

        if(listaProfessores.isEmpty()){
            JOptionPane.showMessageDialog(this, "Não há professores cadastrados", "AVISO", JOptionPane.WARNING_MESSAGE);
            jList1.setVisible(false);
            jScrollPane2.setVisible(false);        
        }
        else{
            // Criar um modelo de lista com os nomes dos professores
            DefaultListModel<String> modeloLista = new DefaultListModel<>();
            for (Professor professor : listaProfessores) {
                modeloLista.addElement(professor.getNome());
            }
            // Definir o modelo de lista na JList
            jList1.setModel(modeloLista);
            // Definir um ListSelectionListener para a JList
            jList1.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()) {
                        // Obter o índice selecionado na JList
                        int indiceSelecionado = jList1.getSelectedIndex();
                        if (indiceSelecionado != -1) {
                            // Obter o professor selecionado com base no índice
                            Professor professorSelecionado = listaProfessores.get(indiceSelecionado);
                            new AbaDesignarMateria(professorSelecionado, listaProfessores).setVisible(true);
                            dispose();
                        }
                    }
                }
            });
        }    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
