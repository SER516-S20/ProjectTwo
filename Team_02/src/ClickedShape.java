/**
 * @author Suryadeep 
 * @created on 01-27-2020
 */
public class ClickedShape {
	public static String shapeName;

	public String returnShape(String clickedShape) {
		try {
			shapeName = clickedShape;
			return clickedShape;
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return "";
	}
}
