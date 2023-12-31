package view;

import model.Conta;

public class AppUI extends javax.swing.JFrame {

    private Conta conta = new Conta();

    /**
     * Creates new form AppUI
     */
    public AppUI() {

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

        jPanel1 = new javax.swing.JPanel();
        lbSaldo = new javax.swing.JLabel();
        btMostrarSaldo = new javax.swing.JButton();
        btMostrarSaldoAteOmomento = new javax.swing.JButton();
        lbSaldoAtual = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btIncluirReceita = new javax.swing.JButton();
        btIncluirDespesa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btListarDespesas = new javax.swing.JButton();
        btListarReceitas = new javax.swing.JButton();
        btListarTodosOsMovimentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ContaUI");
        setName("contaUI"); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo"));

        btMostrarSaldo.setText("Mostrar Saldo Total");
        btMostrarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarSaldoActionPerformed(evt);
            }
        });

        btMostrarSaldoAteOmomento.setText("Mostrar Saldo Atual");
        btMostrarSaldoAteOmomento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarSaldoAteOmomentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMostrarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMostrarSaldoAteOmomento))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbSaldoAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(lbSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMostrarSaldo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btMostrarSaldoAteOmomento)
                    .addComponent(lbSaldoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Incluir Movimento"));

        btIncluirReceita.setText("Incluir Receita");
        btIncluirReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirReceitaActionPerformed(evt);
            }
        });

        btIncluirDespesa.setText("Incluir Despesa");
        btIncluirDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirDespesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btIncluirReceita, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btIncluirDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIncluirReceita)
                    .addComponent(btIncluirDespesa))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Listar Dados"));

        btListarDespesas.setText("Listar Despesas");
        btListarDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarDespesasActionPerformed(evt);
            }
        });

        btListarReceitas.setText("Listar Receitas");
        btListarReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarReceitasActionPerformed(evt);
            }
        });

        btListarTodosOsMovimentos.setText("Listar Todos os Movimentos");
        btListarTodosOsMovimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTodosOsMovimentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btListarDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btListarReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btListarTodosOsMovimentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btListarDespesas)
                .addGap(12, 12, 12)
                .addComponent(btListarReceitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btListarTodosOsMovimentos)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIncluirReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirReceitaActionPerformed
        // TODO add your handling code here:
        IncluirReceita receitaNova = new IncluirReceita();
        receitaNova.setControle(conta);
        receitaNova.setVisible(true);
    }//GEN-LAST:event_btIncluirReceitaActionPerformed

    private void btListarDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarDespesasActionPerformed
        // TODO add your handling code here:
        ListarDados dadosDespesas = new ListarDados();
        dadosDespesas.setControle(conta);
        dadosDespesas.definirDespesas();

        dadosDespesas.setVisible(true);
    }//GEN-LAST:event_btListarDespesasActionPerformed

    private void btListarReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarReceitasActionPerformed
        // TODO add your handling code here:

        ListarDados dadosReceitas = new ListarDados();
        dadosReceitas.setControle(conta);
        dadosReceitas.definirReceitas();

        dadosReceitas.setVisible(true);
    }//GEN-LAST:event_btListarReceitasActionPerformed

    private void btListarTodosOsMovimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTodosOsMovimentosActionPerformed
        // TODO add your handling code here

        ListarDados dadosMovimentos = new ListarDados();
        dadosMovimentos.setControle(conta);
        dadosMovimentos.definirMovimentos();

        dadosMovimentos.setVisible(true);

    }//GEN-LAST:event_btListarTodosOsMovimentosActionPerformed

    private void btMostrarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarSaldoActionPerformed
        // TODO add your handling code here:
        conta.setSaldo();
        lbSaldo.setText(String.valueOf(conta.getSaldo()));

    }//GEN-LAST:event_btMostrarSaldoActionPerformed

    private void btMostrarSaldoAteOmomentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarSaldoAteOmomentoActionPerformed
        // TODO add your handling code here:
        conta.setSaldoAtual();
        lbSaldoAtual.setText(String.valueOf(conta.getSaldoAtual()));
    }//GEN-LAST:event_btMostrarSaldoAteOmomentoActionPerformed

    private void btIncluirDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirDespesaActionPerformed
        // TODO add your handling code here:
        IncluirDespesa despesaNova = new IncluirDespesa();
        despesaNova.setControle(conta);
        despesaNova.setVisible(true);
    }//GEN-LAST:event_btIncluirDespesaActionPerformed

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
            java.util.logging.Logger.getLogger(AppUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluirDespesa;
    private javax.swing.JButton btIncluirReceita;
    private javax.swing.JButton btListarDespesas;
    private javax.swing.JButton btListarReceitas;
    private javax.swing.JButton btListarTodosOsMovimentos;
    private javax.swing.JButton btMostrarSaldo;
    private javax.swing.JButton btMostrarSaldoAteOmomento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbSaldo;
    private javax.swing.JLabel lbSaldoAtual;
    // End of variables declaration//GEN-END:variables

}
