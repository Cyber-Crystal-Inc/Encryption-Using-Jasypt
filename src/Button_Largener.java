import java.awt.Rectangle;

public class Button_Largener {
	private int difference = 6;
	private int XnY = difference/2;
	public Rectangle Bigger(int x,int y,int width, int height) {
		int new_x = x-XnY;
		int new_y = y-XnY;
		int new_width = width+difference;
		int new_height = height+difference;
		Rectangle values = new Rectangle(new_x,new_y,new_width,new_height);
		return values;
	}
	public Rectangle Smaller(int x,int y,int width, int height) {
		int new_x = x+XnY;
		int new_y = y+XnY;
		int new_width = width-difference;
		int new_height = height-difference;
		Rectangle values = new Rectangle(new_x,new_y,new_width,new_height);
		return values;
	}

}
