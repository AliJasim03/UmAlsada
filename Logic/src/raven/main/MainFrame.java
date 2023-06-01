/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package raven.main;

import GlassPanePopup.GlassPanePopup;
import Logic.Employee;
import Logic.Member;
import component.DefaultForm;
import java.awt.Component;
import raven.menu.MenuEvent;
import FileManager.FileManager;
import Logic.PersonalTrainer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alija
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    DashBaord dashBaord = new DashBaord();
    AddEmployeePnl addEmployeePnl = new AddEmployeePnl();
    AddMemberPnl addMemberPnl = new AddMemberPnl();
    AssignTrainerPnl assignTrainerPnl = new AssignTrainerPnl();
    ListPersonalTrainerPnl listPersonalTrainerPnl = new ListPersonalTrainerPnl();
    ManageEmployeesPnl manageEmployeesPnl = new ManageEmployeesPnl();
    ManageMembersPnl manageMembersPnl = new ManageMembersPnl();
    PersonalTrainerPnl pe = new PersonalTrainerPnl();

    public MainFrame() throws IOException, ClassNotFoundException {
        initComponents();
        Employee.loadEmpCount();
        Member.loadMemberCount();
        try {
            FileManager.getInstance().loadStartupFile();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        GlassPanePopup.install(this);
        showForm(dashBaord);

        menu.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                System.out.println(index + "" + subIndex);
                if (index == 0) {
                    showForm(dashBaord);
                } else if (index == 1 && subIndex == 1) {
                    showForm(addEmployeePnl);
                } else if (index == 1 && subIndex == 2) {
                    manageEmployeesPnl.showData();
                    showForm(manageEmployeesPnl);
                } else if (index == 1 && subIndex == 4) {
                    showForm(listPersonalTrainerPnl);
                } else if (index == 2 && subIndex == 1) {
                    showForm(addMemberPnl);
                } else if (index == 2 && subIndex == 2) {
                    manageMembersPnl.showData();
                    showForm(manageMembersPnl);
                } else if (index == 2 && subIndex == 3) {
                    assignTrainerPnl.updateComboBox();
                    assignTrainerPnl.updateTable();
                    showForm(assignTrainerPnl);
                }
              else if (index == 1 && subIndex == 3) {
      ArrayList<PersonalTrainer> personalTrainers = (ArrayList<PersonalTrainer>) pe.getPersonalTrainers();
    listPersonalTrainerPnl.populateTable(personalTrainers);
    showForm(listPersonalTrainerPnl);
    pe.showData();
}
            }
        });
    }

    private void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        menu = new raven.menu.Menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(42, 107, 120));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel body;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private raven.menu.Menu menu;
    // End of variables declaration//GEN-END:variables
}
