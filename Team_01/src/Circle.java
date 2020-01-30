import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * @author Raghavan
 *
 */
public class Circle implements Shapes {

	/**
	 * Draws a Circle using Ellipse2D
	 * @param graphic
	 * @param x - x coordinate for the shape
	 * @param y - y coordinate for the shape
	 */
	@Override
	public void drawShape(Graphics graphic, double x, double y) {
		Shape circle = new Ellipse2D.Double(x, y, 200, 200);
		Graphics2D graphics2 = (Graphics2D) graphic;
		graphics2.draw(circle);
		
		Frame.addShape(circle, ShapesEnum.CIRCLE);
	}

}
