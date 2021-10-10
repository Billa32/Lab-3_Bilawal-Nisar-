import java.awt.*;

public class Rectangle implements Shape{
private int width, height;
	private Color color;
	private int x,y;
	public Rectangle(int x, int y, int width, int height, Color color) {

		this.width = width;
		this.height = height;
		this.color=color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public double area(){
		return  width*height;
	}

	@Override
	public int getType() {
		return RECTANGLE;
	}
}
