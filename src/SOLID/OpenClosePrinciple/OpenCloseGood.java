package SOLID.OpenClosePrinciple;

import java.util.ArrayList;

/**
 * Open closed principle: good example
 * @author Prashant
 *
 */
public class OpenCloseGood {

	public interface Shape {
		double getArea();
	}

	public class RectangleNew implements Shape {
		
		private double height;
		private double width;
		
		public RectangleNew(double height, double width) {
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
		@Override
		public double getArea() {
			return this.width * this.height;
		}
	}

	
	public class CircleNew implements Shape {
		
		private double radius;

		public CircleNew(double radius ) {
			this.radius = radius;
		}
		
		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		@Override
		public double getArea() {
			return Math.PI * this.radius * this.radius;
		}
		
	}

	public class AreaFactoryGood {
		
		public double calculateArea( ArrayList<Shape> shapes ) {

			double area = 0.0;
			
			for( Shape o : shapes ){

				area += o.getArea();
			}
			
			return area;
			
		}
	}
	
	
	public static void main(String[] args) {
		
		OpenCloseGood instance = new OpenCloseGood();
		AreaFactoryGood factory = instance.new AreaFactoryGood();
		
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add( instance.new RectangleNew(1.0, 3.0));
		shapes.add( instance.new RectangleNew(1.0, 2.0));
		shapes.add( instance.new CircleNew(7.0));
	
		// Note : We can implement any shape by implementing Shape interface and pass that
		// to Area Factory to calculate the area
		
		double areaVal = factory.calculateArea(shapes);
		
		System.out.println("Total Area : " + areaVal);
		
	}


}
