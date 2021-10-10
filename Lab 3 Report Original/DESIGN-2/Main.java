import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.*;

public class Main {
	static CustomJpanel panelShapes;
	public static void main(String[] args) {
		JButton btnLoadShapes, btnSortShapes;
		
		btnLoadShapes = new JButton("Load Shapes");
		btnLoadShapes.setBounds(150, 10, 150, 30);
		
		btnSortShapes = new JButton("Sort Shapes");
		btnSortShapes.setBounds(310, 10, 150, 30);


		ArrayList<Shape> shapes = ShapeFactory.getInstance().getAll();

		panelShapes =new CustomJpanel(shapes);


		panelShapes.setBounds(10, 50, 600, 550);
		panelShapes.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panelShapes.setVisible(false);


		btnLoadShapes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				panelShapes.setVisible(true);
			}
		});
		
		JFrame frame = new JFrame();
		frame.setTitle("Display Shpes");
		
		frame.getContentPane().add(btnLoadShapes);
		frame.getContentPane().add(btnSortShapes);
		frame.getContentPane().add(panelShapes);
		frame.setLayout(null);;
		frame.setSize(650,650);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnSortShapes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Collections.sort(shapes, new Comparator<Shape>() {
					@Override
					public int compare(Shape o1, Shape o2) {
						return Double.compare(o1.area() , o2.area());
					}
				});

				panelShapes.invalidate();
				panelShapes.revalidate();
				panelShapes.repaint();
			}
		});


	}

	static class CustomJpanel extends JPanel{
		ArrayList<Shape> shapes;
		public CustomJpanel(ArrayList<Shape> shapes){
			this.shapes=shapes;
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
            int x=10,y=10;

			for(Shape shape:shapes){
				System.out.println(shape.area());
				g2d.setColor(shape.getColor());

				if(shape.getType() == Shape.RECTANGLE){

					g2d.fillRect(x,y,shape.getWidth(),shape.getHeight());
				}
				else if(shape.getType()==Shape.SQUARE){
					g2d.fillRect(x,y,shape.getWidth(),shape.getHeight());
				}
				else if(shape.getType() == Shape.CIRCLE){

					g2d.fillOval(x,y,shape.getWidth(), shape.getHeight());
				}

				x+=shape.getWidth()+5;
				y+=shape.getHeight()+6;

			}


		}

	};

}
