import javax.swing.*;
import java.awt.*;

/**
 * @author Aravind Thillai Villalan
 * @author Karandeep Singh Grewal
 * @since 01-29-2020
 */

public class Triangle extends JPanel {
    public void paint(Graphics tempGraphics) {
        int[] x = {50, 100, 150};
        int[] y = {150, 50, 150};
        int numberOfPoints = 3;
        final Color BLUE = new Color(90, 200, 250);
        tempGraphics.setColor(BLUE);
        tempGraphics.fillPolygon(x, y, numberOfPoints);
    }
}
