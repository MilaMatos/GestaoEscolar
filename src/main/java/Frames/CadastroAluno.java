package Frames;

import com.mycompany.sistemaescolar.Aluno;
import com.mycompany.sistemaescolar.Financeiro;

public class CadastroAluno extends javax.swing.JFrame {
    Financeiro financeiro;
    /**
     * Creates new form CadastroAluno
     * @param financeiro
     */
    public CadastroAluno(Financeiro financeiro) {
        initComponents();   
        this.financeiro = financeiro;
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() 
    {

        jLabel1 = new javax.swing.JLabel();
        tNome = new javax.swing.JLabel();
        campNome = new javax.swing.JTextField();
        tData = new javax.swing.JLabel();
        campEndereco = new javax.swing.JTextField();
        tGenero = new javax.swing.JLabel();
        tContato = new javax.swing.JLabel();
        campContato = new javax.swing.JTextField();
        campResponsavel = new javax.swing.JTextField();
        tResponsavel = new javax.swing.JLabel();
        tEndereco = new javax.swing.JLabel();
        campDataN = new javax.swing.JTextField();
        tNumero = new javax.swing.JLabel();
        campComplemento = new javax.swing.JTextField();
        tBairro = new javax.swing.JLabel();
        campBairro = new javax.swing.JTextField();
        tSerie = new javax.swing.JLabel();
        campSerie = new javax.swing.JComboBox<>();
        buttonConfirmar = new javax.swing.JButton();
        tMensalidade = new javax.swing.JLabel();
        campGenero = new javax.swing.JComboBox<>();
        campMensalidade = new javax.swing.JTextField();
        tCep = new javax.swing.JLabel();
        campCep = new javax.swing.JTextField();
        tComplemento = new javax.swing.JLabel();
        campN = new javax.swing.JTextField();
        buttonVoltar = new javax.swing.JButton();
        tCidade = new javax.swing.JLabel();
        campCidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tNome.setText("Nome:");

        campNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNomeActionPerformed(evt);
            }
        });

        tData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tData.setText("Data de nascimento:");

        campEndereco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campEnderecoActionPerformed(evt);
            }
        });

        tGenero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tGenero.setText("Gênero:");

        tContato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tContato.setText("Contato:");

        campContato.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campContatoActionPerformed(evt);
            }
        });

        campResponsavel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campResponsavelActionPerformed(evt);
            }
        });

        tResponsavel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tResponsavel.setText("Responsável:");

        tEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tEndereco.setText("Endereço:");

        campDataN.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campDataN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campDataNActionPerformed(evt);
            }
        });

        tNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tNumero.setText("Nº:");

        campComplemento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        tBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tBairro.setText("Bairro:");

        campBairro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        tSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tSerie.setText("Série:");

        campSerie.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º ANO", "2º ANO", "3º ANO", "4ºANO", "5º ANO", "" }));
        campSerie.setSelectedIndex(5);
        campSerie.setMinimumSize(new java.awt.Dimension(63, 22));
        campSerie.setPreferredSize(new java.awt.Dimension(65, 22));
        campSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campSerieActionPerformed(evt);
            }
        });

        buttonConfirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonConfirmar.setText("Confirmar");
        buttonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarActionPerformed(evt);
            }
        });

        tMensalidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tMensalidade.setText("Mensalidade:");

        campGenero.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "" }));
        campGenero.setSelectedIndex(2);
        campGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        campGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campGeneroActionPerformed(evt);
            }
        });

        campMensalidade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campMensalidadeActionPerformed(evt);
            }
        });

        tCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tCep.setText("CEP:");

        campCep.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        tComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tComplemento.setText("Complemento:");

        campN.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        buttonVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        tCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tCidade.setText("Cidade:");

        campCidade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tResponsavel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campResponsavel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(tGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campContato))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campDataN))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tEndereco)
                            .addComponent(tBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campCep))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campCidade))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(tMensalidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNome)
                    .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tData)
                    .addComponent(campDataN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSerie)
                    .addComponent(campSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tContato)
                    .addComponent(campContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEndereco)
                    .addComponent(campEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCidade)
                    .addComponent(campCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tBairro)
                    .addComponent(campBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNumero)
                    .addComponent(tCep)
                    .addComponent(campCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tComplemento)
                    .addComponent(campComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tMensalidade)
                    .addComponent(campMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tResponsavel)
                    .addComponent(campResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConfirmar)
                    .addComponent(buttonVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>   
    
    private void campEnderecoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void campNomeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void campContatoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void campResponsavelActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void campDataNActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void campSerieActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         
        
    private void buttonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        String serie = campSerie.getItemAt(campSerie.getSelectedIndex()); //Como pegar a string selecionada com a listinha
        String genero = campGenero.getItemAt(campGenero.getSelectedIndex());
        
        Aluno rayssaPires = new Aluno(campNome.getText(), campDataN.getText(), genero, campContato.getText(), campEndereco.getText(), Integer.parseInt(campN.getText()), campBairro.getText(), campComplemento.getText(), campCidade.getText(), campCep.getText(), 2022150, campResponsavel.getText(), serie, Integer.parseInt(campMensalidade.getText()), financeiro);
        
        campNome.setText(null);
        campGenero.setSelectedIndex(2);
        campDataN.setText(null);
        campSerie.setSelectedIndex(5);
        campContato.setText(null);
        campEndereco.setText(null);
        campBairro.setText(null);
        campN.setText(null);
        campCep.setText(null);
        campComplemento.setText(null);
        campMensalidade.setText(null);
        campResponsavel.setText(null);
        
        rayssaPires.mostraDetalhesAluno();
        financeiro.mostrarTotal();

        
    }                                               

    private void campGeneroActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void campMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                             
       setVisible(false);
    }                                            

    private void campCidadeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

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
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CadastroAluno().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonConfirmar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField campBairro;
    private javax.swing.JTextField campCep;
    private javax.swing.JTextField campCidade;
    private javax.swing.JTextField campComplemento;
    private javax.swing.JTextField campContato;
    private javax.swing.JTextField campDataN;
    private javax.swing.JTextField campEndereco;
    private javax.swing.JComboBox<String> campGenero;
    private javax.swing.JTextField campMensalidade;
    private javax.swing.JTextField campN;
    private javax.swing.JTextField campNome;
    private javax.swing.JTextField campResponsavel;
    private javax.swing.JComboBox<String> campSerie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tBairro;
    private javax.swing.JLabel tCep;
    private javax.swing.JLabel tCidade;
    private javax.swing.JLabel tComplemento;
    private javax.swing.JLabel tContato;
    private javax.swing.JLabel tData;
    private javax.swing.JLabel tEndereco;
    private javax.swing.JLabel tGenero;
    private javax.swing.JLabel tMensalidade;
    private javax.swing.JLabel tNome;
    private javax.swing.JLabel tNumero;
    private javax.swing.JLabel tResponsavel;
    private javax.swing.JLabel tSerie;
    // End of variables declaration                   
}