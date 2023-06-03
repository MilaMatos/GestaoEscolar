package Frames;
import Classes.Aluno;
import Classes.Financeiro;
import Classes.Funcionario;
import Classes.Professor;
import Classes.Turma;
import java.util.ArrayList;

public class AbaInicial extends javax.swing.JFrame {
    private Financeiro financeiro;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Funcionario> listaFuncionario;
    private ArrayList<Turma> turmas;
       
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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

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

        jMenu1.setText("1º Ano");

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

        jMenu2.setText("2º Ano");

        jMenuItem4.setText("Horário");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Alunos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem7.setText("Professores");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        menuTurmas.add(jMenu2);

        jMenu3.setText("3º Ano");

        jMenuItem8.setText("Horário");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Alunos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Professores");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        menuTurmas.add(jMenu3);

        jMenu4.setText("4º Ano");

        jMenuItem11.setText("Horário");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Alunos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Professores");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        menuTurmas.add(jMenu4);

        jMenu5.setText("5º Ano");

        jMenuItem14.setText("Horário");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem14);

        jMenuItem15.setText("Alunos");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Professores");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        menuTurmas.add(jMenu5);

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
        new AbaCadastroAluno(financeiro, listaAlunos, turmas).setVisible(true);
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

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new AbaListaAlunos(listaAlunos).setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new AbaListaAlunos(turmas.get(2).getListaAlunos()).setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        new AbaExibirMateriasProf(Professor.getListaProf(listaFuncionario), "2º ANO").setVisible(true);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new AbaExibirMateriasProf(Professor.getListaProf(listaFuncionario), "3º ANO").setVisible(true);

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        new AbaExibirMateriasProf(Professor.getListaProf(listaFuncionario), "4º ANO").setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        new AbaExibirMateriasProf(Professor.getListaProf(listaFuncionario), "5º ANO").setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       new AbaListaAlunos(turmas.get(1).getListaAlunos()).setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        new AbaListaAlunos(turmas.get(3).getListaAlunos()).setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        new AbaListaAlunos(turmas.get(4).getListaAlunos()).setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new AbaExibirHorario(turmas.get(1)).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new AbaExibirHorario(turmas.get(2)).setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       new AbaExibirHorario(turmas.get(3)).setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        new AbaExibirHorario(turmas.get(4)).setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label TituloGestao;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
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
    // End of variables declaration//GEN-END:variables
}
