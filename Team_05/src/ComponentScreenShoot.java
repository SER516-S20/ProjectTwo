import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class ComponentScreenShoot {
	
	public BufferedImage getScreenShoot(Component component) {
		int width = component.getWidth();
		int height = component.getHeight();
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		component.paint(image.getGraphics());
		return image;
	}
	
	public void saveScreenShoot(Component component) throws Exception {
		BufferedImage image = getScreenShoot(component);
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fileChooser.showSaveDialog(component.getParent());
		if (result == JFileChooser.APPROVE_OPTION) {
		    File selectedFile = fileChooser.getSelectedFile();
		    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
		    ImageIO.write(image, "PNG", new File(selectedFile.getAbsolutePath()));
		}
		
		
	}
}
