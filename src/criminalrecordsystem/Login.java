/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminalrecordsystem;

/**
 *
 * @author hp
 */
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    String EmailAddress;
    String id;
    String userpassword;

    public Login() throws SQLException {
        initComponents();
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
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        Forgetpass = new javax.swing.JButton();
        PoliceID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 30));

        jPassword.setBorder(null);
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 360, 40));

        Forgetpass.setBorderPainted(false);
        Forgetpass.setContentAreaFilled(false);
        Forgetpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgetpassActionPerformed(evt);
            }
        });
        getContentPane().add(Forgetpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 200, 30));

        PoliceID.setBorder(null);
        PoliceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceIDActionPerformed(evt);
            }
        });
        getContentPane().add(PoliceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 360, 40));

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 280, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminalrecordsystem/LoginUI.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PoliceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliceIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoliceIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String sql = "SELECT * FROM Officer WHERE Officer_id = ? and password = ?";
        PreparedStatement statement;

        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, PoliceID.getText());
            statement.setString(2, jPassword.getText());
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                id = result.getString("Officer_id");
                dispose();
                EditProfile EP = new EditProfile();
                EP.setID(result.getString("Officer_ID"));
                EP.setLocationRelativeTo(null);
                EP.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Your Id or Password maybe wrong");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        HomePage HP = new HomePage();
        this.setVisible(false);
        HP.setLocationRelativeTo(null);
        HP.setVisible(true);
        
    }//GEN-LAST:event_backActionPerformed

    private void ForgetpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgetpassActionPerformed


        try {
            String sql = "SELECT * FROM Officer WHERE Officer_id = ? ";
            PreparedStatement statement;
            
            statement = conn.prepareStatement(sql);
            statement.setString(1, PoliceID.getText());
           
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                id = result.getString("Officer_id");
                userpassword = result.getString("Password");
                EmailAddress = result.getString("Email_Address");
            }
            
            /////// emailing
            String host = "smtp.gmail.com";
            String port = "587";
            final String username = "policestationproject@gmail.com";
            final String password = "PoliceProject";
            String to = EmailAddress;
            String subject = "Password Recovery";
            String message = "Your Password is " + userpassword;
            
            sendPlainTextEmail(host, port, username, password, to, subject, message);
            //jLabel13.setText("Booking Details have been emailed at:  " + cus.getAddress());
            JOptionPane.showMessageDialog(this,"Password has been emailed at:  " + EmailAddress);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void sendPlainTextEmail(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message) throws AddressException,
            MessagingException {

        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
// * BEGIN CHANGE
        properties.put("mail.smtp.user", userName);

        // creates a new session, no Authenticator (will connect() later)
        Session session = Session.getDefaultInstance(properties);
// * END CHANGE

        // creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = {new InternetAddress(toAddress)};
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        //msg.setSentDate(new Date());
        // set plain text message
        msg.setText(message);

// * BEGIN CHANGE
        // sends the e-mail
        Transport t = session.getTransport("smtp");
        t.connect(userName, password);
        t.sendMessage(msg, msg.getAllRecipients());
        t.close();
// * END CHANGE

    
        
        
        
        
        
        


        // TODO add your handling code here:
    }//GEN-LAST:event_ForgetpassActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Forgetpass;
    private javax.swing.JTextField PoliceID;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}
