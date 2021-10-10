import java.awt.*;

public class Circle implements Shape {
	private int diameter;
	private Color color;
	private int x,y;
	public Circle(int x, int y, int diameter, Color color) {
		this.diameter = diameter;
		this.color=color;
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
	public Color getColor() {
		return color;
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
