/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.Admin_DAO;
import DAO.Customer_DAO;
import DAO.Admin_DAO;
import DAO.Customer_DAO;
import Model.Admin;
import Model.Customer;
import Model.Role;
import Model.User;
import Utility.DBcontext;
import com.formdev.flatlaf.FlatDarkLaf;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Font;
import java.sql.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class SignIn extends javax.swing.JFrame {

    private Menu menu;
    private Admin_DAO serviceAdmin = new Admin_DAO();
    private Customer_DAO serviceCustomer = new Customer_DAO();

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sign in");
        placeHolder();
        design();
    }

    public void placeHolder() {
        txtEmail.setText("- Email");
        txtEmail.setForeground(Color.gray);
        txtPassword.setText("- Password");
        txtPassword.setForeground(Color.gray);
    }

    public void design() {
        btnSignIn.setFont(new Font("Arial", Font.BOLD, 16)); // Đặt font chữ
        btnSignIn.setForeground(Color.WHITE); // Màu chữ trắng
        btnSignIn.setBackground(new Color(0, 0, 0)); // Màu nền xanh
        btnSignIn.setFocusPainted(false); // Bỏ viền focus
        btnSignIn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        lblSignUp.setForeground(new Color(204, 204, 204));
        lblSignUp.setFont(new Font("segoe UI", Font.BOLD, 12));
        txtEmail.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        pnlSignIn.setBackground(new Color(102, 102, 102));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSignIn = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblSignUp = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        lblNotifi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(382, 336));
        setSize(new java.awt.Dimension(382, 336));

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUp.setText("Sign up");
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSignUpMouseExited(evt);
            }
        });

        btnSignIn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSignIn.setText("Sign in");
        btnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignInMouseExited(evt);
            }
        });
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSignInLayout = new javax.swing.GroupLayout(pnlSignIn);
        pnlSignIn.setLayout(pnlSignInLayout);
        pnlSignInLayout.setHorizontalGroup(
            pnlSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignInLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addGroup(pnlSignInLayout.createSequentialGroup()
                        .addComponent(lblNotifi, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblSignUp)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pnlSignInLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtPassword});

        pnlSignInLayout.setVerticalGroup(
            pnlSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignInLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pnlSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNotifi, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSignUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pnlSignInLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtPassword});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseEntered
        // TODO add your handling code here:
        lblSignUp.setForeground(new Color(255, 255, 255));
        lblSignUp.setFont(new Font("segoe UI", Font.BOLD, 12));
    }//GEN-LAST:event_lblSignUpMouseEntered

    private void lblSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseExited
        // TODO add your handling code here:
        lblSignUp.setForeground(new Color(204, 204, 204));
        lblSignUp.setFont(new Font("segoe UI", Font.BOLD, 12));
    }//GEN-LAST:event_lblSignUpMouseExited

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        Color stt = txtEmail.getForeground();
        if (stt == Color.GRAY) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.white);
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if (txtEmail.getText().isBlank()) {
            txtEmail.setText("- Email");
            txtEmail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        Color stt = txtPassword.getForeground();
        if (stt == Color.GRAY) {
            txtPassword.setText("");
            txtPassword.setForeground(Color.white);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        if (txtPassword.getText().isBlank()) {
            txtPassword.setText("- Password");
            txtPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void lblSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseClicked
        // TODO add your handling code here:
        dispose();
        SignUp signUp = new SignUp();
        signUp.setVisible(true);
    }//GEN-LAST:event_lblSignUpMouseClicked

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        // TODO add your handling code here:
        //Roles
        //------------------------------------
        User khanh = new User();
        Role admin = new Role();
        admin.setRoleName("admin");
        boolean isAdmin = false;
        boolean isCustomer = false;
        admin.addPermission("Read");
        admin.addPermission("Write");
        admin.addPermission("Delete");
        admin.addPermission("Update");
        Role customer = new Role();
        customer.setRoleName("customer");
        customer.addPermission("Read");
        //------------------------------------
        //Sign in logic
        //------------------------------------
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        try {
            Admin_DAO daoad = new Admin_DAO();
            Customer_DAO daocu = new Customer_DAO();
            ResultSet rsad = daoad.selectAdminUser(email, password);
            ResultSet rscu = daocu.selectCustomerUser(email, password);
            if (rsad.next()) {
                khanh.setRole(admin);
                khanh.setIdUser(rsad.getInt("IdAdmin"));
                khanh.setName(rsad.getString("Name"));
                Date sqlDoB = rsad.getDate("DoB");
                khanh.setDoB(sqlDoB != null ? sqlDoB.toLocalDate() : null);
                khanh.setSex(rsad.getString("Sex"));
                khanh.setCreateDate(rsad.getTimestamp("CreateDate").toLocalDateTime());
                khanh.setEmail(rsad.getString("Email"));
                khanh.setPhoneNumber(rsad.getString("PhoneNumber"));
                khanh.setAddress(rsad.getString("Address"));
                khanh.setStatus(rsad.getString("Status"));
                khanh.setDescription(rsad.getString("Description"));
                khanh.setImage(rsad.getString("Image"));
                khanh.setPassword(rsad.getString("Password"));
                khanh.setUserName(rsad.getString("UserName"));
                khanh.setEmailConfirmed(rsad.getBoolean("EmailConfirmed"));
                khanh.setPhoneNumberConfirmed(rsad.getBoolean("PhoneNumberConfirmed"));
                khanh.setPasswordHash(rsad.getString("PasswordHash"));
                khanh.setLogOut(rsad.getBoolean("LogOut"));
                khanh.setAccessFailCount(rsad.getInt("AccessFailCount"));
                new Menu(khanh).setVisible(true);
            }
            if (rscu.next()) {
                khanh.setRole(customer);
                khanh.setIdUser(rscu.getInt("IdCustomer"));
                khanh.setName(rscu.getString("Name"));
                Date sqlDoB = rscu.getDate("DoB");
                khanh.setDoB(sqlDoB != null ? sqlDoB.toLocalDate() : null);
                khanh.setSex(rscu.getString("Sex"));
                khanh.setCreateDate(rscu.getTimestamp("CreateDate").toLocalDateTime());
                khanh.setEmail(rscu.getString("Email"));
                khanh.setPhoneNumber(rscu.getString("PhoneNumber"));
                khanh.setAddress(rscu.getString("Address"));
                khanh.setStatus(rscu.getString("Status"));
                khanh.setDescription(rscu.getString("Description"));
                khanh.setImage(rscu.getString("Image"));
                khanh.setPassword(rscu.getString("Password"));
                khanh.setUserName(rscu.getString("UserName"));
                khanh.setEmailConfirmed(rscu.getBoolean("EmailConfirmed"));
                khanh.setPhoneNumberConfirmed(rscu.getBoolean("PhoneNumberConfirmed"));
                khanh.setPasswordHash(rscu.getString("PasswordHash"));
                khanh.setLogOut(rscu.getBoolean("LogOut"));
                khanh.setAccessFailCount(rscu.getInt("AccessFailCount"));
                new Menu(khanh).setVisible(true);
            }
            if (khanh.getRole() == null) {
                lblNotifi.setText("- Wrong email or password");
                lblNotifi.setForeground(new Color(255, 102, 102));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //------------------------------------

    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseEntered
        // TODO add your handling code here:
        btnSignIn.setBackground(new Color(179, 179, 179));
        btnSignIn.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 230)));
        btnSignIn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnSignInMouseEntered

    private void btnSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseExited
        // TODO add your handling code here:
        btnSignIn.setBackground(new Color(0, 0, 0));
        btnSignIn.setBorder(BorderFactory.createEmptyBorder());
        btnSignIn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSignInMouseExited

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel lblNotifi;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JPanel pnlSignIn;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
