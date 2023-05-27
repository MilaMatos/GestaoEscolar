package Frames;

import Classes.Aluno;
import Classes.Financeiro;

public class AbaExibirAluno extends javax.swing.JFrame {
    Aluno aluno;
    Financeiro financeiro;
    
    public AbaExibirAluno(Aluno aluno, Financeiro financeiro) {
        this.aluno = aluno;
        initComponents();
        setLocationRelativeTo(null);   //Inicializar no meio
        setAlwaysOnTop(true);       //Iniciar na frente do outro jFrame
        setResizable(false);        //Não mudar a configuração de do tamanho da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        panelEndereço = new javax.swing.JPanel();
        jComplemento = new javax.swing.JLabel();
        jComplemento2 = new javax.swing.JLabel();
        jBairro = new javax.swing.JLabel();
        jBairro2 = new javax.swing.JLabel();
        jRua = new javax.swing.JLabel();
        jRua2 = new javax.swing.JLabel();
        jCidade = new javax.swing.JLabel();
        jCidade2 = new javax.swing.JLabel();
        jCep = new javax.swing.JLabel();
        jCep2 = new javax.swing.JLabel();
        jNum = new javax.swing.JLabel();
        jNum2 = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        jNome = new javax.swing.JLabel();
        jNome2 = new javax.swing.JLabel();
        jGenero = new javax.swing.JLabel();
        jGenero2 = new javax.swing.JLabel();
        jResponsavel = new javax.swing.JLabel();
        jResponsavel2 = new javax.swing.JLabel();
        jData = new javax.swing.JLabel();
        jData2 = new javax.swing.JLabel();
        jSerie = new javax.swing.JLabel();
        jSerie2 = new javax.swing.JLabel();
        jContato = new javax.swing.JLabel();
        jContato2 = new javax.swing.JLabel();
        jMatricula = new javax.swing.JLabel();
        jMatricula2 = new javax.swing.JLabel();
        buttonEditar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        jTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTitulo.setText("Exibir");
        jTitulo.setFocusable(false);
        jTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        panelEndereço.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComplemento.setText("Complemento:");

        jComplemento2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComplemento2.setText(aluno.getComplemento());

        jBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBairro.setText("Bairro:");

        jBairro2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBairro2.setText(aluno.getBairro());

        jRua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRua.setText("Rua:");

        jRua2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRua2.setText(aluno.getRua());

        jCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCidade.setText("Cidade:");

        jCidade2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCidade2.setText(aluno.getCidade());

        jCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCep.setText("CEP:");

        jCep2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCep2.setText(aluno.getCep());

        jNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jNum.setText("Nº:");

        if(aluno.getNumero() == -1){
            jNum2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
            jNum2.setText("");
        }
        else jNum2.setText(Integer.toString(aluno.getNumero())
        );

        javax.swing.GroupLayout panelEndereçoLayout = new javax.swing.GroupLayout(panelEndereço);
        panelEndereço.setLayout(panelEndereçoLayout);
        panelEndereçoLayout.setHorizontalGroup(
            panelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEndereçoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEndereçoLayout.createSequentialGroup()
                        .addComponent(jCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCidade2))
                    .addGroup(panelEndereçoLayout.createSequentialGroup()
                        .addComponent(jNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNum2))
                    .addGroup(panelEndereçoLayout.createSequentialGroup()
                        .addComponent(jRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRua2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEndereçoLayout.createSequentialGroup()
                        .addComponent(jBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBairro2))
                    .addGroup(panelEndereçoLayout.createSequentialGroup()
                        .addComponent(jCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCep2))
                    .addGroup(panelEndereçoLayout.createSequentialGroup()
                        .addComponent(jComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComplemento2)))
                .addGap(46, 46, 46))
        );
        panelEndereçoLayout.setVerticalGroup(
            panelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEndereçoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCidade)
                    .addComponent(jCep)
                    .addComponent(jCidade2)
                    .addComponent(jCep2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRua)
                    .addComponent(jRua2)
                    .addComponent(jBairro)
                    .addComponent(jBairro2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNum)
                    .addComponent(jNum2)
                    .addComponent(jComplemento)
                    .addComponent(jComplemento2))
                .addContainerGap())
        );

        panelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jNome.setText("Nome:");

        jNome2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jNome2.setText(aluno.getNome());

        jGenero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jGenero.setText("Gênero:");

        jGenero2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jGenero2.setText(aluno.getGenero());

        jResponsavel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jResponsavel.setText("Responsável:");

        jResponsavel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jResponsavel2.setText(aluno.getResponsavel());

        jData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jData.setText("Data de nascimento:");

        jData2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jData2.setText(aluno.getDataNascimento());

        jSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSerie.setText("Série:");

        jSerie2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jSerie2.setText(aluno.getSerie());

        jContato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jContato.setText("Contato:");

        jContato2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jContato2.setText(aluno.getContato());

        jMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMatricula.setText("Matrícula:");

        jMatricula2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMatricula2.setText(Integer.toString(aluno.getMatricula()));

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(jGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jGenero2))
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(jSerie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSerie2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(jContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jContato2))
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(jData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jData2)))
                        .addGap(40, 40, 40))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(jResponsavel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jResponsavel2)
                                .addGap(18, 18, 18)
                                .addComponent(jMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMatricula2))
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(jNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jNome2)))
                        .addContainerGap(87, Short.MAX_VALUE))))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome)
                    .addComponent(jNome2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGenero)
                    .addComponent(jData)
                    .addComponent(jData2)
                    .addComponent(jGenero2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSerie)
                    .addComponent(jContato)
                    .addComponent(jContato2)
                    .addComponent(jSerie2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jResponsavel)
                    .addComponent(jResponsavel2)
                    .addComponent(jMatricula)
                    .addComponent(jMatricula2))
                .addContainerGap())
        );

        buttonEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonVoltar)
                .addContainerGap())
            .addComponent(panelEndereço, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVoltar)
                    .addComponent(buttonEditar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        dispose();
        

        new Frames.AbaEditarAluno(aluno, financeiro).setVisible(true);
       
    }//GEN-LAST:event_buttonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(AbaExibirAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbaExibirAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbaExibirAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbaExibirAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AbaExibirAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel jBairro;
    private javax.swing.JLabel jBairro2;
    private javax.swing.JLabel jCep;
    private javax.swing.JLabel jCep2;
    private javax.swing.JLabel jCidade;
    private javax.swing.JLabel jCidade2;
    private javax.swing.JLabel jComplemento;
    private javax.swing.JLabel jComplemento2;
    private javax.swing.JLabel jContato;
    private javax.swing.JLabel jContato2;
    private javax.swing.JLabel jData;
    private javax.swing.JLabel jData2;
    private javax.swing.JLabel jGenero;
    private javax.swing.JLabel jGenero2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jMatricula;
    private javax.swing.JLabel jMatricula2;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jNome2;
    private javax.swing.JLabel jNum;
    private javax.swing.JLabel jNum2;
    private javax.swing.JLabel jResponsavel;
    private javax.swing.JLabel jResponsavel2;
    private javax.swing.JLabel jRua;
    private javax.swing.JLabel jRua2;
    private javax.swing.JLabel jSerie;
    private javax.swing.JLabel jSerie2;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JPanel panelEndereço;
    private javax.swing.JPanel panelInfo;
    // End of variables declaration//GEN-END:variables
}
