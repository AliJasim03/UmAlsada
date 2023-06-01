/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logic;

import java.io.IOException;
import GUI.MainFrame;

/**
 *
 * @author yoyoj
 */
public class Logic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            MainFrame frame = new MainFrame();
                    frame.setVisible(true);

        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        // set the initially invisible testingFrameCodes to // visible - also from the Component class
    }

}
