import javax.swing.*;
import java.awt.*;
/*
 *@author Ashutosh Dey
 */
public class CircleIcon implements Icon {
    public final int POSITION_DEVIATION = 25;

    public int getIconWidth() {
        return 0;
    }

    public int getIconHeight() {
        return 0;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Circle circle = new Circle();
        circle.setPosition(x - POSITION_DEVIATION, y - POSITION_DEVIATION);
        circle.draw(g);

    }

}
