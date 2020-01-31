import java.awt.*;

/** 
 * @author Somesh
 * @author Sheran
 * @since 01-29-2019
 */
public class Square extends ObjectInterface {
	
    public Square(String label) {
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
        g.fillRect(0, 0, getSize().width-1, getSize().height-1);
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRect(0, 0, getSize().width-1, getSize().height-1);
    }

}