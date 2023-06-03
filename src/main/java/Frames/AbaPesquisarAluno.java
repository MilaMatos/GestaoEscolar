package Frames;

import Classes.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Classes.Financeiro;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AbaPesquisarAluno extends javax.swing.JFrame {
    private ArrayList<Aluno> lista;
    private Financeiro financeiro;

    public AbaPesquisarAluno(ArrayList lista, Financeiro financeiro) {
        this.lista = lista;
        this.financeiro = financeiro;
        initComponents();
        configTela();
        jLista.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitulo = new javax.swing.JLabel();
        jNome = new javax.swing.JLabel();
        campNome = new javax.swing.JTextField();
        buttonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTitulo.setText("Pesquisar");

        jNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jNome.setText("Nome:");

        campNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
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
        jScrollPane1.setViewportView(jLista);

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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(campNome)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonPesquisar)
                        .addGap(0, 176, Short.MAX_VALUE)))
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome)
                    .addComponent(campNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(buttonPesquisar)
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
    
    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
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
    }//GEN-LAST:event_buttonPesquisarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JTextField campNome;
    private javax.swing.JList<String> jLista;
    private javax.swing.JLabel jNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTitulo;
    // End of variables declaration//GEN-END:variables
}
