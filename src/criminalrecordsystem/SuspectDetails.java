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
public class SuspectDetails extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst, pst2;
    ResultSet rs, rs2;
    /**
     * Creates new form ComplaintInfo
     */

    String crimeid;
    String firid, person_id;

    /**
     * Creates new form SuspectDetails
     */
    public SuspectDetails() throws SQLException {
        initComponents();
        scaleimage();
        visible();
        //setExtendedState(JFrame.);
        Connect();

    }

    SuspectDetails(int cid, int fid) throws SQLException {
        initComponents();
        scaleimage();
        visible();
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
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void visible() {
//        susid2.setVisible(false);
//        susid3.setVisible(false);
//        susid4.setVisible(false);
//        susid5.setVisible(false);
//        susid6.setVisible(false);
//        susid7.setVisible(false);
//        susid8.setVisible(false);
//        susid9.setVisible(false);
//        susid10.setVisible(false);
//        

        susname2.setVisible(false);
        susname3.setVisible(false);
        susname4.setVisible(false);
        susname5.setVisible(false);
        susname6.setVisible(false);
        susname7.setVisible(false);
        susname8.setVisible(false);
        susname9.setVisible(false);
        susname10.setVisible(false);

        susadd2.setVisible(false);
        susadd3.setVisible(false);
        susadd4.setVisible(false);
        susadd5.setVisible(false);
        susadd6.setVisible(false);
        susadd7.setVisible(false);
        susadd8.setVisible(false);
        susadd9.setVisible(false);
        susadd10.setVisible(false);
//        susadd11.setVisible(false);
//        susadd12.setVisible(false);

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
        jLabel3 = new javax.swing.JLabel();
        susadd1 = new javax.swing.JButton();
        susadd2 = new javax.swing.JButton();
        susadd3 = new javax.swing.JButton();
        susadd4 = new javax.swing.JButton();
        susadd5 = new javax.swing.JButton();
        susadd6 = new javax.swing.JButton();
        susadd7 = new javax.swing.JButton();
        susadd8 = new javax.swing.JButton();
        susadd9 = new javax.swing.JButton();
        susadd10 = new javax.swing.JButton();
        SaveSuspectDetails = new javax.swing.JButton();
        susname1 = new javax.swing.JTextField();
        susname2 = new javax.swing.JTextField();
        susname3 = new javax.swing.JTextField();
        susname4 = new javax.swing.JTextField();
        susname5 = new javax.swing.JTextField();
        susname6 = new javax.swing.JTextField();
        susname7 = new javax.swing.JTextField();
        susname8 = new javax.swing.JTextField();
        susname9 = new javax.swing.JTextField();
        susname10 = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Suspect Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        susadd1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        susadd1.setText("+");
        susadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susadd1ActionPerformed(evt);
            }
        });
        jPanel1.add(susadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        susadd2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        susadd2.setText("+");
        susadd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susadd2ActionPerformed(evt);
            }
        });
        jPanel1.add(susadd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        susadd3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        susadd3.setText("+");
        susadd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susadd3ActionPerformed(evt);
            }
        });
        jPanel1.add(susadd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        susadd4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        susadd4.setText("+");
        susadd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susadd4ActionPerformed(evt);
            }
        });
        jPanel1.add(susadd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        susadd5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        susadd5.setText("+");
        susadd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susadd5ActionPerformed(evt);
            }
        });
        jPanel1.add(susadd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        susadd6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        susadd6.setText("+");
        susadd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susadd6ActionPerformed(evt);
            }
        });
        jPanel1.add(susadd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        susadd7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        susadd7.setText("+");
        susadd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susadd7ActionPerformed(evt);
            }
        });
        jPanel1.add(susadd7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        susadd8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        susadd8.setText("+");
        susadd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susadd8ActionPerformed(evt);
            }
        });
        jPanel1.add(susadd8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        susadd9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        susadd9.setText("+");
        susadd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susadd9ActionPerformed(evt);
            }
        });
        jPanel1.add(susadd9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        susadd10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        susadd10.setText("+");
        susadd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susadd10ActionPerformed(evt);
            }
        });
        jPanel1.add(susadd10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, -1));

        SaveSuspectDetails.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SaveSuspectDetails.setBorderPainted(false);
        SaveSuspectDetails.setContentAreaFilled(false);
        SaveSuspectDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveSuspectDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(SaveSuspectDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 110, 60));

        susname1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(susname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 210, 30));

        susname2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(susname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 210, 30));

        susname3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(susname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 210, 30));

        susname4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(susname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 210, 30));

        susname5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(susname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 210, 30));

        susname6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(susname6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 210, 30));

        susname7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(susname7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 210, 30));

        susname8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(susname8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 210, 30));

        susname9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(susname9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 210, 30));

        susname10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(susname10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 210, 30));

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/suspect.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 540, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void susadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susadd1ActionPerformed

        try {

            String name = susname1.getText();

            pst = conn.prepareStatement("insert into suspect(suspect_name,fir_id,crime_id) values(?,?,?)");

            pst.setString(1, name);
            pst.setString(2, firid);
            pst.setString(3, crimeid);

            int k = pst.executeUpdate();

            susadd1.setVisible(false);
            susadd2.setVisible(true);

            susname2.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_susadd1ActionPerformed

    private void susadd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susadd2ActionPerformed

        try {
            String name = susname2.getText();

            pst = conn.prepareStatement("insert into suspect(suspect_name,fir_id,crime_id) values(?,?,?)");

            pst.setString(1, name);
            pst.setString(2, firid);
            pst.setString(3, crimeid);

            int k = pst.executeUpdate();

            susadd2.setVisible(false);
            susadd3.setVisible(true);

            susname3.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_susadd2ActionPerformed

    private void susadd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susadd3ActionPerformed

        try {
            String name = susname3.getText();

            pst = conn.prepareStatement("insert into suspect(suspect_name,fir_id,crime_id) values(?,?,?)");

            pst.setString(1, name);
            pst.setString(2, firid);
            pst.setString(3, crimeid);

            int k = pst.executeUpdate();

            susadd3.setVisible(false);
            susadd4.setVisible(true);

            susname4.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_susadd3ActionPerformed

    private void susadd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susadd4ActionPerformed

        try {
            String name = susname4.getText();

            pst = conn.prepareStatement("insert into suspect(suspect_name,fir_id,crime_id) values(?,?,?)");

            pst.setString(1, name);
            pst.setString(2, firid);
            pst.setString(3, crimeid);

            int k = pst.executeUpdate();

            susadd4.setVisible(false);
            susadd5.setVisible(true);

            susname5.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_susadd4ActionPerformed

    private void susadd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susadd5ActionPerformed

        try {
            String name = susname5.getText();

            pst = conn.prepareStatement("insert into suspect(suspect_name,fir_id,crime_id) values(?,?,?)");

            pst.setString(1, name);
            pst.setString(2, crimeid);
            pst.setString(3, firid);

            int k = pst.executeUpdate();

            susadd5.setVisible(false);
            susadd6.setVisible(true);

            susname6.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_susadd5ActionPerformed

    private void susadd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susadd6ActionPerformed

        try {
            String name = susname6.getText();

            pst = conn.prepareStatement("insert into suspect(suspect_name,fir_id,crime_id) values(?,?,?)");

            pst.setString(1, name);
            pst.setString(2, firid);
            pst.setString(3, crimeid);

            int k = pst.executeUpdate();

            susadd6.setVisible(false);
            susadd7.setVisible(true);

            susname7.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_susadd6ActionPerformed

    private void susadd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susadd7ActionPerformed

        try {
            String name = susname7.getText();

            pst = conn.prepareStatement("insert into suspect(suspect_name,fir_id,crime_id) values(?,?,?)");

            pst.setString(1, name);
            pst.setString(2, firid);
            pst.setString(3, crimeid);

            int k = pst.executeUpdate();

            susadd7.setVisible(false);
            susadd8.setVisible(true);

            susname8.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_susadd7ActionPerformed

    private void susadd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susadd8ActionPerformed

        try {
            String name = susname8.getText();

            pst = conn.prepareStatement("insert into suspect(suspect_name,fir_id,crime_id) values(?,?,?)");

            pst.setString(1, name);
            pst.setString(2, firid);
            pst.setString(3, crimeid);

            int k = pst.executeUpdate();

            susadd8.setVisible(false);
            susadd9.setVisible(true);

            susname9.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_susadd8ActionPerformed

    private void susadd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susadd9ActionPerformed

        try {
            String name = susname9.getText();

            pst = conn.prepareStatement("insert into suspect(suspect_name,fir_id,crime_id) values(?,?,?)");

            pst.setString(1, name);
            pst.setString(2, firid);
            pst.setString(3, crimeid);

            int k = pst.executeUpdate();

            susadd9.setVisible(false);
            susadd10.setVisible(true);
            susname10.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_susadd9ActionPerformed

    private void susadd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susadd10ActionPerformed

        try {
            String name = susname10.getText();

            pst = conn.prepareStatement("insert into suspect(suspect_name,fir_id,crime_id) values(?,?,?)");

            pst.setString(1, name);
            pst.setString(2, firid);
            pst.setString(3, crimeid);

            int k = pst.executeUpdate();

            susadd10.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_susadd10ActionPerformed

    private void SaveSuspectDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveSuspectDetailsActionPerformed
        try {
            // TODO add your handling code here:

            this.toBack();
            this.setVisible(false);
            new FIRform().toFront();

            //JOptionPane.showMessageDialog(this, "Changes Saved.");
        } catch (SQLException ex) {
            Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveSuspectDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(SuspectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuspectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuspectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuspectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SuspectDetails().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SuspectDetails.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SaveSuspectDetails;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton susadd1;
    private javax.swing.JButton susadd10;
    private javax.swing.JButton susadd2;
    private javax.swing.JButton susadd3;
    private javax.swing.JButton susadd4;
    private javax.swing.JButton susadd5;
    private javax.swing.JButton susadd6;
    private javax.swing.JButton susadd7;
    private javax.swing.JButton susadd8;
    private javax.swing.JButton susadd9;
    private javax.swing.JTextField susname1;
    private javax.swing.JTextField susname10;
    private javax.swing.JTextField susname2;
    private javax.swing.JTextField susname3;
    private javax.swing.JTextField susname4;
    private javax.swing.JTextField susname5;
    private javax.swing.JTextField susname6;
    private javax.swing.JTextField susname7;
    private javax.swing.JTextField susname8;
    private javax.swing.JTextField susname9;
    // End of variables declaration//GEN-END:variables
}
