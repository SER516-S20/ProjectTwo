package ProjectTwo.Team_02;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
*
* @author Abhinaw Sarang
* created on 01-29-2020
*/

public class DrawBoardPanel extends JPanel { 
	
	public DrawBoardPanel() {
		
		add(new DrawShapeOnMouseClick());
                setVisible(true);
                Border blackline = BorderFactory.createLineBorder(Color.black);
            setBorder(blackline);
                setSize(1600,800);
	}
}
