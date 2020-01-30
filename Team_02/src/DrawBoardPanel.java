
/**
 * @author Abhinaw Sarang 
 * Created on 01-29-2020
 */

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class DrawBoardPanel extends JPanel {

	public DrawBoardPanel() {
		try {
			add(new DrawShapeOnMouseClick());
			setVisible(true);
			Border blackline = BorderFactory.createLineBorder(Color.black);
			setBorder(blackline);
			setSize(1600, 800);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
