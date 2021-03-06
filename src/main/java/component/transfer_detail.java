/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package component;

import MainProgram.DB_Connection;
import MainProgram.Method;

import javax.swing.*;
import java.sql.ResultSet;

/**
 *
 * @author niebz
 */
public class transfer_detail extends javax.swing.JPanel {

    /**
     * Creates new form transfer_detail
     */
    public transfer_detail(String stm_id) {
        initComponents();

        String query = String.format( "select bk.bank_name,ac.ac_number,ac.ac_name from account as ac inner join bank as bk on ac.bank_id=bk.bank_id WHERE ac.ac_number=(select ac_number_recipient from moneytransfer WHERE tf_id=(select banking_id from statements where stm_id='%s' and type_id='3'));",stm_id );
        DB_Connection db = new DB_Connection();
        try {
            ResultSet rs = db.getResultSet( query );
            if ( rs.next() ){
                show_detail_bank_name_receiver.setText( rs.getString(1) );
                show_detail_ac_number_receiver.setText( rs.getString(2) );
                show_detail_ac_name_receiver.setText( rs.getString(3) );
            }

        }catch (Exception e) {
            Method.displayError( e.getMessage() );
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

        show_detail_ac_name_receiver = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        show_detail_ac_number_receiver = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        show_detail_bank_name_receiver = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel73 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(104, 103, 172));
        setMaximumSize(new java.awt.Dimension(343, 162));
        setMinimumSize(new java.awt.Dimension(343, 162));
        setName(""); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_detail_ac_name_receiver.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        show_detail_ac_name_receiver.setForeground(new java.awt.Color(255, 255, 255));
        show_detail_ac_name_receiver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        show_detail_ac_name_receiver.setText("###AC_NAME###");
        add(show_detail_ac_name_receiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 169, 30));

        jLabel71.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Account Name :");
        add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        show_detail_ac_number_receiver.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        show_detail_ac_number_receiver.setForeground(new java.awt.Color(255, 255, 255));
        show_detail_ac_number_receiver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        show_detail_ac_number_receiver.setText("###AC_NUMBER###");
        add(show_detail_ac_number_receiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, 30));

        jLabel69.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Account Number :");
        add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        show_detail_bank_name_receiver.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        show_detail_bank_name_receiver.setForeground(new java.awt.Color(255, 255, 255));
        show_detail_bank_name_receiver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        show_detail_bank_name_receiver.setText("###BANK_NAME###");
        add(show_detail_bank_name_receiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, 30));

        jLabel67.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("TO");
        add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 30));
        add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 358, 10));

        jLabel73.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Bank :");
        add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JLabel show_detail_ac_name_receiver;
    private javax.swing.JLabel show_detail_ac_number_receiver;
    private javax.swing.JLabel show_detail_bank_name_receiver;
    // End of variables declaration//GEN-END:variables
}
