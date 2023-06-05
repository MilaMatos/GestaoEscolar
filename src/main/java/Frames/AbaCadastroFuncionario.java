package Frames;

import Classes.Financeiro;
import Classes.Funcionario;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AbaCadastroFuncionario extends javax.swing.JFrame {
    private Financeiro financeiro;
    private ArrayList<Funcionario> lista;

    public AbaCadastroFuncionario(Financeiro financeiro, ArrayList lista) {
        initComponents();
        this.financeiro = financeiro;
        this.lista = lista;
        configTela();
        campCargo.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtitulo = new javax.swing.JLabel();
        buttonConfirmar = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        campNome = new javax.swing.JTextField();
        tNome = new javax.swing.JLabel();
        campGenero = new javax.swing.JComboBox<>();
        tData = new javax.swing.JLabel();
        tGenero = new javax.swing.JLabel();
        tContato1 = new javax.swing.JLabel();
        campDataN = new javax.swing.JFormattedTextField();
        campContato = new javax.swing.JFormattedTextField();
        tResponsavel = new javax.swing.JLabel();
        jEscolaridade = new javax.swing.JLabel();
        campEscolaridade = new javax.swing.JComboBox<>();
        campCpf = new javax.swing.JFormattedTextField();
        tSerie = new javax.swing.JLabel();
        jSelecioneCargo = new javax.swing.JComboBox<>();
        campCargo = new javax.swing.JTextField();
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
        jNum = new javax.swing.JLabel();
        campN1 = new javax.swing.JFormattedTextField();
        panelBanco = new javax.swing.JPanel();
        jTipoConta = new javax.swing.JLabel();
        campTipoConta = new javax.swing.JComboBox<>();
        campConta = new javax.swing.JTextField();
        jAgencia = new javax.swing.JLabel();
        tMensalidade1 = new javax.swing.JLabel();
        campSalario = new javax.swing.JTextField();
        jConta = new javax.swing.JLabel();
        jBanco = new javax.swing.JLabel();
        campBanco = new javax.swing.JTextField();
        campAgencia1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtitulo.setText("Cadastro");
        jtitulo.setFocusable(false);
        jtitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonConfirmar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonConfirmar.setText("Confirmar");
        buttonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarActionPerformed(evt);
            }
        });

        panelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        campNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        tNome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tNome.setForeground(new java.awt.Color(150, 20, 20));
        tNome.setText("Nome:");

        campGenero.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Selecione" }));
        campGenero.setSelectedIndex(2);
        campGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tData.setText("Data de nascimento:");

        tGenero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tGenero.setText("Gênero:");

        tContato1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tContato1.setText("Contato:");

        try {
            campDataN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campDataN.setToolTipText("");

        try {
            campContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campContato.setToolTipText("");

        tResponsavel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tResponsavel.setForeground(new java.awt.Color(150, 20, 20));
        tResponsavel.setText("Cargo:");

        jEscolaridade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jEscolaridade.setText("Escolaridade:");

        campEscolaridade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ensino Médio Completo", "Superior Incompleto", "Superior Completo", "Pós/Mestre/Doutor", "Selecione" }));
        campEscolaridade.setSelectedIndex(4);

        try {
            campCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tSerie.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tSerie.setText("CPF:");

        jSelecioneCargo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jSelecioneCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Outro", "Selecione" }));
        jSelecioneCargo.setSelectedIndex(2);
        jSelecioneCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelecioneCargoActionPerformed(evt);
            }
        });

        campCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(tGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInfoLayout.createSequentialGroup()
                                .addComponent(tResponsavel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSelecioneCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                                .addComponent(tData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoLayout.createSequentialGroup()
                                .addComponent(campCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tContato1)
                                .addGap(7, 7, 7)
                                .addComponent(campContato, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(tNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campNome))
                    .addGroup(panelInfoLayout.createSequentialGroup()
                        .addComponent(jEscolaridade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(tContato1)
                    .addComponent(campContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tResponsavel)
                    .addComponent(jSelecioneCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEscolaridade)
                    .addComponent(campCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSerie))
                .addGap(43, 43, 43))
        );

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jRua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRua.setText("Rua:");

        jCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCidade.setText("Cidade:");

        jCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCep.setText("CEP:");

        campCidade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        campEndereco.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

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

        jNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jNum.setText("Nº:");

        campN1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campN1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(jCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addComponent(jBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEnderecoLayout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campN1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campCep, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(jRua)
                        .addGap(18, 18, 18)
                        .addComponent(campEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(campN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        panelBanco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados bancários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jTipoConta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTipoConta.setText("Tipo da Conta:");

        campTipoConta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        campTipoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corrente", "Poupança", "Salário", "Selecione" }));
        campTipoConta.setSelectedIndex(3);

        jAgencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jAgencia.setText("Agência:");

        tMensalidade1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tMensalidade1.setForeground(new java.awt.Color(150, 20, 20));
        tMensalidade1.setText("Salário: ");

        campSalario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jConta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jConta.setText("Conta:");

        jBanco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jBanco.setText("Banco:");

        campBanco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campAgencia1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campAgencia1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

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
                                .addGap(12, 12, 12)
                                .addComponent(campConta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBancoLayout.createSequentialGroup()
                                .addComponent(jTipoConta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tMensalidade1)
                        .addGap(5, 5, 5))
                    .addGroup(panelBancoLayout.createSequentialGroup()
                        .addComponent(jBanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAgencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campAgencia1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelBancoLayout.setVerticalGroup(
            panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBancoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTipoConta)
                    .addComponent(campTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tMensalidade1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBanco)
                    .addComponent(campBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAgencia)
                    .addComponent(campAgencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jConta)
                    .addComponent(campConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(150, 20, 20));
        jLabel1.setText("Campo Obrigatório");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(buttonConfirmar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtitulo)
                .addGap(208, 208, 208))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
    private void jSelecioneCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelecioneCargoActionPerformed
       if(jSelecioneCargo.getSelectedIndex() == 1){
            campCargo.setVisible(true);
        }
        else campCargo.setVisible(false);
    }//GEN-LAST:event_jSelecioneCargoActionPerformed

    private void setNull() {
        campNome.setText(null);
        campGenero.setSelectedIndex(2);
        campDataN.setText(null);
        campEscolaridade.setSelectedIndex(4);
        campContato.setText(null);
        campEndereco.setText(null);
        campBairro.setText(null);
        campN1.setText(null);
        campCep.setText(null);
        campComplemento.setText(null);
        campSalario.setText(null);
        campCargo.setText(null);
        campCidade.setText(null);
        campCpf.setText(null);
        campTipoConta.setSelectedIndex(3);
        campBanco.setText(null);
        campConta.setText(null);
        campAgencia1.setText(null);
        jSelecioneCargo.setSelectedIndex(2);
    }

    private void buttonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {
        String nome = campNome.getText();
        String data = campDataN.getText();
        String genero = campGenero.getItemAt(campGenero.getSelectedIndex());
        String contato = campContato.getText();
        String rua = campEndereco.getText();
        int numero = -1;
        if(!campN1.getText().isBlank()){
            numero = Integer.parseInt(campN1.getText());
            if(numero <= -1) numero = -1;

        }
        String bairro = campBairro.getText();
        String complemento = campComplemento.getText();
        String cidade = campCidade.getText();
        String cep = campCep.getText();
        String escolaridade = campEscolaridade.getItemAt(campEscolaridade.getSelectedIndex());
        String tipoDeCOnta = campTipoConta.getItemAt(campTipoConta.getSelectedIndex());
        String conta = campConta.getText();
        String banco = campBanco.getText();
        String cpf = campCpf.getText();
        int agencia = -1;
        if (!campAgencia1.getText().isBlank()) {
            agencia = Integer.parseInt(campAgencia1.getText());
            if(agencia <= -1) agencia = -1;

        }
        String cargo = campCargo.getText();
        if(jSelecioneCargo.getItemAt(jSelecioneCargo.getSelectedIndex()).equals("Professor")) cargo = "Professor";

        switch(Funcionario.adicionarFuncionario(lista, financeiro, nome, data, genero, contato, rua, numero, bairro, complemento, cidade, cep, escolaridade, cargo, campSalario.getText(), cpf, banco, conta, agencia, tipoDeCOnta)){
            case -1: 
                JOptionPane.showMessageDialog(this, "Campo obrigatório em branco", "AVISO", JOptionPane.WARNING_MESSAGE);
                break;
            case 1: 
                JOptionPane.showMessageDialog(this, "Salário incompatível", "AVISO", JOptionPane.WARNING_MESSAGE);
                break;
            case 0: 
                setNull();
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConfirmar;
    private javax.swing.JFormattedTextField campAgencia1;
    private javax.swing.JTextField campBairro;
    private javax.swing.JTextField campBanco;
    private javax.swing.JTextField campCargo;
    private javax.swing.JFormattedTextField campCep;
    private javax.swing.JTextField campCidade;
    private javax.swing.JTextField campComplemento;
    private javax.swing.JTextField campConta;
    private javax.swing.JFormattedTextField campContato;
    private javax.swing.JFormattedTextField campCpf;
    private javax.swing.JFormattedTextField campDataN;
    private javax.swing.JTextField campEndereco;
    private javax.swing.JComboBox<String> campEscolaridade;
    private javax.swing.JComboBox<String> campGenero;
    private javax.swing.JFormattedTextField campN1;
    private javax.swing.JTextField campNome;
    private javax.swing.JTextField campSalario;
    private javax.swing.JComboBox<String> campTipoConta;
    private javax.swing.JLabel jAgencia;
    private javax.swing.JLabel jBairro;
    private javax.swing.JLabel jBanco;
    private javax.swing.JLabel jCep;
    private javax.swing.JLabel jCidade;
    private javax.swing.JLabel jComplemento;
    private javax.swing.JLabel jConta;
    private javax.swing.JLabel jEscolaridade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNum;
    private javax.swing.JLabel jRua;
    private javax.swing.JComboBox<String> jSelecioneCargo;
    private javax.swing.JLabel jTipoConta;
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
