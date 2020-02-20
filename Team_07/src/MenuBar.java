

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JPanel;

public class MenuBar{
	
	private RightPanel rightPanel;
	
	public MenuBar(RightPanel rightPanel_in) {
		rightPanel = rightPanel_in;
	}
	
	public void save()
	{
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("shapes.dat");
			oos = new ObjectOutputStream(fos);
	        	oos.writeObject(rightPanel);
	        	oos.close();
	        	fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void open()
	{
		rightPanel.deleteAllshapes();
		try
		{
			FileInputStream fi = new FileInputStream(new File("shapes.dat"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			RightPanel saveddata = (RightPanel) oi.readObject();
			
			oi.close();
			fi.close();
			
			for(int i=1;i<saveddata.panel.getComponents().length;i++)
			{
				JPanel thisshape = (JPanel) saveddata.panel.getComponent(i);
				rightPanel.panel.add(thisshape);
				rightPanel.drag(thisshape);
				thisshape.repaint();
				rightPanel.panel.repaint();
			}
			
			System.out.println(saveddata.allShapes.get(0).getLocation());
			System.out.println(saveddata.allShapes.get(0).getClass());
			System.out.println(saveddata.allShapes.get(1).getLocation());
			System.out.println(saveddata.allShapes.get(1).getClass());
			
			

	} catch (FileNotFoundException e) {
		System.out.println("File not found");
	} catch (IOException e) {
		System.out.println("Error initializing stream");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
