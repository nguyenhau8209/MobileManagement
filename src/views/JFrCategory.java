/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import DAO.MobilePhoneDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.MobilePhone;

/**
 *
 * @author nguyen-cong-hau
 */
public class JFrCategory extends javax.swing.JFrame {

    MobilePhoneDAO phoneDAO = new MobilePhoneDAO();

    /**
     * Creates new form JFrCategory
     */
    public JFrCategory() {
        initComponents();
        setLocationRelativeTo(this);

    }

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbMobilePhone.getModel();
        model.setRowCount(0);
        for (MobilePhone all : phoneDAO.getAlls()) {
            Object[] rowData = new Object[5];
            rowData[0] = all.getId();
            rowData[1] = all.getName();
            rowData[2] = all.getQuantity();
            rowData[3] = all.getCategoryID();
            rowData[4] = all.getPrice();
            model.addRow(rowData);
        }
    }

    private void updateProductTable(List<MobilePhone> products) {
        DefaultTableModel model = (DefaultTableModel) tbMobilePhone.getModel();
        model.setRowCount(0); // Clear existing data

        for (MobilePhone product : products) {
            model.addRow(new Object[]{product.getId(), product.getName(), product.getQuantity(), product.getCategoryID(), product.getPrice()});
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

        jLabel1 = new javax.swing.JLabel();
        btnSamSung = new javax.swing.JButton();
        btnIphone = new javax.swing.JButton();
        btnXiaomi = new javax.swing.JButton();
        btnVivo = new javax.swing.JButton();
        btnVsmart = new javax.swing.JButton();
        btnNokia = new javax.swing.JButton();
        btnHuaway = new javax.swing.JButton();
        btnOppo = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMobilePhone = new javax.swing.JTable();
        btnOpenFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("DANH MỤC");

        btnSamSung.setText("SAMSUNG");
        btnSamSung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamSungActionPerformed(evt);
            }
        });

        btnIphone.setText("IPHONE");
        btnIphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIphoneActionPerformed(evt);
            }
        });

        btnXiaomi.setText("XIAOMI");
        btnXiaomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXiaomiActionPerformed(evt);
            }
        });

        btnVivo.setText("VIVO");
        btnVivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVivoActionPerformed(evt);
            }
        });

        btnVsmart.setText("VSMART");
        btnVsmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVsmartActionPerformed(evt);
            }
        });

        btnNokia.setText("NOKIA");
        btnNokia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNokiaActionPerformed(evt);
            }
        });

        btnHuaway.setText("HUAWAY");
        btnHuaway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuawayActionPerformed(evt);
            }
        });

        btnOppo.setText("OPPO");
        btnOppo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOppoActionPerformed(evt);
            }
        });

        jButton9.setText("THOÁT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        tbMobilePhone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MASP", "TEN SP", "SO LUONG", "HANG", "GIA TIEN"
            }
        ));
        jScrollPane1.setViewportView(tbMobilePhone);

        btnOpenFile.setText("Open File");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSamSung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXiaomi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVsmart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNokia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuaway, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btnOppo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)
                        .addGap(131, 131, 131)
                        .addComponent(btnOpenFile))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnOpenFile))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSamSung)
                        .addGap(18, 18, 18)
                        .addComponent(btnIphone)
                        .addGap(18, 18, 18)
                        .addComponent(btnXiaomi)
                        .addGap(18, 18, 18)
                        .addComponent(btnVivo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVsmart)
                        .addGap(18, 18, 18)
                        .addComponent(btnNokia)
                        .addGap(18, 18, 18)
                        .addComponent(btnHuaway)
                        .addGap(18, 18, 18)
                        .addComponent(btnOppo)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSamSungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamSungActionPerformed
        // TODO add your handling code here:
        List<MobilePhone> mobilePhones = phoneDAO.findProductByCategoryID("NSX2");
        updateProductTable(mobilePhones);
    }//GEN-LAST:event_btnSamSungActionPerformed

    private void btnIphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIphoneActionPerformed
        // TODO add your handling code here:
        List<MobilePhone> mobilePhones = phoneDAO.findProductByCategoryID("NSX1");
        updateProductTable(mobilePhones);
    }//GEN-LAST:event_btnIphoneActionPerformed

    private void btnXiaomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXiaomiActionPerformed
        // TODO add your handling code here:
        List<MobilePhone> mobilePhones = phoneDAO.findProductByCategoryID("NSX3");
        updateProductTable(mobilePhones);
    }//GEN-LAST:event_btnXiaomiActionPerformed

    private void btnVivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVivoActionPerformed
        // TODO add your handling code here:
        List<MobilePhone> mobilePhones = phoneDAO.findProductByCategoryID("NSX4");
        updateProductTable(mobilePhones);
    }//GEN-LAST:event_btnVivoActionPerformed

    private void btnVsmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVsmartActionPerformed
        // TODO add your handling code here:
        List<MobilePhone> mobilePhones = phoneDAO.findProductByCategoryID("NSX5");
        updateProductTable(mobilePhones);
    }//GEN-LAST:event_btnVsmartActionPerformed

    private void btnNokiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNokiaActionPerformed
        // TODO add your handling code here:
        List<MobilePhone> mobilePhones = phoneDAO.findProductByCategoryID("NSX6");
        updateProductTable(mobilePhones);
    }//GEN-LAST:event_btnNokiaActionPerformed

    private void btnHuawayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuawayActionPerformed
        // TODO add your handling code here:
        List<MobilePhone> mobilePhones = phoneDAO.findProductByCategoryID("NSX7");
        updateProductTable(mobilePhones);
    }//GEN-LAST:event_btnHuawayActionPerformed

    private void btnOppoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOppoActionPerformed
        // TODO add your handling code here:
        List<MobilePhone> mobilePhones = phoneDAO.findProductByCategoryID("NSX8");
        updateProductTable(mobilePhones);
    }//GEN-LAST:event_btnOppoActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        // TODO add your handling code here:
        phoneDAO.openFile();
        fillTable();
    }//GEN-LAST:event_btnOpenFileActionPerformed

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
            java.util.logging.Logger.getLogger(JFrCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuaway;
    private javax.swing.JButton btnIphone;
    private javax.swing.JButton btnNokia;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnOppo;
    private javax.swing.JButton btnSamSung;
    private javax.swing.JButton btnVivo;
    private javax.swing.JButton btnVsmart;
    private javax.swing.JButton btnXiaomi;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMobilePhone;
    // End of variables declaration//GEN-END:variables
}
