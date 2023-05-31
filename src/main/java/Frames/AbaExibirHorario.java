package Frames;

import Classes.Turma;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AbaExibirHorario extends javax.swing.JFrame {
    private Turma turma;
    
    public AbaExibirHorario(Turma turma) {
        this.turma = turma;
        initComponents();
        setLocationRelativeTo(null);   //Inicializar no meio
        setResizable(false);        //Não mudar a configuração de do tamanho da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaHorario = new javax.swing.JTable();
        buttonEditar = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        buttonVoltar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TabelaHorario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TabelaHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabelaHorario);
        criaTabela();

        buttonEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        jTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTitulo.setText("Horário de aulas");
        jTitulo.setFocusable(false);
        jTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonVoltar3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonVoltar3.setText("Voltar");
        buttonVoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVoltar3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTitulo)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditar)
                    .addComponent(buttonVoltar3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        for (int dia = 0; dia < 5; dia++) {
            for (int aula = 0; aula < 5; aula++) {
                Object valorCelula = TabelaHorario.getValueAt(dia, aula);
                if (valorCelula != null) {
                    String disciplina = valorCelula.toString();
                    turma.getHorario().definirAula(dia, aula, disciplina);
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Horário alterado", "AVISO", JOptionPane.WARNING_MESSAGE);
        dispose();
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonVoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltar3ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVoltar3ActionPerformed

    public void criaTabela(){
         // Obtém a matriz de strings do objeto HorarioAulas
        String[][] dadosHorario = turma.getHorario().getHorarioAulas();

        // Define os títulos das colunas
        String[] titulosColunas = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

        // Cria o modelo de tabela personalizado
        DefaultTableModel modeloTabela = new DefaultTableModel(dadosHorario, titulosColunas);
        // Define o modelo de tabela da JTable
        TabelaHorario.setModel(modeloTabela);
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
            java.util.logging.Logger.getLogger(AbaExibirHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbaExibirHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbaExibirHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbaExibirHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AbaExibirHorario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaHorario;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonVoltar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
