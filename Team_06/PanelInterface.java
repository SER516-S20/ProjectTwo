import java.awt.*;
import javax.swing.*;

public abstract class PanelInterface extends JPanel{
	
	PanelInterface(String s, int a, int b){
		this.setBackground(Color.decode(s));
	}
	
}
