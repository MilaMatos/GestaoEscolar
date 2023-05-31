package Frames;

import Classes.Aluno;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AbaListaAlunos extends javax.swing.JFrame {
    ArrayList<Aluno> lista;
    
    public AbaListaAlunos(ArrayList lista) {
        this.lista = lista;
        initComponents();
        criarLista();
        setLocationRelativeTo(null);   //Inicializar no meio
        setResizable(false);        //Não mudar a configuração de do tamanho da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonVoltar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonVoltar2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonVoltar2.setText("Voltar");
        buttonVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltar2ActionPerformed(evt);
            }
        });

        tabelaAlunos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Matrícula"
            }
        ));
        jScrollPane1.setViewportView(tabelaAlunos);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Lista de alunos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonVoltar2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(buttonVoltar2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltar2ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVoltar2ActionPerformed

    public void criarLista(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome");
        model.addColumn("Matrícula");
        model.addColumn("Série");

         // Preenche o modelo de tabela com os dados dos alunos
        for (Aluno aluno : lista) {
            Object[] rowData = { aluno.getNome(), aluno.getMatricula(), aluno.getSerie()};
            model.addRow(rowData);
        }

         // Define o modelo de tabela da jTable
        tabelaAlunos.setModel(model);
         // Atualiza o jScrollPane1 para exibir a jTable
        jScrollPane1.setViewportView(tabelaAlunos);
    }
    
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
            java.util.logging.Logger.getLogger(AbaListaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbaListaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbaListaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbaListaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AbaListaAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JButton buttonVoltar1;
    private javax.swing.JButton buttonVoltar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAlunos;
    // End of variables declaration//GEN-END:variables
}
