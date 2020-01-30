package MouseListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelCircle extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanelCircle() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClickedShape cs = new ClickedShape();
				cs.returnShape("Circle");
			}
		});
		JPanel contentPane = new JPanel(); 
		repaint();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Shape objCircle = new Ellipse2D.Double(20, 10, 60, 60);
		g2.draw(objCircle);
	}
}
