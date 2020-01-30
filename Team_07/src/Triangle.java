import javax.swing.*;
import java.awt.*;

/*
 * @author Aravind Thillai Villalan
 * @since 01-29-2020
 */
public class Triangle extends JPanel {
    public void paint(Graphics g) {
        int[] x = {50, 100, 150};
        int[] y = {150, 50, 150};
        int numberofpoints = 3;
        g.setColor(new Color(90, 200, 250));
        g.fillPolygon(x, y, numberofpoints);
    }
}
