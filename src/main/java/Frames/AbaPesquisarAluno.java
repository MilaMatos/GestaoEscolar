package Frames;

import Classes.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Classes.Financeiro;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AbaPesquisarAluno extends javax.swing.JFrame {
    ArrayList<Aluno> lista;
    Financeiro financeiro;

    public AbaPesquisarAluno(ArrayList lista, Financeiro financeiro) {
        this.lista = lista;
        this.financeiro = financeiro;
        initComponents();
        configTela();
        jLista.setVisible(false);
        campMatricula.setVisible(false);
        jMatricula.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitulo = new javax.swing.JLabel();
        jMatricula = new javax.swing.JLabel();
        campMatricula = new javax.swing.JFormattedTextField();
        jNome = new javax.swing.JLabel();
        campNome = new javax.swing.JTextField();
        jLista = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTitulo.setText("Pesquisar");

        jMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMatricula.setText("Matrícula:");

        campMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            campMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jNome.setText("Nome:");

        campNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNomeActionPerformed(evt);
            }
        });

        jLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Oi", "tchau" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jLista.setToolTipText("");
        jLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListaMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jTitulo)
                .addContainerGap(111, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome)
                    .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLista, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
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
    
    private void campNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNomeActionPerformed
  
    }//GEN-LAST:event_campNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String aux = campNome.getText();

        //Pesquisar(Verificar) se os nomes que estão na lista COMEÇAM pela string passada
        ArrayList<String> listaAux = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().startsWith(aux)) {
                listaAux.add(lista.get(i).getNome());
            }
        }

        //passando os nomes para a jList (elemento do design)
        jLista.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return listaAux.size(); }
            public String getElementAt(int i) { return listaAux.get(i); }
        });

        //Se a lista não estiver vazia (achou pelo menos um aluno) vai exibir a lista com os nomes, senão vai exibir a mensagem de "erro"  
        if (!listaAux.isEmpty()) {
            jLista.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Aluno não encontrado", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaMouseClicked
        //Vai pesquisar novamente, agora exatamente o nome passado(o nome selecionado) e abrir uma nova aba para exibir as informações
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equals(jLista.getSelectedValue())){

                String[] opcoes = { "Informações", "Boletim" };

                int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "AVISO",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

                if (escolha == 0) {
                    new Frames.AbaExibirAluno(lista.get(i), financeiro, lista).setVisible(true);
                    
                    break;
                } else if (escolha == 1) {
                    new AbaNotas(lista.get(i)).setVisible(true);
                    
                }
            }
        }
            }//GEN-LAST:event_jListaMouseClicked

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
    private javax.swing.JFormattedTextField campMatricula;
    private javax.swing.JTextField campNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jLista;
    private javax.swing.JLabel jMatricula;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
