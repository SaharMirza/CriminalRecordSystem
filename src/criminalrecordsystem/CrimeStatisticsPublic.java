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

/**
 *
 * @author HP
 */
public class CrimeStatisticsPublic extends javax.swing.JFrame {

    /**
     * Creates new form CrimeStatisticsPublic
     */
    Connection conn;
    PreparedStatement pst, pst2;
    ResultSet rs, rs2;
    
    public CrimeStatisticsPublic() throws SQLException {
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
            Logger.getLogger(CrimeStatisticsPublic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void scaleimage(){
//         ImageIcon icon6=new ImageIcon("police_badge_PNG72.png");
//        ImageIcon icon7=new ImageIcon("Karachi-Mazar-E-Quaid-1024x1024.png");
//        ImageIcon icon8=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\Lahore-Minar-E-Pakistan-1024x1024.png");
//        ImageIcon icon9=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\Balochistan.jpeg");
//        ImageIcon icon10=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\cartheft.png");
//        ImageIcon icon11=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\humantraficking.png");
//        ImageIcon icon12=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\rapecases.png");
//        ImageIcon icon13=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\residentialrobbery.png");
//        ImageIcon icon14=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\roberyat.png");
//        ImageIcon icon15=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\kpk.PNG");
//
//
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
//        Image imgscale9=img9.getScaledInstance(jLabel31.getWidth(), jLabel31.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage9 = new ImageIcon(imgscale9);
//        jLabel31.setIcon(scaledImage9);
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
//        Image imgscale15=img15.getScaledInstance(jLabel51.getWidth(), jLabel51.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage15 = new ImageIcon(imgscale15);
//        jLabel51.setIcon(scaledImage15);
//        
//        ImageIcon icon100=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\back.png");
//        //back
//        Image img100=icon100.getImage();
//        Image imgscale100 =img100.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage100 = new ImageIcon(imgscale100);
//        back.setIcon(scaledImage100);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        murdercases = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        CarTheft = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        humantrafficking = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Rape = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        sexualAssualt = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        kidnapping = new javax.swing.JLabel();
        smuggling = new javax.swing.JLabel();
        burglary = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 90));

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 650));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police_badge_PNG72.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 100, 90));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartheft.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 60, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/humantraficking.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 70, 60));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smuggling.png"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 60, 50));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/burglary.png"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 60, 60));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rapecases.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 60, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel2.setText("National Criminal Record");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel3.setText("CRIME STATISTICS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel25.setText("MURDER");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        murdercases.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        murdercases.setText("20,000 cases");
        jPanel1.add(murdercases, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel32.setText("CAR THEFT");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        CarTheft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CarTheft.setText("5,800 Cases");
        jPanel1.add(CarTheft, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setText("HUMAN TRAFFICKING");
        jLabel12.setToolTipText("");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        humantrafficking.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        humantrafficking.setText("40 Cases");
        jPanel1.add(humantrafficking, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel34.setText("RAPE");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, -1, -1));

        Rape.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Rape.setText("30 Cases");
        jPanel1.add(Rape, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel36.setText("SEXUAL ASSAULT");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        sexualAssualt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sexualAssualt.setText("60 Cases");
        jPanel1.add(sexualAssualt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel42.setText("KIDNAPPING");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        kidnapping.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kidnapping.setText("10,000 Cases");
        jPanel1.add(kidnapping, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        smuggling.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        smuggling.setText("3000 Cases");
        jPanel1.add(smuggling, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, -1, -1));

        burglary.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        burglary.setText("1000 Cases");
        jPanel1.add(burglary, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/murder.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 50, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sexualharassment.jpg"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kidnapping.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel39.setText("SMUGGLING");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, -1, 20));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel40.setText("BURGLARY");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 430, -1, 20));

        jLabel47.setBackground(new java.awt.Color(204, 204, 204));
        jLabel47.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel47.setOpaque(true);
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 980, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        HomePage e=new HomePage();
        e.setLocationRelativeTo(null);
        e.setVisible(true);
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
            java.util.logging.Logger.getLogger(CrimeStatisticsPublic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrimeStatisticsPublic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrimeStatisticsPublic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrimeStatisticsPublic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CrimeStatisticsPublic().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CrimeStatisticsPublic.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarTheft;
    private javax.swing.JLabel Rape;
    private javax.swing.JButton back;
    private javax.swing.JLabel burglary;
    private javax.swing.JLabel humantrafficking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kidnapping;
    private javax.swing.JLabel murdercases;
    private javax.swing.JLabel sexualAssualt;
    private javax.swing.JLabel smuggling;
    // End of variables declaration//GEN-END:variables
}
