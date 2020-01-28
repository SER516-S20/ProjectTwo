import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String title = "ProjectTwo-Team 5";
	
	public Frame() {
		this.setTitle(title);
		this.setMinimumSize(new Dimension(800, 500));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setSize(this.getWidth() / 5, this.getHeight());
		leftPanel.setBackground(Color.white);
		
		RoundButton round = new RoundButton("round");
		TriangleButton triangle = new TriangleButton("triangle");
		triangle.setText("triangle");
		leftPanel.add(round);
		leftPanel.add(triangle);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setSize(this.getWidth() - this.getWidth() / 5, this.getHeight());
		rightPanel.setBackground(Color.green);
		
		//add panels to the frame
		this.getContentPane().add(leftPanel);
		this.getContentPane().add(rightPanel);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
