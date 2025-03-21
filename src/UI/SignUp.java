/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.Customer_DAO;
import Model.Customer;
import Model.User;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

/**
 *
 * @author ADMIN
 */
public class SignUp extends javax.swing.JFrame {

    Customer_DAO serviceCustomer = new Customer_DAO();

    public SignUp() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sign up");
        placeHolder();
        design();
    }

    public void placeHolder() {
        txtUserName.setText("- Username");
        txtUserName.setForeground(Color.gray);
        txtEmail.setText("- Email");
        txtEmail.setForeground(Color.gray);
        txtSDT.setText("- SDT");
        txtSDT.setForeground(Color.gray);
        txtPassword.setText("- Password");
        txtPassword.setForeground(Color.gray);
    }

    public void design() {
        btnSignUp.setFont(new Font("Arial", Font.BOLD, 14));
        btnSignUp.setForeground(Color.white);
        btnSignUp.setBackground(new Color(0, 0, 0));
        txtUserName.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txtEmail.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txtSDT.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        txtPassword.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblSignIn.setForeground(new Color(204, 204, 204));
        lblSignIn.setFont(new Font("segoe UI", Font.BOLD, 12));
        pnlSignUp.setBackground(new Color(102, 102, 102));
    }

    public Customer getData() {
        String name = "Skidibidopdopzzz";
        String email = txtEmail.getText();
        String phoneNumber = txtSDT.getText();
        String password = txtPassword.getText();
        String userName = txtUserName.getText();
        Customer c = new Customer(name, email, phoneNumber, password, userName);
        return c;
    }

    private boolean check() {
        if (txtEmail.getForeground() == Color.GRAY || txtPassword.getForeground() == Color.GRAY || txtSDT.getForeground() == Color.GRAY || txtUserName.getForeground() == Color.GRAY) {
            JOptionPane.showMessageDialog(this, "Moi nhap day du");
            return false;
        }
        if (!txtEmail.getText().matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}")) {
            JOptionPane.showMessageDialog(this, "Moi nhap email dung");
            return false;
        }
        String sdt = "^[0-9]+$";
        if (!txtSDT.getText().matches(sdt)) {
            JOptionPane.showMessageDialog(this, "Moi nhap SDT dung");
            return false;
        }
        for (Customer cm : serviceCustomer.selectCustomer()) {
            if (txtUserName.getText().equalsIgnoreCase(cm.getUserName())) {
                JOptionPane.showMessageDialog(this, "UserName exited");
                return false;
            }
        }
        for (Customer cm : serviceCustomer.selectCustomer()) {
            if (txtEmail.getText().equalsIgnoreCase(cm.getEmail())) {
                JOptionPane.showMessageDialog(this, "Email exited");
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSignUp = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblSignIn = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        cboValidate = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
            
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });

        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
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

        lblSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignIn.setText("Sign in");
        lblSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSignInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSignInMouseExited(evt);
            }
        });

        btnSignUp.setText("Sign up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        cboValidate.setText("Validate");
        cboValidate.setEnabled(false);

        javax.swing.GroupLayout pnlSignUpLayout = new javax.swing.GroupLayout(pnlSignUp);
        pnlSignUp.setLayout(pnlSignUpLayout);
        pnlSignUpLayout.setHorizontalGroup(
            pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignUpLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSignUpLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblSignIn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboValidate)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnlSignUpLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtPassword, txtSDT, txtUserName});

        pnlSignUpLayout.setVerticalGroup(
            pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignUpLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboValidate)
                .addGap(8, 8, 8)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSignIn)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pnlSignUpLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtPassword, txtSDT, txtUserName});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSignInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMouseEntered
        lblSignIn.setForeground(new Color(255, 255, 255));
        lblSignIn.setFont(new Font("segoe UI", Font.BOLD, 12));
    }//GEN-LAST:event_lblSignInMouseEntered

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        txtUserName.setText("");
        txtUserName.setForeground(Color.black);
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        if (txtUserName.getText().isBlank()) {
            txtUserName.setText("- Username");
            txtUserName.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        Color stt = txtEmail.getForeground();
        if (stt == Color.GRAY) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().isBlank()) {
            txtEmail.setText("- Email");
            txtEmail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtSDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusGained
        Color stt = txtSDT.getForeground();
        if (stt == Color.GRAY) {
            txtSDT.setText("");
            txtSDT.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtSDTFocusGained

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        if (txtSDT.getText().isBlank()) {
            txtSDT.setText("- SDT");
            txtSDT.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtSDTFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        Color stt = txtPassword.getForeground();
        if (stt == Color.GRAY) {
            txtPassword.setText("");
            txtPassword.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (txtPassword.getText().isBlank()) {
            txtPassword.setText("- Password");
            txtPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void lblSignInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMouseExited
        lblSignIn.setForeground(new Color(204, 204, 204));
        lblSignIn.setFont(new Font("segoe UI", Font.BOLD, 12));
    }//GEN-LAST:event_lblSignInMouseExited

    private void lblSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignInMouseClicked
        dispose();
        SignIn signIn = new SignIn();
        signIn.setVisible(true);
    }//GEN-LAST:event_lblSignInMouseClicked

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        if (check()) {
            serviceCustomer.dangKy(getData());
            new SignIn().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JCheckBox cboValidate;
    private javax.swing.JLabel lblSignIn;
    private javax.swing.JPanel pnlSignUp;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
