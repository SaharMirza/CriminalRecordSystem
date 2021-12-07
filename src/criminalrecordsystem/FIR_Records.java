/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminalrecordsystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class FIR_Records extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst, pst2;
    ResultSet rs, rs2;
    DefaultTableModel Model;

    /**
     * Creates new form FIR_Records
     */
    public FIR_Records() throws SQLException {
        initComponents();
        scaleimage();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        Connect();

    }

    public void Connect() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb", "PoliceRecord", "mypass");

            if (conn == null) {
                System.out.println("unable to connect w db");

            }
            System.out.println("connected w db");
            pst = conn.prepareStatement("select * from FIR");
            rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("FIR_ID");
                String date = rs.getString("FIR_DATE");
                String crime_id = rs.getString("CRIME_ID");
                String fir_status = rs.getString("FIR_STATUS");
                String tbData[] = {id, date, crime_id, fir_status};
                Model = (DefaultTableModel) jTable1.getModel();
                Model.addRow(tbData);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIR_Records.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void scaleimage() {
//        ImageIcon icon1=new ImageIcon("editprofile.jpg");
//        ImageIcon icon2=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\fir form.png");
//        ImageIcon icon3=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\firRecord.png");
//        ImageIcon icon4=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\criminalrecord.png");
//        ImageIcon icon5=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\crimestatistics.png");
//        ImageIcon icon6=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\police_badge_PNG72.png");
//        ImageIcon icon7=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\search.png");
        //edit profile icon
//        Image img1=icon1.getImage();
//        Image imgscale1=img1.getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage1 = new ImageIcon(imgscale1);
//        jLabel17.setIcon(scaledImage1);
//        //fir form image
//        Image img2=icon2.getImage();
//        Image imgscale2=img2.getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage2 = new ImageIcon(imgscale2);
//        jLabel18.setIcon(scaledImage2);
//        //fir record
//        Image img3=icon3.getImage();
//        Image imgscale3=img3.getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage3 = new ImageIcon(imgscale3);
//        jLabel19.setIcon(scaledImage3);
//        //criminal record
//        Image img4=icon4.getImage();
//        Image imgscale4=img4.getScaledInstance(jLabel20.getWidth(), jLabel20.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage4 = new ImageIcon(imgscale4);
//        jLabel20.setIcon(scaledImage4);
//        //criminal statistics
//        Image img5=icon5.getImage();
//        Image imgscale5=img5.getScaledInstance(jLabel21.getWidth(), jLabel21.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage5 = new ImageIcon(imgscale5);
//        jLabel21.setIcon(scaledImage5);
//        // police logo
//         Image img6=icon6.getImage();
//        Image imgscale6=img6.getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage6 = new ImageIcon(imgscale6);
//        jLabel16.setIcon(scaledImage6);
//        //search
//     Image img7=icon7.getImage();
//        Image imgscale7=img7.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage7 = new ImageIcon(imgscale7);
//        jLabel3.setIcon(scaledImage7);
//        //logout
//        ImageIcon icon90=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\logout.png");
//        Image img90=icon90.getImage();
//        Image imgscale90=img90.getScaledInstance(jLabel57.getWidth(), jLabel57.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage90 = new ImageIcon(imgscale90);
//        jLabel57.setIcon(scaledImage90);

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
        viewdetails = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        statustxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EditProfile = new javax.swing.JButton();
        FIRForms = new javax.swing.JButton();
        FIRRecords = new javax.swing.JButton();
        CriminalRecords = new javax.swing.JButton();
        CriminalStatistics = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        idtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewdetails.setBorderPainted(false);
        viewdetails.setContentAreaFilled(false);
        viewdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(viewdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 220, 50));

        delete.setBorderPainted(false);
        delete.setContentAreaFilled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 150, 50));
        jPanel1.add(statustxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 160, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("F.I.R Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        EditProfile.setBackground(new java.awt.Color(204, 204, 204));
        EditProfile.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        EditProfile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EditProfile.setBorderPainted(false);
        EditProfile.setContentAreaFilled(false);
        EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileActionPerformed(evt);
            }
        });
        jPanel1.add(EditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, 60));

        FIRForms.setBackground(new java.awt.Color(204, 204, 204));
        FIRForms.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        FIRForms.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FIRForms.setBorderPainted(false);
        FIRForms.setContentAreaFilled(false);
        FIRForms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIRFormsActionPerformed(evt);
            }
        });
        jPanel1.add(FIRForms, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 180, 60));

        FIRRecords.setBackground(new java.awt.Color(204, 204, 204));
        FIRRecords.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        FIRRecords.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FIRRecords.setBorderPainted(false);
        FIRRecords.setContentAreaFilled(false);
        FIRRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIRRecordsActionPerformed(evt);
            }
        });
        jPanel1.add(FIRRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 200, 60));

        CriminalRecords.setBackground(new java.awt.Color(204, 204, 204));
        CriminalRecords.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        CriminalRecords.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CriminalRecords.setBorderPainted(false);
        CriminalRecords.setContentAreaFilled(false);
        CriminalRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriminalRecordsActionPerformed(evt);
            }
        });
        jPanel1.add(CriminalRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 230, 60));

        CriminalStatistics.setBackground(new java.awt.Color(204, 204, 204));
        CriminalStatistics.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        CriminalStatistics.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CriminalStatistics.setBorderPainted(false);
        CriminalStatistics.setContentAreaFilled(false);
        CriminalStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriminalStatisticsActionPerformed(evt);
            }
        });
        jPanel1.add(CriminalStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 210, 60));

        Logout.setBackground(new java.awt.Color(204, 204, 204));
        Logout.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Logout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Logout.setBorderPainted(false);
        Logout.setContentAreaFilled(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 160, 60));

        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "F.I.R ID", "Date", "Crime ID", "F.I.R Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 990, 200));

        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 120, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("F.I.R ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        update.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 140, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/FIR Records.PNG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 1200, 670));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileActionPerformed
        try {
            this.toBack();
            this.setVisible(false);
            new EditProfile().toFront();
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(FIR_Records.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditProfileActionPerformed

    private void FIRFormsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIRFormsActionPerformed
        try {
            dispose();
            FIRform F1 = new FIRform();
            F1.setLocationRelativeTo(null);
            F1.setVisible(true);
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(FIR_Records.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FIRFormsActionPerformed

    private void FIRRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIRRecordsActionPerformed

      
    }//GEN-LAST:event_FIRRecordsActionPerformed

    private void CriminalRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalRecordsActionPerformed
        try {
            dispose();
            CriminalRecords cr = new CriminalRecords();
            cr.setLocationRelativeTo(null);
            cr.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FIR_Records.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CriminalRecordsActionPerformed

    private void CriminalStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalStatisticsActionPerformed
        try {
            dispose();
            CrimeStatistics c1 = new CrimeStatistics();
            c1.setLocationRelativeTo(null);
            c1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FIR_Records.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CriminalStatisticsActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        dispose();
        HomePage c1 = new HomePage();
        c1.setLocationRelativeTo(null);
        c1.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedrowindex = jTable1.getSelectedRow();
        idtxt.setText(Model.getValueAt(selectedrowindex, 0).toString());
        statustxt.setText(Model.getValueAt(selectedrowindex, 3).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        try {
            String fir_status = statustxt.getText();
            String id = idtxt.getText();

            String sql = "update fir set fir_status =?  where fir_id = ?";
            pst2 = conn.prepareStatement(sql);
            pst2.setString(1, fir_status);
            pst2.setString(2, id);
            int s = pst2.executeUpdate();

            System.out.println("updated");
        } catch (SQLException ex) {
            Logger.getLogger(FIR_Records.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {

            String id = idtxt.getText();

            String sql = "delete from fir where fir_id = ?";
            pst2 = conn.prepareStatement(sql);

            pst2.setString(1, id);
            int s = pst2.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FIR_Records.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void viewdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdetailsActionPerformed
        try {
            String id = idtxt.getText();
            firdetails fd = new firdetails(id);
             fd.setLocationRelativeTo(null);
            this.setVisible(false);
            fd.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FIR_Records.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewdetailsActionPerformed

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
            java.util.logging.Logger.getLogger(FIR_Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIR_Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIR_Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIR_Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FIR_Records().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FIR_Records.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CriminalRecords;
    private javax.swing.JButton CriminalStatistics;
    private javax.swing.JButton EditProfile;
    private javax.swing.JButton FIRForms;
    private javax.swing.JButton FIRRecords;
    private javax.swing.JButton Logout;
    private javax.swing.JButton delete;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField statustxt;
    private javax.swing.JButton update;
    private javax.swing.JButton viewdetails;
    // End of variables declaration//GEN-END:variables
}
