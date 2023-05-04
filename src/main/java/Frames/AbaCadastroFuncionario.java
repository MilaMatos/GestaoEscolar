
package Frames;

import Classes.Financeiro;

public class AbaCadastroFuncionario extends javax.swing.JFrame {
    Financeiro financeiro;
    /**
     * Creates new form AbaCadastroFuncionario
     */
    public AbaCadastroFuncionario(Financeiro financeiro) {
        initComponents();
        this.financeiro = financeiro;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tEndereco = new javax.swing.JLabel();
        campDataN = new javax.swing.JTextField();
        tNumero = new javax.swing.JLabel();
        campGenero = new javax.swing.JComboBox<>();
        campComplemento = new javax.swing.JTextField();
        tCep = new javax.swing.JLabel();
        campCep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tNome = new javax.swing.JLabel();
        campNome = new javax.swing.JTextField();
        tData = new javax.swing.JLabel();
        tComplemento = new javax.swing.JLabel();
        campN = new javax.swing.JTextField();
        campEndereco = new javax.swing.JTextField();
        buttonVoltar = new javax.swing.JButton();
        tGenero = new javax.swing.JLabel();
        tCidade = new javax.swing.JLabel();
        tContato = new javax.swing.JLabel();
        campCidade = new javax.swing.JTextField();
        tBairro = new javax.swing.JLabel();
        campContato = new javax.swing.JTextField();
        campBairro = new javax.swing.JTextField();
        campCargo = new javax.swing.JTextField();
        tSerie = new javax.swing.JLabel();
        tResponsavel = new javax.swing.JLabel();
        buttonConfirmar = new javax.swing.JButton();
        campCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campEscolaridade = new javax.swing.JComboBox<>();
        tCep1 = new javax.swing.JLabel();
        campCep2 = new javax.swing.JTextField();
        tCep2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tCep3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        tCep4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        campSalario = new javax.swing.JTextField();
        tMensalidade1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tEndereco.setText("Endereço:");

        campDataN.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campDataN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campDataNActionPerformed(evt);
            }
        });

        tNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tNumero.setText("Nº:");

        campGenero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "" }));
        campGenero.setSelectedIndex(2);
        campGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        campGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campGeneroActionPerformed(evt);
            }
        });

        campComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tCep.setText("CEP:");

        campCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tNome.setText("Nome:");

        campNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNomeActionPerformed(evt);
            }
        });

        tData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tData.setText("Data de nascimento:");

        tComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tComplemento.setText("Complemento:");

        campN.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campEnderecoActionPerformed(evt);
            }
        });

        buttonVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        tGenero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tGenero.setText("Gênero:");

        tCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tCidade.setText("Cidade:");

        tContato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tContato.setText("Contato:");

        campCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campCidadeActionPerformed(evt);
            }
        });

        tBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tBairro.setText("Bairro:");

        campContato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campContatoActionPerformed(evt);
            }
        });

        campBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campCargoActionPerformed(evt);
            }
        });

        tSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tSerie.setText("CPF:");

        tResponsavel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tResponsavel.setText("Cargo:");

        buttonConfirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonConfirmar.setText("Confirmar");
        buttonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarActionPerformed(evt);
            }
        });

        campCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Escolaridade:");

        campEscolaridade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ensino Médio Completo", "Superior Incompleto", "Superior Completo", "Pós/Mestre/Doutor", "" }));
        campEscolaridade.setSelectedIndex(4);

        tCep1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tCep1.setText("Tipo de conta:");

        campCep2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tCep2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tCep2.setText("Banco:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corrente", "Poupança", "Salário", "" }));
        jComboBox1.setSelectedIndex(3);

        tCep3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tCep3.setText("Agência:");

        tCep4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tCep4.setText("Conta:");

        campSalario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campSalarioActionPerformed(evt);
            }
        });

        tMensalidade1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tMensalidade1.setText("Salário: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tCep2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campCep2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tCep1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tCep3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tCep4))
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(jTextField2)))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tMensalidade1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(tSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tResponsavel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(tBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campComplemento))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tContato)
                        .addGap(14, 14, 14)
                        .addComponent(campContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campEndereco))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(tCep))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tGenero)
                                    .addComponent(tNome))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campGenero, 0, 89, Short.MAX_VALUE)
                                    .addComponent(campCep))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tData))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campN, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tCidade)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campCidade)
                                    .addComponent(campDataN))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNome)
                    .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tData)
                    .addComponent(campDataN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCep)
                    .addComponent(campCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCidade)
                    .addComponent(campCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNumero)
                    .addComponent(campN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tBairro)
                    .addComponent(campBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tComplemento)
                    .addComponent(campComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEndereco)
                    .addComponent(campEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tContato)
                    .addComponent(campContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCep1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tMensalidade1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCep2)
                    .addComponent(campCep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSerie)
                    .addComponent(campCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCep3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCep4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tResponsavel)
                    .addComponent(campCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConfirmar)
                    .addComponent(buttonVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campDataNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campDataNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campDataNActionPerformed

    private void campGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campGeneroActionPerformed

    private void campNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campNomeActionPerformed

    private void campEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campEnderecoActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void campCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campCidadeActionPerformed

    private void campContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campContatoActionPerformed

    private void campCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campCargoActionPerformed

    private void buttonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarActionPerformed
        String cargo = campEscolaridade.getItemAt(campEscolaridade.getSelectedIndex()); //Como pegar a string selecionada com a listinha
        String genero = campGenero.getItemAt(campGenero.getSelectedIndex());

        
        
        campNome.setText(null);
        campGenero.setSelectedIndex(2);
        campDataN.setText(null);
        campEscolaridade.setSelectedIndex(4);
        campContato.setText(null);
        campEndereco.setText(null);
        campBairro.setText(null);
        campN.setText(null);
        campCep.setText(null);
        campComplemento.setText(null);
        campSalario.setText(null);
        campCargo.setText(null);
        campCidade.setText(null);
        campCpf.setText(null);

        //Desnecessário
        //rayssaPires.mostraDetalhesAluno();
        //financeiro.mostrarTotal();
        //Desnecessário

    }//GEN-LAST:event_buttonConfirmarActionPerformed

    private void campSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campSalarioActionPerformed

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
            java.util.logging.Logger.getLogger(AbaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AbaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConfirmar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField campBairro;
    private javax.swing.JTextField campCargo;
    private javax.swing.JTextField campCep;
    private javax.swing.JTextField campCep2;
    private javax.swing.JTextField campCidade;
    private javax.swing.JTextField campComplemento;
    private javax.swing.JTextField campContato;
    private javax.swing.JTextField campCpf;
    private javax.swing.JTextField campDataN;
    private javax.swing.JTextField campEndereco;
    private javax.swing.JComboBox<String> campEscolaridade;
    private javax.swing.JComboBox<String> campGenero;
    private javax.swing.JTextField campN;
    private javax.swing.JTextField campNome;
    private javax.swing.JTextField campSalario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel tBairro;
    private javax.swing.JLabel tCep;
    private javax.swing.JLabel tCep1;
    private javax.swing.JLabel tCep2;
    private javax.swing.JLabel tCep3;
    private javax.swing.JLabel tCep4;
    private javax.swing.JLabel tCidade;
    private javax.swing.JLabel tComplemento;
    private javax.swing.JLabel tContato;
    private javax.swing.JLabel tData;
    private javax.swing.JLabel tEndereco;
    private javax.swing.JLabel tGenero;
    private javax.swing.JLabel tMensalidade1;
    private javax.swing.JLabel tNome;
    private javax.swing.JLabel tNumero;
    private javax.swing.JLabel tResponsavel;
    private javax.swing.JLabel tSerie;
    // End of variables declaration//GEN-END:variables
}
