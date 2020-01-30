import javax.swing.*;
import java.awt.*;

public class SquareIcon implements Icon {
    public final int POSITION_DEVIATION = 25;

    public int getIconWidth() {
        return 0;
    }

    public int getIconHeight() {
        return 0;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Square square = new Square();
        square.setPosition(x - POSITION_DEVIATION, y - POSITION_DEVIATION);
        square.draw(g);

    }

}
