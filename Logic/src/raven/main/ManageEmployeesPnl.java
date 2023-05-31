/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package raven.main;

import FileManager.FileManager;
import GUI.Message;
import GlassPanePopup.GlassPanePopup;
import Logic.Employee;
import Logic.GymSystem;
import Logic.PersonalTrainer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alija
 */
public class ManageEmployeesPnl extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeePnl
     */
    Message obj = new Message();
    EditEmployeePnl editEmployeePnl;

    public ManageEmployeesPnl() {
        initComponents();
        employeesTable.fixTable(jScrollPane);
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        this.editEmployeePnl = new EditEmployeePnl(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new GUI.TextField();
        jScrollPane = new javax.swing.JScrollPane();
        employeesTable = new Table.Table();
        editBtn = new GUI.Button();
        delBtn = new GUI.Button();

        setBackground(new java.awt.Color(42, 107, 120));

        textField1.setEditable(false);
        textField1.setBackground(new java.awt.Color(233, 189, 78));
        textField1.setForeground(new java.awt.Color(0, 0, 0));
        textField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField1.setText("Manage Employees");
        textField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textField1.setRound(50);
        textField1.setShadowColor(new java.awt.Color(0, 0, 0));

        employeesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Role"
            }
        ));
        employeesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        employeesTable.setShowGrid(true);
        jScrollPane.setViewportView(employeesTable);

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        if (employeesTable.getSelectedRow() != -1) {
            GymSystem.employees.remove(employeesTable.getSelectedRow());

            try {
                FileManager.getInstance().writeEmployee();
            } catch (IOException ex) {
                Logger.getLogger(ManageEmployeesPnl.class.getName()).log(Level.SEVERE, null, ex);
            }
            showData();
            obj.jLabel1.setText("Employee has been deleted");
            GlassPanePopup.showPopup(obj);
        } else {

            obj.jLabel1.setText("Please Select an employee to delete");
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if (employeesTable.getSelectedRow() != -1) {
            MainFrame.body.removeAll();
            MainFrame.body.add(editEmployeePnl);
            editEmployeePnl.emp = GymSystem.employees.get(employeesTable.getSelectedRow());
            editEmployeePnl.showData();
            MainFrame.body.repaint();
            MainFrame.body.revalidate();
        } else {
            obj.jLabel1.setText("Please Select an employee to edit");
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_editBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.Button delBtn;
    private GUI.Button editBtn;
    private Table.Table employeesTable;
    private javax.swing.JScrollPane jScrollPane;
    private GUI.TextField textField1;
    // End of variables declaration//GEN-END:variables
public void showData() {
        DefaultTableModel model = (DefaultTableModel) employeesTable.getModel();
        model.setRowCount(0);
        for (Employee emp : GymSystem.employees) {
            if (emp instanceof PersonalTrainer) {
                employeesTable.addRow(new Object[]{emp.getId(), emp.getFullName(), emp.getPhone(), "Personal Trainer"});
            } else {
                employeesTable.addRow(new Object[]{emp.getId(), emp.getFullName(), emp.getPhone(), "Regular"});
            }
        }
    }
}
