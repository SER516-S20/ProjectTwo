import java.awt.Color;
import java.awt.Graphics;

/**
 * To create square shape at a particular position for the given X and Y coordinate
 * @author Nachiappan Lakshmanan
 * @version 1.0
 * @since 01/29/2020
 */
public class Square implements Shape {

	static final int SQUARE_HEIGHT = 50;
	static final int SQUARE_WIDTH = 50;
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
		g.setColor(Color.BLUE);
		g.drawRect(coordinateX, coordinateY, SQUARE_WIDTH, SQUARE_HEIGHT);
		g.fillRect(coordinateX, coordinateY, SQUARE_WIDTH, SQUARE_HEIGHT);
	}

}
