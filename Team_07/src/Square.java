import javax.swing.*;
import java.awt.*;

/**
 * @author Aravind Thillai Villalan
 * @author Karandeep Singh Grewal
 * @since 01-29-2020
 */

public class Square extends JPanel {
    public void paintComponent(Graphics tempGraphics) {
        final Color GREEN = new Color(76, 217, 100);
        tempGraphics.setColor(GREEN);
        tempGraphics.fillRect(0 , 0, 100,100);
        this.setSize(100,100);
    }

}
