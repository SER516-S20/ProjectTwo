package ProjectTwo.Team_02;

import javax.swing.JPanel;

/**
*
* @author Abhinaw Sarang
* created on 01-29-2020
*/

public class DrawBoardPanel extends JPanel { 
	
	public DrawBoardPanel() {
		
		add(new DrawShapeOnMouseClick());
	}
}
