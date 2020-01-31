import javax.swing.*;
import java.awt.*;

/**
 * @author Aravind Thillai Villalan
 * @author Karandeep Singh Grewal
 * @since 01-29-2020
 */

public class Square extends JPanel {
    public void paint(Graphics tempGraphics) {
        int[] x = {50, 150, 150, 50};
        int[] y = {50, 50, 150, 150};
        int numberOfPoints = 4;
        final Color GREEN = new Color(76, 217, 100);
        tempGraphics.setColor(GREEN);
        tempGraphics.fillPolygon(x, y, numberOfPoints);
    }

}
