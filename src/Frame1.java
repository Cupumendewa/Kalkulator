/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Frame1 extends javax.swing.JFrame {
    /**
     * Creates new form Frame1
     */
    public Frame1() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bilangan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Bilangan2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Kali = new javax.swing.JButton();
        Bagi = new javax.swing.JButton();
        Tambah = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Kalkulator Sederhana");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 30, 110, 20);

        jLabel2.setText("Bilangan 1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 70, 60, 30);
        jPanel1.add(Bilangan);
        Bilangan.setBounds(240, 70, 40, 30);

        jLabel3.setText("Bilangan 2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 130, 60, 30);
        jPanel1.add(Bilangan2);
        Bilangan2.setBounds(240, 130, 40, 30);

        jLabel4.setText("Operator");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 180, 50, 20);

        Kali.setText("X");
        Kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliActionPerformed(evt);
            }
        });
        jPanel1.add(Kali);
        Kali.setBounds(100, 220, 50, 40);

        Bagi.setText(":");
        Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagiActionPerformed(evt);
            }
        });
        jPanel1.add(Bagi);
        Bagi.setBounds(180, 220, 50, 40);

        Tambah.setText("+");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        jPanel1.add(Tambah);
        Tambah.setBounds(260, 220, 50, 40);

        Kurang.setText("-");
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });
        jPanel1.add(Kurang);
        Kurang.setBounds(340, 220, 50, 40);

        jLabel5.setText("Hasil");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(230, 280, 30, 20);

        Hasil.setEditable(false);
        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });
        jPanel1.add(Hasil);
        Hasil.setBounds(170, 310, 140, 50);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(350, 330, 51, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-2, -4, 480, 380);

        setBounds(0, 0, 493, 414);
    }// </editor-fold>//GEN-END:initComponents

    private void KaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliActionPerformed
        int bil1 = Integer.parseInt(Bilangan.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasilkali = bil1*bil2;
        Hasil.setText(String.valueOf(hasilkali));
         // TODO add your handling code here:
    }//GEN-LAST:event_KaliActionPerformed

    private void BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiActionPerformed
        double bil1 = Integer.parseInt(Bilangan.getText());
        double bil2 = Integer.parseInt(Bilangan2.getText());
        double hasilbagi = bil1 / bil2;
        Hasil.setText(String.valueOf(hasilbagi));
        // TODO add your handling code here:
    }//GEN-LAST:event_BagiActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HasilActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        int bil1 = Integer.parseInt(Bilangan.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasiltambah = bil1+bil2;
        Hasil.setText(String.valueOf(hasiltambah));
        
        // TODO add your handling code here:
    }//GEN-LAST:event_TambahActionPerformed

    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed
        int bil1 = Integer.parseInt(Bilangan.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasilkurang = bil1-bil2;
        Hasil.setText(String.valueOf(hasilkurang));
                // TODO add your handling code here:
    }//GEN-LAST:event_KurangActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagi;
    private javax.swing.JTextField Bilangan;
    private javax.swing.JTextField Bilangan2;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Kali;
    private javax.swing.JButton Kurang;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
