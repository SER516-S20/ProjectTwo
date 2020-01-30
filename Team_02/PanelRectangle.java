package MouseListener;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelRectangle extends JPanel {
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	public PanelRectangle() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClickedShape cs = new ClickedShape();
				cs.returnShape("Rectangle");
			}
		});
		JPanel contentPane = new JPanel(); 
		repaint();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Shape objRectang = new Rectangle(20, 10, 80, 60);
		g2.draw(objRectang);
	}
}
