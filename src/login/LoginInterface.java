package login;

import admi.AdmiInterface;
import java.util.Arrays;
import javax.swing.ImageIcon;
import teacher.TeacherInterface;
import student.StudentInterface;

public class LoginInterface extends javax.swing.JFrame {
    
    public LoginInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgLogin = new javax.swing.JDialog();
        btnIngresar = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();

        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jLabel1.setText("USERNAME:  ");

        jLabel2.setText("PASSWORD:  ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("COLEGIO JORGE SANDOVAL");

        lblError.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 51, 51));
        lblError.setText("USUARIO Y/O CONTRASEÑA  SON INCORRECTOS");

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgLoginLayout = new javax.swing.GroupLayout(dlgLogin.getContentPane());
        dlgLogin.getContentPane().setLayout(dlgLoginLayout);
        dlgLoginLayout.setHorizontalGroup(
            dlgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgLoginLayout.createSequentialGroup()
                .addGroup(dlgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(dlgLoginLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel3)))
                    .addGroup(dlgLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dlgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgLoginLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgLoginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(dlgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dlgLoginLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnIngresar)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        dlgLoginLayout.setVerticalGroup(
            dlgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgLoginLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(63, 63, 63)
                .addGroup(dlgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(dlgLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addComponent(lblError)
                .addGap(51, 51, 51)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String username = txtUserName.getText();
        char[] pass =  txtPass.getPassword();
        char[] sec = new char[]{'a','d','m','i'};

        if (username.equals("root") && Arrays.equals(pass, sec)) {
            AdmiInterface.view();
            dlgLogin.dispose();
        }

        else if (username.equals("jorge salinas 03") && pass.equals("12345678")) {
            TeacherInterface.view();
            dlgLogin.dispose();
        }

        else if (username.equals("javier martinez 123") && pass.equals("87654321")) {
            StudentInterface.view();
            dlgLogin.dispose();
        }

        else {
            lblError.setVisible(true);
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void initLogin(){
        dlgLogin.setSize(409, 396);
        dlgLogin.setResizable(false);
        dlgLogin.setLocationRelativeTo(null);
        dlgLogin.setVisible(true);
        lblError.setVisible(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().initLogin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JDialog dlgLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblError;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
