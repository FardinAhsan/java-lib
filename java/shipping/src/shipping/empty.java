/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LED.java
 *
 * Created on Jan 11, 2013, 3:50:27 PM
 */

package shipping;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ICONMicrosystems
 */
public class empty extends javax.swing.JPanel {
Connection con;
    /** Creates new form LED */
    public empty(Connection con) {
        this.con=con;
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BL ID", "Container Number", "MLO CODE", "Line Number", "Description", "Marks ", "Good", "Date of Entry Good", "Net Weight", "Gross Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addContainerGap(684, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
 Statement st;
  String factory,total_load,sales,balance,nocpn,cpnrecieve,serial,cpnprice,totalcpn,duepaid,credit,diesel,other_cost,cash;
   try{
 DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         String str = "select * from bl,do where bl.bl_no=do.bl_id";


            st =  con.createStatement();
            st.execute(str);
             ResultSet res=st.executeQuery(str);
				         	 while ( res.next() ) {
                                                        factory=res.getString("bl_no");
							total_load=res.getString("number");
							sales=res.getString("mlo_code");
							balance=res.getString("line_no");
                                                        nocpn=res.getString("description");
                                                        cpnrecieve=res.getString("marks_no");
                                                        serial=res.getString("goods_description");
                                                        cpnprice=res.getString("entry_data");
                                                        totalcpn=res.getString("net_weight");
                                                         cash=res.getString("gross_weight");


					model.addRow(new Object[]{factory,total_load,sales,balance,nocpn,cpnrecieve,serial,cpnprice,totalcpn,cash});
                                        }
            //JOptionPane.showMessageDialog(null,"Entry Success");
        }
      catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex.toString());

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                                    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                                                                int a=jTable1.getRowCount();
                                                                for(int i=a-1;i>=0;i--)
                                                                {
                                                                        model.removeRow(i);
                                                                }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
