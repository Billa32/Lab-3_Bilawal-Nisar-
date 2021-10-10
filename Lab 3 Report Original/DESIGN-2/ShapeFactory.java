import java.awt.*;
import java.util.ArrayList;

public class ShapeFactory {
//s = new Square (10,10,50,50);
//		c = new Circle (70,70,60,60);
//		r = new Rectangle(140, 140, 80, 70);
//		C1 = new Circle (230,220,100,100);
//		S1 = new Square (340,330,110,110);
//		r2 = new Rectangle (460,450,40,30);
    private ShapeFactory(){}
    public static ShapeFactory factory;

    public static ShapeFactory getInstance(){
        if(factory == null){
            factory = new ShapeFactory();
            return factory;
        }
        return factory;
    }


    public ArrayList<Shape> getAll(){

        ArrayList<Shape> shapes=new ArrayList<>();
        shapes.add(getCircle());
        shapes.add(getSquare2());
        shapes.add(getRectangle2());
        shapes.add(getSquare());
        shapes.add(getCircle2());
        shapes.add(getRectangle());

        return shapes;
    }
    public Shape getRectangle(){
        return new Rectangle(10,10,100,50, Color.YELLOW);
    }

    public Shape getCircle(){
        return new Circle(70,70,60,Color.BLACK);
    }
    public Shape getSquare(){
        return  new Square(140,140,80,Color.RED);
    }

    public Shape getRectangle2(){
        return new Rectangle(230,220,160,100, Color.BLUE);
    }

    public Shape getCircle2(){
        return new Circle(340,340,110,Color.LIGHT_GRAY);
    }
    public Shape getSquare2(){
        return  new Square(460,450,40,Color.ORANGE);
    }




}
