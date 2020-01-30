import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Module to Draw Circle and listen to mouse click events.
 * @author Suryadeep
 * @created 01-27-2020
 */
public class Circle extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//Code to Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circle frame = new Circle();
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println("error");
					e.printStackTrace();
				}
			}
		});
	}
	// Class Constructor
	public Circle() {
		// Set Exit Operation for the frame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 250, 250);
		// Panel module to create shape.
		contentPane = new JPanel() {
			private static final long serialVersionUID = 1L;
			// Method that draws the circle.
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				// Set location and size of
				// the circle.
				Shape circle = new Ellipse2D.Double(20, 20, 60, 60);
				g2.draw(circle);
			}
		};
		// Mouse click action listener.
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Shape clicked"+ e);
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
}
