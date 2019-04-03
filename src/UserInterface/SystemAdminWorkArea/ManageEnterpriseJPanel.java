/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.City;
import Business.SuperMarket;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCitySupJPanel
     */
    JPanel rightJPanel;
    SuperMarket superMarket;
    
    public ManageEnterpriseJPanel(JPanel rightJPanel,SuperMarket superMarket ) {
        initComponents();
        this.rightJPanel=rightJPanel;
        this.superMarket=superMarket;
             
        
        populateComboBox();
        populateEnterpriseTable();
    }
    
    private void populateEnterpriseTable() 
    {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (City city : superMarket.getCityList()) 
        {
            for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = city.getCityName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }
    
    private void populateComboBox()
    {
        cityComboBox.removeAllItems();
        enterpriseTypeComboBox.removeAllItems();
           cityComboBox.addItem("--SELECT--");
           enterpriseTypeComboBox.addItem("--SELECT--");
        for (City city : superMarket.getCityList()) 
        {
            cityComboBox.addItem(city);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeComboBox.addItem(type);
        }

    }
    
    public void refreshTable()
    {
        int rowCount=enterpriseJTable.getRowCount();
        
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        for (int i=rowCount-1;i>=0;i--)
        {
            model.removeRow(i);
        }
        //model.setRowCount(0);
        for (City city : superMarket.getCityList()) 
        {
            for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = city.getCityName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
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

        cityComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseNameTxtField = new javax.swing.JTextField();
        supervisorBackBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        enterpriseTypeComboBox = new javax.swing.JComboBox();
        addEnterpriseBtn = new javax.swing.JButton();
        removeEnterprise = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 104, 80));

        cityComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "City", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setText("Select City");

        jLabel2.setText("Enterprise Type");

        supervisorBackBtn.setText("<< Back");
        supervisorBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervisorBackBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Enterprise Name");

        enterpriseTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addEnterpriseBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add_50px.png"))); // NOI18N
        addEnterpriseBtn.setText("Add Enterprise");
        addEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnterpriseBtnActionPerformed(evt);
            }
        });

        removeEnterprise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Remove_50px.png"))); // NOI18N
        removeEnterprise.setText("Remove Enterprise");
        removeEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEnterpriseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(supervisorBackBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cityComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterpriseNameTxtField)
                                .addComponent(enterpriseTypeComboBox, 0, 108, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeEnterprise)
                                .addGap(110, 110, 110)
                                .addComponent(addEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterpriseTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(enterpriseNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supervisorBackBtn)
                    .addComponent(removeEnterprise)
                    .addComponent(addEnterpriseBtn))
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnterpriseBtnActionPerformed
        int flag=0;
        City city = (City) cityComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeComboBox.getSelectedItem();

        if (city == null || type == null ) 
        {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        
        if(enterpriseNameTxtField.getText().isEmpty())
        {
        
            JOptionPane.showMessageDialog(null, "Please do not leave the field blank!");
            flag=1;
        }
        if(flag==0)
        {
            String enterpriseName = enterpriseNameTxtField.getText();
            Enterprise enterprise = city.getEnterpriseDirectory().addEnterprise(enterpriseName, type);
        }

        

        populateEnterpriseTable();
        //enterpriseNameTxtField.setText("");
        
        
        
    }//GEN-LAST:event_addEnterpriseBtnActionPerformed

    private void removeEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEnterpriseActionPerformed
        City city = (City) cityComboBox.getSelectedItem();
        int selectedRow=enterpriseJTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            int selectionButton= JOptionPane.YES_NO_OPTION;
            int selectionResult= JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION){
                Enterprise enterprise = (Enterprise)enterpriseJTable.getValueAt(selectedRow, 0);
                city.getEnterpriseDirectory().removeEnterprise(enterprise);
                        //.removeEnterprise(enterprise);
                
                refreshTable();
            }            
        }
        else
        {
                JOptionPane.showMessageDialog(null, "Please select a row!!");
        }
        
    }//GEN-LAST:event_removeEnterpriseActionPerformed

    private void supervisorBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervisorBackBtnActionPerformed
        
        SystemAdminWorkAreaJPanel adminWorkAreaPanel= new SystemAdminWorkAreaJPanel(rightJPanel,superMarket);
        rightJPanel.add("SystemAdminWorkAreaJPanel",adminWorkAreaPanel);
        CardLayout layout= (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
        
    }//GEN-LAST:event_supervisorBackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEnterpriseBtn;
    private javax.swing.JComboBox cityComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JTextField enterpriseNameTxtField;
    private javax.swing.JComboBox enterpriseTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeEnterprise;
    private javax.swing.JButton supervisorBackBtn;
    // End of variables declaration//GEN-END:variables
}
