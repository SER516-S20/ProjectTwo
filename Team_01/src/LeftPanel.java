import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author Raghavan
 *
 */
public class LeftPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Uses graphics to draw components
	 * @param graphics
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Shapes square = new Square();
		square.drawShape(g, 50, 50);
		Shapes circle = new Circle();
		circle.drawShape(g, 50, 350);
		Shapes triangle = new Triangle();
		triangle.drawShape(g, 50, 800);		
		this.addMouseListener(new LeftPanelMouseListener());
	}
}
