import java.awt.*;

public class Square extends ObjectInterface{
    public Square(String label) {
        super(label);
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }
        g.fillRect(0, 0, getSize().width-1,getSize().height-1);

        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRect(0, 0, getSize().width-1,getSize().height-1);
    }

}