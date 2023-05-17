package Frames;

import Classes.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AbaPesquisarAluno extends javax.swing.JFrame {
    ArrayList<Aluno> lista;

    /**
     * Creates new form AbaPesquisarAluno
     */
    public AbaPesquisarAluno(ArrayList lista) {
        this.lista = lista;
        initComponents();
        this.setLocationRelativeTo(null);   //Inicializar no meio
        setAlwaysOnTop(true);       //Iniciar na frente do outro jFrame
        setResizable(false);        //Não mudar a configuração de do tamanho da tela
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitulo = new javax.swing.JLabel();
        jMatricula = new javax.swing.JLabel();
        campMatricula = new javax.swing.JFormattedTextField();
        jNome = new javax.swing.JLabel();
        campNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTitulo.setText("Pesquisar");

        jMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMatricula.setText("Matrícula:");

        try {
            campMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jNome.setText("Nome:");

        campNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNomeActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campNome))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(buttonVoltar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMatricula)
                    .addComponent(campMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome)
                    .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(buttonVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void campNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNomeActionPerformed
  
    }//GEN-LAST:event_campNomeActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String aux = campNome.getText();
       int mat = 0;
       if(!campMatricula.getText().isBlank()) mat = Integer.parseInt(campMatricula.getText());
        
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equals(aux) || lista.get(i).getMatricula() == mat){
                new Frames.AbaExibirAluno(lista.get(i)).setVisible(true);
                dispose();
            }
            if(i == (lista.size()-1) && !lista.get(i).getNome().equals(aux) && lista.get(i).getMatricula() != mat) JOptionPane.showMessageDialog(this, "Aluno não encontrado", "AVISO", JOptionPane.WARNING_MESSAGE);

        }
        
        /*for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getMatricula() == mat){
                 new Frames.AbaExibirAluno(lista.get(i)).setVisible(true);
                 dispose();
            }
            if(i == (lista.size()-1) && !lista.get(i).getNome().equals(aux)) JOptionPane.showMessageDialog(this, "Aluno não encontrado", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
        */
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AbaPesquisarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbaPesquisarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbaPesquisarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbaPesquisarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AbaPesquisarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JFormattedTextField campMatricula;
    private javax.swing.JTextField campNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jMatricula;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
