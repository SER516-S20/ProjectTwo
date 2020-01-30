import java.awt.Color;
import java.awt.GridLayout;
import java.lang.reflect.InvocationTargetException;

import javax.swing.BorderFactory;
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
		String[] classNames = new String[]{ "Circle", "Rectangle", "Square", "Triangle"};
		for (int i = 0; i < classNames.length; i++) {
			try {
				Class<?> tabClass = Class.forName("Panel" + classNames[i]);
				setLayout(new GridLayout(1, 4));
				Object newTab = tabClass.getDeclaredConstructor().newInstance();
				JPanel toolkit_panel = (JPanel) newTab;
				toolkit_panel.setBorder(BorderFactory.createLineBorder(Color.black));
				add(toolkit_panel);
				
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
