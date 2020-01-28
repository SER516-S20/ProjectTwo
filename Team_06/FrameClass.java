import java.awt.*;
import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class FrameClass extends JFrame{

	FrameClass(String name) {
		this.setTitle(name);
	    this.setMinimumSize(new Dimension(800, 600));
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    getContentPane().add(addPanels());
	    
	    this.pack();
	    this.setLocationRelativeTo(null);
	    this.setVisible(true);
	}
	    public JSplitPane addPanels() {
	    Class<?> panelClass1;
	    Class<?> panelClass2;
		try {
			panelClass1 = Class.forName("LeftPanel");
		    panelClass2 = Class.forName("RightPanel");		
	        JPanel panel1 = (JPanel) panelClass1.getDeclaredConstructor().newInstance();
	        JPanel panel2 = (JPanel) panelClass2.getDeclaredConstructor().newInstance();
	        JSplitPane splitPane = new JSplitPane();
	        splitPane.setSize(800, 600);
	        splitPane.setDividerSize(0);
	        splitPane.setDividerLocation(150);
	        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
	        splitPane.setLeftComponent(panel1);
	        splitPane.setRightComponent(panel2);
		    return splitPane;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	    
	    public static void main(String args[]) {
	    	new FrameClass("Somesh");
	    }

}
