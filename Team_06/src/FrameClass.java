import javax.swing.*;
import java.awt.*;

/**
 * author: Somesh, Suyog
 * Date: 01/28/2020
 * Description: This is the main class and it handles the main frame which is going to contain all the items in the application.
 */
public class FrameClass extends JFrame{

	private static final String[] panelNames = {"LeftPanel", "RightPanel"};
	private JPanel[] panels = new JPanel[15];
	// This is the constructor for the FrameClass class
	FrameClass(String name) {

		this.setTitle(name);
	    this.setMinimumSize(new Dimension(800, 600));
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    getContentPane().add(addPanels());
	    this.pack();
	    this.setLocationRelativeTo(null);
	    this.setVisible(true);

	}
	//This method splits the frame into two panels. It is basically adding two panels with a division pre-defined as per user's desire.
	public JSplitPane addPanels(){

	    Class<?> panelClass1;
	    Class<?> panelClass2;
	    for(int thePanel = 0; thePanel < panelNames.length; thePanel++) {

		   try {

			   Class<?> panelClass = Class.forName(panelNames[thePanel]);
			   JPanel panel = (JPanel) panelClass.getDeclaredConstructor().newInstance();
			   panels[thePanel] = panel;

		   }
		   catch(Exception e) {

			   addError(panelNames[thePanel]);

		   }
	    }
	    try {

	        JSplitPane splitPane = new JSplitPane();
	        splitPane.setSize(800, 600);
	        splitPane.setDividerSize(0);
	        splitPane.setDividerLocation(150);
	        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
	        splitPane.setLeftComponent(panels[0]);
	        splitPane.setRightComponent(panels[1]);
		    return splitPane;

			}
	    catch (Exception e) {

	    	e.printStackTrace();

	    }
	    return null;

	}
	// This method is used to throw error message for a specific case where the two panels are not defined in the PANEL_NAMES list.
	private void addError(String panelNumber) {

		JPanel panel = new JPanel();
		JLabel label = new JLabel("Panel " + panelNumber + " Error");
		panel.add(label);
		add(panel);

	}
	// This is the main method for the FrameClass class
	public static void main(String args[]) {

		new FrameClass("Somesh");

	}

}
