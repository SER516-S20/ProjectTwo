package MouseListener;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelToolkit extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelToolkit() {
		PanelCircle objPanelCircle = new PanelCircle();
		PanelRectangle objPanelRectang = new PanelRectangle();
	    setLayout(new GridLayout(1, 4));
	    
	    JPanel toolkit_panel = (JPanel)objPanelCircle;
	    JPanel toolkit_panel1 = (JPanel)objPanelRectang;
	    add(toolkit_panel);
	    add(toolkit_panel1);
	}

}
