import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Nachiappan Lakshmanan
 * @version 1.0
 */

/*
 * This class is used to create circle shape at a particular position for the
 * given X and Y cordinate
 */
public class Circle implements Shape {

	static final int CIRCLE_HEIGHT = 50;
	static final int CIRCLE_WIDTH = 50;

	private int cordX;
	private int cordY;

	@Override
	public void setPosition(int x, int y) {
		this.cordX = x;
		this.cordY = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval(cordX, cordY, CIRCLE_HEIGHT, CIRCLE_WIDTH);
		g.fillOval(cordX, cordY, CIRCLE_HEIGHT, CIRCLE_WIDTH);

	}

}
