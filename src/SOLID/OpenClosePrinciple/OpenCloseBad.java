package SOLID.OpenClosePrinciple;

import java.util.ArrayList;

public class OpenCloseBad {
	
	public class Rectangle {
		
		private double height;
		private double width;
		
		public Rectangle(double height, double width) {
			this.height = height;
			this.width = width;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
	}

	
	public class Circle {
		
		private double radius;

		public Circle(double radius ) {
			this.radius = radius;
		}
		
		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
		
	}
	
	
	public class AreaFactory {
		
		public double calculateArea( ArrayList<Object> shapes ) {

			double area = 0.0;
			
			for( Object o : shapes ){
				
				if( o instanceof Rectangle ) {
					Rectangle rect = (Rectangle) o;
					area += (rect.getHeight() * rect.getWidth());					
				}
				else if ( o instanceof Circle ) {
					Circle circle = (Circle) o;
					area += (Math.PI * circle.getRadius() * circle.getRadius());
				}
				else {
					throw new RuntimeException("Shape not supported.");
				}
			}
			
			return area;
			
		}
	}
	
	
	public static void main(String[] args) {
		
		OpenCloseBad instance = new OpenCloseBad();
		AreaFactory factory = instance.new AreaFactory();
		
		ArrayList<Object> shapes = new ArrayList<>();
		shapes.add( instance.new Rectangle(1.0, 3.0));
		shapes.add( instance.new Rectangle(1.0, 2.0));
		shapes.add( instance.new Circle(7.0));
		
		double areaVal = factory.calculateArea(shapes);
		
		System.out.println("Total Area : " + areaVal);
		
	}
	
}