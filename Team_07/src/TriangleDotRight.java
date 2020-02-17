import java.awt.*;

/**
 * @author Karandeep Singh Grewal
 * @since 01-29-2020
 */

public class TriangleDotRight extends Dot {
    public void paintComponent(Graphics tempGraphics) {
        int diameter = 5 * 2;
        final Color ORANGE = new Color(251, 255, 244, 255);
        tempGraphics.setColor(ORANGE);
        tempGraphics.fillOval(0, 0, diameter, diameter);
        this.setBounds(25, 65, 20, 20);
    }
}
