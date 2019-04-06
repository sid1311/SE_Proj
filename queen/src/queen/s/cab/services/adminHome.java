package queen.s.cab.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siddharth
 */
public final class adminHome extends javax.swing.JFrame {

    /**
     * Creates new form customerHome
     */
     Connection conn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
     String colName[] = {"D_ID", "D_NAME", "D_EMAIL", "V_ID"};
        
    public adminHome(){
        initComponents();
    }
    
     public void loadDriverDetails(String s) throws SQLException{
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cID = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 562));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 562));
        setSize(new java.awt.Dimension(1000, 562));
        getContentPane().setLayout(null);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(210, 50, 2, 580);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(1000, 562));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 562));
        jPanel3.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 64, 64));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Admin ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 110, 80, 18);

        cID.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        cID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cID);
        cID.setBounds(100, 110, 40, 20);

        name.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Siddharth");
        jPanel1.add(name);
        name.setBounds(10, 60, 150, 30);

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome,");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 18, 60, 20);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(0, 50, 210, 140);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel2.setText(" Log out");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 310, 60, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\icons\\logout_rounded_left_32px.png")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 310, 100, 40);

        jLabel11.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel11.setText("Help!");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(60, 260, 90, 40);

        jLabel12.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel12.setText("Profile");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12);
        jLabel12.setBounds(50, 20, 90, 30);

        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel13.setText("View Drivers");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13);
        jLabel13.setBounds(50, 140, 90, 30);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(0, 230, 210, 20);

        jLabel14.setFont(new java.awt.Font("Microsoft Tai Le", 2, 14)); // NOI18N
        jLabel14.setText("Transaction");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(50, 80, 90, 30);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(0, 200, 210, 360);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\icons\\cancel_48px.png")); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3);
        jLabel3.setBounds(950, 0, 50, 50);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 1000, 50);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Driver ID", "Driver Name", "Driver Email", "Vehicle Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(210, 50, 790, 510);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1000, 640);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new custLoginPage().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(colName);
        table = new JTable();
        table.setModel(model);
        
        String dname;
        String vehicleID;
        String email;
        String dID;
        
        
        try{
        String query = "Select * from driver;";
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/se_proj","root","");
        pst = conn.prepareStatement(query);
        rs = pst.executeQuery();
        ResultSetMetaData meta = rs.getMetaData();
        int rowCount = meta.getColumnCount();
        while(rs.next()){
            dname = rs.getString("D_Fname");
            //rCount.setText("Rides Count: "+rs.getString("NO_RIDE"));
            vehicleID =  rs.getString("V_ID");
            email = rs.getString("D_EMAIL");
            dID = rs.getString("C_ID");
            
            model.addRow(new String[]{dname, vehicleID, email, dID});
        }
        JOptionPane.showMessageDialog(null, "Done");
        }
        catch (SQLException e){
            
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    
   
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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new adminHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel name;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
