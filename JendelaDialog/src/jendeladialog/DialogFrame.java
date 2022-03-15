/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jendeladialog;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DialogFrame extends javax.swing.JFrame {

    /**
     * Creates new form DialogFrame
     */
    public DialogFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDialogPesan = new javax.swing.JButton();
        btnDialogInput = new javax.swing.JButton();
        btnDialogKonfirmasi = new javax.swing.JButton();
        btnDialogPilihan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jendela Dialog / Pop up");

        jLabel2.setText("Show Message Dialog");

        jLabel3.setText("Show Input Dialog");

        jLabel4.setText("Show Confirm Dialog");

        jLabel5.setText("Show Option Dialog");

        btnDialogPesan.setText("Message Dialog");
        btnDialogPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDialogPesanActionPerformed(evt);
            }
        });

        btnDialogInput.setText("Input Dialog");
        btnDialogInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDialogInputActionPerformed(evt);
            }
        });

        btnDialogKonfirmasi.setText("Confirm Dialog");
        btnDialogKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDialogKonfirmasiActionPerformed(evt);
            }
        });

        btnDialogPilihan.setText("Option Dialog");
        btnDialogPilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDialogPilihanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDialogPesan, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(btnDialogKonfirmasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDialogPilihan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDialogInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDialogPesan, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDialogInput, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDialogKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDialogPilihan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDialogPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDialogPesanActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Hello my name is Firbaya Mutiara");
    }//GEN-LAST:event_btnDialogPesanActionPerformed

    private void btnDialogInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDialogInputActionPerformed
        // TODO add your handling code here:
        String inputan = JOptionPane.showInputDialog("Please input odd number");
        JOptionPane.showMessageDialog(this, "Input Result: " + inputan);
    }//GEN-LAST:event_btnDialogInputActionPerformed

    private void btnDialogKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDialogKonfirmasiActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showConfirmDialog(this, "Do you want to continue action?");
        switch(jawab){
            case JOptionPane.YES_OPTION:
                    JOptionPane.showMessageDialog(this, "Okay!");
                    break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(this, "Yahh!");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(this, "Anda Membatalkan");
        }
    }//GEN-LAST:event_btnDialogKonfirmasiActionPerformed

    private void btnDialogPilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDialogPilihanActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showOptionDialog(this, "Apakah Anda yakin untuk keluar?",
                "keluar",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Program akan keluar");
            System.exit(0);
        }
    }//GEN-LAST:event_btnDialogPilihanActionPerformed

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
            java.util.logging.Logger.getLogger(DialogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDialogInput;
    private javax.swing.JButton btnDialogKonfirmasi;
    private javax.swing.JButton btnDialogPesan;
    private javax.swing.JButton btnDialogPilihan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
