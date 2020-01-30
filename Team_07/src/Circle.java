import javax.swing.*;
import java.awt.*;

/*
 * @author Aravind Thillai Villalan
 * @since 01-29-2020
 */

public class Circle extends JPanel {

	public void paint(Graphics g) {
		int diameter = 50 * 2;
		g.setColor(new Color(255, 149, 0));
		g.fillOval(50, 50, diameter, diameter);
	}

}
