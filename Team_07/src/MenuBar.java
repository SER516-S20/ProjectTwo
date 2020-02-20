

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
		
        

		System.out.println(rightPanel.allShapes.get(0).getLocation());
		System.out.println(rightPanel.allShapes.get(0).getClass().toString());
		System.out.println(rightPanel.allShapes.get(1).getLocation());
		System.out.println(rightPanel.allShapes.get(1).getClass());
	}
	
	public void open()
	{
		rightPanel.deleteAllshapes();
		try
		{
			FileInputStream fi = new FileInputStream(new File("shapes.dat"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			RightPanel saveddata = (RightPanel) oi.readObject();
		
		//saveddata.allShape
		
		System.out.println(saveddata.allShapes.get(0).getLocation());
		System.out.println(saveddata.allShapes.get(0).getClass().toString());
		System.out.println(saveddata.allShapes.get(1).getLocation());
		System.out.println(saveddata.allShapes.get(1).getClass());
			oi.close();
			fi.close();

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
