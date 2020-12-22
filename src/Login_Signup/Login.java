/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Signup;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author vimle
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Panel = new javax.swing.JPanel();
        L_background = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        register_btn = new javax.swing.JButton();
        head = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        submit_btn = new javax.swing.JButton();
        u_sep = new javax.swing.JSeparator();
        p_sep = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        password_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setIconImage(new ImageIcon(getClass().getResource("/Login_Signup/logo.png")).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(744, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L_background.setBackground(new java.awt.Color(123, 14, 123));
        L_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Signup/lib.jpg"))); // NOI18N
        L_background.setOpaque(true);
        L_Panel.add(L_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 500));

        getContentPane().add(L_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register_btn.setBackground(new java.awt.Color(0, 0, 0));
        register_btn.setText("not yet registered? Register Now");
        register_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 14, 123), 1, true));
        register_btn.setBorderPainted(false);
        register_btn.setContentAreaFilled(false);
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });
        Login.add(register_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 250, 30));

        head.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        head.setText("Login");
        Login.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 50));

        username.setBackground(new java.awt.Color(255,255,255,0));
        username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        username.setBorder(null);
        username.setOpaque(false);
        Login.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 240, 40));

        submit_btn.setBackground(new java.awt.Color(255, 255, 255));
        submit_btn.setForeground(new java.awt.Color(51, 51, 51));
        submit_btn.setText("Submit");
        submit_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 14, 123), 1, true));
        submit_btn.setBorderPainted(false);
        submit_btn.setContentAreaFilled(false);
        submit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submit_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                submit_btnMouseReleased(evt);
            }
        });
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        Login.add(submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 130, 30));

        u_sep.setBackground(new java.awt.Color(0, 0, 0));
        u_sep.setForeground(new java.awt.Color(0, 0, 0));
        u_sep.setPreferredSize(new java.awt.Dimension(0, 1));
        Login.add(u_sep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 240, 10));

        p_sep.setBackground(new java.awt.Color(0, 0, 0));
        p_sep.setForeground(new java.awt.Color(0, 0, 0));
        Login.add(p_sep, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 240, 10));

        password.setBackground(new java.awt.Color(255,255,255,0));
        password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        password.setBorder(null);
        password.setOpaque(false);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        Login.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 240, 40));

        password_label.setLabelFor(password);
        password_label.setText("Password");
        Login.add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, 30));

        username_label.setBackground(new java.awt.Color(0, 0, 0));
        username_label.setLabelFor(username);
        username_label.setText("Username");
        Login.add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Signup/background.jpg"))); // NOI18N
        Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 350, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        new Signup().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_register_btnActionPerformed

    private void submit_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit_btnMousePressed
        submit_btn.setBackground(new java.awt.Color(123, 14, 123));
        submit_btn.setForeground(Color.WHITE);
        submit_btn.setOpaque(true);
    }//GEN-LAST:event_submit_btnMousePressed

    private void submit_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit_btnMouseReleased
        submit_btn.setBackground(Color.WHITE);
        submit_btn.setForeground(new java.awt.Color(123, 14, 123));
    }//GEN-LAST:event_submit_btnMouseReleased

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        String user = username.getText();
        char[] pass = password.getPassword();
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/library_management","root","0000");
            PreparedStatement log=con.prepareStatement("select username from users where username = ? && password = ?;");
            log.setString(1, user);
            log.setString(2, String.valueOf(pass));
            ResultSet rs = log.executeQuery();
            if(rs.next()){
                new dashboard.home(user).setVisible(true);
                dispose();
            }
            else
                JOptionPane.showMessageDialog(this, "Login Failed","Alert",JOptionPane.ERROR_MESSAGE);
            
            }catch(ClassNotFoundException | SQLException e){ System.out.println(e);}
    }//GEN-LAST:event_submit_btnActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
                new Login().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel L_Panel;
    private javax.swing.JLabel L_background;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator p_sep;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel password_label;
    private javax.swing.JButton register_btn;
    private javax.swing.JButton submit_btn;
    private javax.swing.JSeparator u_sep;
    private javax.swing.JTextField username;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
