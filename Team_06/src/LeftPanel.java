import javax.swing.*;
import java.awt.*;

public class LeftPanel extends PanelInterface {

	LeftPanel() {
		super("#ffffff",1,20);
		
		JButton circle = new Circle("");
		this.add(circle);                      
		this.add(Box.createVerticalStrut(100));
		
		JButton square = new Square("");          
		this.add(square);                       
		this.add(Box.createVerticalStrut(200)); 
		
		JButton Triangle = new Triangle("");     
		this.add(Triangle);                    

	}

}
