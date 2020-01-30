
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class RectangleButton extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Shape rectangle;
	private Color foreground = new Color(178, 255, 102);
	private Color background = new Color(0, 255, 255);
	private Dimension size;
	public RectangleButton(String label) {
		super(label);
		size = getPreferredSize();
		size.width = size.height = Math.max(size.width,size.height);
		setPreferredSize(size);
		setContentAreaFilled(false);
		setOpaque(false);
		setFocusPainted(false);
		setBorderPainted(false);
		setContentAreaFilled(false);
		setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		//rectangle = createRectangle();
	}

	protected void paintComponent(Graphics g) {
		if (getModel().isArmed()) {
			g.setColor(background);
		} else {
			g.setColor(foreground);
		}
		Graphics2D g2d = (Graphics2D)g;
		g2d.fillRect(0, 0, getSize().width - 1,getSize().height - 1);
		
		super.paintComponent(g);
	}

	protected void paintBorder(Graphics g) {
		g.setColor(this.getForeground());
		Graphics2D g2d = (Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.drawRect(0, 0, getSize().width - 1,getSize().height - 1);
	}

	public boolean contains(int x, int y) {
		if (rectangle == null || 
				!rectangle.getBounds().equals(getBounds())) {
			rectangle = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
		}
		return rectangle.contains(x, y);
	}
}

