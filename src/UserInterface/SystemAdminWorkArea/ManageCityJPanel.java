/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

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
public class ManageCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCityJPanel
     */
    JPanel rightJPanel;
    SuperMarket superMarket;
        
    public ManageCityJPanel(JPanel rightJPanel,SuperMarket superMarket) {
        initComponents();
        this.rightJPanel=rightJPanel;
        this.superMarket=superMarket;
                
        populateCityTable();
    }

    private void populateCityTable(){
        DefaultTableModel model = (DefaultTableModel) cityTable.getModel();

        model.setRowCount(0);
        for (City city : superMarket.getCityList()) {
            Object[] row = new Object[1];
            row[0] = city;
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        cityTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cityNameText = new javax.swing.JTextField();
        addCityBtn = new javax.swing.JButton();
        removeCityBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 104, 80));

        cityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cityTable);

        jLabel1.setText("City Name");

        cityNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityNameTextActionPerformed(evt);
            }
        });

        addCityBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/City_50px.png"))); // NOI18N
        addCityBtn.setText("Add City");
        addCityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCityBtnActionPerformed(evt);
            }
        });

        removeCityBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Remove_50px.png"))); // NOI18N
        removeCityBtn.setText("Remove City");
        removeCityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCityBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(backBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(cityNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(removeCityBtn)))
                .addGap(106, 106, 106)
                .addComponent(addCityBtn)
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeCityBtn)
                    .addComponent(backBtn)
                    .addComponent(addCityBtn))
                .addGap(148, 148, 148))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCityBtnActionPerformed
        
        if (cityNameText.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null, "City Name cannot be empty ");
            return;  
        }
        String name = cityNameText.getText();

        City city = superMarket.createAndAddCity();
        city.setCityName(name);

        populateCityTable();
        cityNameText.setText("");
    }//GEN-LAST:event_addCityBtnActionPerformed

    public void refreshTable(){
        int rowCount=cityTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)cityTable.getModel();
        for (int i = rowCount-1; i>=0; i-- ){
            dtm.removeRow(i);
        }
        
        for (City city: superMarket.getCityList()){
            Object row[]= new Object[1];
            row[0] = city;           
            dtm.addRow(row);
        }
    }
    
    private void removeCityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCityBtnActionPerformed
        int selectedRow=cityTable.getSelectedRow();
        if (selectedRow >= 0){
            int selectionButton= JOptionPane.YES_NO_OPTION;
            int selectionResult= JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION){
                City city = (City)cityTable.getValueAt(selectedRow, 0);
                superMarket.removeCity(city);
                refreshTable();
            }            
        }
        else{
                JOptionPane.showMessageDialog(null, "Please select a row!!");
        }
    }//GEN-LAST:event_removeCityBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        SystemAdminWorkAreaJPanel sysAdminWrkArea= new SystemAdminWorkAreaJPanel(rightJPanel,superMarket);
        rightJPanel.add("SystemAdminWorkAreaJPanel",sysAdminWrkArea);
        CardLayout layout= (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void cityNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityNameTextActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCityBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cityNameText;
    private javax.swing.JTable cityTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeCityBtn;
    // End of variables declaration//GEN-END:variables
}
