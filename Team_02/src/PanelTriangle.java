import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Path2D;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author Suryadeep
 * @created on 01-28-2020
 * @version 1.0
 */
public class PanelTriangle extends JPanel {

	private static final long serialVersionUID = 1L;

	public PanelTriangle() {

		addMouseListener(new PanelMouseListener());
		JPanel objTrianglePane = new JPanel();
		repaint();
		objTrianglePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		objTrianglePane.setLayout(null);
	}

	public void paintComponent(Graphics objGraphics) {

		try {
			Path2D path = new Path2D.Double();
			path.moveTo(120, 60);
			path.lineTo(80, 140);
			path.lineTo(160, 140);
			path.closePath();
			Graphics2D obj2D = (Graphics2D) objGraphics;
			obj2D.draw(path);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private class PanelMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {

			ClickedShape objClickedShape = new ClickedShape();
			objClickedShape.returnShape("Triangle");
		}
	}
}
