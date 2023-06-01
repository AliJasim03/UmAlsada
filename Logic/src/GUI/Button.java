/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

/**
 * This class represents a custom button with rounded corners.
 * The button provides a visually appealing appearance with smooth rendering and mouse interaction effects.
 */
public class Button extends JButton {

    private boolean mousePress;
/**
     * Creates a new instance of Button.
     * Initializes the button's properties and sets up the mouse event listeners.
     */
    public Button() {
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(7, 5, 7, 5));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    mousePress = true;
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    mousePress = false;
                }
            }
        });
    }

     /**
     * Overrides the paintComponent method to provide custom rendering of the button.
     * Applies anti-aliasing and draws a rounded rectangle as the button background.
     *
     * @param grphcs The Graphics object to paint on.
     */
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (mousePress) {
            g2.setColor(getBackground().darker());
        } else {
            g2.setColor(getBackground());
        }
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), getHeight(), getHeight()));
        g2.dispose();
        super.paintComponent(grphcs);
    }


    
}
