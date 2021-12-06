/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminalrecordsystem;

import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        scaleimage();
       // setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public void scaleimage() {
//        ImageIcon icon1=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\crimelog.png");
//        ImageIcon icon2=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\crimestatistics.png");
//        ImageIcon icon3=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\police_badge_PNG72.png");
//        
// // crime lof
//        Image img1=icon1.getImage();
//        Image imgscale1=img1.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage1 = new ImageIcon(imgscale1);
//        jLabel3.setIcon(scaledImage1);       
//// crime statistics
//        Image img2=icon2.getImage();
//        Image imgscale2=img2.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage2 = new ImageIcon(imgscale2);
//        jLabel1.setIcon(scaledImage2);
//
//// police logo
//        Image img3=icon3.getImage();
//        Image imgscale3=img3.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage3 = new ImageIcon(imgscale3);
//        jLabel10.setIcon(scaledImage3);
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
        PublicCrimeLog = new javax.swing.JButton();
        PublicCrimeStatistics = new javax.swing.JButton();
        officerLogIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 650));
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setMinimumSize(new java.awt.Dimension(1320, 670));
        jPanel1.setPreferredSize(new java.awt.Dimension(1320, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PublicCrimeLog.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PublicCrimeLog.setBorderPainted(false);
        PublicCrimeLog.setContentAreaFilled(false);
        PublicCrimeLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicCrimeLogActionPerformed(evt);
            }
        });
        jPanel1.add(PublicCrimeLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 210, 200));

        PublicCrimeStatistics.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PublicCrimeStatistics.setBorderPainted(false);
        PublicCrimeStatistics.setContentAreaFilled(false);
        PublicCrimeStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicCrimeStatisticsActionPerformed(evt);
            }
        });
        jPanel1.add(PublicCrimeStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 220, 190));

        officerLogIn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        officerLogIn.setBorderPainted(false);
        officerLogIn.setContentAreaFilled(false);
        officerLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officerLogInActionPerformed(evt);
            }
        });
        jPanel1.add(officerLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 240, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/WhatsApp Image 2021-12-05 at 8.27.38 PM.jpeg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PublicCrimeLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublicCrimeLogActionPerformed
        dispose();
        CriminalLog e = new CriminalLog();
        e.setLocationRelativeTo(null);
        e.setVisible(true);
    }//GEN-LAST:event_PublicCrimeLogActionPerformed

    private void officerLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officerLogInActionPerformed
        try {
            dispose();
            Login cr = new Login();
            cr.setLocationRelativeTo(null);
            cr.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_officerLogInActionPerformed

    private void PublicCrimeStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublicCrimeStatisticsActionPerformed
        try {
            dispose();
            CrimeStatisticsPublic e = new CrimeStatisticsPublic();
            e.setLocationRelativeTo(null);
            e.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PublicCrimeStatisticsActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomePage obj = new  HomePage();
                //new HomePage().setVisible(true);
                obj.setVisible(true);
                
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PublicCrimeLog;
    private javax.swing.JButton PublicCrimeStatistics;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton officerLogIn;
    // End of variables declaration//GEN-END:variables
}
