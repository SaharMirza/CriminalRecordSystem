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
public class KPKCriminals extends javax.swing.JFrame {

     Connection conn;
    PreparedStatement pst, pst2;
    ResultSet rs, rs2;
    DefaultTableModel Model;
    /**
     * Creates new form KPKCrimes
     */
    public KPKCriminals() throws SQLException {
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
            pst = conn.prepareStatement("select person.person_name,crime.crime_name from person_involvement JOIN person on person_involvement.person_id = person.person_id join crime on crime.crime_id = person_involvement.crime_id  where person.person_province ='KPK'   AND person_involvement.criminal = '1'");
            rs = pst.executeQuery();
            while(rs.next()){
               
                String name = rs.getString("Person_name");                
                String crime_name = rs.getString("CRIME_NAME");                               
                            
                             
                String tbData[] = {name,crime_name};
                Model = (DefaultTableModel)jTable1.getModel();
                Model.addRow(tbData);
                
                
            }

           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(KPKCriminals.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void scaleimage(){
//    ImageIcon icon3=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\CriminalRecordSystem\\images\\police_badge_PNG72.png");
//        
//         Image img3=icon3.getImage();
//        Image imgscale3=img3.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledImage3 = new ImageIcon(imgscale3);
//        jLabel10.setIcon(scaledImage3);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Criminal Name", "Crime Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 980, 400));

        back.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/KPKCriminals.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1200, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        CriminalLog e=new CriminalLog();
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
            java.util.logging.Logger.getLogger(KPKCriminals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KPKCriminals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KPKCriminals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KPKCriminals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KPKCriminals().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KPKCriminals.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
