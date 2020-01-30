import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Nachiappan Lakshmanan
 * @version 1.0
 */

/*
 * This class is used to create circle shape at a particular position for the
 * given X and Y coordinate
 */
public class Circle implements Shape {

	static final int CIRCLE_HEIGHT = 50;
	static final int CIRCLE_WIDTH = 50;

	private int cordinateX;
	private int cordinateY;
	
	public int getCordinateX() {
		return cordinateX;
	}

	public int getCordinateY() {
		return cordinateY;
	}

	@Override
	public void setPosition(int x, int y) {
		this.cordinateX = x;
		this.cordinateY = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval(cordinateX, cordinateY, CIRCLE_HEIGHT, CIRCLE_WIDTH);
		g.fillOval(cordinateX, cordinateY, CIRCLE_HEIGHT, CIRCLE_WIDTH);

	}

}
