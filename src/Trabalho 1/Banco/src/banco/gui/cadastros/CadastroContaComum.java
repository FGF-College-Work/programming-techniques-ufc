/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package banco.gui.cadastros;

import banco.contas.Conta;


/**
 * Formulário específico para ContaComum (aka.: Conta)
 * @author Manoel Vilela
 */
public class CadastroContaComum extends Cadastro {

    /**
     * Creates new form Cadastro
     */
    public CadastroContaComum() {
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

        jButtonProx = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldSaldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jButtonProx.setText("Próximo");
        jButtonProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProxActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome: ");

        jLabel2.setText("Número: ");

        jLabel3.setText("Saldo Inicial:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        jTextFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("CADASTRO CONTA COMUM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel4)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldNumero)
                            .addComponent(jTextFieldSaldo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonProx, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonProx))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents



    private void jButtonProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProxActionPerformed
        this.submeterCadastro();
    }//GEN-LAST:event_jButtonProxActionPerformed

    public void salvarCadastro() {
        Conta conta = this.getConta();
        conta.setNome(this.jTextFieldNome.getText());
        conta.setNumero(Integer.parseInt(this.jTextFieldNumero.getText()));
        conta.setSaldo(Double.parseDouble(this.jTextFieldSaldo.getText()));
    }

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jTextFieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoActionPerformed
        this.submeterCadastro();
    }//GEN-LAST:event_jTextFieldSaldoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        this.jTextFieldNumero.requestFocusInWindow();
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        this.jTextFieldSaldo.requestFocusInWindow();
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProx;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldSaldo;
    // End of variables declaration//GEN-END:variables
}