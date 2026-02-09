package userinterface.CVSadmin;

import business.Pharmacy;
import business.PharmacyDirectory;
import business.Validator;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AddPharmacy extends javax.swing.JPanel {

    /**
     * Creates new form AddPharmacy
     */
    private JPanel userProcessContainer;
    private PharmacyDirectory pharmacyDirectory;
    private Validator validator;
    
    public AddPharmacy(JPanel userProcessContainer,PharmacyDirectory pharmacyDirectory) {
        this.userProcessContainer = userProcessContainer;
        this.pharmacyDirectory = pharmacyDirectory;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pharmacyNameJText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addPharmacyJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        errorInName = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        pharmacyNameJText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("New Pharmacy Store");

        addPharmacyJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addPharmacyJButton.setText("ADD PHARMACY");
        addPharmacyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPharmacyJButtonActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        errorInName.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(errorInName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pharmacyNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(addPharmacyJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnBack)))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorInName)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pharmacyNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(addPharmacyJButton)
                .addGap(61, 61, 61)
                .addComponent(btnBack)
                .addContainerGap(341, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPharmacyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPharmacyJButtonActionPerformed
        
        String name = pharmacyNameJText.getText();
        Pharmacy pharma = new Pharmacy();
// pharmacyDirectory.addPharmacy();
        validator = new Validator();
        
        if(validator.isStringValid(name)){
        pharma.setStoreName(name);
        errorInName.setText("");
        pharmacyDirectory.addPharmacy(pharma);
        JOptionPane.showMessageDialog(null, "Pharmacy is added","Pharmacy Addition",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            errorInName.setText("Pharmacy name cannot be empty");
        }

        
    }//GEN-LAST:event_addPharmacyJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPharmacyJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel errorInName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pharmacyNameJText;
    // End of variables declaration//GEN-END:variables
}
