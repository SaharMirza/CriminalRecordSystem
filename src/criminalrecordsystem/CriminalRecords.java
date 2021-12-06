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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class CriminalRecords extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst, pst2;
    ResultSet rs, rs2;
    DefaultTableModel Model;

    /**
     * Creates new form CriminalRecords
     */
    public CriminalRecords() throws SQLException {
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
            pst = conn.prepareStatement("select person.person_id,person.person_name,person.person_gender,person.person_age,person.person_CNIC,person.person_phoneno,person.person_address,person.person_fathername,person.person_nationality,person.person_province,person_involvement.fir_id,person_involvement.crime_id,person_involvement.punishment,person_involvement.pi_date from person JOIN person_involvement on person.person_id=person_involvement.person_id where person_involvement.criminal = '1'");
            rs = pst.executeQuery();
            while (rs.next()) {
                String id = rs.getString("Person_ID");
                String name = rs.getString("Person_name");
                String gender = rs.getString("Person_gender");
                String Age = rs.getString("Person_Age");
                String CNIC = rs.getString("Person_CNIC");
                String Phoneno = rs.getString("Person_Phoneno");
                String Address = rs.getString("Person_address");
                String Fathername = rs.getString("Person_fathername");
                String Nationality = rs.getString("Person_nationality");
                String Province = rs.getString("Person_province");
                String fir_id = rs.getString("FIR_ID");
                String crime_id = rs.getString("CRIME_ID");
                String Punishment = rs.getString("Punishment");
                String date = rs.getString("PI_DATE");

                String tbData[] = {id, name, gender, Age, CNIC, Phoneno, Address, Fathername, Nationality, Province, fir_id, crime_id, Punishment, date};
                Model = (DefaultTableModel) jTable1.getModel();
                Model.addRow(tbData);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIR_Records.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void scaleimage() {
//        ImageIcon icon1=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\editprofile.jpg");
//        ImageIcon icon2=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\fir form.png");
//        ImageIcon icon3=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\firRecord.png");
//        ImageIcon icon4=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\criminalrecord.png");
//        ImageIcon icon5=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\crimestatistics.png");
//        ImageIcon icon6=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\police_badge_PNG72.png");
//        ImageIcon icon7=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\search.png");
//      
//       //edit profile icon
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
//        Image img7=icon7.getImage();
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
        EditProfile = new javax.swing.JButton();
        FIRForms = new javax.swing.JButton();
        FIRRecords = new javax.swing.JButton();
        CriminalRecords = new javax.swing.JButton();
        CriminalStatistics = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        update = new javax.swing.JButton();
        criminal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        punishment = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EditProfile.setBackground(new java.awt.Color(204, 204, 204));
        EditProfile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        EditProfile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EditProfile.setBorderPainted(false);
        EditProfile.setContentAreaFilled(false);
        EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileActionPerformed(evt);
            }
        });
        jPanel1.add(EditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 170, 60));

        FIRForms.setBackground(new java.awt.Color(204, 204, 204));
        FIRForms.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        FIRForms.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FIRForms.setBorderPainted(false);
        FIRForms.setContentAreaFilled(false);
        FIRForms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIRFormsActionPerformed(evt);
            }
        });
        jPanel1.add(FIRForms, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 190, 60));

        FIRRecords.setBackground(new java.awt.Color(204, 204, 204));
        FIRRecords.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        FIRRecords.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FIRRecords.setBorderPainted(false);
        FIRRecords.setContentAreaFilled(false);
        FIRRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIRRecordsActionPerformed(evt);
            }
        });
        jPanel1.add(FIRRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 210, 60));

        CriminalRecords.setBackground(new java.awt.Color(204, 204, 204));
        CriminalRecords.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CriminalRecords.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CriminalRecords.setBorderPainted(false);
        CriminalRecords.setContentAreaFilled(false);
        CriminalRecords.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CriminalRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriminalRecordsActionPerformed(evt);
            }
        });
        jPanel1.add(CriminalRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 200, 60));

        CriminalStatistics.setBackground(new java.awt.Color(204, 204, 204));
        CriminalStatistics.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        CriminalStatistics.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CriminalStatistics.setBorderPainted(false);
        CriminalStatistics.setContentAreaFilled(false);
        CriminalStatistics.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CriminalStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriminalStatisticsActionPerformed(evt);
            }
        });
        jPanel1.add(CriminalStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 190, 60));

        Logout.setBackground(new java.awt.Color(204, 204, 204));
        Logout.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Logout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Logout.setBorderPainted(false);
        Logout.setContentAreaFilled(false);
        Logout.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 170, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Criminal ID", "Criminal Name", "Gender", "Age", "CNIC", "Phone No.", "Address", "Father Name", "Nationality ", "Province", "F.I.R ID", "Crime ID", "Punishment", "Date Of Arrest"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false, false, false, false, false
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 1040, 230));

        update.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        update.setBorderPainted(false);
        update.setContentAreaFilled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 160, 50));

        criminal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        criminal.setBorderPainted(false);
        criminal.setContentAreaFilled(false);
        criminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criminalActionPerformed(evt);
            }
        });
        jPanel1.add(criminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 270, 60));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Criminal ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 120, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Punishment");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        punishment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fine", "Prison", "Community Service", "Probation", "Suspended Sentence", "Pending", "Imprisonment" }));
        punishment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punishmentActionPerformed(evt);
            }
        });
        jPanel1.add(punishment, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 170, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/criminal record.PNG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 1270, 650));

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
            Logger.getLogger(CriminalRecords.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CriminalRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FIRFormsActionPerformed

    private void FIRRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIRRecordsActionPerformed
        try {
            dispose();
            FIR_Records F2 = new FIR_Records();
            F2.setLocationRelativeTo(null);
            F2.setVisible(true);
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(CriminalRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FIRRecordsActionPerformed

    private void CriminalRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalRecordsActionPerformed


    }//GEN-LAST:event_CriminalRecordsActionPerformed

    private void CriminalStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalStatisticsActionPerformed
        try {
            dispose();
            CrimeStatistics c1 = new CrimeStatistics();
            c1.setLocationRelativeTo(null);
            c1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CriminalRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CriminalStatisticsActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        dispose();
        HomePage c1 = new HomePage();
        c1.setLocationRelativeTo(null);
        c1.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        try {
            String punishmenttxt = punishment.getSelectedItem().toString();
            String id = idtxt.getText();

            String sql = "update person_involvement set punishment =?  where person_id = ?";
            pst2 = conn.prepareStatement(sql);
            pst2.setString(1, punishmenttxt);
            pst2.setString(2, id);
            int s = pst2.executeUpdate();

            System.out.println("updated");
        } catch (SQLException ex) {
            Logger.getLogger(CriminalRecords.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void criminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criminalActionPerformed
        try {
            dispose();
            CriminalInfo c1 = new CriminalInfo();
            c1.setLocationRelativeTo(null);
            c1.setVisible(true);                   // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(CriminalRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_criminalActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedrowindex = jTable1.getSelectedRow();
        idtxt.setText(Model.getValueAt(selectedrowindex, 0).toString());
        punishment.setSelectedItem(Model.getValueAt(selectedrowindex, 12).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void punishmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punishmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_punishmentActionPerformed

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
            java.util.logging.Logger.getLogger(CriminalRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriminalRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriminalRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriminalRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CriminalRecords().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CriminalRecords.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton criminal;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> punishment;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
