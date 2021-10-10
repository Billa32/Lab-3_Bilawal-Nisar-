
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

public interface Shape{

	int RECTANGLE = 100;
	int SQUARE = 101;
int CIRCLE = 104;

    Color getColor();
	double area();

 int getType();

	 int getWidth();

	int getHeight();


}
