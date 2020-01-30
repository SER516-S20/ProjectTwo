import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelSquare extends JPanel {
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	public PanelSquare() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClickedShape objClickedShape = new ClickedShape();
				objClickedShape.returnShape("Square");
			}
		});
		JPanel objSquarePane = new JPanel();
		repaint();

		objSquarePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		objSquarePane.setLayout(null);
	}
	public void paintComponent(Graphics objGraphics) {
		Graphics2D obj2D = (Graphics2D) objGraphics;
		Shape objSquare = new Rectangle(105, 60, 80, 80);
		obj2D.draw(objSquare);
	}
}
