import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * this class is to show the app
 * @author Hongqi Zhang
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
		getContentPane().setLayout(null);
		btnContainer = new LeftPanel();
		dragArea = new RightPanel();
		dragArea.setFrame(this);
		this.getContentPane().add(createLeftPanel());
		this.getContentPane().add(createRightPanel());
		this.pack();
		this.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem itemSave = new JMenuItem("save");
		itemSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ComponentScreenShoot img = new ComponentScreenShoot();
				try {
					img.saveScreenShoot(dragArea);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		menuBar.add(itemSave);
		this.setVisible(true);
	}
	
	private JPanel createLeftPanel() {
		
		btnContainer.setSize(200, 500);
		btnContainer.setLocation(0, 0);
		btnContainer.setBackground(lBackground);
		btnContainer.setRoundButtonMouseAdapter(new LeftPanelMouse(dragArea));
		btnContainer.setTriangleButtonMouseAdapter(new LeftPanelMouse(dragArea));
		btnContainer.setRectangleButtonMouseAdapter(new LeftPanelMouse(dragArea));
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
