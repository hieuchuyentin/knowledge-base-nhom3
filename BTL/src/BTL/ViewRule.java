package BTL;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class ViewRule extends javax.swing.JFrame {

    /**
     * Creates new form ViewRule
     */
    MainGUI mainGUI;
    public ViewRule(MainGUI parent) {
        initComponents();
        mainGUI = parent;
        ShowRuleList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableSingleRule = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btFormAddRule = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAndRule = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableOrRule = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle("Danh sách luật");

        tableSingleRule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Điều kiện", "Kết luận", "Độ tin cậy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSingleRule.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableSingleRule);
        if (tableSingleRule.getColumnModel().getColumnCount() > 0) {
            tableSingleRule.getColumnModel().getColumn(2).setMinWidth(100);
            tableSingleRule.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableSingleRule.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jLabel1.setText("Các luật đang có trong hệ thống");

        btFormAddRule.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btFormAddRule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/them luat.png"))); // NOI18N
        btFormAddRule.setText("Điều chỉnh");
        btFormAddRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFormAddRuleActionPerformed(evt);
            }
        });

        tableAndRule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Điều kiện thứ nhất", "Điều kiện thứ hai", "Kết luận", "Độ tin cậy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableAndRule);
        if (tableAndRule.getColumnModel().getColumnCount() > 0) {
            tableAndRule.getColumnModel().getColumn(3).setMinWidth(100);
            tableAndRule.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableAndRule.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel2.setText("Luật đơn");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/them.png"))); // NOI18N

        jLabel3.setText("Luật And");

        tableOrRule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Điều kiện thứ nhất", "Điều kiện thứ hai", "Kết luận", "Độ tin cậy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableOrRule);
        if (tableOrRule.getColumnModel().getColumnCount() > 0) {
            tableOrRule.getColumnModel().getColumn(3).setMinWidth(100);
            tableOrRule.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableOrRule.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel4.setText("Luật Or");

        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(107, 107, 107)
                                .addComponent(btFormAddRule, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(367, 367, 367))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btFormAddRule, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFormAddRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFormAddRuleActionPerformed
        // TODO add your handling code here:
        mainGUI.formAddRule.setVisible(true);
        mainGUI.formAddRule.setFocusable(true);
    }//GEN-LAST:event_btFormAddRuleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void ShowRuleList()
    {
        ShowSingleRuleList();
        ShowAndRuleList();
        ShowOrRuleList();
    }
    public void ShowSingleRuleList()
    {
        int nIndex, nIDEvent, nIndexEvent;
        Event e = new Event(0, 0), eInList;
        SingleRule ruleSingle;
        
        while (tableSingleRule.getRowCount() > 0)
            ((DefaultTableModel)tableSingleRule.getModel()).removeRow(0);
        
        for (nIndex = 0; nIndex < mainGUI.listSingleRule.size(); nIndex++)
        {
            ruleSingle = mainGUI.listSingleRule.get(nIndex);
            ((DefaultTableModel)tableSingleRule.getModel()).addRow((Vector) null);
            e.nID = ruleSingle.nIDCondition;
            nIndexEvent = mainGUI.listEvent.indexOf(e);
            eInList = mainGUI.listEvent.get(nIndexEvent);
            tableSingleRule.setValueAt(eInList.sDetail, nIndex, 0);
            
            e.nID = ruleSingle.nIDResult;
            nIndexEvent = mainGUI.listEvent.indexOf(e);
            eInList = mainGUI.listEvent.get(nIndexEvent);
            tableSingleRule.setValueAt(eInList.sDetail, nIndex, 1);
            
            tableSingleRule.setValueAt(ruleSingle.CF, nIndex, 2);
        }
    }
    
    public void ShowAndRuleList()
    {
        int nIndex, nIDEvent, nIndexEvent;
        Event e = new Event(0, 0), eInList;
        AndRule ruleAnd;
        
        while (tableAndRule.getRowCount() > 0)
            ((DefaultTableModel)tableAndRule.getModel()).removeRow(0);
        
        for (nIndex = 0; nIndex < mainGUI.listAndRule.size(); nIndex++)
        {
            ruleAnd = mainGUI.listAndRule.get(nIndex);
            ((DefaultTableModel)tableAndRule.getModel()).addRow((Vector) null);
            e.nID = ruleAnd.nIDCondition1;
            nIndexEvent = mainGUI.listEvent.indexOf(e);
            eInList = mainGUI.listEvent.get(nIndexEvent);
            tableAndRule.setValueAt(eInList.sDetail, nIndex, 0);
            
            e.nID = ruleAnd.nIDCondition2;
            nIndexEvent = mainGUI.listEvent.indexOf(e);
            eInList = mainGUI.listEvent.get(nIndexEvent);
            tableAndRule.setValueAt(eInList.sDetail, nIndex, 1);
            
            e.nID = ruleAnd.nIDResult;
            nIndexEvent = mainGUI.listEvent.indexOf(e);
            eInList = mainGUI.listEvent.get(nIndexEvent);
            tableAndRule.setValueAt(eInList.sDetail, nIndex, 2);
            
            tableAndRule.setValueAt(ruleAnd.CF, nIndex, 3);
        }
    }
    
    public void ShowOrRuleList()
    {
        int nIndex, nIDEvent, nIndexEvent;
        Event e = new Event(0, 0), eInList;
        OrRule ruleOr;
        
        while (tableOrRule.getRowCount() > 0)
            ((DefaultTableModel)tableOrRule.getModel()).removeRow(0);
        
        for (nIndex = 0; nIndex < mainGUI.listOrRule.size(); nIndex++)
        {
            ruleOr = mainGUI.listOrRule.get(nIndex);
            ((DefaultTableModel)tableOrRule.getModel()).addRow((Vector) null);
            e.nID = ruleOr.nIDCondition1;
            nIndexEvent = mainGUI.listEvent.indexOf(e);
            eInList = mainGUI.listEvent.get(nIndexEvent);
            tableOrRule.setValueAt(eInList.sDetail, nIndex, 0);
            
            e.nID = ruleOr.nIDCondition2;
            nIndexEvent = mainGUI.listEvent.indexOf(e);
            eInList = mainGUI.listEvent.get(nIndexEvent);
            tableOrRule.setValueAt(eInList.sDetail, nIndex, 1);
            
            e.nID = ruleOr.nIDResult;
            nIndexEvent = mainGUI.listEvent.indexOf(e);
            eInList = mainGUI.listEvent.get(nIndexEvent);
            tableOrRule.setValueAt(eInList.sDetail, nIndex, 2);
            
            tableOrRule.setValueAt(ruleOr.CF, nIndex, 3);
        }
    }
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
            java.util.logging.Logger.getLogger(ViewRule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRule(new MainGUI()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFormAddRule;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableAndRule;
    private javax.swing.JTable tableOrRule;
    private javax.swing.JTable tableSingleRule;
    // End of variables declaration//GEN-END:variables
}
