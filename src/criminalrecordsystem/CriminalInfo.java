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
public class CriminalInfo extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst, pst2;
    ResultSet rs, rs2;
    String person_id;

    /**
     * /**
     * Creates new form FIRCriminalInfo
     */
    public CriminalInfo() throws SQLException {
        initComponents();
        scaleimage();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
            Logger.getLogger(CriminalInfo.class.getName()).log(Level.SEVERE, null, ex);
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

            PreparedStatement pst2 = conn.prepareStatement("select fir_id from fir");
            rs2 = pst2.executeQuery();
            while (rs2.next()) {
                firid.addItem(rs2.getString("fir_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CriminalInfo.class.getName()).log(Level.SEVERE, null, ex);
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
//    //edit profile icon
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
//         // police logo
//         Image img6=icon6.getImage();
//        Image imgscale6=img6.getScaledInstance(jLabel16.getWidth(), jLabel16.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage6 = new ImageIcon(imgscale6);
//        jLabel16.setIcon(scaledImage6);
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
        jLabel28 = new javax.swing.JLabel();
        punishment = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        CriminalName = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        CriminalFather = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        CriminalCNIC = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        CriminalAge = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        CriminalPhone = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        CriminalAddress = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        CriminalNationality = new javax.swing.JTextArea();
        SaveCriminalInfo = new javax.swing.JButton();
        genderDropdown = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        crimeId = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        firid = new javax.swing.JComboBox<>();
        province = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel28.setText("Punishment:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, -1, -1));

        punishment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fine", "Prison", "Community Service", "Probation", "Suspended Sentence" }));
        punishment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                punishmentActionPerformed(evt);
            }
        });
        jPanel1.add(punishment, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 430, 240, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Criminal Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setOpaque(true);
        back.setPreferredSize(new java.awt.Dimension(133, 116));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 50, 60));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel26.setText("Name:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel27.setText("Father Name:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setText("CNIC Number:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setText("Gender:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel22.setText("Age:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel23.setText("Phone number:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel24.setText("Address:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel25.setText("Nationality:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setText("Province:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, -1, -1));

        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane15.setEnabled(false);
        jScrollPane15.setWheelScrollingEnabled(false);

        CriminalName.setBackground(new java.awt.Color(153, 153, 153));
        CriminalName.setColumns(20);
        CriminalName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CriminalName.setRows(5);
        CriminalName.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane15.setViewportView(CriminalName);

        jPanel1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 240, 30));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane7.setEnabled(false);
        jScrollPane7.setWheelScrollingEnabled(false);

        CriminalFather.setBackground(new java.awt.Color(153, 153, 153));
        CriminalFather.setColumns(20);
        CriminalFather.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CriminalFather.setRows(5);
        CriminalFather.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(CriminalFather);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 240, 30));

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane8.setEnabled(false);
        jScrollPane8.setWheelScrollingEnabled(false);

        CriminalCNIC.setBackground(new java.awt.Color(153, 153, 153));
        CriminalCNIC.setColumns(20);
        CriminalCNIC.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CriminalCNIC.setRows(5);
        CriminalCNIC.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane8.setViewportView(CriminalCNIC);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 240, 30));

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane10.setEnabled(false);
        jScrollPane10.setWheelScrollingEnabled(false);

        CriminalAge.setBackground(new java.awt.Color(153, 153, 153));
        CriminalAge.setColumns(20);
        CriminalAge.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CriminalAge.setRows(5);
        CriminalAge.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane10.setViewportView(CriminalAge);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 240, 30));

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane11.setEnabled(false);
        jScrollPane11.setWheelScrollingEnabled(false);

        CriminalPhone.setBackground(new java.awt.Color(153, 153, 153));
        CriminalPhone.setColumns(20);
        CriminalPhone.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CriminalPhone.setRows(5);
        CriminalPhone.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane11.setViewportView(CriminalPhone);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 240, 30));

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane12.setEnabled(false);
        jScrollPane12.setWheelScrollingEnabled(false);

        CriminalAddress.setBackground(new java.awt.Color(153, 153, 153));
        CriminalAddress.setColumns(20);
        CriminalAddress.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CriminalAddress.setRows(5);
        CriminalAddress.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane12.setViewportView(CriminalAddress);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 240, 30));

        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane16.setEnabled(false);
        jScrollPane16.setWheelScrollingEnabled(false);

        CriminalNationality.setBackground(new java.awt.Color(153, 153, 153));
        CriminalNationality.setColumns(20);
        CriminalNationality.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        CriminalNationality.setRows(5);
        CriminalNationality.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane16.setViewportView(CriminalNationality);

        jPanel1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 240, 30));

        SaveCriminalInfo.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        SaveCriminalInfo.setBorderPainted(false);
        SaveCriminalInfo.setContentAreaFilled(false);
        SaveCriminalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCriminalInfoActionPerformed(evt);
            }
        });
        jPanel1.add(SaveCriminalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, 130, 40));

        genderDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jPanel1.add(genderDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 230, 240, 40));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel29.setText("Crime ID:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 150, 30));

        crimeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimeIdActionPerformed(evt);
            }
        });
        jPanel1.add(crimeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 100, 30));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel30.setText("F.I.R ID");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 150, 30));

        firid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firidActionPerformed(evt);
            }
        });
        jPanel1.add(firid, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 100, 30));

        province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sindh", "Balochistan", "KPK", "Punjab" }));
        province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinceActionPerformed(evt);
            }
        });
        jPanel1.add(province, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 330, 240, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/criminalinfo.PNG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 1260, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveCriminalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCriminalInfoActionPerformed

        try {
            String Name = CriminalName.getText();
            String CNIC = CriminalCNIC.getText();
            String Age = CriminalAge.getText();
            String Address = CriminalAddress.getText();
            String Province = province.getSelectedItem().toString();
            String FatherName = CriminalFather.getText();
            String Gender = genderDropdown.getSelectedItem().toString();
            String Phoneno = CriminalPhone.getText();
            String Nationality = CriminalNationality.getText();
            String crimeid = crimeId.getSelectedItem().toString();
            String fir_id = firid.getSelectedItem().toString();
            String Punishment = punishment.getSelectedItem().toString();

            pst = conn.prepareStatement("insert into person(Person_name,Person_gender,Person_age,Person_CNIC,Person_phoneno,Person_address,Person_fathername,person_nationality,Person_Province) values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, Name);
            pst.setString(2, Gender);
            pst.setString(3, Age);
            pst.setString(4, CNIC);
            pst.setString(5, Phoneno);
            pst.setString(6, Address);
            pst.setString(7, FatherName);
            pst.setString(8, Nationality);
            pst.setString(9, Province);

            int k = pst.executeUpdate();

            if (k == 1) {
                JOptionPane.showMessageDialog(this, "Record Added");
                pst = conn.prepareStatement("select MAX(person_id) from Person");

                rs = pst.executeQuery();

                if (rs.next() == true) {
                    person_id = rs.getString(1);
                    pst2 = conn.prepareStatement("insert into person_involvement(Person_ID,Crime_ID,Complaint,Victim,Criminal,PI_Date,FIR_ID,punishment) values(?,?,?,?,?,sysdate,?,?)");
                    pst2.setString(1, person_id);
                    pst2.setString(2, crimeid);
                    pst2.setString(3, "0");
                    pst2.setString(4, "0");
                    pst2.setString(5, "1");
                    pst2.setString(6, fir_id);
                    pst2.setString(7, Punishment);

                    int s = pst2.executeUpdate();

                }
            } else {
                JOptionPane.showMessageDialog(this, "Record failed");
            }
            dispose();
            CriminalRecords c1 = new CriminalRecords();
            c1.setLocationRelativeTo(null);
            c1.setVisible(true);

        } catch (SQLException ex) {
            Logger.getLogger(CriminalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveCriminalInfoActionPerformed

    private void crimeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crimeIdActionPerformed

    private void firidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firidActionPerformed

    private void provinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinceActionPerformed

    private void punishmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_punishmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_punishmentActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        try {
            dispose();
            CriminalRecords e = new CriminalRecords();
            e.setLocationRelativeTo(null);
            e.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CriminalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(CriminalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriminalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriminalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriminalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CriminalInfo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CriminalInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CriminalAddress;
    private javax.swing.JTextArea CriminalAge;
    private javax.swing.JTextArea CriminalCNIC;
    private javax.swing.JTextArea CriminalFather;
    private javax.swing.JTextArea CriminalName;
    private javax.swing.JTextArea CriminalNationality;
    private javax.swing.JTextArea CriminalPhone;
    private javax.swing.JButton SaveCriminalInfo;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> crimeId;
    private javax.swing.JComboBox<String> firid;
    private javax.swing.JComboBox<String> genderDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JComboBox<String> province;
    private javax.swing.JComboBox<String> punishment;
    // End of variables declaration//GEN-END:variables
}
