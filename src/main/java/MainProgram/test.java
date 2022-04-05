/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainProgram;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.github.lgooddatepicker.optionalusertools.DateTimeChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateTimeChangeEvent;
import message.MessageDialog;

/**
 *
 * @author niebz
 */
public class test extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public test() {
        initComponents();
        jButton1.setEnabled(false);
        jDialog1.setLocationRelativeTo( this );

    }

    public test(boolean btn_status) {
        initComponents();
        jButton1.setEnabled( btn_status );

        dateTimePicker1.addDateTimeChangeListener( new DateTimeChangeListener() {
            @Override
            public void dateOrTimeChanged (DateTimeChangeEvent dateTimeChangeEvent) {
                try {
                    LocalDateTime checkOut = dateTimePicker1.getDateTimeStrict().plusDays( 1 );
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd HH:mm:ss" );
                    jLabel1.setText( checkOut.format( formatter ) );
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null,e.getMessage() );
                }
            }
        } );

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        panelBorder1 = new swing.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        buttonCustom1 = new swing.ButtonCustom();
        jButton1 = new javax.swing.JButton();
        dateTimePicker1 = new com.github.lgooddatepicker.components.DateTimePicker();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jTextField1 = new javax.swing.JTextField();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setMinimumSize(new java.awt.Dimension(100, 100));
        jDialog1.setUndecorated(true);
        jDialog1.setSize(new java.awt.Dimension(100, 100));
        jDialog1.setType(java.awt.Window.Type.POPUP);

        panelBorder1.setBackground(new java.awt.Color(232, 232, 255));

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel2)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jDialog1.getContentPane().add(panelBorder1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(701, 477));
        setPreferredSize(new java.awt.Dimension(701, 477));
        setSize(new java.awt.Dimension(701, 477));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonCustom1.setText("buttonCustom1");

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jButton2)
                        .addGap(15, 15, 15)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(dateTimePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(buttonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTimePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(37, 37, 37)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(3, 3, 3)
                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(buttonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MessageDialog md = new MessageDialog( this );
//        md.showMessage("Delete your account ?", "All data will lose if you press ok button\nYou can restore any time within 30 days start from now.");
//        if (md.getMessageType() == MessageDialog.MessageType.OK) {
//            Method.displayInfo( "User click ok" );
//        } else {
//            Method.displayError( "User click cancel" );
//        }
//        jDialog1.setBackground( new Color( 0, 0, 0, 0 ) );
//        jDialog1.setVisible( true );
        jButton1.setEnabled(true);
        temp tm = new temp();
        this.dispose();
        tm.setVisible( true );

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            LocalDateTime checkOut = dateTimePicker1.getDateTimeStrict().plusDays( 1 );
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd HH:mm:ss" );
            jLabel1.setText( checkOut.format( formatter ) );
        }catch(Exception e){
            Method.displayError( e.getMessage() );
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public static boolean Get_btn_status(){
        return jButton1.isEnabled();
    }
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
                    javax.swing.UIManager.put("JOptionPane.messageFont", new Font("TH Sarabun New", 1, 18));
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonCustom buttonCustom1;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker1;
    private static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private swing.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
