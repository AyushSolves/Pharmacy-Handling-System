package userinterface.CVSadmin;

import business.Drug;
import business.DrugCatalog;
import business.Pharmacy;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ViewPharmacyCompany extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Pharmacy pharmacy;
    public ViewPharmacyCompany(JPanel userProcessConatiner, Pharmacy pharmacy) {
        initComponents();
        this.userProcessContainer =  userProcessConatiner;
        this.pharmacy = pharmacy;
//        addDrugsJButton.setEnabled(false);
        populateTable();
        pharmacyNameLabelName.setText(pharmacy.getStoreName()); //to get supplier name as label above the abv
    }
    
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) drugsCatalogJTable.getModel();
        dtm.setRowCount(0); //to make row count 0
       // int rowCount = accountJTable.getRowCount();
        for (Drug drugs : pharmacy.getDrugCatalog().getDrugList())
        {
            Object[] row = new Object[3];
            row[0]=drugs;
            row[1]=drugs.getDrugID();
            row[2]=drugs.getDrugAvailibility();
            
            dtm.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pharmacyNameLabelName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugsCatalogJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        addDrugsJButton = new javax.swing.JButton();

        pharmacyNameLabelName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pharmacyNameLabelName.setText("jLabel1");

        drugsCatalogJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Drug Name", "Drug Id", "Drug Availibility"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugsCatalogJTable);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        addDrugsJButton.setText("Add Drugs");
        addDrugsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrugsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(pharmacyNameLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addDrugsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(295, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pharmacyNameLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(addDrugsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnBack)
                .addContainerGap(282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void addDrugsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrugsJButtonActionPerformed
        // TODO add your handling code here:
        DrugCatalog drugCatalog = pharmacy.getDrugCatalog();
        AddDrugsJPanel addDrugsJPanel = new AddDrugsJPanel(userProcessContainer,drugCatalog);
        userProcessContainer.add("addDrugsJPanel",addDrugsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addDrugsJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrugsJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable drugsCatalogJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pharmacyNameLabelName;
    // End of variables declaration//GEN-END:variables
}
