package Frames;

import javax.swing.JOptionPane;
import Classes.Aluno;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class AbaNotas extends javax.swing.JFrame {
    private Aluno aluno;
    
    public AbaNotas(Aluno aluno) {
        initComponents();
        this.aluno = aluno;
        configurarTabela();
        configTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        notas = new javax.swing.JTable();
        salvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        notas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Português", null, null, null, null, null},
                {"Matemática", null, null, null, null, null},
                {"História", null, null, null, null, null},
                {"Geografia", null, null, null, null, null},
                {"Ciências", null, null, null, null, null},
                {"Artes", null, null, null, null, null},
                {"Inglês", null, null, null, null, null},
                {"Educação Física", null, null, null, null, null}
            },
            new String [] {
                "Matérias", "1º Bimestre", "2º Bimestre", "3º Bimestre", "4º Bimestre", "Média final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(notas);

        salvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Boletim");

        nome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nome.setText("Aluno: nome do aluno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salvar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nome)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarTabela(){
        DefaultTableModel model = (DefaultTableModel) notas.getModel();

            for (int indice = 0; indice < 8; indice++){
                for (int bimestre = 0; bimestre <= 3; bimestre++) {
                    double nota = aluno.getNotas(bimestre).obterNota(indice);
                    if(nota != -1){
                        model.setValueAt(nota, indice, bimestre + 1);
                    }
                }

                // Calcula a média final e define na célula correspondente
                double mediaFinal = aluno.calcularMediaFinal(indice);
                if(mediaFinal >= 0){
                    model.setValueAt(mediaFinal, indice, 5);
                }
            }

        //Se o valor inserido for maior que 10 estabelece o valor para 10
        notas.getModel().addTableModelListener(new TableModelListener() {
        @Override
        public void tableChanged(TableModelEvent e) {
            int row = e.getFirstRow();
            int column = e.getColumn();

            // Verifica se a coluna é uma das colunas editáveis (1º ao 4º bimestre)
            if (column >= 1 && column <= 4) {
                DefaultTableModel model = (DefaultTableModel) notas.getModel();
                Object value = model.getValueAt(row, column);

                // Verifica se o valor é maior que 10
                if (value instanceof Double && (Double) value > 10) {
                    // Define o valor máximo como 10
                    model.setValueAt(10.0, row, column);
                }
            }
        }
        });
 
    }
    
        public void configTela(){
        String nomeAluno = aluno.getNome();
        nome.setText("Aluno: "+nomeAluno);
        System.out.println(aluno.getNome());
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
    
    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
       for (int materia = 0; materia < 8; materia++) {
            for (int bimestre = 1; bimestre < 5; bimestre++) {
                Object valorCelula = notas.getValueAt(materia, bimestre);
                if (valorCelula != null) {
                    double valor = Double.parseDouble(valorCelula.toString());
                    aluno.getNotas(bimestre-1).adicionarNota(materia, valor);                   
                }
            }
        }      
        JOptionPane.showMessageDialog(this, "Boletim alterado", "AVISO", JOptionPane.WARNING_MESSAGE);
        configurarTabela();
    }//GEN-LAST:event_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(AbaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbaNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AbaNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome;
    private javax.swing.JTable notas;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
