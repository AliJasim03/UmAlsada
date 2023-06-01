
/**

The EditEmployeePnl class represents a panel used for editing employee information.

It allows modifying the first name, last name, address, phone number, salary, and employee type.

This panel is used in the gym management system.
*/
package GUI;

import CustomGUI.Message;
import GlassPanePopup.GlassPanePopup;
import Logic.Employee;
import Logic.GymSystem;
import Logic.PersonalTrainer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import FileManager.FileManager;
import javax.swing.JPanel;

/**
 * The EditEmployeePnl class represents a panel used for editing employee information.
 * It allows modifying the first name, last name, address, phone number, salary, and employee type.
 * This panel is used in the gym management system.
 */
public class EditEmployeePnl extends javax.swing.JPanel {

    /**
     * Creates new form test
     */
    Message obj = new Message();// A message object for displaying notifications
    ManageEmployeesPnl manageEmployeesPnl; // Reference to the parent panel
    Employee emp;// The employee being edited
      /**
     * Creates a new instance of EditEmployeePnl.
     * 
     * @param manageEmployeesPnl The parent panel that manages employees
     */

    public EditEmployeePnl(ManageEmployeesPnl manageEmployeesPnl) {
        initComponents();
        this.manageEmployeesPnl = manageEmployeesPnl;
                // Event listener for OK button in the message dialog
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
    }

     /**
     * Event handler for the "Save" button.
     * Updates the employee information and notifies the user about the status.
     * Writes the updated employee data to a file.
     * 
     * @param evt The action event triggered by the "Save" button
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmpTypeRadioBtnGroup = new javax.swing.ButtonGroup();
        textField1 = new CustomGUI.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFristNameEmp = new CustomGUI.TextField();
        txtLastNameEmp = new CustomGUI.TextField();
        txtPhone = new CustomGUI.TextField();
        txtSalary = new CustomGUI.TextField();
        txtAddressEmp = new CustomGUI.TextField();
        regularEmpBtn = new CustomGUI.RadioButtonCustom();
        personalTrainerEmpBtn = new CustomGUI.RadioButtonCustom();
        saveBtn = new CustomGUI.Button();
        backBtn = new CustomGUI.Button();

        setBackground(new java.awt.Color(42, 107, 120));

        textField1.setEditable(false);
        textField1.setBackground(new java.awt.Color(233, 189, 78));
        textField1.setForeground(new java.awt.Color(0, 0, 0));
        textField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField1.setText("Edit Employee Form");
        textField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textField1.setRound(50);
        textField1.setShadowColor(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 189, 78));
        jLabel1.setText("First Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 189, 78));
        jLabel2.setText("Last Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 189, 78));
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 189, 78));
        jLabel4.setText("Phone number ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 189, 78));
        jLabel5.setText("Salary");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(233, 189, 78));
        jLabel6.setText("Employee Type");

        txtFristNameEmp.setBackground(new java.awt.Color(68, 176, 191));
        txtFristNameEmp.setRound(30);

        txtLastNameEmp.setBackground(new java.awt.Color(68, 176, 191));
        txtLastNameEmp.setRound(30);

        txtPhone.setBackground(new java.awt.Color(68, 176, 191));
        txtPhone.setRound(30);

        txtSalary.setBackground(new java.awt.Color(68, 176, 191));
        txtSalary.setRound(30);

        txtAddressEmp.setBackground(new java.awt.Color(68, 176, 191));
        txtAddressEmp.setRound(30);

        EmpTypeRadioBtnGroup.add(regularEmpBtn);
        regularEmpBtn.setText("Regular");
        regularEmpBtn.setEnabled(false);
        regularEmpBtn.setFocusPainted(false);

        EmpTypeRadioBtnGroup.add(personalTrainerEmpBtn);
        personalTrainerEmpBtn.setText("Personal Trainer");
        personalTrainerEmpBtn.setEnabled(false);
        personalTrainerEmpBtn.setFocusPainted(false);

        saveBtn.setBackground(new java.awt.Color(68, 176, 191));
        saveBtn.setForeground(new java.awt.Color(233, 189, 78));
        saveBtn.setText("Save");
        saveBtn.setFocusPainted(false);
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 102, 102));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log-out (2).png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBtn.setIconTextGap(8);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFristNameEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtLastNameEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtAddressEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regularEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(personalTrainerEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFristNameEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastNameEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAddressEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(regularEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(personalTrainerEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
           // Update employee information based on input fields
            emp.setFirstName(txtFristNameEmp.getText());
            emp.setLastName(txtLastNameEmp.getText());
            emp.setAddress(txtAddressEmp.getText());
            emp.setPhone(txtPhone.getText());
            emp.setSalary(Double.parseDouble(txtSalary.getText()));
            
           // Update the display of employee data in the parent panel
            manageEmployeesPnl.showData();
           // Show a notification message
            obj.jLabel1.setText("Data has been updated");
            GlassPanePopup.showPopup(obj);
              Message obj = new Message();
           // Event listener for OK button in the message dialog
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    GlassPanePopup.closePopupLast();
                   // Switch back to the parent panel
                    MainFrame.body.removeAll();
                    MainFrame.body.add(manageEmployeesPnl);
                    MainFrame.body.repaint();
                    MainFrame.body.revalidate();
                }
            });
            /**

Event handler for the "Save" button.

Updates the employee information and notifies the user about the status.

Writes the updated employee data to a file.

@param evt The action event triggered by the "Save" button
*/
            // Write the updated employee data to a file
            FileManager.getInstance().writeEmployee();
        } catch (Exception e) {
            obj.jLabel1.setText("Please check your input text fields");
            GlassPanePopup.showPopup(obj);
        }
    }//GEN-LAST:event_saveBtnActionPerformed
/**

Event handler for the "Back" button.
Switches back to the parent panel.
@param evt The action event triggered by the "Back" button
*/
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MainFrame.body.removeAll();
        manageEmployeesPnl.showData();
        MainFrame.body.add(manageEmployeesPnl);
        MainFrame.body.repaint();
        MainFrame.body.revalidate();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup EmpTypeRadioBtnGroup;
    private CustomGUI.Button backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private CustomGUI.RadioButtonCustom personalTrainerEmpBtn;
    private CustomGUI.RadioButtonCustom regularEmpBtn;
    private CustomGUI.Button saveBtn;
    private CustomGUI.TextField textField1;
    private CustomGUI.TextField txtAddressEmp;
    private CustomGUI.TextField txtFristNameEmp;
    private CustomGUI.TextField txtLastNameEmp;
    private CustomGUI.TextField txtPhone;
    private CustomGUI.TextField txtSalary;
    // End of variables declaration//GEN-END:variables

    public void showData() {
        txtFristNameEmp.setText(emp.getFirstName());
        txtLastNameEmp.setText(emp.getLastName());
        txtAddressEmp.setText(emp.getAddress());
        txtPhone.setText(emp.getPhone());
        txtSalary.setText(String.valueOf(emp.getSalary()));
        if (emp instanceof PersonalTrainer) {
            personalTrainerEmpBtn.setSelected(true);
        } else {
            regularEmpBtn.setSelected(true);
        }
    }
}
