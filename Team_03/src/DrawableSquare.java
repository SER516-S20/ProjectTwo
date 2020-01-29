import java.awt.Color;
import java.awt.Graphics;


public class DrawableSquare extends Square implements DrawableInterface{

    private Color color;
    private int cordX;
    private int cordY;

    public DrawableSquare(double h, double w){
        super(h, w);
    }

    @Override
    public void setColor(Color c) {
        color = c;
    }

    @Override
    public void setPosition(int x, int y) {
        cordX = x;
        cordY = y;
    }

    @Override
    public void draw(Graphics g) {

    g.setColor(color);
    g.drawRect(cordX,cordY,10,10);

    }

}
