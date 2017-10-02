/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package banco.gui.operacoes;

import banco.contas.Conta;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 * View para gerencimanto de depósito.
 * @author Manoel Vilela
 */
public class Deposito extends Operacao {

    /**
     * Creates new form Deposito
     */
    public Deposito() {
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

        jLabelValor = new javax.swing.JLabel();
        jTextFieldConta = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonDepositar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelSaque = new javax.swing.JLabel();
        jLabelConta = new javax.swing.JLabel();

        jLabelValor.setText("Valor:");

        jTextFieldConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContaActionPerformed(evt);
            }
        });

        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });

        jButtonDepositar.setText("Depositar");
        jButtonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositarActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabelSaque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelSaque.setText("DEPÓSITO");

        jLabelConta.setText("Conta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVoltar)
                                .addGap(71, 71, 71)
                                .addComponent(jButtonDepositar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelConta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldConta))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabelValor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabelSaque)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSaque)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConta)
                    .addComponent(jTextFieldConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDepositar)
                    .addComponent(jButtonVoltar))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContaActionPerformed
       this.submeterOperacao();
    }//GEN-LAST:event_jTextFieldContaActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        this.submeterOperacao();
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private void jButtonDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositarActionPerformed
        this.submeterOperacao();
        
    }//GEN-LAST:event_jButtonDepositarActionPerformed
    
    /**
     * Realiza a operação de deposito através da interface gráfica.
     */
    @Override
    protected void operacao() {
        int numeroConta = Integer.parseInt(jTextFieldConta.getText());
        double valor = Double.parseDouble(jTextFieldValor.getText());
        Conta conta = Conta.buscaConta(numeroConta);
        if (conta != null) {
            int state = JOptionPane.showConfirmDialog(
                    this,
                    "Nome da conta: " + conta.getNome().toUpperCase(),
                    "Depósito",
                    JOptionPane.YES_NO_OPTION
            );
            if (state == JOptionPane.YES_OPTION) {
                conta.depositar(valor);
                JOptionPane.showMessageDialog(this, "Depósito efetuado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Depósito cancelado!");
            }
            this.terminarOperacao();
        } else {
            JOptionPane.showMessageDialog(this, "Conta não encontrada!");
        }
    }
    
    // limpa os buffers de TextField e volta para tela de operações
    @Override
    protected void limparFields() {
        jTextFieldConta.setText("");
        jTextFieldValor.setText("");
    }
    
    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.terminarOperacao();
    }//GEN-LAST:event_jButtonVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDepositar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelConta;
    private javax.swing.JLabel jLabelSaque;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JTextField jTextFieldConta;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
