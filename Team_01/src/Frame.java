import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Chandan Kiragadalu Javaregowda
 *
 */
public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private final String title = "Team 1";

	private Frame() {
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		setTitle(title);
		setVisible(true);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * Create left panel to the frame
	 */
	private void createLeftPanel() {
		try {
			JPanel leftPanel = new JPanel() {
				private static final long serialVersionUID = 1L;
				public void paintComponent(Graphics g) {
					super.paintComponent(g);
					Shapes square = new Square();
					square.drawShape(g, 50, 50);
					Shapes circle = new Circle();
					circle.drawShape(g, 50, 350);
					Shapes triangle = new Triangle();
					triangle.drawShape(g, 50, 800);
				}
			};
			leftPanel.setBounds(0, 0, this.getWidth() / 4, this.getHeight());
			leftPanel.setVisible(true);
			this.add(leftPanel);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Create right panel to the frame paintComponent creates new shapes upon click
	 */
	private void createRightpanel() {
		try {
			JPanel rightPanel = new JPanel() {
				private static final long serialVersionUID = 1L;
			};
			rightPanel.setBackground(Color.WHITE);
			rightPanel.setBounds(this.getWidth() / 4, 0, 3 * this.getWidth() / 4, this.getHeight());
			rightPanel.setVisible(true);
			this.add(rightPanel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args This method schedules a job for the event-dispatching thread.
	 *             This method is responsible for creating and showing application's
	 *             GUI.
	 */
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Frame frame = new Frame();
				frame.createLeftPanel();
				frame.createRightpanel();
			}
		});
	}
}
