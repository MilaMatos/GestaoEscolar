package Frames;

import Classes.Aluno;
import Classes.Financeiro;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class AbaCadastroAluno extends javax.swing.JFrame {
    Financeiro financeiro;
    /**
     * Creates new form CadastroAluno
     * @param financeiro
     */
    public AbaCadastroAluno(Financeiro financeiro) {
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonConfirmar = new javax.swing.JButton();
        jTitulo = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        panelEndereco = new javax.swing.JPanel();
        jRua = new javax.swing.JLabel();
        jCidade = new javax.swing.JLabel();
        jCep = new javax.swing.JLabel();
        campCidade = new javax.swing.JTextField();
        campEndereco = new javax.swing.JTextField();
        jBairro = new javax.swing.JLabel();
        campBairro = new javax.swing.JTextField();
        campComplemento = new javax.swing.JTextField();
        jComplemento = new javax.swing.JLabel();
        campCep = new javax.swing.JFormattedTextField();
        campN = new javax.swing.JTextField();
        jNum = new javax.swing.JLabel();
        panelInfo = new javax.swing.JPanel();
        campNome = new javax.swing.JTextField();
        campResponsavel = new javax.swing.JTextField();
        tNome = new javax.swing.JLabel();
        campGenero = new javax.swing.JComboBox<>();
        tData = new javax.swing.JLabel();
        tGenero = new javax.swing.JLabel();
        tContato = new javax.swing.JLabel();
        tSerie = new javax.swing.JLabel();
        tResponsavel = new javax.swing.JLabel();
        campSerie = new javax.swing.JComboBox<>();
        campDataN = new javax.swing.JFormattedTextField();
        campContato = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonConfirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonConfirmar.setText("Confirmar");
        buttonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarActionPerformed(evt);
            }
        });

        jTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTitulo.setText("Cadastro");
        jTitulo.setFocusable(false);
        jTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonVoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jRua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRua.setText("Rua:");

        jCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCidade.setText("Cidade:");

        jCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCep.setText("CEP:");

        campCidade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campCidadeActionPerformed(evt);
            }
        });

        campEndereco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campEnderecoActionPerformed(evt);
            }
        });

        jBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBairro.setText("Bairro:");

        campBairro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        campComplemento.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComplemento.setText("Complemento:");

        try {
            campCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campN.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jNum.setText("Nº:");

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(jCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campCidade))
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(jBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(117, 117, 117)
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(jNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(jCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campCep, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                        .addComponent(jRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campEndereco)
                        .addGap(9, 9, 9)
                        .addComponent(jComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCidade)
                    .addComponent(campCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCep)
                    .addComponent(campCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jNum)
                        .addComponent(campN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBairro)
                        .addComponent(campBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRua)
                        .addComponent(campEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComplemento)))
                .addContainerGap())
        );

        panelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        campNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campNomeActionPerformed(evt);
            }
        });

        campResponsavel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campResponsavelActionPerformed(evt);
            }
        });

        tNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tNome.setForeground(new java.awt.Color(150, 20, 20));
        tNome.setText("Nome:");
        tNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tNomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tNomeMouseExited(evt);
            }
        });

        campGenero.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Selecione" }));
        campGenero.setSelectedIndex(2);
        campGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        campGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campGeneroActionPerformed(evt);
            }
        });

        tData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tData.setForeground(new java.awt.Color(150, 20, 20));
        tData.setText("Data de nascimento:");

        tGenero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tGenero.setText("Gênero:");

        tContato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tContato.setText("Contato:");

        tSerie.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tSerie.setForeground(new java.awt.Color(150, 20, 20));
        tSerie.setText("Série:");

        tResponsavel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tResponsavel.setForeground(new java.awt.Color(150, 20, 20));
        tResponsavel.setText("Responsável:");

        campSerie.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º ANO", "2º ANO", "3º ANO", "4º ANO", "5º ANO", "Selecione" }));
        campSerie.setSelectedIndex(5);
        campSerie.setMinimumSize(new java.awt.Dimension(63, 22));
        campSerie.setPreferredSize(new java.awt.Dimension(65, 22));
        campSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campSerieActionPerformed(evt);
            }
        });

        try {
            campDataN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campDataN.setToolTipText("");
        campDataN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campDataNActionPerformed(evt);
            }
        });

        try {
            campContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campContato.setToolTipText("");

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(tResponsavel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campResponsavel))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(tGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                                .addComponent(tData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                                .addComponent(tContato)
                                .addGap(7, 7, 7)
                                .addComponent(campContato, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(tNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campNome)))
                .addContainerGap())
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNome)
                    .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tData)
                    .addComponent(tGenero)
                    .addComponent(campDataN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tSerie)
                    .addComponent(campSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tContato)
                    .addComponent(campContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tResponsavel)
                    .addComponent(campResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 20, 20));
        jLabel1.setText("Campo obrigatório");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTitulo)
                .addGap(173, 173, 173))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConfirmar)
                    .addComponent(buttonVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setNull(){
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
        campResponsavel.setText(null);
        campCidade.setText(null);
    }
    
    private boolean verificaNull(){
        if(campNome.getText().isBlank() || (campSerie.getSelectedIndex() == 5 || campResponsavel.getText().isBlank()) || campDataN.getText().isBlank()){
            return false;}
        else return true;
    }
    
    private boolean validarIdade(){
        String data = campDataN.getText();
        String serie = campSerie.getItemAt(campSerie.getSelectedIndex());
        
        String[] result = data.split("/");
        int ano = Integer.parseInt(result[2]);
        int mes = Integer.parseInt(result[1]);
        
        if(null != serie) switch (serie) {
            case "1º ANO":
                if(ano > 2017) return false;
                if(ano == 2017 && mes > 3) return false;
                break;
            case "2º ANO":
                if(ano > 2016) return false;
                if(ano == 2016 && mes > 3) return false;
                break;
            case "3º ANO":
                if(ano > 2015) return false;
                if(ano == 2015 && mes > 3) return false;
                break;
            case "4º ANO":
                if(ano > 2014) return false;
                if(ano == 2014 && mes > 3) return false;
                break;
            case "5º ANO":
                if(ano > 2013) return false;
                if(ano == 2013 && mes > 3) return false;
                break;
            default:
                break;
        } 
        return true;
    }
    
    
    
    private void buttonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarActionPerformed
        String serie = campSerie.getItemAt(campSerie.getSelectedIndex()); //Como pegar a string selecionada com a listinha
        String genero = campGenero.getItemAt(campGenero.getSelectedIndex());
        double mensalidade = financeiro.verificaMensalidade(serie);
        int numero = 0;
        if(campN.getText().isBlank()){
            numero = -1;
        }
        
        if(this.verificaNull()){
            if(this.validarIdade()){
                Aluno rayssaPires = new Aluno(campNome.getText(), campDataN.getText(), genero, campContato.getText(), campEndereco.getText(),numero , campBairro.getText(), campComplemento.getText(), campCidade.getText(), campCep.getText(), 2022150, campResponsavel.getText(), serie, mensalidade, financeiro);
                setNull();            
            }
            else JOptionPane.showMessageDialog(this, "O aluno é muito novo para cursar " +serie);
        }
        else JOptionPane.showMessageDialog(this, "Campo obrigatório em branco");
    }//GEN-LAST:event_buttonConfirmarActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void campCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campCidadeActionPerformed

    private void campEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campEnderecoActionPerformed

    private void campSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campSerieActionPerformed

    private void campGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campGeneroActionPerformed

    private void campResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campResponsavelActionPerformed

    private void campNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campNomeActionPerformed

    private void campDataNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campDataNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campDataNActionPerformed

    private void tNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNomeMouseEntered
        tNome.setForeground(Color.red);
    }//GEN-LAST:event_tNomeMouseEntered

    private void tNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNomeMouseExited
        tNome.setForeground(Color.black);
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
            java.util.logging.Logger.getLogger(AbaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbaCadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AbaCadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConfirmar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField campBairro;
    private javax.swing.JFormattedTextField campCep;
    private javax.swing.JTextField campCidade;
    private javax.swing.JTextField campComplemento;
    private javax.swing.JFormattedTextField campContato;
    private javax.swing.JFormattedTextField campDataN;
    private javax.swing.JTextField campEndereco;
    private javax.swing.JComboBox<String> campGenero;
    private javax.swing.JTextField campN;
    private javax.swing.JTextField campNome;
    private javax.swing.JTextField campResponsavel;
    private javax.swing.JComboBox<String> campSerie;
    private javax.swing.JLabel jBairro;
    private javax.swing.JLabel jCep;
    private javax.swing.JLabel jCidade;
    private javax.swing.JLabel jComplemento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNum;
    private javax.swing.JLabel jRua;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JLabel tContato;
    private javax.swing.JLabel tData;
    private javax.swing.JLabel tGenero;
    private javax.swing.JLabel tNome;
    private javax.swing.JLabel tResponsavel;
    private javax.swing.JLabel tSerie;
    // End of variables declaration//GEN-END:variables
}