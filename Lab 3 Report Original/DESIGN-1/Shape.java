
//public class Shape {
//	Square s;
//	Circle c;
//	Rectangle r;
//	Circle C1;
//	Square S1;
//	Rectangle r2;
//	public Shape(){
//		s = new Square (10,10,50,50);
//		c = new Circle (70,70,60,60);
//		r = new Rectangle(140, 140, 80, 70);
//		C1 = new Circle (230,220,100,100);
//		S1 = new Square (340,330,110,110);
//		r2 = new Rectangle (460,450,40,30);
//	}
//	public Square getS() {
//		return s;
//	}
//	public void setS(Square s) {
//		this.s = s;
//	}
//	public Circle getC() {
//		return c;
//	}
//	public void setC(Circle c) {
//		this.c = c;
//	}
//	public Rectangle getR() {
//		return r;
//	}
//	public void setR(Rectangle r) {
//		this.r = r;
//	}
//	public Circle getC1() {
//		return C1;
//	}
//	public void setC1(Circle c1) {
//		C1 = c1;
//	}
//	public Square getS1() {
//		return S1;
//	}
//	public void setS1(Square s1) {
//		S1 = s1;
//	}
//	public Rectangle getR2() {
//		return r2;
//	}
//	public void setR2(Rectangle r2) {
//		this.r2 = r2;
//	}
//
//
//}

import java.awt.*;

public class Shape{

	private Color color;
	private int X,Y;

	public static int RECTANGLE = 100;
	public static int SQUARE = 101;
	public static int CIRCLE = 104;

	public Shape(){

	}
	public Shape(Color color, int x, int y) {
		this.color = color;
		X = x;
		Y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	public double area(){
		return 0;
	}

	public int getType(){
		return 0;
	}

	public int getWidth(){
		return 0;
	}

	public int getHeight(){
		return 0;
	}


}
