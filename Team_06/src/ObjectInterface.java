import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

public abstract class ObjectInterface extends JButton{
	public ObjectInterface(String label) {
        super(label);
        Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.width,size.height);
        setPreferredSize(size);
        
        Border emptyBorder = BorderFactory.createEmptyBorder();
        setBorder(emptyBorder);
        setContentAreaFilled(false);
    }
}
