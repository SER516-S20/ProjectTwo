import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * @author surya create on 01-28-2020
 */

public class PanelToolkit extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Interface for shapes to be added into toolkit
	 */
	public PanelToolkit() {
		PanelCircle objPanelCircle = new PanelCircle();
		PanelRectangle objPanelRectang = new PanelRectangle();
		setLayout(new GridLayout(1, 4));

		JPanel toolkit_panel = (JPanel) objPanelCircle;
		JPanel toolkit_panel1 = (JPanel) objPanelRectang;
		add(toolkit_panel);
		add(toolkit_panel1);
	}

}
