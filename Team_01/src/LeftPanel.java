import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * This class is used to create the panel on the left side
 * which has different shapes.
 * 
 * @author Raghavan
 * @version 1.0
 */
public class LeftPanel extends JPanel {
	/**
	 * Defining x and y coordinates for the shapes
	 * to start. x from the left of the frame and y
	 * from the top of the frame.
	 */
	static final int X_COORDINATE_SHAPES = 50;
	static final int Y_COORDINATE_SQUARE = 50;
	static final int Y_COORDINATE_CIRCLE = 350;
	static final int Y_COORDINATE_TRIANGLE = 800;

	private static final long serialVersionUID = 1L;
	/**
	 * Uses graphics to draw components
	 * @param graphics
	 */
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Shapes square = new Square();
		square.drawShape(graphics, X_COORDINATE_SHAPES, Y_COORDINATE_SQUARE);
		Shapes circle = new Circle();
		circle.drawShape(graphics, X_COORDINATE_SHAPES, Y_COORDINATE_CIRCLE);
		Shapes triangle = new Triangle();
		triangle.drawShape(graphics, X_COORDINATE_SHAPES, Y_COORDINATE_TRIANGLE);		
		this.addMouseListener(new LeftPanelMouseListener());
	}
	
}
