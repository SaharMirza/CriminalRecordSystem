/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminalrecordsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class firdetails extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst, pst2, pst3,pst4;
    ResultSet rs, rs2, rs3,rs4;
    DefaultTableModel Model,Model1;
            String fid;

    public firdetails() throws SQLException {
        initComponents();
        Connect();

    }

    public firdetails(String id) throws SQLException {
        fid = id;
        System.out.println(fid);
        initComponents();
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

            FIRID.setText(fid);
            pst = conn.prepareStatement("select * from FIR where FIR_ID = ?");

            pst.setString(1, fid);
            rs = pst.executeQuery();
            if (rs.next()) {
                String FIR_location = rs.getString("FIR_LOCATION");
                String officerid = rs.getString("OFFICER_ID");
                String crime_id = rs.getString("CRIME_ID");
                String fir_date = rs.getString("FIR_DATE");
                String desc = rs.getString("INCIDENT_DESCRIPTION");
                String fir_status = rs.getString("FIR_STATUS");

                Officerid.setText(officerid);
                FIRDate.setText(fir_date.substring(0, 11));
                FIRLocation.setText(FIR_location);
                FIRCrime.setText(crime_id);
                FIRStatus.setText(fir_status);
                FIRDesc.setText(desc);

            }

            pst2 = conn.prepareStatement("select * from person where person_ID = (select person_id from person_involvement where complaint = '1' AND fir_id =?)");

            pst2.setString(1, fid);
            rs2 = pst2.executeQuery();
            if (rs2.next()) {
                String Name = rs2.getString("Person_Name");
                String CNIC = rs2.getString("Person_CNIC");
                String Age = rs2.getString("Person_Age");
                String Address = rs2.getString("Person_Address");
                String Province = rs2.getString("Person_Province");
                String FatherName = rs2.getString("Person_Fathername");
                String Gender = rs2.getString("Person_Gender");
                String Phoneno = rs2.getString("Person_Phoneno");
                String Nationality = rs2.getString("Person_Nationality");

                CriminalName1.setText(Name);
                CriminalGender.setText(Gender);
                CriminalAge.setText(Age);
                CriminalCNIC.setText(CNIC);
                CriminalPhoneNo.setText(Phoneno);
                CriminalAddress.setText(Address);
                CriminalFatherName.setText(FatherName);
                CriminalNationality.setText(Nationality);
                CriminalProvince.setText(Province);

                pst3 = conn.prepareStatement("select suspect_name from suspect where fir_id = ?");
                pst3.setString(1, fid);
                rs3 = pst3.executeQuery();
                while (rs3.next()) {
                    String name = rs3.getString("suspect_name");
                    
                    String tbData[] = {name};
                    Model = (DefaultTableModel) jTable1.getModel();
                    Model.addRow(tbData);

                }
            }
            
            pst4 = conn.prepareStatement("select * from person where person_ID IN (select person_id from person_involvement where Victim = '1' AND fir_id =?)");

            pst4.setString(1, fid);
            rs4 = pst4.executeQuery();
            while (rs4.next()) {
                String VName = rs4.getString("Person_Name");
                String VCNIC = rs4.getString("Person_CNIC");
                String VAge = rs4.getString("Person_Age");
                String VAddress = rs4.getString("Person_Address");
                String VProvince = rs4.getString("Person_Province");
                String VFatherName = rs4.getString("Person_Fathername");
                String VGender = rs4.getString("Person_Gender");
                String VPhoneno = rs4.getString("Person_Phoneno");
                String VNationality = rs4.getString("Person_Nationality");
                String tbData1[] = {VName,VGender,VAge,VCNIC,VPhoneno,VAddress,VProvince,VFatherName,VNationality,VProvince};
                Model1 = (DefaultTableModel) jTable2.getModel();
                Model1.addRow(tbData1);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(firdetails.class.getName()).log(Level.SEVERE, null, ex);
        }
           

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        FIRDate = new javax.swing.JTextField();
        FIRID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        FIRLocation = new javax.swing.JTextField();
        FIRDesc = new javax.swing.JTextField();
        FIRCrime = new javax.swing.JTextField();
        FIRStatus = new javax.swing.JTextField();
        Officerid = new javax.swing.JTextField();
        CriminalAge = new javax.swing.JTextField();
        CriminalCNIC = new javax.swing.JTextField();
        CriminalPhoneNo = new javax.swing.JTextField();
        CriminalAddress = new javax.swing.JTextField();
        CriminalFatherName = new javax.swing.JTextField();
        CriminalNationality = new javax.swing.JTextField();
        CriminalProvince = new javax.swing.JTextField();
        CriminalGender = new javax.swing.JTextField();
        CriminalName1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Suspect Names"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 160, 310));

        FIRDate.setBackground(new java.awt.Color(255, 255, 255));
        FIRDate.setForeground(new java.awt.Color(255, 255, 255));
        FIRDate.setBorder(null);
        FIRDate.setCaretColor(new java.awt.Color(255, 255, 255));
        FIRDate.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FIRDate.setEnabled(false);
        getContentPane().add(FIRDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, 110, -1));
        getContentPane().add(FIRID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 74, 80, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "Age", "CNIC", "Phone no.", "Address", "Father Name", "Nationality ", "Province"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 1080, 120));

        Back.setBackground(new java.awt.Color(255, 255, 255));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        FIRLocation.setBackground(new java.awt.Color(255, 255, 255));
        FIRLocation.setForeground(new java.awt.Color(255, 255, 255));
        FIRLocation.setBorder(null);
        FIRLocation.setCaretColor(new java.awt.Color(255, 255, 255));
        FIRLocation.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FIRLocation.setEnabled(false);
        getContentPane().add(FIRLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 110, -1));

        FIRDesc.setBackground(new java.awt.Color(255, 255, 255));
        FIRDesc.setForeground(new java.awt.Color(0, 0, 0));
        FIRDesc.setBorder(null);
        FIRDesc.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(FIRDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 380, 80));

        FIRCrime.setBackground(new java.awt.Color(255, 255, 255));
        FIRCrime.setForeground(new java.awt.Color(255, 255, 255));
        FIRCrime.setBorder(null);
        FIRCrime.setCaretColor(new java.awt.Color(255, 255, 255));
        FIRCrime.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FIRCrime.setEnabled(false);
        getContentPane().add(FIRCrime, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 110, -1));

        FIRStatus.setBackground(new java.awt.Color(255, 255, 255));
        FIRStatus.setForeground(new java.awt.Color(255, 255, 255));
        FIRStatus.setBorder(null);
        FIRStatus.setCaretColor(new java.awt.Color(255, 255, 255));
        FIRStatus.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        FIRStatus.setEnabled(false);
        getContentPane().add(FIRStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 110, -1));

        Officerid.setBackground(new java.awt.Color(255, 255, 255));
        Officerid.setForeground(new java.awt.Color(255, 255, 255));
        Officerid.setBorder(null);
        Officerid.setCaretColor(new java.awt.Color(255, 255, 255));
        Officerid.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Officerid.setEnabled(false);
        getContentPane().add(Officerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 110, -1));

        CriminalAge.setBackground(new java.awt.Color(255, 255, 255));
        CriminalAge.setForeground(new java.awt.Color(255, 255, 255));
        CriminalAge.setBorder(null);
        CriminalAge.setCaretColor(new java.awt.Color(255, 255, 255));
        CriminalAge.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CriminalAge.setEnabled(false);
        getContentPane().add(CriminalAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 140, -1));

        CriminalCNIC.setBackground(new java.awt.Color(255, 255, 255));
        CriminalCNIC.setForeground(new java.awt.Color(255, 255, 255));
        CriminalCNIC.setBorder(null);
        CriminalCNIC.setCaretColor(new java.awt.Color(255, 255, 255));
        CriminalCNIC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CriminalCNIC.setEnabled(false);
        getContentPane().add(CriminalCNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 140, -1));

        CriminalPhoneNo.setBackground(new java.awt.Color(255, 255, 255));
        CriminalPhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        CriminalPhoneNo.setBorder(null);
        CriminalPhoneNo.setCaretColor(new java.awt.Color(255, 255, 255));
        CriminalPhoneNo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CriminalPhoneNo.setEnabled(false);
        getContentPane().add(CriminalPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 140, -1));

        CriminalAddress.setBackground(new java.awt.Color(255, 255, 255));
        CriminalAddress.setForeground(new java.awt.Color(255, 255, 255));
        CriminalAddress.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CriminalAddress.setBorder(null);
        CriminalAddress.setCaretColor(new java.awt.Color(255, 255, 255));
        CriminalAddress.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CriminalAddress.setEnabled(false);
        getContentPane().add(CriminalAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, -1));

        CriminalFatherName.setBackground(new java.awt.Color(255, 255, 255));
        CriminalFatherName.setForeground(new java.awt.Color(255, 255, 255));
        CriminalFatherName.setBorder(null);
        CriminalFatherName.setCaretColor(new java.awt.Color(255, 255, 255));
        CriminalFatherName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CriminalFatherName.setEnabled(false);
        getContentPane().add(CriminalFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 140, -1));

        CriminalNationality.setBackground(new java.awt.Color(255, 255, 255));
        CriminalNationality.setForeground(new java.awt.Color(255, 255, 255));
        CriminalNationality.setBorder(null);
        CriminalNationality.setCaretColor(new java.awt.Color(255, 255, 255));
        CriminalNationality.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CriminalNationality.setEnabled(false);
        getContentPane().add(CriminalNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 140, -1));

        CriminalProvince.setBackground(new java.awt.Color(255, 255, 255));
        CriminalProvince.setForeground(new java.awt.Color(255, 255, 255));
        CriminalProvince.setBorder(null);
        CriminalProvince.setCaretColor(new java.awt.Color(255, 255, 255));
        CriminalProvince.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CriminalProvince.setEnabled(false);
        getContentPane().add(CriminalProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 140, -1));

        CriminalGender.setBackground(new java.awt.Color(255, 255, 255));
        CriminalGender.setForeground(new java.awt.Color(255, 255, 255));
        CriminalGender.setBorder(null);
        CriminalGender.setCaretColor(new java.awt.Color(255, 255, 255));
        CriminalGender.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CriminalGender.setEnabled(false);
        getContentPane().add(CriminalGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 140, -1));

        CriminalName1.setBackground(new java.awt.Color(255, 255, 255));
        CriminalName1.setForeground(new java.awt.Color(255, 255, 255));
        CriminalName1.setBorder(null);
        CriminalName1.setCaretColor(new java.awt.Color(255, 255, 255));
        CriminalName1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CriminalName1.setEnabled(false);
        getContentPane().add(CriminalName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/firsearch.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1190, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        try {
            FIR_Records FR = new FIR_Records();
            this.setVisible(false);
            FR.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(firdetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(firdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new firdetails().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(firdetails.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField CriminalAddress;
    private javax.swing.JTextField CriminalAge;
    private javax.swing.JTextField CriminalCNIC;
    private javax.swing.JTextField CriminalFatherName;
    private javax.swing.JTextField CriminalGender;
    private javax.swing.JTextField CriminalName1;
    private javax.swing.JTextField CriminalNationality;
    private javax.swing.JTextField CriminalPhoneNo;
    private javax.swing.JTextField CriminalProvince;
    private javax.swing.JTextField FIRCrime;
    private javax.swing.JTextField FIRDate;
    private javax.swing.JTextField FIRDesc;
    private javax.swing.JTextField FIRID;
    private javax.swing.JTextField FIRLocation;
    private javax.swing.JTextField FIRStatus;
    private javax.swing.JTextField Officerid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
