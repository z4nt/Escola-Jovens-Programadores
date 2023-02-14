/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.PacienteDAO;
import DAO.UsuarioDAO;
import DTO.PacienteDTO;
import DTO.UsuarioDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antoniel
 */
public class Paciente extends javax.swing.JFrame {

    /**
     * Creates new form Paciente
     */
    public Paciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtidadeP = new javax.swing.JTextField();
        btsalvarP = new javax.swing.JButton();
        btvoltar2 = new javax.swing.JButton();
        btalteraP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btconsultarP = new javax.swing.JButton();
        txtnome = new javax.swing.JLabel();
        btexcluirP = new javax.swing.JButton();
        txtnomeP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtenderecoP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelapaciente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtcodPAC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btsalvarP.setText("SALVAR");
        btsalvarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarPActionPerformed(evt);
            }
        });

        btvoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvoltar2ActionPerformed(evt);
            }
        });

        btalteraP.setText("ALTERAR");
        btalteraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalteraPActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("GERENCIAR PACIENTE");

        btconsultarP.setText("CONSULTAR");
        btconsultarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconsultarPActionPerformed(evt);
            }
        });

        txtnome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtnome.setText("Nome:");

        btexcluirP.setText("EXCLUIR");
        btexcluirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirPActionPerformed(evt);
            }
        });

        txtnomeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomePActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Idade Paciente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Endereço:");

        tabelapaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "codigo", "nome", "idade", "endereço"
            }
        ));
        jScrollPane1.setViewportView(tabelapaciente);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Codigo:");

        txtcodPAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodPACActionPerformed(evt);
            }
        });

        jLabel6.setText("SOMENTE EXCLUSÃO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btsalvarP)
                                .addGap(18, 18, 18)
                                .addComponent(btalteraP)
                                .addGap(18, 18, 18)
                                .addComponent(btconsultarP)
                                .addGap(18, 18, 18)
                                .addComponent(btexcluirP))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcodPAC, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(txtenderecoP))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(281, 281, 281))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnomeP, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(txtidadeP))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btvoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btvoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome)
                    .addComponent(txtnomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidadeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtenderecoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcodPAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsalvarP)
                    .addComponent(btalteraP)
                    .addComponent(btconsultarP)
                    .addComponent(btexcluirP))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsalvarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarPActionPerformed
        String nome_paciente = txtnomeP.getText();
        String idade_paciente = txtidadeP.getText();
        String endereco_paciente = txtenderecoP.getText();

        PacienteDTO pacDTO = new PacienteDTO();
        pacDTO.setNome_pa(nome_paciente);
        pacDTO.setIdade_pa(idade_paciente);
        pacDTO.setEndereco_pa(endereco_paciente);

        PacienteDAO pacdao = new PacienteDAO();
        pacdao.InserirPaciente(pacDTO);
    }//GEN-LAST:event_btsalvarPActionPerformed

    private void btvoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvoltar2ActionPerformed
        this.dispose();
        Principal prin = new Principal();
        prin.setVisible(true);
    }//GEN-LAST:event_btvoltar2ActionPerformed

    private void btalteraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalteraPActionPerformed
           alterarPaciente();
    }//GEN-LAST:event_btalteraPActionPerformed

    private void btconsultarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconsultarPActionPerformed
        listarValores();
    }//GEN-LAST:event_btconsultarPActionPerformed

    private void txtnomePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomePActionPerformed

    private void btexcluirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirPActionPerformed
        excluirPaciente();
    }//GEN-LAST:event_btexcluirPActionPerformed

    private void txtcodPACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodPACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodPACActionPerformed

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
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btalteraP;
    private javax.swing.JButton btconsultarP;
    private javax.swing.JButton btexcluirP;
    private javax.swing.JButton btsalvarP;
    private javax.swing.JButton btvoltar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelapaciente;
    private javax.swing.JTextField txtcodPAC;
    private javax.swing.JTextField txtenderecoP;
    private javax.swing.JTextField txtidadeP;
    private javax.swing.JLabel txtnome;
    private javax.swing.JTextField txtnomeP;
    // End of variables declaration//GEN-END:variables
private void listarValores() {
        try {
            PacienteDAO objetoFuncionarioDAO = new PacienteDAO();
            DefaultTableModel model = (DefaultTableModel) tabelapaciente.getModel();
            model.setNumRows(0);
            ArrayList<PacienteDTO> lista = objetoFuncionarioDAO.pesquisarPaciente();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getCodigo_pa(),
                    lista.get(num).getNome_pa(),
                    lista.get(num).getIdade_pa(),
                    lista.get(num).getEndereco_pa()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar valores VIEW"
                    + e);
        }
    }

    private void carregarCampos() {
        int setar = tabelapaciente.getSelectedRow();
        txtnomeP.setText(tabelapaciente.getModel().getValueAt(setar, 1).toString());
        txtidadeP.setText(tabelapaciente.getModel().getValueAt(setar, 2).toString());
        txtenderecoP.setText(tabelapaciente.getModel().getValueAt(setar, 3).toString());

    }

    private void alterarPaciente() {

        String nome_paciente = txtnomeP.getText();
        String idade_paciente = txtidadeP.getText();
        String endereco_paciente = txtenderecoP.getText();
        PacienteDTO objfuncionariodto = new PacienteDTO();

        objfuncionariodto.setNome_pa(nome_paciente);
        objfuncionariodto.setIdade_pa(idade_paciente);
        objfuncionariodto.setEndereco_pa(endereco_paciente);

        PacienteDAO objfuncionaridao = new PacienteDAO();
        objfuncionaridao.alterarPaciente(objfuncionariodto);
    }

    private void excluirPaciente() {
        int cod_pac = Integer.parseInt(txtcodPAC.getText());
        PacienteDTO objfuncionariodto = new PacienteDTO();
        objfuncionariodto.setCodigo_pa(cod_pac);
        PacienteDAO objfuncionaridao = new PacienteDAO();
        objfuncionaridao.excluirFuncionario(objfuncionariodto);
    }
    
}
