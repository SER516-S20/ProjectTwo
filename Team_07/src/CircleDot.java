import java.awt.*;

/**
 * @author Karandeep Singh Grewal
 * @since 02-15-2020
 */

public class CircleDot extends Dot {
    public void paintComponent(Graphics tempGraphics) {
        int diameter = 5 * 2;
        final Color ORANGE = new Color(251, 255, 244, 255);
        tempGraphics.setColor(ORANGE);
        tempGraphics.fillOval(0, 0, diameter, diameter);
        this.setBounds(45, 45, 10, 10);
    }
}
