import java.awt.*;

public  class Triangle extends ObjectInterface{
    public Triangle(String label) {
        super(label);
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }
        g.fillPolygon(new int[] {0,  (getSize().width-1)/2 ,  getSize().width-1}, new int[] {getSize().height-1, 0,  getSize().height-1}, 3);

        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawPolygon(new int[] {0,  (getSize().width-1)/2 ,  getSize().width-1}, new int[] {getSize().height-1, 0,  getSize().height-1}, 3);
    }

}