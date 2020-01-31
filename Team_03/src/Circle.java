import java.awt.Color;
import java.awt.Graphics;

/**
 * To create circle shape at a particular position for the given X and Y coordinate
 * @author Nachiappan Lakshmanan
 * @version 1.0
 * @since 01/27/2020
 */
public class Circle implements Shape {

	static final int CIRCLE_HEIGHT = 50;
	static final int CIRCLE_WIDTH = 50;
	private int coordinateX;
	private int coordinateY;
	
	public int getCoordinateX() {
		return coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	@Override
	public void setPosition(int x, int y) {
		this.coordinateX = x;
		this.coordinateY = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval(coordinateX, coordinateY, CIRCLE_WIDTH, CIRCLE_HEIGHT);
		g.fillOval(coordinateX, coordinateY, CIRCLE_WIDTH, CIRCLE_HEIGHT);
	}

}
