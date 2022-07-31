/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlrp.ui;

import com.qlrp.utils.Auth;
import com.qlrp.utils.XImage;
import javax.swing.JOptionPane;

/**
 *
 * @author duong
 */
public class SplashScreen extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form splashloading
     */
    public SplashScreen() {
        initComponents();
        runLoading();
        this.setIconImage(XImage.getAppIcon());
        this.setLocationRelativeTo(null);
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
        LoadingBar = new rojerusan.componentes.RSProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("4TLIX CINEMAS");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        LoadingBar.setForeground(new java.awt.Color(229, 79, 109));
        jPanel1.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/4tlix-logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 290, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/icon/login/SPIDER-MAN- NO WAY HOME - Official Trailer (HD)_8.gif"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void runLoading() {
        Thread load = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(49);
                        LoadingBar.setValue(i);
                    }
                    thoat();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        };
        load.start();
    }

    private void thoat() {
        this.setVisible(false);
        if (Auth.user == null) {
            if (Auth.cus != null) {
                KHHOME kh = new KHHOME();
                kh.setVisible(true);
            }
        } else {
            if(Auth.user.getTEN_VAI_TRO().equalsIgnoreCase("Nhân viên Bán Hàng")) {
                KHHOME kh = new KHHOME();
                kh.setVisible(true);
                kh.refeshForm();
            } else {
                QLHOME qlhome = new QLHOME();
                qlhome.setVisible(true);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.componentes.RSProgressBar LoadingBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
