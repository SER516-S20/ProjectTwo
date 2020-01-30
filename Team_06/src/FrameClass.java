import java.awt.*;
import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class FrameClass extends JFrame{

	private static final String[] PANEL_NAMES = {"LeftPanel", "RightPanel"};
	
	public JPanel[] panels = new JPanel[15];
	 
	FrameClass(String name) {
		this.setTitle(name);
	    this.setMinimumSize(new Dimension(800, 600));
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    getContentPane().add(addPanels());
	    
	    this.pack();
	    this.setLocationRelativeTo(null);
	    this.setVisible(true);
	}
	
	    public JSplitPane addPanels(){
	    Class<?> panelClass1;
	    Class<?> panelClass2;
	    
	    for(int i = 0; i < PANEL_NAMES.length; i++) {
		   try {
			   Class<?> panelClass = Class.forName(PANEL_NAMES[i]);
			   JPanel panel;
			   if (i == 1) {
				    panel = (JPanel) RightPanel.getInstance();

			   }
			   else{
				    panel = (JPanel) panelClass.getDeclaredConstructor().newInstance();
			   }
			   panels[i] = panel;
		   }catch(Exception e) {
			   addError(PANEL_NAMES[i]);
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
			} catch (Exception e) {
				e.printStackTrace();
			}
	    return null;
	    }
	    
	    private void addError(String panelNumber) {
	        JPanel panel = new JPanel();
	        JLabel label = new JLabel("Panel " + panelNumber + " Error");
	        panel.add(label);
	        add(panel);
	    }    
	    public static void main(String args[]) {
	    	new FrameClass("Somesh");
	    }

}
