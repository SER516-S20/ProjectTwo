import javax.swing.*;

/**
 * @author Kunal Sharma
 * @created on 01-27-2020
 * @version 1.0
 */
public class MainWindow {

	public static void main(String[] args) {

		try {
			JFrame frameWindow = new JFrame("Main Window");
			frameWindow.setVisible(true);
			frameWindow.setSize(1000, 1000);
			frameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JSplitPane splitPane = new JSplitPane();
			splitPane.setSize(900, 900);
			splitPane.setDividerSize(0);
			splitPane.setDividerLocation(200);
			splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane.setTopComponent(new PanelToolkit());
			splitPane.setBottomComponent(new DrawBoardPanel());
			frameWindow.add(splitPane);
			frameWindow.setExtendedState(JFrame.MAXIMIZED_BOTH);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
