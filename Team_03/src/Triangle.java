import java.awt.Graphics;

public class Triangle implements Shape  {

	

	private int cordX;
	private int cordY;
	
	@Override
	public void setPosition(int x, int y) {
		this.cordX = x;
		this.cordY = y;
	}

	@Override
	public void draw(Graphics g) {

		
	}

}
