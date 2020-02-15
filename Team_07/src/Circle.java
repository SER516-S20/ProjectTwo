import javax.swing.*;
import java.awt.*;

/**
 * @author Aravind Thillai Villalan
 * @author Karandeep Singh Grewal
 * @since 01-29-2020
 */

public class Circle extends JPanel {

    public void paint(Graphics tempGraphics) {
        int diameter = 50 * 2;
        final Color ORANGE = new Color(255, 149, 0);
        tempGraphics.setColor(ORANGE);
        tempGraphics.fillOval(0, 0, diameter, diameter);
        this.setSize(100,100);
    }
}
