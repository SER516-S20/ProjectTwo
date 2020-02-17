import java.awt.*;

/**
 * @author Karandeep Singh Grewal
 * @since 02-15-2020
 */

public class SquareBarLeft extends Bar {
    public void paintComponent(Graphics tempGraphics) {
        final Color WHITE = new Color(255, 255, 255, 240);
        tempGraphics.setColor(WHITE);
        tempGraphics.fillRect(0, 0, 10, 60);
        this.setBounds(20, 20, 10, 60);
    }
}
