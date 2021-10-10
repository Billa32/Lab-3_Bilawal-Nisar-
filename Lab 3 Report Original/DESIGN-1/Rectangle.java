import java.awt.*;

public class Rectangle extends Shape{
private int width, height;
	public Rectangle(int x, int y, int width, int height, Color color) {
        super(color,x,y);
		this.width = width;
		this.height = height;
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
	public double area(){
		return  width*height;
	}

	@Override
	public int getType() {
		return RECTANGLE;
	}
}
