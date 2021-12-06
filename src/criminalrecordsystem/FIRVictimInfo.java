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
public class FIRVictimInfo extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst, pst2;
    ResultSet rs, rs2;
    /**
     * Creates new form ComplaintInfo
     */

    String crimeid;
    String firid, person_id;

    /**
     * Creates new form FIRVictimInfo
     */
    public FIRVictimInfo() throws SQLException {
        initComponents();
        scaleimage();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Connect();

    }

    FIRVictimInfo(int cid, int fid) throws SQLException {
        initComponents();
        scaleimage();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Connect();
        crimeid = Integer.toString(cid);
        firid = Integer.toString(fid);
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
            Logger.getLogger(FIRVictimInfo.class.getName()).log(Level.SEVERE, null, ex);
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
        jScrollPane16 = new javax.swing.JScrollPane();
        VictimNationality = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        VictimAddress = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        VictimPhone = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        VictimAge = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        VictimCNIC = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        VictimFather = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        VictimName = new javax.swing.JTextArea();
        AddVictims = new javax.swing.JButton();
        SaveVictimInfo = new javax.swing.JButton();
        province = new javax.swing.JComboBox<>();
        genderdropdown = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 710));
        setMinimumSize(new java.awt.Dimension(700, 710));
        setPreferredSize(new java.awt.Dimension(700, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane16.setEnabled(false);
        jScrollPane16.setWheelScrollingEnabled(false);

        VictimNationality.setColumns(20);
        VictimNationality.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        VictimNationality.setRows(5);
        jScrollPane16.setViewportView(VictimNationality);

        jPanel1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 240, 30));

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane12.setEnabled(false);
        jScrollPane12.setWheelScrollingEnabled(false);

        VictimAddress.setColumns(20);
        VictimAddress.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        VictimAddress.setRows(5);
        jScrollPane12.setViewportView(VictimAddress);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 240, 30));

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane11.setEnabled(false);
        jScrollPane11.setWheelScrollingEnabled(false);

        VictimPhone.setColumns(20);
        VictimPhone.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        VictimPhone.setRows(5);
        jScrollPane11.setViewportView(VictimPhone);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 240, 20));

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane10.setEnabled(false);
        jScrollPane10.setWheelScrollingEnabled(false);

        VictimAge.setColumns(20);
        VictimAge.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        VictimAge.setRows(5);
        jScrollPane10.setViewportView(VictimAge);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 240, 20));

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane8.setEnabled(false);
        jScrollPane8.setWheelScrollingEnabled(false);

        VictimCNIC.setColumns(20);
        VictimCNIC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        VictimCNIC.setRows(5);
        jScrollPane8.setViewportView(VictimCNIC);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 240, 30));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane7.setEnabled(false);
        jScrollPane7.setWheelScrollingEnabled(false);

        VictimFather.setColumns(20);
        VictimFather.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        VictimFather.setRows(5);
        jScrollPane7.setViewportView(VictimFather);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 240, 20));

        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane15.setEnabled(false);
        jScrollPane15.setWheelScrollingEnabled(false);

        VictimName.setColumns(20);
        VictimName.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        VictimName.setRows(5);
        jScrollPane15.setViewportView(VictimName);

        jPanel1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 240, 30));

        AddVictims.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        AddVictims.setBorderPainted(false);
        AddVictims.setContentAreaFilled(false);
        AddVictims.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVictimsActionPerformed(evt);
            }
        });
        jPanel1.add(AddVictims, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 250, 60));

        SaveVictimInfo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SaveVictimInfo.setBorderPainted(false);
        SaveVictimInfo.setContentAreaFilled(false);
        SaveVictimInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveVictimInfoActionPerformed(evt);
            }
        });
        jPanel1.add(SaveVictimInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 120, 60));

        province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sindh", "Balochistan", "KPK", "Punjab" }));
        province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinceActionPerformed(evt);
            }
        });
        jPanel1.add(province, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 110, 40));

        genderdropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jPanel1.add(genderdropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 80, 30));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setOpaque(true);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/victiminfo.PNG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 600, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddVictimsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVictimsActionPerformed
        try {
            //save to database before opening a new frame
           
            int cid = Integer.parseInt(crimeid);
            int fid = Integer.parseInt(firid);
            
                     
           
            String Name = VictimName.getText();
            String CNIC = VictimCNIC.getText();
            String Age = VictimAge.getText();
            String Address = VictimAddress.getText();
            String Province = province.getSelectedItem().toString();
            String FatherName = VictimFather.getText();
            String Gender = genderdropdown.getSelectedItem().toString();
            String Phoneno = VictimPhone.getText();
            String Nationality = VictimNationality.getText();

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
                    pst2 = conn.prepareStatement("insert into person_involvement(Person_ID,Crime_ID,Complaint,Victim,Criminal,PI_Date,FIR_ID) values(?,?,?,?,?,sysdate,?)");
                    pst2.setString(1, person_id);
                    pst2.setString(2, crimeid);
                    pst2.setString(3, "0");
                    pst2.setString(4, "1");
                    pst2.setString(5, "0");
                    pst2.setString(6, firid);

                    int s = pst2.executeUpdate();
                    
                    FIRVictimInfo e = new FIRVictimInfo(cid,fid);
            e.setLocationRelativeTo(null);
            e.setVisible(true);

                }
            } else {
                JOptionPane.showMessageDialog(this, "Record failed");
            }

        
        } catch (SQLException ex) {
            Logger.getLogger(FIRVictimInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddVictimsActionPerformed

    private void SaveVictimInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveVictimInfoActionPerformed
        try {                                               
            try {
                // TODO add your handling code here:
                String Name = VictimName.getText();
                String CNIC = VictimCNIC.getText();
                String Age = VictimAge.getText();
                String Address = VictimAddress.getText();
                String Province = province.getSelectedItem().toString();
                String FatherName = VictimFather.getText();
                String Gender = genderdropdown.getSelectedItem().toString();
                String Phoneno = VictimPhone.getText();
                String Nationality = VictimNationality.getText();
                
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
                        pst2 = conn.prepareStatement("insert into person_involvement(Person_ID,Crime_ID,Complaint,Victim,Criminal,PI_Date,FIR_ID) values(?,?,?,?,?,sysdate,?)");
                        pst2.setString(1, person_id);
                        pst2.setString(2, crimeid);
                        pst2.setString(3, "0");
                        pst2.setString(4, "1");
                        pst2.setString(5, "0");
                        pst2.setString(6, firid);
                        
                        int s = pst2.executeUpdate();
                        
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Record failed");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(FIRVictimInfo.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.toBack();
            this.setVisible(false);
            
            new FIRform().toFront();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FIRVictimInfo.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_SaveVictimInfoActionPerformed

    private void provinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinceActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        try {
            this.toBack();
            this.setVisible(false);
            new FIRform().toFront();
        } catch (SQLException ex) {
            Logger.getLogger(FIRComplaintInfo.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(FIRVictimInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIRVictimInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIRVictimInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIRVictimInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FIRVictimInfo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FIRVictimInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddVictims;
    private javax.swing.JButton SaveVictimInfo;
    private javax.swing.JTextArea VictimAddress;
    private javax.swing.JTextArea VictimAge;
    private javax.swing.JTextArea VictimCNIC;
    private javax.swing.JTextArea VictimFather;
    private javax.swing.JTextArea VictimName;
    private javax.swing.JTextArea VictimNationality;
    private javax.swing.JTextArea VictimPhone;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> genderdropdown;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JComboBox<String> province;
    // End of variables declaration//GEN-END:variables
}
