import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape{

	
	private int cordX;
	private int cordY;
	
	@Override
	public void setPosition(int x, int y) {
		this.cordX = x;
		this.cordY = y;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.drawOval(cordX, cordY,  10, 15);
		g.fillRect(cordX, cordY, 10, 15);
		
	}

}
