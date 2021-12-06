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
public class CrimeStatistics extends javax.swing.JFrame {

    /**
     * Creates new form CrimeStatistics
     */
    Connection conn;
    PreparedStatement pst, pst2;
    ResultSet rs, rs2;

    public CrimeStatistics() throws SQLException {
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

            pst = conn.prepareStatement("select count(fir_id) from fir where crime_id = 1");
            rs = pst.executeQuery();
            while (rs.next()) {
                murdercases.setText(rs.getString("count(fir_id)") + " Cases");
            }

            pst = conn.prepareStatement("select count(fir_id) from fir where crime_id = 2");
            rs = pst.executeQuery();
            while (rs.next()) {
                Rape.setText(rs.getString("count(fir_id)") + " Cases");
            }

            pst = conn.prepareStatement("select count(fir_id) from fir where crime_id = 3");
            rs = pst.executeQuery();
            while (rs.next()) {
                kidnapping.setText(rs.getString("count(fir_id)") + " Cases");
            }

            pst = conn.prepareStatement("select count(fir_id) from fir where crime_id = 4");
            rs = pst.executeQuery();
            while (rs.next()) {
                burglary.setText(rs.getString("count(fir_id)") + " Cases");
            }

            pst = conn.prepareStatement("select count(fir_id) from fir where crime_id = 5");
            rs = pst.executeQuery();
            while (rs.next()) {
                CarTheft.setText(rs.getString("count(fir_id)") + " Cases");
            }

            pst = conn.prepareStatement("select count(fir_id) from fir where crime_id = 8");
            rs = pst.executeQuery();
            while (rs.next()) {
                humantrafficking.setText(rs.getString("count(fir_id)") + " Cases");
            }

            pst = conn.prepareStatement("select count(fir_id) from fir where crime_id = 7");
            rs = pst.executeQuery();
            while (rs.next()) {
                smuggling.setText(rs.getString("count(fir_id)") + " Cases");
            }

            pst = conn.prepareStatement("select count(fir_id) from fir where crime_id = 9");
            rs = pst.executeQuery();
            while (rs.next()) {
                sexualAssualt.setText(rs.getString("count(fir_id)") + " Cases");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CrimeStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void scaleimage() {
        ImageIcon icon1 = new ImageIcon("editprofile.jpg");
        ImageIcon icon2 = new ImageIcon("fir form.png");
        ImageIcon icon3 = new ImageIcon("firRecord.png");
        ImageIcon icon4 = new ImageIcon("criminalrecord.png");
        ImageIcon icon5 = new ImageIcon("crimestatistics.png");
        ImageIcon icon6 = new ImageIcon("police_badge_PNG72.png");
        ImageIcon icon7 = new ImageIcon("Karachi-Mazar-E-Quaid-1024x1024.png");
        ImageIcon icon8 = new ImageIcon("Lahore-Minar-E-Pakistan-1024x1024.png");
        ImageIcon icon9 = new ImageIcon("Balochistan.jpeg");
        ImageIcon icon10 = new ImageIcon("cartheft.png");
        ImageIcon icon11 = new ImageIcon("humantraficking.png");
        ImageIcon icon12 = new ImageIcon("rapecases.png");
        ImageIcon icon13 = new ImageIcon("residentialrobbery.png");
        ImageIcon icon14 = new ImageIcon("roberyat.png");
        ImageIcon icon15 = new ImageIcon("kpk.PNG");

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
//        //sindh
//        Image img7=icon7.getImage();
//        Image imgscale7=img7.getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage7 = new ImageIcon(imgscale7);
//        jLabel15.setIcon(scaledImage7);
//        //punjab
//        Image img8=icon8.getImage();
//        Image imgscale8=img8.getScaledInstance(jLabel22.getWidth(), jLabel22.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage8 = new ImageIcon(imgscale8);
//        jLabel22.setIcon(scaledImage8);
//        //balochistan
//        Image img9=icon9.getImage();
//        Image imgscale9=img9.getScaledInstance(jLabel56.getWidth(), jLabel56.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage9 = new ImageIcon(imgscale9);
//        jLabel56.setIcon(scaledImage9);
//        //car theft
//        Image img10=icon10.getImage();
//        Image imgscale10=img10.getScaledInstance(jLabel24.getWidth(), jLabel24.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage10 = new ImageIcon(imgscale10);
//        jLabel24.setIcon(scaledImage10);
//        //human trafficking
//        Image img11=icon11.getImage();
//        Image imgscale11=img11.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage11 = new ImageIcon(imgscale11);
//        jLabel1.setIcon(scaledImage11);
//        //rape cases
//        Image img12=icon12.getImage();
//        Image imgscale12=img12.getScaledInstance(jLabel23.getWidth(), jLabel23.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage12 = new ImageIcon(imgscale12);
//        jLabel23.setIcon(scaledImage12);
//        //residential robbery
//        Image img13=icon13.getImage();
//        Image imgscale13=img13.getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage13 = new ImageIcon(imgscale13);
//        jLabel29.setIcon(scaledImage13);
//        //non residential robbery
//        Image img14=icon14.getImage();
//        Image imgscale14=img14.getScaledInstance(jLabel30.getWidth(), jLabel30.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage14 = new ImageIcon(imgscale14);
//        jLabel30.setIcon(scaledImage14);
//        //kpk 
//         Image img15=icon15.getImage();
//        Image imgscale15=img15.getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage15 = new ImageIcon(imgscale15);
//        jLabel31.setIcon(scaledImage15);
//        
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
        FIRForm = new javax.swing.JButton();
        FIRRecords = new javax.swing.JButton();
        CriminalRecords = new javax.swing.JButton();
        CriminalStatistics = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CarTheft = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        murdercases = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        burglary = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cartheft = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Rape = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        sexualAssualt = new javax.swing.JLabel();
        humantrafficking = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        smuggling = new javax.swing.JLabel();
        kidnapping = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(EditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 190, 60));

        FIRForm.setBackground(new java.awt.Color(204, 204, 204));
        FIRForm.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        FIRForm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FIRForm.setBorderPainted(false);
        FIRForm.setContentAreaFilled(false);
        FIRForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIRFormActionPerformed(evt);
            }
        });
        jPanel1.add(FIRForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 190, 60));

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
        jPanel1.add(FIRRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 190, 60));

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
        jPanel1.add(CriminalRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 220, 60));

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
        jPanel1.add(CriminalStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 210, 60));

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
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 170, 60));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("CRIME STATISTICS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setText("HUMAN TRAFFICKING");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, -1));

        CarTheft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CarTheft.setText("5,800 Cases");
        jPanel1.add(CarTheft, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        jLabel23.setBackground(new java.awt.Color(153, 153, 153));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rapecases.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 50, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartheft.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 50, 50));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel25.setText("MURDER");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        murdercases.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        murdercases.setText("20,000 cases");
        jPanel1.add(murdercases, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/humantraficking.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 50, 50));

        burglary.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        burglary.setText("1,000 cases");
        jPanel1.add(burglary, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smuggling.png"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 50, 50));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burglary.png"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 50, 50));

        cartheft.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cartheft.setText("CAR THEFT");
        jPanel1.add(cartheft, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel34.setText("RAPE");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, -1, -1));

        Rape.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Rape.setText("30 Cases");
        jPanel1.add(Rape, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel36.setText("SEXUAL ASSAULT");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, -1, -1));

        sexualAssualt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sexualAssualt.setText("60 Cases");
        jPanel1.add(sexualAssualt, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, -1, -1));

        humantrafficking.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        humantrafficking.setText("40 Cases");
        jPanel1.add(humantrafficking, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel39.setText("SMUGGLING");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, 20));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel40.setText("BURGLARY");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, -1, 20));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel42.setText("KIDNAPPING");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, -1, -1));

        smuggling.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        smuggling.setText("3,000 cases");
        jPanel1.add(smuggling, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        kidnapping.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kidnapping.setText("10,000 Cases");
        jPanel1.add(kidnapping, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, -1, -1));
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/murder.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 50, 50));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sexualharassment.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 60, 50));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kidnapping.png"))); // NOI18N
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 650, 350));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/crimestats.PNG"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 1200, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1340, 650));
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileActionPerformed
        try {
            this.toBack();
            this.setVisible(false);            
            new EditProfile().toFront();
        } catch (SQLException ex) {
            Logger.getLogger(CrimeStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditProfileActionPerformed

    private void FIRFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIRFormActionPerformed
        try {
            dispose();
            FIRform F1 = new FIRform();
            F1.setLocationRelativeTo(null);
            F1.setVisible(true);
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(CrimeStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FIRFormActionPerformed

    private void FIRRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIRRecordsActionPerformed
        try {
            dispose();
            FIR_Records F2 = new FIR_Records();
            F2.setLocationRelativeTo(null);
            F2.setVisible(true);
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(CrimeStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FIRRecordsActionPerformed

    private void CriminalRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalRecordsActionPerformed
        try {
            dispose();
            CriminalRecords cr = new CriminalRecords();
            cr.setLocationRelativeTo(null);
            cr.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CrimeStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CriminalRecordsActionPerformed

    private void CriminalStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalStatisticsActionPerformed
       
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
            java.util.logging.Logger.getLogger(CrimeStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrimeStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrimeStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrimeStatistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CrimeStatistics().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CrimeStatistics.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarTheft;
    private javax.swing.JButton CriminalRecords;
    private javax.swing.JButton CriminalStatistics;
    private javax.swing.JButton EditProfile;
    private javax.swing.JButton FIRForm;
    private javax.swing.JButton FIRRecords;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Rape;
    private javax.swing.JLabel burglary;
    private javax.swing.JLabel cartheft;
    private javax.swing.JLabel humantrafficking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kidnapping;
    private javax.swing.JLabel murdercases;
    private javax.swing.JLabel sexualAssualt;
    private javax.swing.JLabel smuggling;
    // End of variables declaration//GEN-END:variables
}
