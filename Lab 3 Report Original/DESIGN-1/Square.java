import java.awt.*;

public class Square extends Rectangle {

	public Square(int x, int y, int width, Color color) {
		super(x,y,width,width,color);
	}

	@Override
	public int getType() {
		return SQUARE;
	}
}
