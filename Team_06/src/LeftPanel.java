import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeftPanel extends PanelInterface {
public int flag = 0;
	LeftPanel() {
		super("#ffffff",1,20);
		
		JButton circle = new Circle("");
		this.add(circle);               
		circle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		        if (circle.isEnabled()) {
		        	System.out.println("Button is pressed");
		        	flag = 1;
		        	//RightPanel rightpanel = new RightPanel(flag);
		        	RightPanel.getInstance().finalFlag = 1;
		        }
		        
				
			}
		});

		this.add(Box.createVerticalStrut(100));
		
		JButton square = new Square("");          
		this.add(square);                       
		this.add(Box.createVerticalStrut(200)); 
		
		square.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		        if (square.isEnabled()) {
		        	System.out.println("Button is pressed");
		        	flag = 2;
		        	//RightPanel rightpanel = new RightPanel(flag);
		        	RightPanel.getInstance().finalFlag = 2;
		        }
		        
				
			}
		});
		
		JButton Triangle = new Triangle("");     
		this.add(Triangle);   
		Triangle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		        if (Triangle.isEnabled()) {
		        	System.out.println("Button is pressed");
		        	flag = 2;
		        	//RightPanel rightpanel = new RightPanel(flag);
		        	RightPanel.getInstance().finalFlag = 3;
		        }
		        
				
			}
		});

	}

}