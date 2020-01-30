/**
 * @author Surya
 * created on 01-28-2020
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Path2D;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelTriangle extends JPanel {

	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	public PanelTriangle() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClickedShape objClickedShape = new ClickedShape();
				objClickedShape.returnShape("Triangle");
			}
		});
		JPanel objTrianglePane = new JPanel();
		repaint();

		objTrianglePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		objTrianglePane.setLayout(null);

	}
	public void paintComponent(Graphics objGraphics) {
		Path2D path = new Path2D.Double();
		path.moveTo(120, 60);
		path.lineTo(80, 140);
		path.lineTo(160, 140);
		path.closePath();
		Graphics2D obj2D = (Graphics2D) objGraphics;
		obj2D.draw(path);
	}
}


