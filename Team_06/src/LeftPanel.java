import javax.swing.*;
import java.awt.*;

public class LeftPanel extends PanelInterface {

	LeftPanel() {
		super("#ffffff",1,20);

	}
	
	public void DrawTriangle(JFrame frame) {
		new DrawTriangle(frame);
	}

}
