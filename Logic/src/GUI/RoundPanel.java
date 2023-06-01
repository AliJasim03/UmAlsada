/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 * This class represents a custom JPanel with a rounded background.
 * It provides a rounded rectangle shape for the panel's appearance.
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class RoundPanel extends JPanel {
/**
     * Creates a new instance of the RoundPanel class.
     * Initializes the panel's appearance.
     */
    public RoundPanel() {
        setOpaque(false);
    }
 /**
     * Paints the panel with a rounded background.
     * Overrides the default paint method to customize the appearance of the panel.
     * @param grphcs The Graphics object used for painting.
     */
    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 55, 55);
        g2.dispose();
        super.paint(grphcs);
    }
}