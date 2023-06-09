package Frames;

import Classes.Aluno;
import Classes.Financeiro;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AbaExibirAluno extends javax.swing.JFrame {
    private Aluno aluno;
    private Financeiro financeiro;
    private ArrayList<Aluno> lista;
    
    public AbaExibirAluno(Aluno aluno, Financeiro financeiro, ArrayList<Aluno> lista) {
        this.aluno = aluno;
        this.lista = lista;
        this.financeiro = financeiro;
        initComponents();
        configTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
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
        buttonExcluir = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        if(aluno.getGenero() == "Selecione") jGenero2.setText("");
        else
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
                        .addComponent(jGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jGenero2))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSerie2))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jResponsavel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jResponsavel2))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNome2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jContato2))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jData2))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMatricula2)))
                .addGap(40, 40, 40))
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

        buttonExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonExcluir.setForeground(new java.awt.Color(200, 50, 50));
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelEndereço, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditar)
                    .addComponent(buttonExcluir))
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
    
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        dispose();
        new Frames.AbaEditarAluno(aluno, financeiro, lista).setVisible(true);
       
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Todos os dados do aluno serão excluídos \n\n                     Prosseguir?", "Aviso", JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "Aluno removido com sucesso", "AVISO", JOptionPane.WARNING_MESSAGE);
            Aluno.excluirAluno(lista, aluno);
            dispose();
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
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
