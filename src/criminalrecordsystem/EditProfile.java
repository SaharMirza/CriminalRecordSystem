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

/**
 *
 * @author HP
 */
public class EditProfile extends javax.swing.JFrame {

    String OFFICER_ID;

    /**
     * Creates new form EditProfile
     */
    public EditProfile() throws SQLException {
        initComponents();
        scaleimage();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        Connect();

    }

    Connection conn;

    public void Connect() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb", "PoliceRecord", "mypass");

            if (conn == null) {
                System.out.println("unable to connect w db");

            }
            System.out.println("connected w db");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void scaleimage() {
//        ImageIcon icon1=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\editprofile.jpg");
//        ImageIcon icon2=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\fir form.png");
//        ImageIcon icon3=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\firRecord.png");
//        ImageIcon icon4=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\criminalrecord.png");
//        ImageIcon icon5=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\crimestatistics.png");
//        ImageIcon icon6=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\police_badge_PNG72.png");
//        ImageIcon icon7=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\profilepic.jpg");
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
        //criminal record
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
//        //profile pic
//        Image img7=icon7.getImage();
//        Image imgscale7=img7.getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage7 = new ImageIcon(imgscale7);
//        jLabel23.setIcon(scaledImage7);
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
        Rank = new javax.swing.JLabel();
        OfficerID = new javax.swing.JLabel();
        CNIC = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        OfficerName = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        SaveEditProfile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PoliceConfirmpw = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        PoliceAddress = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        PoliceEmail = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        PoliceOldpw = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        PoliceNewpw = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        PolicePhone = new javax.swing.JTextArea();
        EditProfile = new javax.swing.JButton();
        FIRForms = new javax.swing.JButton();
        FIRRecords = new javax.swing.JButton();
        CriminalRecords = new javax.swing.JButton();
        CriminalStatistics = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Rank.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Rank.setText("Rank:");
        jPanel1.add(Rank, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        OfficerID.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        OfficerID.setText("Officer ID:");
        jPanel1.add(OfficerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        CNIC.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        CNIC.setText("CNIC:");
        jPanel1.add(CNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        Gender.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Gender.setText("Gender:");
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        OfficerName.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        OfficerName.setText("Officer Name");
        jPanel1.add(OfficerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        Age.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Age.setText("Age:");
        jPanel1.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, -1, -1));

        SaveEditProfile.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SaveEditProfile.setBorderPainted(false);
        SaveEditProfile.setContentAreaFilled(false);
        SaveEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveEditProfileActionPerformed(evt);
            }
        });
        jPanel1.add(SaveEditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 600, 120, 50));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setEnabled(false);
        jScrollPane2.setWheelScrollingEnabled(false);

        PoliceConfirmpw.setColumns(20);
        PoliceConfirmpw.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PoliceConfirmpw.setForeground(new java.awt.Color(153, 153, 153));
        PoliceConfirmpw.setRows(5);
        jScrollPane2.setViewportView(PoliceConfirmpw);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, 150, 20));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setEnabled(false);
        jScrollPane3.setWheelScrollingEnabled(false);

        PoliceAddress.setColumns(20);
        PoliceAddress.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PoliceAddress.setForeground(new java.awt.Color(153, 153, 153));
        PoliceAddress.setRows(5);
        jScrollPane3.setViewportView(PoliceAddress);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 150, 20));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setEnabled(false);
        jScrollPane4.setWheelScrollingEnabled(false);

        PoliceEmail.setColumns(20);
        PoliceEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PoliceEmail.setForeground(new java.awt.Color(153, 153, 153));
        PoliceEmail.setRows(5);
        jScrollPane4.setViewportView(PoliceEmail);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, 150, 20));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane5.setEnabled(false);
        jScrollPane5.setWheelScrollingEnabled(false);

        PoliceOldpw.setColumns(20);
        PoliceOldpw.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PoliceOldpw.setForeground(new java.awt.Color(153, 153, 153));
        PoliceOldpw.setRows(5);
        jScrollPane5.setViewportView(PoliceOldpw);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, 150, 20));

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane6.setEnabled(false);
        jScrollPane6.setWheelScrollingEnabled(false);

        PoliceNewpw.setColumns(20);
        PoliceNewpw.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PoliceNewpw.setForeground(new java.awt.Color(153, 153, 153));
        PoliceNewpw.setRows(5);
        jScrollPane6.setViewportView(PoliceNewpw);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 490, 150, 20));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane7.setEnabled(false);
        jScrollPane7.setWheelScrollingEnabled(false);

        PolicePhone.setColumns(20);
        PolicePhone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PolicePhone.setForeground(new java.awt.Color(153, 153, 153));
        PolicePhone.setRows(5);
        jScrollPane7.setViewportView(PolicePhone);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 150, 20));

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
        jPanel1.add(EditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 170, 60));

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
        jPanel1.add(FIRForms, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 170, 60));

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
        jPanel1.add(FIRRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 190, 60));

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
        jPanel1.add(CriminalRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 230, 60));

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
        jPanel1.add(CriminalStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 80, 210, 60));

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
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 210, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/editprofiless.PNG"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1300, 650));
        jLabel3.setMinimumSize(new java.awt.Dimension(1300, 650));
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 1250, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 660));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String setID(String ID) throws SQLException {
        OFFICER_ID = ID;

        String sql = "SELECT * FROM Officer WHERE Officer_id = ?";
        PreparedStatement statement;
        statement = conn.prepareStatement(sql);
        statement.setString(1, OFFICER_ID);

        ResultSet result = statement.executeQuery();
        if (result.next()) {
            OfficerName.setText(result.getString("Officer_Name"));
            OfficerID.setText("Officer ID: " + result.getString("Officer_ID"));
            Rank.setText("Rank: " + result.getString("Officer_Rank"));
            CNIC.setText("CNIC: " + result.getString("Officer_CNIC"));
            Gender.setText("Gender: " + result.getString("Officer_Gender"));
            Age.setText("Age: " + result.getString("Officer_Age"));
            PolicePhone.setText(result.getString("Officer_Phoneno"));
            PoliceEmail.setText(result.getString("Email_address"));
            PoliceAddress.setText(result.getString("Officer_address"));

        }
        return OFFICER_ID;

    }

    private void SaveEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveEditProfileActionPerformed
        try {
            // TODO add your handling code here:
            String phoneno = PolicePhone.getText();
            String email = PoliceEmail.getText();
            String address = PoliceAddress.getText();
            String oldpass = PoliceOldpw.getText();
            String newpass = PoliceNewpw.getText();
            String confirmpass = PoliceConfirmpw.getText();

            String sql1 = "select password from Officer where OFFICER_ID=?";
            String sql = "update Officer set OFFICER_PHONENO=?,OFFICER_ADDRESS=?,EMAIL_ADDRESS=? where OFFICER_ID=?";

            PreparedStatement statement2;
            statement2 = conn.prepareStatement(sql1);
            statement2.setString(1, OFFICER_ID);

            ResultSet rs = statement2.executeQuery();

            while (rs.next()) {
                if (rs.getString(1).equals(oldpass) && newpass.equals(confirmpass)) {
                    String sql2 = "update Officer set Password=? where OFFICER_ID=?";
                    PreparedStatement statement3;
                    statement3 = conn.prepareStatement(sql2);
                    statement3.setString(1, newpass);
                    statement3.setString(2, OFFICER_ID);
                    statement3.executeUpdate();
                } else {
                    JOptionPane.showMessageDialog(this, "Passwords Don't Match");

                }
            }

            PreparedStatement statement1;
            statement1 = conn.prepareStatement(sql);
            statement1.setString(1, phoneno);
            statement1.setString(3, email);
            statement1.setString(2, address);
            statement1.setString(4, OFFICER_ID);

            int k = statement1.executeUpdate();
            if (k == 1) {
                JOptionPane.showMessageDialog(this, "Profile Updated");

            } else {
                JOptionPane.showMessageDialog(this, "Check Fields Again");
            }

        } catch (SQLException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveEditProfileActionPerformed

    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileActionPerformed
//        try {
//            dispose();
//            EditProfile e = new EditProfile();
//            e.setLocationRelativeTo(null);
//            e.setVisible(true);
//        } catch (SQLException ex) {
//            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_EditProfileActionPerformed

    private void FIRFormsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIRFormsActionPerformed
        try {
            
            this.toBack();           
            FIRform F1 = new FIRform();
            F1.setLocationRelativeTo(null);
            F1.setVisible(true);
            F1.toFront();
        } catch (SQLException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FIRFormsActionPerformed

    private void FIRRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIRRecordsActionPerformed
        try {
            this.toBack();           
            FIR_Records F2 = new FIR_Records();
            F2.setLocationRelativeTo(null);
            F2.setVisible(true);
            F2.toFront();
           
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FIRRecordsActionPerformed

    private void CriminalRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalRecordsActionPerformed
        try {
            this.toBack();           
            CriminalRecords cr = new CriminalRecords();
            cr.setLocationRelativeTo(null);
            cr.setVisible(true);
            cr.toFront();
            
        } catch (SQLException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CriminalRecordsActionPerformed

    private void CriminalStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalStatisticsActionPerformed
        try {
            this.toBack();           
             CrimeStatistics c1 = new CrimeStatistics();
            c1.setLocationRelativeTo(null);
            c1.setVisible(true);
            c1.toFront();
           
        } catch (SQLException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CriminalStatisticsActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        dispose();
        HomePage c1 = new HomePage();
        c1.setLocationRelativeTo(null);
        c1.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditProfile().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel CNIC;
    private javax.swing.JButton CriminalRecords;
    private javax.swing.JButton CriminalStatistics;
    private javax.swing.JButton EditProfile;
    private javax.swing.JButton FIRForms;
    private javax.swing.JButton FIRRecords;
    private javax.swing.JLabel Gender;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel OfficerID;
    private javax.swing.JLabel OfficerName;
    private javax.swing.JTextArea PoliceAddress;
    private javax.swing.JTextArea PoliceConfirmpw;
    private javax.swing.JTextArea PoliceEmail;
    private javax.swing.JTextArea PoliceNewpw;
    private javax.swing.JTextArea PoliceOldpw;
    private javax.swing.JTextArea PolicePhone;
    private javax.swing.JLabel Rank;
    private javax.swing.JButton SaveEditProfile;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables

}
