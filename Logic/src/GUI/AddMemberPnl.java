/**

This class represents a JPanel for adding a new member to the gym system.
It provides a form for entering the member's details such as name, address, phone number, gender, date of birth, and member type.
The user can enter the details and click the "Add" button to add the member to the system.
The class also handles the event listeners for various GUI components.
*/
package GUI;

import Calander.EventDateChooser;
import Calander.SelectedAction;
import Calander.SelectedDate;
import CustomGUI.Message;
import GlassPanePopup.GlassPanePopup;
import Logic.Employee;
import Logic.GymSystem;
import Logic.PersonalTrainer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import FileManager.FileManager;
import Logic.Member;
import Logic.PolytechnicStaff;
import Logic.PolytechnicStudent;
import javax.swing.JFrame;

/**
 *
 * @author alija
 */
public class AddMemberPnl extends javax.swing.JPanel {

    Message obj = new Message();
/**
 * Creates a new instance of AddMemberPnl.
 * Initializes the GUI components, sets up event listeners, and configures additional functionalities.
 */
    public AddMemberPnl() {
        initComponents();
        showExtraData();
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        dateChooserAddMem.setTextRefernce(txtDm);
        dateChooserAddMem.addEventDateChooser(new EventDateChooser() {
            @Override
            public void dateSelected(SelectedAction action, SelectedDate date) {
                if (action.getAction() == SelectedAction.DAY_SELECTED) {
                    dateChooserAddMem.hidePopup();
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioButtonGender = new javax.swing.ButtonGroup();
        RadioButtonMember = new javax.swing.ButtonGroup();
        dateChooserAddMem = new Calander.DateChooser();
        textField1 = new CustomGUI.TextField();
        txtFm = new CustomGUI.TextField();
        jLabel1 = new javax.swing.JLabel();
        txtPhon = new CustomGUI.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLm = new CustomGUI.TextField();
        jLabel3 = new javax.swing.JLabel();
        txtAm = new CustomGUI.TextField();
        jLabel6 = new javax.swing.JLabel();
        staff = new CustomGUI.RadioButtonCustom();
        student = new CustomGUI.RadioButtonCustom();
        femaleRadioButton = new CustomGUI.RadioButtonCustom();
        maleRadioButton = new CustomGUI.RadioButtonCustom();
        addEmpBtn = new CustomGUI.Button();
        txtPositionOrMajor = new CustomGUI.TextField();
        lblPositionOrMajor = new javax.swing.JLabel();
        txtDepartmentOrTeam = new CustomGUI.TextField();
        lblDepartmenOrTeam = new javax.swing.JLabel();
        txtDm = new CustomGUI.TextField();
        jLabel9 = new javax.swing.JLabel();
        button1 = new CustomGUI.Button();

        dateChooserAddMem.setForeground(new java.awt.Color(68, 176, 191));

        setBackground(new java.awt.Color(42, 107, 120));
        setPreferredSize(new java.awt.Dimension(882, 508));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textField1.setEditable(false);
        textField1.setBackground(new java.awt.Color(233, 189, 78));
        textField1.setForeground(new java.awt.Color(0, 0, 0));
        textField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField1.setText("Registar New Member Form");
        textField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textField1.setRound(50);
        textField1.setShadowColor(new java.awt.Color(0, 0, 0));
        add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 67));

        txtFm.setBackground(new java.awt.Color(68, 176, 191));
        txtFm.setName("memf"); // NOI18N
        txtFm.setRound(30);
        txtFm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFmActionPerformed(evt);
            }
        });
        add(txtFm, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 114, 225, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 189, 78));
        jLabel1.setText("First Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 87, -1, -1));

        txtPhon.setBackground(new java.awt.Color(68, 176, 191));
        txtPhon.setRound(30);
        add(txtPhon, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 114, 225, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 189, 78));
        jLabel4.setText("Phone number ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 87, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 189, 78));
        jLabel2.setText("Last Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 161, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 189, 78));
        jLabel5.setText("Gender");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 161, -1, -1));

        txtLm.setBackground(new java.awt.Color(68, 176, 191));
        txtLm.setRound(30);
        add(txtLm, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 188, 225, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 189, 78));
        jLabel3.setText("Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 235, -1, -1));

        txtAm.setBackground(new java.awt.Color(68, 176, 191));
        txtAm.setRound(30);
        add(txtAm, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 262, 225, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(233, 189, 78));
        jLabel6.setText("Member Type");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 221, -1, -1));

        RadioButtonMember.add(staff);
        staff.setText("Staff");
        staff.setFocusPainted(false);
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });
        add(staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 254, -1, -1));

        RadioButtonMember.add(student);
        student.setText("Student");
        student.setFocusPainted(false);
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 254, -1, -1));

        RadioButtonGender.add(femaleRadioButton);
        femaleRadioButton.setText("Female");
        femaleRadioButton.setFocusPainted(false);
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });
        add(femaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 188, -1, -1));

        RadioButtonGender.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.setFocusPainted(false);
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });
        add(maleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 188, -1, -1));

        addEmpBtn.setBackground(new java.awt.Color(68, 176, 191));
        addEmpBtn.setForeground(new java.awt.Color(233, 189, 78));
        addEmpBtn.setText("Add");
        addEmpBtn.setFocusPainted(false);
        addEmpBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemBtnActionPerformed(evt);
            }
        });
        add(addEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 444, 70, -1));

        txtPositionOrMajor.setBackground(new java.awt.Color(68, 176, 191));
        txtPositionOrMajor.setRound(30);
        add(txtPositionOrMajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 320, 225, -1));

        lblPositionOrMajor.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblPositionOrMajor.setForeground(new java.awt.Color(233, 189, 78));
        lblPositionOrMajor.setText("Position");
        add(lblPositionOrMajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 293, -1, -1));

        txtDepartmentOrTeam.setBackground(new java.awt.Color(68, 176, 191));
        txtDepartmentOrTeam.setRound(30);
        add(txtDepartmentOrTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 406, 225, -1));

        lblDepartmenOrTeam.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblDepartmenOrTeam.setForeground(new java.awt.Color(233, 189, 78));
        lblDepartmenOrTeam.setText("Department");
        add(lblDepartmenOrTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 379, -1, -1));

        txtDm.setBackground(new java.awt.Color(68, 176, 191));
        txtDm.setRound(30);
        add(txtDm, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 336, 168, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(233, 189, 78));
        jLabel9.setText("Date of birth");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 309, -1, -1));

        button1.setBackground(new java.awt.Color(68, 176, 191));
        button1.setForeground(new java.awt.Color(233, 189, 78));
        button1.setText("Pick");
        button1.setFocusPainted(false);
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 336, 45, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFmActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void addMemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemBtnActionPerformed
        String gender = null;
        if (maleRadioButton.isSelected()) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        }
        try {
            if (student.isSelected()) {
                ///lablablab the one for the show and remove
                Member m = new PolytechnicStudent(txtFm.getText(), txtLm.getText(), txtAm.getText(), txtPhon.getText(), gender,
                        txtDm.getText(), txtPositionOrMajor.getText(), txtDepartmentOrTeam.getText());
                GymSystem.members.add(m);
            } else if (staff.isSelected()) {
                //// same lalalalalalal for show and remove
                Member m = new PolytechnicStaff(txtFm.getText(), txtLm.getText(), txtAm.getText(), txtPhon.getText(), gender,
                        txtDm.getText(), txtPositionOrMajor.getText(), txtDepartmentOrTeam.getText());
                GymSystem.members.add(m);

            }
            obj.jLabel1.setText("A new Member has been added");
            GlassPanePopup.showPopup(obj);
            txtFm.setText("");
            txtLm.setText("");
            txtAm.setText("");
            txtPhon.setText("");
            txtDm.setText("");
            txtPositionOrMajor.setText("");
            txtDepartmentOrTeam.setText("");
            RadioButtonGender.clearSelection();
            RadioButtonMember.clearSelection();
            showExtraData();
            FileManager.getInstance().writeMember();
        } catch (Exception e) {
            obj.jLabel1.setText("Please check your input data");
            GlassPanePopup.showPopup(obj);
        }

    }//GEN-LAST:event_addMemBtnActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        showExtraData();
        if (student.isSelected()) {
            lblPositionOrMajor.setText("Major");
            lblDepartmenOrTeam.setText("Sport Team");

        }
            }//GEN-LAST:event_studentActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        showExtraData();
        if (staff.isSelected()) {
            lblPositionOrMajor.setText("Position");
            lblDepartmenOrTeam.setText("Department");

        }
    }//GEN-LAST:event_staffActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        dateChooserAddMem.showPopup();
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RadioButtonGender;
    private javax.swing.ButtonGroup RadioButtonMember;
    private CustomGUI.Button addEmpBtn;
    private CustomGUI.Button button1;
    private Calander.DateChooser dateChooserAddMem;
    private CustomGUI.RadioButtonCustom femaleRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblDepartmenOrTeam;
    private javax.swing.JLabel lblPositionOrMajor;
    private CustomGUI.RadioButtonCustom maleRadioButton;
    private CustomGUI.RadioButtonCustom staff;
    private CustomGUI.RadioButtonCustom student;
    private CustomGUI.TextField textField1;
    private CustomGUI.TextField txtAm;
    private CustomGUI.TextField txtDepartmentOrTeam;
    private CustomGUI.TextField txtDm;
    private CustomGUI.TextField txtFm;
    private CustomGUI.TextField txtLm;
    private CustomGUI.TextField txtPhon;
    private CustomGUI.TextField txtPositionOrMajor;
    // End of variables declaration//GEN-END:variables
        public void showExtraData() {
        boolean check = RadioButtonMember.getSelection() != null ? true : false;
        
        lblPositionOrMajor.setVisible(check);
        txtPositionOrMajor.setVisible(check);
        lblDepartmenOrTeam.setVisible(check);
        txtDepartmentOrTeam.setVisible(check);
    }
}
