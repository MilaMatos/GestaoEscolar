package Frames;
import Classes.Aluno;
import Classes.Financeiro;
import Classes.Funcionario;
import Classes.Professor;
import Classes.Turma;
import java.util.ArrayList;

public class AbaInicial extends javax.swing.JFrame {
    Financeiro financeiro;
    ArrayList<Aluno> listaAlunos;
    ArrayList<Funcionario> listaFuncionario;
    ArrayList<Turma> turmas;
    
    
    public AbaInicial(Financeiro financeiro, ArrayList listaA, ArrayList listaF, ArrayList turmas) {
        initComponents();
        this.setLocationRelativeTo(null);   //Inicializar no meio
        this.financeiro = financeiro;
        this.listaAlunos = listaA;
        this.listaFuncionario = listaF;  
        this.turmas = turmas;
        jButtonSair.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSair = new javax.swing.JButton();
        TituloGestao = new java.awt.Label();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuAlunos = new javax.swing.JMenu();
        jMenuItemCadAlu = new javax.swing.JMenuItem();
        jMenuItemPesAlu = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenu();
        jMenuItemCadFun = new javax.swing.JMenuItem();
        jMenuItemPesFun = new javax.swing.JMenuItem();
        jMenuItemProfFun = new javax.swing.JMenuItem();
        menuFinanceiro = new javax.swing.JMenu();
        jMenuItemRelFin = new javax.swing.JMenuItem();
        menuTurmas = new javax.swing.JMenu();
        primeiro = new javax.swing.JMenuItem();
        segundo = new javax.swing.JMenuItem();
        terceiro = new javax.swing.JMenuItem();
        quarto = new javax.swing.JMenuItem();
        quinto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema escolar");

        jButtonSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setToolTipText("");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        TituloGestao.setAlignment(java.awt.Label.CENTER);
        TituloGestao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TituloGestao.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        TituloGestao.setName(""); // NOI18N
        TituloGestao.setPreferredSize(new java.awt.Dimension(250, 70));
        TituloGestao.setText("Gestão Escolar");

        menuAlunos.setText("Alunos");

        jMenuItemCadAlu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemCadAlu.setText("Cadastro");
        jMenuItemCadAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadAluActionPerformed(evt);
            }
        });
        menuAlunos.add(jMenuItemCadAlu);

        jMenuItemPesAlu.setText("Pesquisar");
        jMenuItemPesAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesAluActionPerformed(evt);
            }
        });
        menuAlunos.add(jMenuItemPesAlu);

        jMenuItem6.setText("Lista de Alunos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuAlunos.add(jMenuItem6);

        jMenuBar2.add(menuAlunos);

        menuFuncionarios.setText("Funcionários");

        jMenuItemCadFun.setText("Cadastro");
        jMenuItemCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFunActionPerformed(evt);
            }
        });
        menuFuncionarios.add(jMenuItemCadFun);

        jMenuItemPesFun.setText("Pesquisar");
        jMenuItemPesFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesFunActionPerformed(evt);
            }
        });
        menuFuncionarios.add(jMenuItemPesFun);

        jMenuItemProfFun.setText("Professores");
        jMenuItemProfFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfFunActionPerformed(evt);
            }
        });
        menuFuncionarios.add(jMenuItemProfFun);

        jMenuBar2.add(menuFuncionarios);

        menuFinanceiro.setText("Financeiro");

        jMenuItemRelFin.setText("Relatório");
        jMenuItemRelFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelFinActionPerformed(evt);
            }
        });
        menuFinanceiro.add(jMenuItemRelFin);

        jMenuBar2.add(menuFinanceiro);

        menuTurmas.setText("Turmas");

        primeiro.setText("1º Ano");
        primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiroActionPerformed(evt);
            }
        });
        menuTurmas.add(primeiro);

        segundo.setText("2º Ano");
        segundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoActionPerformed(evt);
            }
        });
        menuTurmas.add(segundo);

        terceiro.setText("3º Ano");
        terceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terceiroActionPerformed(evt);
            }
        });
        menuTurmas.add(terceiro);

        quarto.setText("4º Ano");
        quarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quartoActionPerformed(evt);
            }
        });
        menuTurmas.add(quarto);

        quinto.setText("5º Ano");
        quinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quintoActionPerformed(evt);
            }
        });
        menuTurmas.add(quinto);

        jMenu1.setText("Teste");

        jMenuItem1.setText("Horário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Alunos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Professores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        menuTurmas.add(jMenu1);

        jMenuBar2.add(menuTurmas);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(TituloGestao, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(TituloGestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadAluActionPerformed
        AbaCadastroAluno abaCadastroAluno = new AbaCadastroAluno(financeiro, listaAlunos, turmas);
        abaCadastroAluno.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadAluActionPerformed

    private void jMenuItemPesAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesAluActionPerformed
        new AbaPesquisarAluno(listaAlunos, financeiro).setVisible(true);  
    }//GEN-LAST:event_jMenuItemPesAluActionPerformed

    private void jMenuItemCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFunActionPerformed
        new Frames.AbaCadastroFuncionario(financeiro, listaFuncionario).setVisible(true);
    }//GEN-LAST:event_jMenuItemCadFunActionPerformed

    private void jMenuItemPesFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesFunActionPerformed
        new Frames.AbaPesquisarFuncionario(listaFuncionario, financeiro).setVisible(true);
    }//GEN-LAST:event_jMenuItemPesFunActionPerformed

    private void jMenuItemProfFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfFunActionPerformed
        new AbaExibirProfessores(listaFuncionario).setVisible(true);
    }//GEN-LAST:event_jMenuItemProfFunActionPerformed

    private void jMenuItemRelFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelFinActionPerformed
        new Frames.AbaRelatorioFinanceiro(financeiro).setVisible(true);
    }//GEN-LAST:event_jMenuItemRelFinActionPerformed

    private void primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiroActionPerformed
        new AbaExibirHorario(turmas.get(0)).setVisible(true);

    }//GEN-LAST:event_primeiroActionPerformed

    private void segundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundoActionPerformed
        new AbaExibirHorario(turmas.get(1)).setVisible(true);
    }//GEN-LAST:event_segundoActionPerformed

    private void quartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quartoActionPerformed
        new AbaExibirHorario(turmas.get(3)).setVisible(true);
    }//GEN-LAST:event_quartoActionPerformed

    private void quintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quintoActionPerformed
        new AbaExibirHorario(turmas.get(4)).setVisible(true);
    }//GEN-LAST:event_quintoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new AbaListaAlunos(listaAlunos).setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void terceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terceiroActionPerformed
        new AbaExibirHorario(turmas.get(2)).setVisible(true);
    }//GEN-LAST:event_terceiroActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new AbaExibirHorario(turmas.get(0)).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new AbaListaAlunos(turmas.get(0).getListaAlunos()).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new AbaExibirMateriasProf(Professor.getListaProf(listaFuncionario), "1º ANO").setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(AbaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AbaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TituloGestao;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemCadAlu;
    private javax.swing.JMenuItem jMenuItemCadFun;
    private javax.swing.JMenuItem jMenuItemPesAlu;
    private javax.swing.JMenuItem jMenuItemPesFun;
    private javax.swing.JMenuItem jMenuItemProfFun;
    private javax.swing.JMenuItem jMenuItemRelFin;
    private javax.swing.JMenu menuAlunos;
    private javax.swing.JMenu menuFinanceiro;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenu menuTurmas;
    private javax.swing.JMenuItem primeiro;
    private javax.swing.JMenuItem quarto;
    private javax.swing.JMenuItem quinto;
    private javax.swing.JMenuItem segundo;
    private javax.swing.JMenuItem terceiro;
    // End of variables declaration//GEN-END:variables
}
