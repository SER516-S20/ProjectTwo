import javax.swing.*;
import java.awt.*;

/**
 * @author Aravind Thillai Villalan
 * @author Karandeep Singh Grewal
 * @since 01-29-2020
 */

public class Triangle extends JPanel {
    public void paint(Graphics tempGraphics) {
        int[] x = {0, 100, 50};
        int[] y = {86, 86, 0};
        int numberOfPoints = 3;
        final Color BLUE = new Color(90, 200, 250,150);
        tempGraphics.setColor(BLUE);
        tempGraphics.fillPolygon(x, y, numberOfPoints);
        this.setSize(100,86);
    }
}
