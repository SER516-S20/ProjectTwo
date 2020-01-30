import javax.swing.*;
import java.awt.*;

/*
 * @author Aravind Thillai Villalan
 * @since 01-29-2020
 */

public class Square extends JPanel {
    public void paint(Graphics g) {
        int[] x = {50, 150, 150, 50};
        int[] y = {50, 50, 150, 150};
        int numberofpoints = 4;
        g.setColor(new Color(76, 217, 100));
        g.fillPolygon(x, y, numberofpoints);
    }

}
