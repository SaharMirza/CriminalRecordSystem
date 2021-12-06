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
public class FIRform extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs, rs2;
    int fid = 0;
    int cid = 0;

    /**
     * Creates new form FIRform
     */
    public FIRform() throws SQLException {

        initComponents();
        scaleimage();
        AddVictimDetails.setVisible(false);
        AddSuspectDetails.setVisible(false);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        Connect();
        dropdown();

    }

    public void Connect() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb", "PoliceRecord", "mypass");

            if (conn == null) {
                System.out.println("unable to connect w db");

            }
            System.out.println("connected w db");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FIRform.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void dropdown() {
        try {
            // TODO add your handling code here:
            PreparedStatement pst1 = conn.prepareStatement("select Crime_id from Crime");
            rs = pst1.executeQuery();
            while (rs.next()) {
                crimeId.addItem(rs.getString("Crime_id"));
            }

            PreparedStatement pst2 = conn.prepareStatement("select Officer_id from Officer");
            rs2 = pst2.executeQuery();
            while (rs2.next()) {
                officerid.addItem(rs2.getString("Officer_id"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(FIRform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void scaleimage() {
//        ImageIcon icon1=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\editprofile.jpg");
//        ImageIcon icon2=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\fir form.png");
//        ImageIcon icon3=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\firRecord.png");
//        ImageIcon icon4=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\criminalrecord.png");
//        ImageIcon icon5=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\crimestatistics.png");
//        ImageIcon icon6=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\police_badge_PNG72.png");
//
//       //edit profile icon
//        Image img1=icon1.getImage();
//        Image imgscale1=img1.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage1 = new ImageIcon(imgscale1);
//        jLabel4.setIcon(scaledImage1);
//        //fir form image
//        Image img2=icon2.getImage();
//        Image imgscale2=img2.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage2 = new ImageIcon(imgscale2);
//        jLabel5.setIcon(scaledImage2);
//        //fir record
//        Image img3=icon3.getImage();
//        Image imgscale3=img3.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage3 = new ImageIcon(imgscale3);
//        jLabel8.setIcon(scaledImage3);
//        //criminal record
//        Image img4=icon4.getImage();
//        Image imgscale4=img4.getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage4 = new ImageIcon(imgscale4);
//        jLabel6.setIcon(scaledImage4);
//        //criminal statistics
//        Image img5=icon5.getImage();
//        Image imgscale5=img5.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage5 = new ImageIcon(imgscale5);
//        jLabel7.setIcon(scaledImage5);
//        // police logo
//         Image img6=icon6.getImage();
//        Image imgscale6=img6.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage6 = new ImageIcon(imgscale6);
//        jLabel10.setIcon(scaledImage6);
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
        Logout = new javax.swing.JButton();
        AddVictimDetails = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Desc = new javax.swing.JTextArea();
        SubmitFIRForm = new javax.swing.JButton();
        EditProfile = new javax.swing.JButton();
        FIRForms = new javax.swing.JButton();
        FIRRecords = new javax.swing.JButton();
        CriminalRecords = new javax.swing.JButton();
        CriminalStatistics = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        FIRLocation = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        no = new javax.swing.JRadioButton();
        yes = new javax.swing.JRadioButton();
        AddComplaintDetails = new javax.swing.JButton();
        yes1 = new javax.swing.JRadioButton();
        no1 = new javax.swing.JRadioButton();
        AddSuspectDetails = new javax.swing.JButton();
        crimeId = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        officerid = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logout.setBackground(new java.awt.Color(204, 204, 204));
        Logout.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        Logout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Logout.setBorderPainted(false);
        Logout.setContentAreaFilled(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 170, 40));

        AddVictimDetails.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        AddVictimDetails.setText("Add Victim Details");
        AddVictimDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVictimDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(AddVictimDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 260, 40));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setEnabled(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        Desc.setColumns(20);
        Desc.setFont(new java.awt.Font("Segoe UI Emoji", 0, 20)); // NOI18N
        Desc.setRows(5);
        jScrollPane1.setViewportView(Desc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 710, 50));

        SubmitFIRForm.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SubmitFIRForm.setBorderPainted(false);
        SubmitFIRForm.setContentAreaFilled(false);
        SubmitFIRForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitFIRFormActionPerformed(evt);
            }
        });
        jPanel1.add(SubmitFIRForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 610, 160, 50));

        EditProfile.setBackground(new java.awt.Color(204, 204, 204));
        EditProfile.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        EditProfile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EditProfile.setBorderPainted(false);
        EditProfile.setContentAreaFilled(false);
        EditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileActionPerformed(evt);
            }
        });
        jPanel1.add(EditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 200, 60));

        FIRForms.setBackground(new java.awt.Color(204, 204, 204));
        FIRForms.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        FIRForms.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FIRForms.setBorderPainted(false);
        FIRForms.setContentAreaFilled(false);
        FIRForms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIRFormsActionPerformed(evt);
            }
        });
        jPanel1.add(FIRForms, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 190, 60));

        FIRRecords.setBackground(new java.awt.Color(204, 204, 204));
        FIRRecords.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        FIRRecords.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FIRRecords.setBorderPainted(false);
        FIRRecords.setContentAreaFilled(false);
        FIRRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIRRecordsActionPerformed(evt);
            }
        });
        jPanel1.add(FIRRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 180, 60));

        CriminalRecords.setBackground(new java.awt.Color(204, 204, 204));
        CriminalRecords.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        CriminalRecords.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CriminalRecords.setBorderPainted(false);
        CriminalRecords.setContentAreaFilled(false);
        CriminalRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriminalRecordsActionPerformed(evt);
            }
        });
        jPanel1.add(CriminalRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 240, 60));

        CriminalStatistics.setBackground(new java.awt.Color(204, 204, 204));
        CriminalStatistics.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        CriminalStatistics.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CriminalStatistics.setBorderPainted(false);
        CriminalStatistics.setContentAreaFilled(false);
        CriminalStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriminalStatisticsActionPerformed(evt);
            }
        });
        jPanel1.add(CriminalStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 200, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/crimestatistics.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 40, 40));

        jScrollPane16.setBorder(null);
        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setToolTipText("");
        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane16.setEnabled(false);
        jScrollPane16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane16.setWheelScrollingEnabled(false);

        FIRLocation.setColumns(20);
        FIRLocation.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        FIRLocation.setRows(5);
        FIRLocation.setText("Location");
        FIRLocation.setOpaque(false);
        jScrollPane16.setViewportView(FIRLocation);

        jPanel1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 160, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel11.setText("Know any Victims?");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 170, 30));

        no.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel1.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, -1, -1));

        yes.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        yes.setText("Yes");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        jPanel1.add(yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, -1, -1));

        AddComplaintDetails.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        AddComplaintDetails.setBorderPainted(false);
        AddComplaintDetails.setContentAreaFilled(false);
        AddComplaintDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddComplaintDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(AddComplaintDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 260, 40));

        yes1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        yes1.setText("Yes");
        yes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yes1ActionPerformed(evt);
            }
        });
        jPanel1.add(yes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        no1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        no1.setText("No");
        no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no1ActionPerformed(evt);
            }
        });
        jPanel1.add(no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        AddSuspectDetails.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        AddSuspectDetails.setText("Add Suspect Details");
        AddSuspectDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSuspectDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(AddSuspectDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 260, 40));

        crimeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimeIdActionPerformed(evt);
            }
        });
        jPanel1.add(crimeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 100, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel14.setText("Any Suspects?");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 150, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel16.setText("Officer ID:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 150, 20));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel20.setText("Crime ID:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 150, 20));

        officerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officeridActionPerformed(evt);
            }
        });
        jPanel1.add(officerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 100, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/FIR_Form.PNG"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 1200, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileActionPerformed
        try {
            this.toBack();
            this.setVisible(false);

            new EditProfile().toFront();

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(FIRform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditProfileActionPerformed

    private void FIRFormsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIRFormsActionPerformed


    }//GEN-LAST:event_FIRFormsActionPerformed

    private void FIRRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIRRecordsActionPerformed
        try {
            dispose();
            FIR_Records F2 = new FIR_Records();
            F2.setLocationRelativeTo(null);
            F2.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FIRform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FIRRecordsActionPerformed

    private void CriminalRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalRecordsActionPerformed
        try {
            dispose();
            CriminalRecords cr = new CriminalRecords();
            cr.setLocationRelativeTo(null);
            cr.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FIRform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CriminalRecordsActionPerformed

    private void CriminalStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalStatisticsActionPerformed
        try {
            dispose();
            CrimeStatistics c1 = new CrimeStatistics();
            c1.setLocationRelativeTo(null);
            c1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FIRform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CriminalStatisticsActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        dispose();
        HomePage c1 = new HomePage();
        c1.setLocationRelativeTo(null);
        c1.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        if (yes.isSelected()) {
            no.setSelected(false);
            AddVictimDetails.setVisible(true);
        }
    }//GEN-LAST:event_yesActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        if (no.isSelected()) {
            yes.setSelected(false);
            AddVictimDetails.setVisible(false);
        }
    }//GEN-LAST:event_noActionPerformed

    private void AddVictimDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVictimDetailsActionPerformed

        try {
            pst = conn.prepareStatement("select MAX(fir_id) from fir");

            rs = pst.executeQuery();

            if (rs.next() == true) {

                fid = Integer.parseInt(rs.getString(1));

            }

            this.toBack();
            FIRVictimInfo F1 = new FIRVictimInfo(cid, fid);
            F1.setLocationRelativeTo(null);
            F1.setVisible(true);
            F1.toFront();

        } catch (SQLException ex) {
            Logger.getLogger(FIRform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddVictimDetailsActionPerformed

    private void yes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yes1ActionPerformed
        if (yes1.isSelected()) {
            no1.setSelected(false);
            AddSuspectDetails.setVisible(true);
        }
    }//GEN-LAST:event_yes1ActionPerformed

    private void no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no1ActionPerformed
        if (no1.isSelected()) {
            yes1.setSelected(false);
            AddSuspectDetails.setVisible(false);
        }
    }//GEN-LAST:event_no1ActionPerformed

    private void AddSuspectDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSuspectDetailsActionPerformed

        try {
            pst = conn.prepareStatement("select MAX(fir_id) from fir");

            rs = pst.executeQuery();

            if (rs.next() == true) {

                fid = Integer.parseInt(rs.getString(1));

            }

            this.toBack();
            SuspectDetails F1 = new SuspectDetails(cid, fid);
            F1.setLocationRelativeTo(null);
            F1.setVisible(true);
            F1.toFront();
        } catch (SQLException ex) {
            Logger.getLogger(FIRform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddSuspectDetailsActionPerformed

    private void AddComplaintDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddComplaintDetailsActionPerformed

        String Officer_id = officerid.getSelectedItem().toString();
        String Crime_id = crimeId.getSelectedItem().toString();
        cid = Integer.parseInt(Crime_id);
        String fir_location = FIRLocation.getText();
        String incident_des = Desc.getText();

        try {
            pst = conn.prepareStatement("insert into FIR(Officer_ID,crime_id,fir_date,fir_time,fir_location,Incident_Description,fir_status) values(?,?,sysdate,sysdate,?,?,?)");
            pst.setString(1, Officer_id);
            pst.setString(2, Crime_id);
            pst.setString(3, fir_location);
            pst.setString(4, incident_des);
            pst.setString(5, "Open");

            int k = pst.executeUpdate();

            if (k == 1) {
                //JOptionPane.showMessageDialog(this, "Record Added");
                pst = conn.prepareStatement("select MAX(fir_id) from fir");

                rs = pst.executeQuery();

                if (rs.next() == true) {

                    fid = Integer.parseInt(rs.getString(1));

                }

            } else {
                JOptionPane.showMessageDialog(this, "Check Details Again there maybe errors!");

            }

            this.toBack();
            FIRComplaintInfo F1 = new FIRComplaintInfo(cid, fid);
            F1.setLocationRelativeTo(null);
            F1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FIRform.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddComplaintDetailsActionPerformed

    private void SubmitFIRFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitFIRFormActionPerformed

        JOptionPane.showMessageDialog(this, "F.I.R form Submitted");
        try {
            dispose();
            FIRform F1 = new FIRform();
            F1.setLocationRelativeTo(null);
            F1.setVisible(true);
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(CriminalRecords.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SubmitFIRFormActionPerformed

    private void crimeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crimeIdActionPerformed

    private void officeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_officeridActionPerformed

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
            java.util.logging.Logger.getLogger(FIRform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIRform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIRform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIRform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FIRform().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FIRform.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddComplaintDetails;
    private javax.swing.JButton AddSuspectDetails;
    private javax.swing.JButton AddVictimDetails;
    private javax.swing.JButton CriminalRecords;
    private javax.swing.JButton CriminalStatistics;
    private javax.swing.JTextArea Desc;
    private javax.swing.JButton EditProfile;
    private javax.swing.JButton FIRForms;
    private javax.swing.JTextArea FIRLocation;
    private javax.swing.JButton FIRRecords;
    private javax.swing.JButton Logout;
    private javax.swing.JButton SubmitFIRForm;
    private javax.swing.JComboBox<String> crimeId;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JRadioButton no;
    private javax.swing.JRadioButton no1;
    private javax.swing.JComboBox<String> officerid;
    private javax.swing.JRadioButton yes;
    private javax.swing.JRadioButton yes1;
    // End of variables declaration//GEN-END:variables
}
