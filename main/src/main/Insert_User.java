/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;
import javax.swing.*;
import java.sql.*;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SSN
 */
public class Insert_User extends javax.swing.JFrame {
    Connection con;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form Insert_User
     */
    public Insert_User() {
        initComponents();
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            //JOptionPane.showMessageDialog(this,"Driver Loaded!");
            try {
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Mega477553");
                //JOptionPane.showMessageDialog(this,"Connected to Oracle database!");
            }
            catch (SQLException ex) {
                Logger.getLogger(Insert_User.class.getName()).log(Level.SEVERE,null, ex);
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
        catch(ClassNotFoundException ex){
            Logger.getLogger(Insert_User.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage());
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

        User_Address = new javax.swing.JButton();
        User_Details = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        User_Address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        User_Address.setText("Insert User Address");
        User_Address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        User_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_AddressActionPerformed(evt);
            }
        });
        getContentPane().add(User_Address);
        User_Address.setBounds(140, 110, 205, 40);

        User_Details.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        User_Details.setText("Insert User Details");
        User_Details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        User_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_DetailsActionPerformed(evt);
            }
        });
        getContentPane().add(User_Details);
        User_Details.setBounds(140, 180, 205, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("        User Insert");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 60, 200, 33);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\SSN\\Downloads\\MP_Images\\5(1).png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 10, 50, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\SSN\\Downloads\\MP_Images\\14.jpeg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-700, -150, 1190, 540);

        setSize(new java.awt.Dimension(500, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void User_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_DetailsActionPerformed
        // TODO add your handling code here:
        Insert_User_Details UD = new Insert_User_Details();
        UD.show();
        this.dispose();
    }//GEN-LAST:event_User_DetailsActionPerformed

    private void User_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_AddressActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Insert_User_Address UA = new Insert_User_Address();
        UA.show();
    }//GEN-LAST:event_User_AddressActionPerformed

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
            java.util.logging.Logger.getLogger(Insert_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton User_Address;
    private javax.swing.JButton User_Details;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
