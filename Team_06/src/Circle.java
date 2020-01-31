import java.awt.*;

/** 
 * @author Somesh
 * @since 01-29-2019
 */
public class Circle extends ObjectInterface {
	
	public Circle(String label) {   
		super(label);
    }
	@Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } 
        else {
            g.setColor(getBackground());
        }
        g.fillOval(0, 0, getSize().width-1, getSize().height-1);
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawOval(0, 0, getSize().width-1, getSize().height-1);
    }

}
