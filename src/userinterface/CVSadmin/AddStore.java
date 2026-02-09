
package userinterface.CVSadmin;

import business.Store;
import business.StoreDirectory;
import business.Validator;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AddStore extends javax.swing.JPanel {

    /**
     * Creates new form AddStore
     */
    private JPanel userProcessContainer;
    private StoreDirectory storeDirectory;
    private Validator validator;
    public AddStore(JPanel userProcessContainer, StoreDirectory storeDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.storeDirectory = storeDirectory;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        storeNameJText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addStoreJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        storeLocationJText1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        errorInName = new javax.swing.JLabel();
        errorInLocation = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        storeNameJText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("New  Store");

        addStoreJButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addStoreJButton.setText("ADD STORE");
        addStoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStoreJButtonActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        storeLocationJText1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Location");

        errorInName.setForeground(new java.awt.Color(255, 0, 0));

        errorInLocation.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorInName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(storeNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(storeLocationJText1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(addStoreJButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorInLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel5)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(21, 21, 21)
                .addComponent(errorInName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(errorInLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(storeNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeLocationJText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addComponent(addStoreJButton)
                .addGap(88, 88, 88)
                .addComponent(btnBack)
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addStoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStoreJButtonActionPerformed

        String name = storeNameJText.getText();
        String location = storeLocationJText1.getText();
        Store store = new Store();
         
        validator = new Validator();

        ArrayList<String> errorArray = new ArrayList();
        
        
        if(validator.isStringValid(name)){
            store.setStoreName(name);
            errorInName.setText("");
        }
        else
        {
           // errorInName.setText("Store name cannot be empty");
            errorArray.add("Store name");
        }
        
        if(validator.isStringValid(location)){
            store.setStoreLocation(location);
            errorInName.setText("");
        }
        else
        {
            errorArray.add("Location");
            //errorInName.setText("Store Location name cannot be empty");
        }

        //Check is done if the errorArray contains error messages
        if(!errorArray.isEmpty()){
        //System.out.print("test1");
        
        String message = "";
        //Iterate the errorListArray with foreach
        for( String error : errorArray )
            {
                message += error + " \n";
            }
            JOptionPane.showMessageDialog(null,message +"are empty fields. Please enter the values.","Error ",JOptionPane.ERROR_MESSAGE);   
        }
        else{
            storeDirectory.addStore(store);
        JOptionPane.showMessageDialog(null, "Store is added","Store Addition",JOptionPane.INFORMATION_MESSAGE);       
        
        }
                
    }//GEN-LAST:event_addStoreJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed
public void backAction()
{
    //add refresh button and also call populateTable
    userProcessContainer.remove(this);
    Component[] componentArray = userProcessContainer.getComponents();
    Component component = componentArray[componentArray.length - 1 ];
    ManageStores manageStoreJPanel = (ManageStores) component;
    manageStoreJPanel.populateTable();
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.previous(userProcessContainer);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStoreJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel errorInLocation;
    private javax.swing.JLabel errorInName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField storeLocationJText1;
    private javax.swing.JTextField storeNameJText;
    // End of variables declaration//GEN-END:variables
}
