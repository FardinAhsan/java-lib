/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Agent_info1.java
 *
 * Created on Jan 8, 2013, 5:23:20 PM
 */

package shipping;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author OTSL
 */
public class Agent_info1 extends javax.swing.JPanel {

    /** Creates new form Agent_info1 */
    Connection con;
    public Agent_info1(Connection con) {
        this.con = con;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTextField31 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel34.setText("Delivered");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel35.setText("Cell No");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel36.setText("Email");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel32.setText("Bill Of Entry Number");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel31.setText("Agent Name");

        jButton9.setText("Clear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel30.setForeground(new java.awt.Color(0, 0, 255));
        jLabel30.setText("Agent Information");

        jButton8.setText("Save");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel33.setText("Bill Of Entry Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel32)
                                .addComponent(jLabel33)
                                .addComponent(jLabel34)
                                .addComponent(jLabel31)
                                .addComponent(jLabel35)
                                .addComponent(jLabel36))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField31, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField30, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField29, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField27, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton9))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(jLabel30)))
                    .addContainerGap(224, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel30)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel32)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel33)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel34)
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel36)))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton9)
                                .addComponent(jButton8)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(123, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Statement st;
        try{

            String str = "insert into agent(name,bill_entry_no,bill_entry_data,delivered,cell,email)" +
                    "values('"+jTextField26.getText()+"','"+jTextField27.getText()+"','"+jTextField28.getText()+"'," +
                    "'"+jTextField29.getText()+"','"+jTextField30.getText()+"','"+jTextField31.getText()+"')";

            st =  con.createStatement();
            st.execute(str);
            JOptionPane.showMessageDialog(null,"Entry Success");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
}//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    // End of variables declaration//GEN-END:variables

}