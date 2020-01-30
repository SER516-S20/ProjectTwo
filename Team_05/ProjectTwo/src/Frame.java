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
	private RightPanel rightPanel;
	private LeftPanel leftPanel;
	
	public Frame() {
		this.setTitle(title);
		this.setMinimumSize(new Dimension(800, 500));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		

		//add panels to the frame
		leftPanel = new LeftPanel();
		rightPanel = new RightPanel();
		rightPanel.SetFrame(this);
		this.getContentPane().add(createLeftPanel());
		this.getContentPane().add(createRightPanel());
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	private JPanel createLeftPanel() {
		
		leftPanel.setSize(200, 500);
		leftPanel.setLocation(0, 0);
		leftPanel.setBackground(lBackground);
		leftPanel.SetMouseAdapter_RoundButton(new LeftPanelMouse(rightPanel));
		leftPanel.SetMouseAdapter_TriangleButton(new LeftPanelMouse(rightPanel));
		leftPanel.SetMouseAdapter_RectangleButton(new LeftPanelMouse(rightPanel));
		
		return leftPanel;
	}
	
	private JPanel createRightPanel() {
		rightPanel.setLocation(200, 0);
		rightPanel.setSize(600, 500);
		rightPanel.setBackground(rBackground);
		
		return rightPanel;
	}
	
	public void contentRepaint() {
		getContentPane().revalidate();
		getContentPane().repaint();	
	}

}
