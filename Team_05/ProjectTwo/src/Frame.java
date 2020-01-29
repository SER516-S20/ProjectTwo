import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String title = "ProjectTwo-Team 5";
	private static final Color lBackground = new Color(255, 255, 240);
	private static final Color rBackground = new Color(240, 255, 255);
	private JPanel rightPanel;
	private JPanel leftPanel;
	
	public Frame() {
		this.setTitle(title);
		this.setMinimumSize(new Dimension(800, 500));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//add panels to the frame
		this.getContentPane().add(createLeftPanel());
		this.getContentPane().add(createRightPanel());
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	private JPanel createLeftPanel() {
		leftPanel = new JPanel();
		leftPanel.setSize(this.getWidth() / 5, this.getHeight());
		leftPanel.setBackground(lBackground);
		
		RoundButton round = new RoundButton("round");
		round.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("click");
				RoundButton instance = new RoundButton("");
				rightPanel.add(instance);
				contentRepaint();
			}
		});
		
		TriangleButton triangle = new TriangleButton("triangle");
		triangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TriangleButton instance = new TriangleButton("");
				rightPanel.add(instance);
				contentRepaint();
			}
		});
		triangle.setText("triangle");
		
		RectangleButton rectangle = new RectangleButton("rectangle");
		rectangle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RectangleButton instance = new RectangleButton("");
				rightPanel.add(instance);
				contentRepaint();
			}
		});
		leftPanel.add(round);
		leftPanel.add(triangle);
		leftPanel.add(rectangle);
		
		return leftPanel;
	}
	
	private JPanel createRightPanel() {
		rightPanel = new JPanel();
		rightPanel.setSize(this.getWidth() - this.getWidth() / 5, this.getHeight());
		rightPanel.setBackground(rBackground);
		
		return rightPanel;
	}
	
	private void contentRepaint() {
		getContentPane().revalidate();
		getContentPane().repaint();	
	}

}
