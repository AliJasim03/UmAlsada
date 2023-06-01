/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import FileManager.FileManager;
import CustomGUI.Message;
import GlassPanePopup.GlassPanePopup;
import Logic.Employee;
import Logic.GymSystem;
import Logic.Member;
import Logic.PersonalTrainer;
import Logic.PolytechnicStaff;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.table.DefaultTableModel;

/**
 * This class represents a JPanel for assigning trainers to members in the gym system.
 * It provides a table with member information and allows selecting a trainer from a dropdown menu for each member.
 * The class also handles event listeners for various GUI components.
 */
public class AssignTrainerPnl extends javax.swing.JPanel {

    /**
     * Creates new form AssignTrainerPnl
     */
    Message obj = new Message();
/**
     * Creates a new instance of AssignTrainerPnl.
     * Initializes the GUI components and sets up additional functionalities.
     */
    public AssignTrainerPnl() {
        initComponents();
        assignTrainerTable.fixTable(jScrollPane);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trainersComboBox = new ComboBox.ComboBoxSuggestion();
        textField1 = new CustomGUI.TextField();
        jScrollPane = new javax.swing.JScrollPane();
        assignTrainerTable = new Table.Table();
        jLabel1 = new javax.swing.JLabel();

        trainersComboBox.setEditable(false);
        trainersComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                trainersComboBoxFocusLost(evt);
            }
        });

        setBackground(new java.awt.Color(42, 107, 120));

        textField1.setEditable(false);
        textField1.setBackground(new java.awt.Color(233, 189, 78));
        textField1.setForeground(new java.awt.Color(0, 0, 0));
        textField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField1.setText("Assign Trainer");
        textField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textField1.setRound(50);
        textField1.setShadowColor(new java.awt.Color(0, 0, 0));

        assignTrainerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Member Name", "Member Type", "Assigned Trainer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        assignTrainerTable.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        assignTrainerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        assignTrainerTable.setShowGrid(true);
        assignTrainerTable.setShowVerticalLines(false);
        jScrollPane.setViewportView(assignTrainerTable);
        if (assignTrainerTable.getColumnModel().getColumnCount() > 0) {
            assignTrainerTable.getColumnModel().getColumn(0).setResizable(false);
            assignTrainerTable.getColumnModel().getColumn(1).setResizable(false);
            assignTrainerTable.getColumnModel().getColumn(2).setResizable(false);
            assignTrainerTable.getColumnModel().getColumn(3).setResizable(false);
            assignTrainerTable.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(trainersComboBox));
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 189, 78));
        jLabel1.setText("<html><center>Select a trianer to assign</center></html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 /**
     * Event handler for the trainersComboBox focus lost event.
     * Assigns a trainer to a selected member based on the selected trainer in the combo box.
     *
     * @param evt The focus event triggered by losing focus on the trainersComboBox.
     */
    private void trainersComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_trainersComboBoxFocusLost

        Member mem = GymSystem.members.get(assignTrainerTable.getSelectedRow());
        ArrayList<PersonalTrainer> trainers = new ArrayList<>();
        for (Employee emp : GymSystem.employees) {
            if (emp instanceof PersonalTrainer personalTrainer) {
                trainers.add(personalTrainer);
                System.out.println(personalTrainer.getMembers().size());
            }
        }
        boolean swaped = false;
        boolean found = false;
        for (PersonalTrainer emp : trainers) {
//            found = false;
            for (Member member : emp.getMembers()) {
                if (member.getId() == mem.getId()) {
                    found = true;
                    if (trainersComboBox.getSelectedIndex() - 1 != -1 && !swaped) {
                        ((PersonalTrainer) emp).getMembers().remove(member);
                        trainers.get(trainersComboBox.getSelectedIndex() - 1).getMembers().add(member);
                        swaped = true;
                        if (trainersComboBox.getSelectedIndex() != 0) {
                            obj.jLabel1.setText("<html>" + member.getFullName() + " has been reasigned to " + trainers.get(trainersComboBox.getSelectedIndex() - 1).getFullName() + ".</html>");
                            GlassPanePopup.showPopup(obj);
                        }
                        break;
                    } else if (!swaped) {
                        ((PersonalTrainer) emp).getMembers().remove(member);
                        obj.jLabel1.setText("<html>" + mem.getFullName() + " has been removed from " + ((PersonalTrainer) emp).getFullName() + ".</html>");
                        GlassPanePopup.showPopup(obj);
                        break;
                    }
                }
            }

        }
        if (!found && trainersComboBox.getSelectedIndex() - 1 != -1) {
            trainers.get(trainersComboBox.getSelectedIndex() - 1).getMembers().add(mem);
            obj.jLabel1.setText("<html>" + mem.getFullName() + " has been asigned to " + trainers.get(trainersComboBox.getSelectedIndex() - 1).getFullName() + ".</html>");
            GlassPanePopup.showPopup(obj);
        }
        try {
            FileManager.getInstance().writeEmployee();
        } catch (IOException ex) {
            Logger.getLogger(AssignTrainerPnl.class.getName()).log(Level.SEVERE, null, ex);
        }
     }//GEN-LAST:event_trainersComboBoxFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Table.Table assignTrainerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private CustomGUI.TextField textField1;
    private ComboBox.ComboBoxSuggestion trainersComboBox;
    // End of variables declaration//GEN-END:variables
    @SuppressWarnings("unchecked")
    public void updateComboBox() {
        trainersComboBox.removeAllItems();
        ArrayList<PersonalTrainer> PS = new ArrayList<PersonalTrainer>();
        PS.removeAll(PS);
        for (Employee emp : GymSystem.employees) {
            if (emp instanceof PersonalTrainer) {
                PS.add((PersonalTrainer) emp);
            }
        }
        trainersComboBox.addItem("(None)");
        for (PersonalTrainer emp : PS) {
            trainersComboBox.addItem(emp.getFullName() + " (" + emp.getId() + ")");
        }
    }
 /**
     * Updates the assignTrainerTable with the member information and assigned trainers.
     */
    public void updateTable() {
        DefaultTableModel model = (DefaultTableModel) assignTrainerTable.getModel();
        model.setRowCount(0);
        for (Member mem : GymSystem.members) {
            boolean found = false;
            String name = null;
            int id = 0;
            for (Employee emp : GymSystem.employees) {
                if (emp instanceof PersonalTrainer) {

                    for (Member empFound : ((PersonalTrainer) emp).getMembers()) {
                        if (empFound.getId() == mem.getId()) {
                            found = true;
                            name = emp.getFullName();
                            id = emp.getId();
                            break;
                        }
                    }
                }
            }
            if (found) {
                if (mem instanceof PolytechnicStaff) {
                    assignTrainerTable.addRow(new Object[]{mem.getId(), mem.getFullName(), "Polytechnic Staff", name + " (" + id + ")"});
                } else {
                    assignTrainerTable.addRow(new Object[]{mem.getId(), mem.getFullName(), "Polytechnic Student", name + " (" + id + ")"});
                }
            } else if (!found) {
                if (mem instanceof PolytechnicStaff) {
                    assignTrainerTable.addRow(new Object[]{mem.getId(), mem.getFullName(), "Polytechnic Staff", "(None)"});
                } else {
                    assignTrainerTable.addRow(new Object[]{mem.getId(), mem.getFullName(), "Polytechnic Student", "(None)"});
                }
            }
        }
    }
   /**
     * Retrieves the selected member from the assignTrainerTable based on the selected row.
     *
     * @return The selected member.
     */
    public Member getMemTrainerByID() {
        int row = assignTrainerTable.getSelectedRow();
        Object id = assignTrainerTable.getModel().getValueAt(row, 0);
        String idString = id.toString();
        int idFound = Integer.parseInt(idString);
        for (Member mem : GymSystem.members) {
            if (mem.getId() == idFound) {
                return mem;
            }
        }
        return null;
    }
}
