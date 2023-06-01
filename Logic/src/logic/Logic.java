/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package logic;

import java.io.IOException;
import GUI.MainFrame;

/**
 * The main class for the gym management system.
 */
public class Logic {

    /**
     * The main method that starts the gym management system.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            MainFrame frame = new MainFrame(); // Create a new MainFrame object
            frame.setVisible(true); // Make the main frame visible
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage()); // Print the localized message of the exception if an error occurs
        }
        // set the initially invisible testingFrameCodes to // visible - also from the Component class
    }
}
