import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
/***
 * @author Hongqi Zhang
 * this class is to show the app
 */
public class Frame extends JFrame{

	private static final long serialVersionUID = 1L;
	private static final String title = "ProjectTwo-Team 5";
	private static final Color lBackground = new Color(255, 255, 240);
	private static final Color rBackground = new Color(240, 255, 255);
	private RightPanel dragArea;
	private LeftPanel btnContainer;
	
	public Frame() {
		this.setTitle(title);
		this.setMinimumSize(new Dimension(800, 500));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		

		//add panels to the frame
		btnContainer = new LeftPanel();
		dragArea = new RightPanel();
		dragArea.SetFrame(this);
		this.getContentPane().add(createLeftPanel());
		this.getContentPane().add(createRightPanel());
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	private JPanel createLeftPanel() {
		
		btnContainer.setSize(200, 500);
		btnContainer.setLocation(0, 0);
		btnContainer.setBackground(lBackground);
		btnContainer.SetMouseAdapter_RoundButton(new LeftPanelMouse(dragArea));
		btnContainer.SetMouseAdapter_TriangleButton(new LeftPanelMouse(dragArea));
		btnContainer.SetMouseAdapter_RectangleButton(new LeftPanelMouse(dragArea));
		
		return btnContainer;
	}
	
	private JPanel createRightPanel() {
		dragArea.setLocation(200, 0);
		dragArea.setSize(600, 500);
		dragArea.setBackground(rBackground);
		
		return dragArea;
	}
	
	public void contentRepaint() {
		getContentPane().revalidate();
		getContentPane().repaint();	
	}

}
