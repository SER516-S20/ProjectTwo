import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author surya create on 01-27-2020
 */

public class PanelRectangle extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanelRectangle() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClickedShape objClickedShape = new ClickedShape();
				objClickedShape.returnShape("Rectangle");
			}
		});
		JPanel objRectanglePane = new JPanel();
		repaint();

		objRectanglePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		objRectanglePane.setLayout(null);
	}

	public void paintComponent(Graphics objGraphics) {
		Graphics2D obj2D = (Graphics2D) objGraphics;
		Shape objRectangle = new Rectangle(105, 60, 100, 80);
		obj2D.draw(objRectangle);
	}
}
