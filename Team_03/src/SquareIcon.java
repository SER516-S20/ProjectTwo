import javax.swing.*;
import java.awt.*;

/**
 * @author Ashutosh Dey
 * @version 1.0
 * @since 01/29/2020
 */
public class SquareIcon implements Icon {

    public int getIconWidth() {
        return 0;
    }

    public int getIconHeight() {
        return 0;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        int positionDeviation = 25;
        Square square = new Square();
        square.setPosition(x - positionDeviation, y - positionDeviation);
        square.draw(g);
    }

}
