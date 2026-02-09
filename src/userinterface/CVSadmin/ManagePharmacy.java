package userinterface.CVSadmin;

import business.Pharmacy;
import business.PharmacyDirectory;
import java.awt.CardLayout;
import java.util.function.Supplier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManagePharmacy extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PharmacyDirectory pharmacyDirectory;
    public ManagePharmacy(JPanel userProcessConatiner, PharmacyDirectory pharmacyDirectory) {
        initComponents();
        this.userProcessContainer = userProcessConatiner;
        this.pharmacyDirectory = pharmacyDirectory;
        populateTable();
    }
    void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) pharmacyTable.getModel();
        dtm.setRowCount(0); //to make row count 0
       // int rowCount = accountJTable.getRowCount();
        for (Pharmacy pharmacy : pharmacyDirectory.getStoreList())
        {
            Object[] row = new Object[1];
            row[0]=pharmacy;
            dtm.addRow(row);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pharmacyTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAddPharmacy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        pharmacyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Pharmacy Company Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pharmacyTable);

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnView.setText("View Pharmacy");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAddPharmacy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddPharmacy.setText("Add Pharmacy");
        btnAddPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPharmacyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Manage Pharmacy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddPharmacy)
                                    .addComponent(btnView)
                                    .addComponent(btnRemove))))))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnAddPharmacy)
                        .addGap(18, 18, 18)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)))
                .addGap(54, 54, 54)
                .addComponent(btnBack)
                .addContainerGap(302, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPharmacyActionPerformed
        AddPharmacy aph = new AddPharmacy(userProcessContainer,pharmacyDirectory);
        userProcessContainer.add("add pharmacy",aph);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddPharmacyActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        
        int selectedRow = pharmacyTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row to view","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Pharmacy pharmacy = (Pharmacy) pharmacyTable.getValueAt(selectedRow, 0);
        ViewPharmacyDetails viewpharmadetailsPanel = new ViewPharmacyDetails(userProcessContainer,pharmacy);
        userProcessContainer.add("viewpharmadetailsPanel",viewpharmadetailsPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int selectedRow = pharmacyTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row to view","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int dialogResult = JOptionPane.showConfirmDialog(null, "Please confirm to delete", "Delete confirmation", JOptionPane.WARNING_MESSAGE);
             if(dialogResult == JOptionPane.YES_OPTION){
         Pharmacy pharmacy = (Pharmacy) pharmacyTable.getValueAt(selectedRow, 0);
         pharmacyDirectory.removeSupplier(pharmacy);
         populateTable();
             }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPharmacy;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pharmacyTable;
    // End of variables declaration//GEN-END:variables

}
