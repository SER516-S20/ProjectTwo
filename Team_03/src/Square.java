import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Nachiappan Lakshmanan
 * @version 1.0
 */

/*
 * This class is used to create square shape at a particular position for the
 * given X and Y cordinate
 */
public class Square implements Shape {

	static final int SQUARE_HEIGHT = 50;
	static final int SQUARE_WIDTH = 50;

	private int cordX;
	private int cordY;

	@Override
	public void setPosition(int x, int y) {
		this.cordX = x;
		this.cordY = y;
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.BLUE);
		g.drawRect(cordX, cordY, SQUARE_HEIGHT, SQUARE_WIDTH);
		g.fillRect(cordX, cordY, SQUARE_HEIGHT, SQUARE_WIDTH);

	}

}
