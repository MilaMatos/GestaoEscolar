package Frames;

import Classes.Funcionario;

public class AbaExibirFuncionario extends javax.swing.JFrame {
    Funcionario funcionario;

    public AbaExibirFuncionario(Funcionario funcionario) {
        initComponents();
        this.funcionario = funcionario;
        setLocationRelativeTo(null);   //Inicializar no meio
        setAlwaysOnTop(true);       //Iniciar na frente do outro jFrame
        setResizable(false);        //Não mudar a configuração de do tamanho da tela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEndereco = new javax.swing.JPanel();
        jRua = new javax.swing.JLabel();
        jCidade = new javax.swing.JLabel();
        jCep = new javax.swing.JLabel();
        jBairro = new javax.swing.JLabel();
        jComplemento = new javax.swing.JLabel();
        jNum = new javax.swing.JLabel();
        jCidade2 = new javax.swing.JLabel();
        jBairro2 = new javax.swing.JLabel();
        jRua2 = new javax.swing.JLabel();
        jCep2 = new javax.swing.JLabel();
        jNum2 = new javax.swing.JLabel();
        jComplemento2 = new javax.swing.JLabel();
        panelBanco = new javax.swing.JPanel();
        jTipoConta = new javax.swing.JLabel();
        jAgencia = new javax.swing.JLabel();
        tMensalidade1 = new javax.swing.JLabel();
        jConta = new javax.swing.JLabel();
        jBanco = new javax.swing.JLabel();
        jTipoDeConta2 = new javax.swing.JLabel();
        jBanco2 = new javax.swing.JLabel();
        jConta2 = new javax.swing.JLabel();
        jSalario2 = new javax.swing.JLabel();
        jAgencia2 = new javax.swing.JLabel();
        jtitulo = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        tNome = new javax.swing.JLabel();
        tData = new javax.swing.JLabel();
        tGenero = new javax.swing.JLabel();
        tContato1 = new javax.swing.JLabel();
        tResponsavel = new javax.swing.JLabel();
        jEscolaridade = new javax.swing.JLabel();
        tSerie = new javax.swing.JLabel();
        jNome2 = new javax.swing.JLabel();
        jGenero2 = new javax.swing.JLabel();
        jCargo2 = new javax.swing.JLabel();
        jEscolaridade2 = new javax.swing.JLabel();
        jData2 = new javax.swing.JLabel();
        jContato2 = new javax.swing.JLabel();
        jCpf2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jRua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRua.setText("Rua:");

        jCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCidade.setText("Cidade:");

        jCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCep.setText("CEP:");

        jBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBairro.setText("Bairro:");

        jComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComplemento.setText("Complemento:");

        jNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jNum.setText("Nº:");

        jCidade2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCidade2.setText("jLabel1");

        jBairro2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBairro2.setText("jLabel1");

        jRua2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRua2.setText("jLabel1");

        jCep2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCep2.setText("jLabel1");

        jNum2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jNum2.setText("jLabel1");

        jComplemento2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComplemento2.setText("jLabel1");

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                        .addComponent(jRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRua2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComplemento2)
                        .addGap(53, 53, 53))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(jBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBairro2))
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(jCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCidade2)))
                        .addGap(199, 199, 199)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(jNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jNum2))
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(jCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCep2)))
                        .addGap(52, 52, 52))))
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCidade)
                    .addComponent(jCep)
                    .addComponent(jCidade2)
                    .addComponent(jCep2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jNum)
                        .addComponent(jNum2))
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBairro)
                        .addComponent(jBairro2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRua)
                        .addComponent(jRua2))
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComplemento)
                        .addComponent(jComplemento2)))
                .addContainerGap())
        );

        panelBanco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados bancários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jTipoConta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTipoConta.setText("Tipo da Conta:");

        jAgencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jAgencia.setText("Agência:");

        tMensalidade1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tMensalidade1.setText("Salário: ");

        jConta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jConta.setText("Conta:");

        jBanco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBanco.setText("Banco:");

        jTipoDeConta2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTipoDeConta2.setText("jLabel1");

        jBanco2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBanco2.setText("jLabel1");

        jConta2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jConta2.setText("jLabel1");

        jSalario2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jSalario2.setText("jLabel1");

        jAgencia2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jAgencia2.setText("jLabel1");

        javax.swing.GroupLayout panelBancoLayout = new javax.swing.GroupLayout(panelBanco);
        panelBanco.setLayout(panelBancoLayout);
        panelBancoLayout.setHorizontalGroup(
            panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBancoLayout.createSequentialGroup()
                        .addGroup(panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBancoLayout.createSequentialGroup()
                                .addComponent(jConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jConta2))
                            .addGroup(panelBancoLayout.createSequentialGroup()
                                .addComponent(jTipoConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTipoDeConta2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tMensalidade1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSalario2)
                        .addGap(62, 62, 62))
                    .addGroup(panelBancoLayout.createSequentialGroup()
                        .addComponent(jBanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBanco2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAgencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAgencia2)
                        .addGap(61, 61, 61))))
        );
        panelBancoLayout.setVerticalGroup(
            panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipoConta)
                    .addComponent(tMensalidade1)
                    .addComponent(jTipoDeConta2)
                    .addComponent(jSalario2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBanco)
                    .addComponent(jAgencia)
                    .addComponent(jBanco2)
                    .addComponent(jAgencia2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConta)
                    .addComponent(jConta2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jtitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtitulo.setText("Exibir");
        jtitulo.setFocusable(false);
        jtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        buttonEditar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        panelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        tNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tNome.setText("Nome:");
        tNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tNomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tNomeMouseExited(evt);
            }
        });

        tData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tData.setText("Data de nascimento:");

        tGenero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tGenero.setText("Gênero:");

        tContato1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tContato1.setText("Contato:");

        tResponsavel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tResponsavel.setText("Cargo:");

        jEscolaridade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jEscolaridade.setText("Escolaridade:");

        tSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tSerie.setText("CPF:");

        jNome2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jNome2.setText("jLabel2");

        jGenero2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jGenero2.setText("jLabel1");

        jCargo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCargo2.setText("jLabel1");

        jEscolaridade2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jEscolaridade2.setText("jLabel1");

        jData2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jData2.setText("jLabel1");

        jContato2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jContato2.setText("jLabel1");

        jCpf2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jCpf2.setText("jLabel1");

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
                                .addComponent(tGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jGenero2))
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(tResponsavel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCargo2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                                .addComponent(tData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jData2)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                                .addComponent(tContato1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCpf2)
                                    .addComponent(jContato2))
                                .addGap(79, 79, 79))))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(tNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNome2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jEscolaridade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEscolaridade2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNome)
                    .addComponent(jNome2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tData)
                    .addComponent(tGenero)
                    .addComponent(jGenero2)
                    .addComponent(jData2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tContato1)
                    .addComponent(tResponsavel)
                    .addComponent(jCargo2)
                    .addComponent(jContato2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEscolaridade)
                    .addComponent(tSerie)
                    .addComponent(jEscolaridade2)
                    .addComponent(jCpf2))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVoltar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jtitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditar)
                    .addComponent(buttonVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void tNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNomeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeMouseEntered

    private void tNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNomeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeMouseExited

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
            java.util.logging.Logger.getLogger(AbaExibirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbaExibirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbaExibirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbaExibirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AbaExibirFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel jAgencia;
    private javax.swing.JLabel jAgencia2;
    private javax.swing.JLabel jBairro;
    private javax.swing.JLabel jBairro2;
    private javax.swing.JLabel jBanco;
    private javax.swing.JLabel jBanco2;
    private javax.swing.JLabel jCargo2;
    private javax.swing.JLabel jCep;
    private javax.swing.JLabel jCep2;
    private javax.swing.JLabel jCidade;
    private javax.swing.JLabel jCidade2;
    private javax.swing.JLabel jComplemento;
    private javax.swing.JLabel jComplemento2;
    private javax.swing.JLabel jConta;
    private javax.swing.JLabel jConta2;
    private javax.swing.JLabel jContato2;
    private javax.swing.JLabel jCpf2;
    private javax.swing.JLabel jData2;
    private javax.swing.JLabel jEscolaridade;
    private javax.swing.JLabel jEscolaridade2;
    private javax.swing.JLabel jGenero2;
    private javax.swing.JLabel jNome2;
    private javax.swing.JLabel jNum;
    private javax.swing.JLabel jNum2;
    private javax.swing.JLabel jRua;
    private javax.swing.JLabel jRua2;
    private javax.swing.JLabel jSalario2;
    private javax.swing.JLabel jTipoConta;
    private javax.swing.JLabel jTipoDeConta2;
    private javax.swing.JLabel jtitulo;
    private javax.swing.JPanel panelBanco;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JLabel tContato1;
    private javax.swing.JLabel tData;
    private javax.swing.JLabel tGenero;
    private javax.swing.JLabel tMensalidade1;
    private javax.swing.JLabel tNome;
    private javax.swing.JLabel tResponsavel;
    private javax.swing.JLabel tSerie;
    // End of variables declaration//GEN-END:variables
}
