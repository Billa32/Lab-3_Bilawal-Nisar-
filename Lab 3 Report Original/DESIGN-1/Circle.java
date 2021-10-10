import java.awt.*;

public class Circle extends Shape {
	private int diameter;
	public Circle(int x, int y, int diameter, Color color) {
		super(color,x,y);
		this.diameter = diameter;
	}

	@Override
	public int getHeight() {
		return diameter;
	}

	@Override
	public int getWidth() {
		return diameter;
	}

	@Override
	public double area() {
		return Math.PI* diameter * diameter/4;
	}

	@Override
	public int getType() {
		return CIRCLE;
	}
}
