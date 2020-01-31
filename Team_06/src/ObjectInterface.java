import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.Border;

/** 
 * @author Sheran
 * @since 01-29-2019
 */
public abstract class ObjectInterface extends JButton {
	
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
