/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import javax.swing.JOptionPane;

/**
 *
 * @author adise
 */
public class Motor extends javax.swing.JFrame {

    /**
     * Creates new form Motor
     */
    public Motor() {
        mtr = new formDB();
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

        noPolisiLabel = new javax.swing.JLabel();
        warnaLabel = new javax.swing.JLabel();
        tipeLabel = new javax.swing.JLabel();
        ccLabel = new javax.swing.JLabel();
        noMesinLabel = new javax.swing.JLabel();
        tahunLabel = new javax.swing.JLabel();
        bahaBakarLabel = new javax.swing.JLabel();
        noPolisiTextField = new javax.swing.JTextField();
        warnaTextField = new javax.swing.JTextField();
        tipeTextField = new javax.swing.JTextField();
        ccTextField = new javax.swing.JTextField();
        noMesinTextField = new javax.swing.JTextField();
        tahunTextField = new javax.swing.JTextField();
        bahaBakarTextField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        kembaliButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Motor");

        noPolisiLabel.setText("No. Polisi");

        warnaLabel.setText("Warna");

        tipeLabel.setText("Tipe");

        ccLabel.setText("CC");

        noMesinLabel.setText("No. Mesin");

        tahunLabel.setText("Tahun");

        bahaBakarLabel.setText("Bahan Bakar");

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        kembaliButton.setText("Kembali");
        kembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noPolisiLabel)
                            .addComponent(warnaLabel)
                            .addComponent(tipeLabel)
                            .addComponent(ccLabel)
                            .addComponent(noMesinLabel)
                            .addComponent(tahunLabel)
                            .addComponent(bahaBakarLabel))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(noPolisiTextField)
                            .addComponent(warnaTextField)
                            .addComponent(tipeTextField)
                            .addComponent(ccTextField)
                            .addComponent(noMesinTextField)
                            .addComponent(tahunTextField)
                            .addComponent(bahaBakarTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(simpanButton)
                            .addComponent(kembaliButton))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hapusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noPolisiLabel)
                    .addComponent(noPolisiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(warnaLabel)
                    .addComponent(warnaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipeLabel)
                    .addComponent(tipeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccLabel)
                    .addComponent(ccTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noMesinLabel)
                    .addComponent(noMesinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tahunLabel)
                    .addComponent(tahunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bahaBakarLabel)
                    .addComponent(bahaBakarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanButton)
                    .addComponent(hapusButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembaliButton)
                    .addComponent(nextButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliButtonActionPerformed
        // TODO add your handling code here:
        MenuUtama MN = new MenuUtama();
        MN.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembaliButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        String id = "";
        String no_polisi = noPolisiTextField.getText();
        String warna = warnaTextField.getText();
        String tipe = tipeTextField.getText();
        String CC = ccTextField.getText();
        String no_mesin = noMesinTextField.getText();
        String tahun = tahunTextField.getText();
        String bahan_bakar = bahaBakarTextField.getText();
        
        mtr.MotorDB(id, no_polisi, warna, tipe, CC, no_mesin, tahun, bahan_bakar);
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        Mekanik mknk = new Mekanik();
        mknk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        noPolisiTextField.setText("");
        warnaTextField.setText("");
        tipeTextField.setText("");
        ccTextField.setText("");
        noMesinTextField.setText("");
        tahunTextField.setText("");
        bahaBakarTextField.setText("");
    }//GEN-LAST:event_hapusButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Motor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Motor().setVisible(true);
            }
        });
    }
formDB mtr;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bahaBakarLabel;
    private javax.swing.JTextField bahaBakarTextField;
    private javax.swing.JLabel ccLabel;
    private javax.swing.JTextField ccTextField;
    private javax.swing.JButton hapusButton;
    private javax.swing.JButton kembaliButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel noMesinLabel;
    private javax.swing.JTextField noMesinTextField;
    private javax.swing.JLabel noPolisiLabel;
    private javax.swing.JTextField noPolisiTextField;
    private javax.swing.JButton simpanButton;
    private javax.swing.JLabel tahunLabel;
    private javax.swing.JTextField tahunTextField;
    private javax.swing.JLabel tipeLabel;
    private javax.swing.JTextField tipeTextField;
    private javax.swing.JLabel warnaLabel;
    private javax.swing.JTextField warnaTextField;
    // End of variables declaration//GEN-END:variables
}
